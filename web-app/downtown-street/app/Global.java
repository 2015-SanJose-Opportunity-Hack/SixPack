import static play.mvc.Results.notFound;
import modules.utilities.Utilities;
import play.*;
import play.mvc.*;
import play.mvc.Http.*;
import play.libs.F.*;

public class Global extends GlobalSettings {

	public Promise<Result> onHandlerNotFound(RequestHeader request) {
		return Promise.<Result> pure(notFound(views.html.main.notfound
				.render(request.uri())));
	}

	public Promise<Result> onError(RequestHeader request, Throwable t) {
		String message = "Error Message : " + t.getMessage() + "  CAUSED BY : "
				+ t.getCause() + " \n \n STACK: " + t.getStackTrace();
		// Utilities.sendEmail("ERROR LOG", "harsh.malewar@sjsu.edu", message);
		return Promise.<Result> pure(Results
				.internalServerError(views.html.main.error
						.render("Some Problem")));
	}

	public void onStart(Application app) {
		Logger.info("Application has started");

	}

	public void onStop(Application app) {
		Logger.info("Application shutdown...");
		String message = "The application server has been stopped";
		// Utilities.sendEmail("Application Stopped", "harsh.malewar@sjsu.edu",
		// message);
	}

	// For CORS
	private class ActionWrapper extends Action.Simple {
		public ActionWrapper(Action<?> action) {
			this.delegate = action;
		}

		@Override
		public Promise<Result> call(Http.Context ctx)
				throws java.lang.Throwable {
			Promise<Result> result = this.delegate.call(ctx);
			Http.Response response = ctx.response();
			response.setHeader("Access-Control-Allow-Origin", "*");
			return result;
		}
	}

	@Override
	public Action<?> onRequest(Http.Request request,
			java.lang.reflect.Method actionMethod) {
		return new ActionWrapper(super.onRequest(request, actionMethod));
	}

}