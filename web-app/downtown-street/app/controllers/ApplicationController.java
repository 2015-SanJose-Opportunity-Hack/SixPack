package controllers;

import java.io.File;
import java.io.IOException;

import models.Admin;
import models.Request;
import modules.utilities.Setup;
import modules.utilities.Utilities;
import net.coobird.thumbnailator.Thumbnails;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Http.MultipartFormData.FilePart;
import play.mvc.Result;
import views.formdata.admin.AdminLoginForm;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.twilio.sdk.TwilioRestException;

public class ApplicationController extends Controller {
	
	private final static String directoryPath = play.Play.application().configuration().getString("request.imageDirectory");
	private final static String thumbDirectory = play.Play.application().configuration().getString("request.thumbDirectory");

	//Index Login Page
    public static Result index() throws IllegalStateException, IOException {
    	session().clear();
    	if( Admin.find.findRowCount() == 0 ){
    		Setup.initSetup();
    	}
    	Form<AdminLoginForm> adminLoginForm = Form.form(AdminLoginForm.class);
        return ok(views.html.main.login.render(adminLoginForm));
        
    }
    
    public static Result logout(){
    	session().clear();
    	return redirect(routes.ApplicationController.index());
    }
    
    
    public static Result errorNotFound(){
    	return ok(views.html.main.notfound
    			.render("Oops!"));
    }
    
    public static Result aboutProject(){
    	return ok(views.html.main.about
    			.render("About the Project"));
    }
    
    public static Result error(){
    	return ok(views.html.main.error.render("Some problem!"));
    }
    
    public static Result requestRestCall(){
      response().setHeader("Access-Control-Allow-Origin", "*");
      response().setHeader("Allow", "*");
      response().setHeader("Access-Control-Allow-Methods", "POST");
      response().setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Referer, User-Agent");
      
      ObjectNode result = Json.newObject();
	  
  	  Http.MultipartFormData body = request().body().asMultipartFormData();
  	  DynamicForm dynamicForm = Form.form().bindFromRequest();
  	  String firstName = dynamicForm.get("firstName") == null ? "" : dynamicForm.get("firstName");
  	  String lastName = dynamicForm.get("lastName") == null ? "" : dynamicForm.get("lastName");
  	  String latitude = dynamicForm.get("latitude") == null ? "" : dynamicForm.get("latitude");
  	  String longitude = dynamicForm.get("longitude") == null ? "" : dynamicForm.get("longitude");
  	  String address = dynamicForm.get("address") == null ? "" : dynamicForm.get("address");
  	  String comment = dynamicForm.get("comment") == null ? "" : dynamicForm.get("firstName");
  	  String email = dynamicForm.get("email") == null ? "" : dynamicForm.get("email");
  	  String contact = dynamicForm.get("contact") == null ? "" : dynamicForm.get("contact"); 
  	  String business = dynamicForm.get("business") == null ? "" : dynamicForm.get("business");
  	  FilePart pictureFile = body.getFile("image");
  	  String fileName = Utilities.uploadItemPicture(pictureFile);
  	  
 	  System.out.println("FileName: " + fileName + " body details: " +body.getFiles().size() );
  	  try {
  		  Thumbnails.of(new File(directoryPath + fileName)).size(160, 160).toFile(new File(thumbDirectory + "thumb-" + fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("error", "No picture in the body");
		}
  	  
  	  Request request = new Request();
  	  
  	  request.setFirstName(firstName);
  	  request.setLastName(lastName);
  	  request.setLatitude(latitude);
  	  request.setLongitude(longitude);
  	  request.setBusiness(business);
  	  request.setEmail(email);
  	  request.setAddress(address);
  	  request.setComment(comment);
  	  request.setContact(contact);
  	  request.setImage(fileName);
  	  
  	  
  	  try {
		request.save();
		System.out.println("Saved...");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		result.put("error", "Could not save request");
		return badRequest(result);
	}
  	  result.put("success", "success");
  	  
  	  String adminEmail = Admin.find.findUnique().getEmail();
  	  
  	  Utilities.sendEmail("New Request Received", adminEmail , "Hi, You have a new request on the web dashboard.");
  	  
  	  
//  	  try {
//		Utilities.sendMessage("4158678494", "New request");
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
  	  return ok(result);
    }

}
