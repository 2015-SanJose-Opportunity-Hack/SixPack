package controllers;

import java.io.IOException;

import models.Admin;
import models.Request;
import modules.utilities.Setup;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
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
	  
	  
	  
	  	String firstName = "";
		String lastName= "";
		String latitude= "";
		String longitude= "";
		String address= "";
		String comment= "";
		String email = "";
		String image = "";
		String business = "";
	
	try {
		  firstName = json.findPath("firstName").asText();
		  lastName = json.findPath("lastName").asText();
		  latitude = json.findPath("latitude").asText();
		  longitude = json.findPath("longitude").asText();
		  email = json.findPath("email").asText();
		  //business = json.findPath("business").asText();
		  //address = json.findPath("address").asText();
		  image = json.findPath("image").asText();
		  //comment = json.findPath("comment").asText();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

  	  
  	  Request request = new Request();
  	  
  	  request.setFirstName(firstName);
  	  request.setLastName(lastName);
  	  request.setLatitude(latitude);
  	  request.setLongitude(longitude);
  	  
  	  //request.setAddress(address);
  	  //request.setComment(comment);
  	  request.setImage(image);
  	  request.save();
  	  
  	  result.put("success", "success");
  	  return ok(result);
    }

}
