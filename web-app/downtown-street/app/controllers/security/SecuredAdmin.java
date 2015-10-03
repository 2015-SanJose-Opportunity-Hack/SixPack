package controllers.security;

import models.Admin;
import play.mvc.Http.Context;
import play.mvc.Result;
import play.mvc.Security;
import controllers.routes;

public class SecuredAdmin extends Security.Authenticator{
	
	@Override
	public Result onUnauthorized(Context context) {
	    return redirect(routes.AdminController.login()); 
	}
	
	public static String getAdminUsername(Context ctx) {
		return ctx.session().get("username");
	}
	
	public static boolean isLoggedIn(Context ctx) {
	    return (getAdminUsername(ctx) != null);
	}
	
	public static Admin getAdminInfo(Context ctx){
		return (isLoggedIn(ctx)? Admin.getAdminInfo(getAdminUsername(ctx)): null);
	}

}
