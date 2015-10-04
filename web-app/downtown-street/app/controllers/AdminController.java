package controllers;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import models.Admin;
import models.Request;
import modules.utilities.Utilities;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Http.MultipartFormData.FilePart;
import play.mvc.Result;
import play.mvc.Security;
import views.formdata.admin.AdminLoginForm;
import views.formdata.admin.SettingsForm;
import controllers.security.SecuredAdmin;

public class AdminController extends Controller {

	private final static String directoryPath = play.Play.application()
			.configuration().getString("inventory.imagePath");
	
	
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
		List<Request> requestList = Request.find.all();
		return ok(views.html.admin.dashboard.render("Dashboard",
				SecuredAdmin.isLoggedIn(ctx()), admin, requestList));
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
		admin.setUsername(settingsForm.get().username);
		
		admin.setContact(settingsForm.get().contact);
		
		admin.update();
		if (settingsForm.get().oldPassword.length() > 6
				&& (settingsForm.get().rePassword
						.equals(settingsForm.get().newPassword))) {
			admin
					.setPassword(Utilities.getMD5Hash(settingsForm.get().newPassword));
		}
		return redirect(routes.AdminController.settings());
	}

	
	// check if information is filled
	private static boolean isLoggedInInfoFilled() {
		if (session().get("name") == null || session().get("id") == null
				|| session().get("name").length() == 0
				|| session("id").length() == 0) {
			return false;
		}
		return true;
	}

	// get loggedin user information
	private static String loggedInUserInfo() {
		return session().get("name") + " - " + session().get("id");
	}

	//upload a picture
	private static String uploadItemPicture(FilePart file) {
		String directoryPath = play.Play.application().configuration()
				.getString("inventory.imagePath");
		String fileName = "";
		FilePart pictureFile = file;
		try {
			String tempName = pictureFile.getFilename();
			String fileDetails[] = tempName.split("\\.");
			String fileExtension = fileDetails[fileDetails.length - 1];
			fileName = Utilities.getRandomUID() + "." + fileExtension;
			File destination = new File(directoryPath, fileName);
			pictureFile.getFile().renameTo(destination);
		} catch (Exception e) {
			return "";
		}
		return fileName;
	}

	// deleting a file
	private static boolean deleteFile(String fileName) {
		String filePath = directoryPath + fileName;
		try {
			File file = new File(filePath);
			file.delete();
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	// get image path from file system
	private static String getImagePath(String fileName) {
		String directoryPath = play.Play.application().configuration()
				.getString("inventory.imagePath");
		String filePath = directoryPath + fileName;
		File file = null;
		String fileUrl = "";
		try {
			file = new File(filePath);
			URI uri = file.toURI();
			fileUrl = uri.resolve(uri).toString();
		} catch (Exception e) {
			return "";
		}
		return fileUrl;
	}	
}
