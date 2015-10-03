package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import modules.utilities.Utilities;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
@Table(name="admin")
public class Admin extends Model{

	private static final long serialVersionUID = 5854422586239724109L;
	
	@Id
	private long id;
	
	@Required
	private String username;
	
	@Required
	private String password;
	
	@Required
	private String email;
	
	@Required
	private String contact;
	
	public static Finder<Integer, Admin> find =  new Finder<Integer, Admin>(Integer.class, Admin.class);
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * Function to validate the login for admin
	 * @param username username of the admin
	 * @param password password (without hash) of the admin
	 * @return true if valid login, otherwise false
	 */
	public static boolean authenticateAdmin(String username, String password){
		if(find.where().eq("username", username).eq("password", Utilities.getMD5Hash(password)).findRowCount() ==1 ){
			return true;
		}
		return false;
	}
	
	public static boolean isOldPasswordValid(String oldPassword){
		Admin admin = find.byId(1);
		return admin.getPassword().equals(oldPassword);
	}
	
	/**
	 * Function to get Admin information via Admin object
	 * @param username username of the admin
	 * @return return Admin Object which contains all the info about admin
	 */
	public static Admin getAdminInfo(String username){
		return find.where().eq("username", username).findUnique();
	}
	
}