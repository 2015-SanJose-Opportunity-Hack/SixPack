package views.formdata.admin;

import java.util.ArrayList;
import java.util.List;

import play.data.validation.ValidationError;

public class AdminLoggedInForm {
	
	public String name;
	
	public String id;
	
	public String reId;
	
	public List<ValidationError> validate(){
		List<ValidationError> errors = new ArrayList<ValidationError>();
		
		if( name.length() == 0 || name == null ){
			errors.add(new ValidationError("name", "Please enter your name"));
		}
		
		if( reId.length() == 0 || reId == null ){
			errors.add(new ValidationError("reId", "Please enter your student/employee ID again"));
		}
		
		if( id.length() == 0 || id == null ){
			errors.add(new ValidationError("id", "Please enter your student/employee ID again"));
		}
		
		if( id.length() > 0 && id != null && reId.length() > 0 && reId != null && !id.equals(reId)){
			errors.add(new ValidationError("id", "Your IDs do not match."));
		}
		
			
		return errors.size() > 0? errors: null;
	}

}
