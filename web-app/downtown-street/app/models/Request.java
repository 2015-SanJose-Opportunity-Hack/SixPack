package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
@Table(name="request")
public class Request extends Model{

	private static final long serialVersionUID = 1L;

	@Id
	@Required
	private int id;
	
	@Required
	private String firstName;
	
	@Required
	private String lastName;
	
	@Required
	private String image;
	
	private Date createdAt = new Date();
	
	private String resolvedImage;

	private String contact = "";
	
	private String comment = "";
	
	private String latitude = "";
	
	private String longitude = "";
	
	private String address = "";
	
	private String email = "";
	
	private String business = "";
	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	private boolean isResolved = false;

	public int getId() {
		return id;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isResolved() {
		return isResolved;
	}

	public void setResolved(boolean isResolved) {
		this.isResolved = isResolved;
	}
	
	
	public String getResolvedImage() {
		return resolvedImage;
	}

	public void setResolvedImage(String resolvedImage) {
		this.resolvedImage = resolvedImage;
	}
	

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	
	public static Finder<Integer, Request> find =  new Finder<Integer, Request>(Integer.class, Request.class);
	
}
