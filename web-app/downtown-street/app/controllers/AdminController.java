package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Admin;
import models.Request;
import modules.utilities.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;

import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Http.MultipartFormData.FilePart;
import play.mvc.Result;
import play.mvc.Security;
import views.formdata.admin.AdminLoginForm;
import views.formdata.admin.SettingsForm;

import com.fasterxml.jackson.databind.node.ObjectNode;

import controllers.security.SecuredAdmin;

public class AdminController extends Controller {

	private final static String directoryPath = play.Play.application()
			.configuration().getString("request.imageDirectory");
	
	
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
		
		JSONObject requestJSON = new JSONObject();
		JSONArray requestArray=null;
		List<Request> requestList = Request.find.all();
		for(Request request : requestList){
			requestArray = new JSONArray();
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
		
		result.put("data", Json.toJson(Request.find.all()));
		return ok(result);
	}
	
	@Security.Authenticated(SecuredAdmin.class)
	public static Result resolveRequest(int id){
		Http.MultipartFormData body = request().body().asMultipartFormData();
		Request request = Request.find.byId(id);
		
		if(request == null){
			return redirect(routes.AdminController.errorNotFound());
		}
		String email = request.getEmail();
		FilePart pictureFile = body.getFile("resolvedImage");
  	  	String fileName = Utilities.uploadItemPicture(pictureFile);
  	  	
  	  	request.setResolvedImage(fileName);
	  	request.setResolved(true);
		request.update();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(email + " " + email.equals(""));
		if(!email.equals("")){
			  System.out.println("Sending mail with attachment...");
	  		  Utilities.sendEmailwithAttach("Your issues has been resolved", email, "Hi, Thank you for sending us a request. Your issue has been resolved by our volunteer. Please find an image attached to this mail.", directoryPath + request.getImage());
	  	}
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
	
	@Security.Authenticated(SecuredAdmin.class)
	public static Result visualizations(){
		List<Request> requestList = Request.find.all();
		return ok(views.html.admin.visualizations
				.render("Visualization", SecuredAdmin.isLoggedIn(ctx()), requestList));
	}
	
	@Security.Authenticated(SecuredAdmin.class)
	public static Result locations(){
		ObjectNode result = Json.newObject();
		List<String> locationList = new ArrayList<String>();
		List<Request> requestList = Request.find.all();
		for(Request request: requestList){
			if(!request.getLatitude().equals("") && !request.getLongitude().equals("")){
				locationList.add(request.getLatitude()+"," + request.getLongitude());
			}
		}
		result.put("locations", Json.toJson(locationList));
		return ok(result);
	}
}
