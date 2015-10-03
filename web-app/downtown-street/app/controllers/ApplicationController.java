package controllers;

import java.io.IOException;

import models.Admin;
import models.Request;
import modules.utilities.Setup;
import modules.utilities.Utilities;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Http.MultipartFormData.FilePart;
import play.mvc.Result;
import views.formdata.admin.AdminLoginForm;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ApplicationController extends Controller {

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
      ObjectNode result = Json.newObject();
  	  JsonNode json = request().body().asJson();
	  Http.MultipartFormData body = request().body().asMultipartFormData();
	  String fileName = "";
	  if( (fileName == null || fileName.length() == 0) && (body.getFiles() == null || body.getFiles().size() == 0)){
        	Utilities.deleteFile(fileName);
			fileName="";
	   }else if(body.getFiles().size() == 1 ){
		   FilePart pictureFile = body.getFile("picture");
			fileName = Utilities.uploadItemPicture(pictureFile);
	   }else{
			fileName = "";
	  }
	  
  	  String firstName = json.findPath("firstName").asText();
  	  String lastName = json.findPath("lastName").asText();
  	  String latitude = json.findPath("latitude").asText();
  	  String longitude = json.findPath("longitude").asText();
  	  String email = json.findPath("email").asText();
  	  String business = json.findPath("business").asText();
  	  String address = json.findPath("address").asText();
  	  String imagePath = json.findPath("image").asText();
  	  String comment = json.findPath("comment").asText();
  	
  	  if(latitude.equals("") || longitude.equals("")){
  		  result.put("error", "No longitude/latitude");
  		 return badRequest(result);
  	  }
  	  
  	  Request request = new Request();
  	  
  	  request.setFirstName(firstName);
  	  request.setLastName(lastName);
  	  request.setLatitude(latitude);
  	  request.setLongitude(longitude);
  	  request.setAddress(address);
  	  request.setComment(comment);
  	  request.save();
  	  
  	  result.put("success", "success");
  	  return ok(result);
    }

}
