package views.formdata.admin;

import java.util.ArrayList;
import java.util.List;

import models.Admin;
import modules.utilities.Utilities;
import play.data.validation.ValidationError;
import play.mvc.Http;

public class SettingsForm {
	
	public String newPassword="";
	
	public String rePassword="";
	
	public String oldPassword="";
	
	public String contact="";
	
	public String username="";
	
	public String email = "";
	
	public List<ValidationError> validate(){
		List<ValidationError> errors = new ArrayList<ValidationError>();
		
		if( contact == null || contact.length() == 0 ){
			errors.add(new ValidationError("adminPhone", "Admin contact cannot be left blank"));
		}
		
		if( email == null || email.length() == 0 ){
			errors.add(new ValidationError("email", "Email cannot be left blank"));
		}
		
		if( username.length() > 0 && !Utilities.isValidUsername(username) ){
			errors.add(new ValidationError("username", "Invalid username. Username should be minimum 6 characters with a-z, 0-9, _ and -"));
		}
		
		if(username.length() > 0 && !username.equals(Http.Context.current().session().get("username")) && Admin.find.where().eq("username", username).findRowCount() > 0){
			errors.add(new ValidationError("username", "Username Already Exists! Please try a different Username"));
		}
		
		if( newPassword.length() > 0 && (newPassword.length() < 6 || newPassword.length() >20 )){
			errors.add(new ValidationError("newPassword", "Password should be 6-20 characters long"));
		}
		
		if( newPassword.length() > 0 && (rePassword.length() == 0 || rePassword == null )){
			errors.add(new ValidationError("rePassword", "Please fill the password again"));
		}
		
		if( oldPassword.length() > 0 && !Admin.authenticateAdmin(Http.Context.current().session().get("username"), oldPassword) ){
			errors.add(new ValidationError("oldPassword", "Invalid password. Try again. If problem persists, contact admin."));
		}
		
		if( !newPassword.equals(rePassword)){
			errors.add(new ValidationError("password", "Passwords do not match. Please fill the passwords carefully"));
		}
		
		return errors.size() > 0 ? errors : null;
	}

}
