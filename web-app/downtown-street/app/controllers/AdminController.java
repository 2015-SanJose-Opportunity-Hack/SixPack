package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Admin;
import models.Request;
import modules.utilities.Utilities;

import org.json.JSONArray;

import play.data.Form;
import play.libs.F.Callback;
import play.libs.F.Callback0;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Http.MultipartFormData.FilePart;
import play.mvc.Result;
import play.mvc.Security;
import play.mvc.WebSocket;
import views.formdata.admin.AdminLoginForm;
import views.formdata.admin.SettingsForm;

import com.fasterxml.jackson.databind.node.ObjectNode;

import controllers.security.SecuredAdmin;

public class AdminController extends Controller {

	private final static String directoryPath = play.Play.application()
			.configuration().getString("inventory.imagePath");
	
	private static ArrayList<WebSocket.Out> channels=new ArrayList<WebSocket.Out>();

	
	
 	// Function to authenticate login
	public static Result authenticateLogin() {
		Form<AdminLoginForm> adminLoginForm = Form.form(
				AdminLoginForm.class).bindFromRequest();
		if (adminLoginForm.hasErrors()) {
			return badRequest(views.html.admin.login.render(
					"Staff Login", SecuredAdmin.isLoggedIn(ctx()),
					adminLoginForm));
		}
		session().clear();
		session("username", adminLoginForm.get().getUsername());
		return redirect(routes.AdminController.dashboard());
	}

	//login
	public static Result login() {
		session().clear();
		Form<AdminLoginForm> adminLoginForm = Form
				.form(AdminLoginForm.class);
		return ok(views.html.admin.login.render("Staff Login",
				SecuredAdmin.isLoggedIn(ctx()), adminLoginForm));
	}

	// welcome dashboard page
	@Security.Authenticated(SecuredAdmin.class)
	public static Result dashboard() {
		Admin admin = SecuredAdmin.getAdminInfo(ctx());
		List<Request> requestList = Request.find.where().orderBy("createdAt desc").findList();
		int all = Request.find.findRowCount();
		int resolved = Request.find.where().eq("is_resolved", "1").findRowCount();
		int pending = all - resolved;
		return ok(views.html.admin.dashboard.render("Dashboard",
				SecuredAdmin.isLoggedIn(ctx()), admin, requestList, all, resolved, pending));
	}
	
	@Security.Authenticated(SecuredAdmin.class)
	public static Result errorNotFound() {
		return ok(views.html.admin.notfound.render("Request Not Found",
				SecuredAdmin.isLoggedIn(ctx())));
	}

	@Security.Authenticated(SecuredAdmin.class)
	public static Result settings() {
		Admin admin = SecuredAdmin.getAdminInfo(ctx());
		SettingsForm tempForm = new SettingsForm();
		tempForm.username = admin.getUsername();
		tempForm.contact = admin.getContact();
		tempForm.email = admin.getEmail();
		Form<SettingsForm> settingsForm = Form.form(SettingsForm.class).fill(
				tempForm);
		return ok(views.html.admin.settings.render("Settings",
				SecuredAdmin.isLoggedIn(ctx()), settingsForm));
	}

	@Security.Authenticated(SecuredAdmin.class)
	public static Result updateSettings() {
		Admin admin = SecuredAdmin.getAdminInfo(ctx());
		Form<SettingsForm> settingsForm = Form.form(SettingsForm.class)
				.bindFromRequest();
		if (admin == null) {
			return redirect(routes.ApplicationController.logout());
		}
		if (settingsForm.hasErrors()) {
			return badRequest(views.html.admin.settings.render("Settings",
					SecuredAdmin.isLoggedIn(ctx()), settingsForm));
		}
		if (settingsForm.get().oldPassword.length() > 6
				&& (settingsForm.get().rePassword
						.equals(settingsForm.get().newPassword))) {
			admin
					.setPassword(Utilities.getMD5Hash(settingsForm.get().newPassword));
		}
		admin.setUsername(settingsForm.get().username);
		admin.setEmail(settingsForm.get().email);
		admin.setContact(settingsForm.get().contact);
		
		admin.update();
		
		return redirect(routes.AdminController.settings());
	}
	
	//view request details
	@Security.Authenticated(SecuredAdmin.class)
	public static Result viewRequest(int id){
		for(WebSocket.Out channel : channels){
            channel.write("blah");
        }
		Request request = Request.find.byId(id);
		if(request == null){
			return redirect(routes.AdminController.errorNotFound());
		}
		
		return ok(views.html.admin.request
				.render("View Request", SecuredAdmin.isLoggedIn(ctx()), request));
	}
	
	@Security.Authenticated(SecuredAdmin.class)
	public static Result allRequestAjax(){
		ObjectNode result = Json.newObject();
		
		JSONArray requestArray = new JSONArray();
		ObjectNode requestJSON = Json.newObject();
		List<Request> requestList = Request.find.all();
		for(Request request : requestList){
			requestJSON.put("firstName", request.getFirstName());
			requestJSON.put("lastName", request.getLastName());
			requestJSON.put("latitude", request.getLatitude());
			requestJSON.put("longitude", request.getLongitude());
			requestJSON.put("business", request.getBusiness());
			requestJSON.put("contact", request.getContact());
			requestJSON.put("image", request.getImage());
			requestJSON.put("email", request.getEmail());
			requestJSON.put("address", request.getAddress());
			requestArray.put(requestJSON);
		}
		//result.put("data", requestArray);
		//result.putArray(requestArray);
		return ok();
	}
	
	@Security.Authenticated(SecuredAdmin.class)
	public static Result resolveRequest(int id){
		Http.MultipartFormData body = request().body().asMultipartFormData();
		Request request = Request.find.byId(id);
		if(request == null){
			return redirect(routes.AdminController.errorNotFound());
		}
		
		FilePart pictureFile = body.getFile("resolvedImage");
  	  	String fileName = Utilities.uploadItemPicture(pictureFile);
  	  	
  	  	request.setResolvedImage(fileName);
	  	request.setResolved(true);
		request.update();
		
		return redirect(routes.AdminController.viewRequest(id));
	}
	
	@Security.Authenticated(SecuredAdmin.class)
	public static Result unresolveRequest(int id){
		Request request = Request.find.byId(id);
		if(request == null){
			return redirect(routes.AdminController.errorNotFound());
		}
		request.setResolved(false);
		request.update();
		return redirect(routes.AdminController.viewRequest(id));
	}
	
	public static WebSocket<String> index() {
		  return new WebSocket<String>() {
		      
		    public void onReady(WebSocket.In<String> in, WebSocket.Out<String> out) {
		      out.write("Hello!");
		      System.out.println("Running");
		      out.close();
		    }
		    
		  };
	}
	
	
}
