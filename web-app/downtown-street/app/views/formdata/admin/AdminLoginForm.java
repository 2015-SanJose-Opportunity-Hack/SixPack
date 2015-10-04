package views.formdata.admin;

import java.util.ArrayList;
import java.util.List;

import models.Admin;
import modules.utilities.Utilities;
import play.data.validation.ValidationError;

public class AdminLoginForm {

	public String username;
	
	public String password;
	
	public List<ValidationError> validate(){
		List<ValidationError> errors = new ArrayList<ValidationError>();
		if( username.length() == 0 || username == null ){
			errors.add(new ValidationError("username", "Username cannot be left blank"));
		}
		
		if( password.length() == 0 || password == null ){
			errors.add(new ValidationError("password", "Password cannot be left blank"));
		}
		
		if( username.length()>0 && password.length() > 0 && username != null && password != null ){
			if( Admin.find.where().eq("username", username).eq("password", Utilities.getMD5Hash(password)).findRowCount() != 1 ){
				errors.add(new ValidationError("form", "Invalid login. Please try again"));
			}
		}
		return (errors.size() > 0 ) ? errors : null;
	}
	
	//getter setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
