// @SOURCE:/Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/conf/routes
// @HASH:7c8476fc74761ef12fa768130f4c2dfe3283988f
// @DATE:Sun Oct 04 11:23:23 PDT 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:3
private[this] lazy val controllers_ApplicationController_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_ApplicationController_index0_invoker = createInvoker(
controllers.ApplicationController.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ApplicationController", "index", Nil,"GET", """""", Routes.prefix + """"""))
        

// @LINE:5
private[this] lazy val controllers_ApplicationController_logout1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_ApplicationController_logout1_invoker = createInvoker(
controllers.ApplicationController.logout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ApplicationController", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:7
private[this] lazy val controllers_ApplicationController_aboutProject2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
private[this] lazy val controllers_ApplicationController_aboutProject2_invoker = createInvoker(
controllers.ApplicationController.aboutProject(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ApplicationController", "aboutProject", Nil,"GET", """""", Routes.prefix + """about"""))
        

// @LINE:9
private[this] lazy val controllers_ApplicationController_errorNotFound3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("not-found"))))
private[this] lazy val controllers_ApplicationController_errorNotFound3_invoker = createInvoker(
controllers.ApplicationController.errorNotFound(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ApplicationController", "errorNotFound", Nil,"GET", """""", Routes.prefix + """not-found"""))
        

// @LINE:11
private[this] lazy val controllers_ApplicationController_error4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("error"))))
private[this] lazy val controllers_ApplicationController_error4_invoker = createInvoker(
controllers.ApplicationController.error(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ApplicationController", "error", Nil,"GET", """""", Routes.prefix + """error"""))
        

// @LINE:14
private[this] lazy val controllers_AdminController_login5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_AdminController_login5_invoker = createInvoker(
controllers.AdminController.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "login", Nil,"GET", """""", Routes.prefix + """login"""))
        

// @LINE:16
private[this] lazy val controllers_AdminController_authenticateLogin6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate"))))
private[this] lazy val controllers_AdminController_authenticateLogin6_invoker = createInvoker(
controllers.AdminController.authenticateLogin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "authenticateLogin", Nil,"POST", """""", Routes.prefix + """authenticate"""))
        

// @LINE:18
private[this] lazy val controllers_AdminController_dashboard7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dashboard"))))
private[this] lazy val controllers_AdminController_dashboard7_invoker = createInvoker(
controllers.AdminController.dashboard(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "dashboard", Nil,"GET", """""", Routes.prefix + """dashboard"""))
        

// @LINE:20
private[this] lazy val controllers_AdminController_settings8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("settings"))))
private[this] lazy val controllers_AdminController_settings8_invoker = createInvoker(
controllers.AdminController.settings(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "settings", Nil,"GET", """""", Routes.prefix + """settings"""))
        

// @LINE:22
private[this] lazy val controllers_AdminController_updateSettings9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("settings"))))
private[this] lazy val controllers_AdminController_updateSettings9_invoker = createInvoker(
controllers.AdminController.updateSettings(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "updateSettings", Nil,"POST", """""", Routes.prefix + """settings"""))
        

// @LINE:24
private[this] lazy val controllers_AdminController_errorNotFound10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("error/not-found"))))
private[this] lazy val controllers_AdminController_errorNotFound10_invoker = createInvoker(
controllers.AdminController.errorNotFound(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "errorNotFound", Nil,"GET", """""", Routes.prefix + """error/not-found"""))
        

// @LINE:26
private[this] lazy val controllers_AdminController_viewRequest11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("request/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_AdminController_viewRequest11_invoker = createInvoker(
controllers.AdminController.viewRequest(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "viewRequest", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """request/$id<[^/]+>"""))
        

// @LINE:28
private[this] lazy val controllers_ApplicationController_requestRestCall12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("request/v1"))))
private[this] lazy val controllers_ApplicationController_requestRestCall12_invoker = createInvoker(
controllers.ApplicationController.requestRestCall(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ApplicationController", "requestRestCall", Nil,"POST", """""", Routes.prefix + """request/v1"""))
        

// @LINE:30
private[this] lazy val controllers_AdminController_resolveRequest13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("request/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_AdminController_resolveRequest13_invoker = createInvoker(
controllers.AdminController.resolveRequest(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "resolveRequest", Seq(classOf[Integer]),"POST", """""", Routes.prefix + """request/$id<[^/]+>"""))
        

// @LINE:32
private[this] lazy val controllers_AdminController_unresolveRequest14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("request/unresolve/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_AdminController_unresolveRequest14_invoker = createInvoker(
controllers.AdminController.unresolveRequest(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "unresolveRequest", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """request/unresolve/$id<[^/]+>"""))
        

// @LINE:34
private[this] lazy val controllers_AdminController_visualizations15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("visualize"))))
private[this] lazy val controllers_AdminController_visualizations15_invoker = createInvoker(
controllers.AdminController.visualizations(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "visualizations", Nil,"GET", """""", Routes.prefix + """visualize"""))
        

// @LINE:36
private[this] lazy val controllers_AdminController_locations16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("locations"))))
private[this] lazy val controllers_AdminController_locations16_invoker = createInvoker(
controllers.AdminController.locations(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "locations", Nil,"GET", """""", Routes.prefix + """locations"""))
        

// @LINE:38
private[this] lazy val controllers_AdminController_allRequestAjax17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("request"))))
private[this] lazy val controllers_AdminController_allRequestAjax17_invoker = createInvoker(
controllers.AdminController.allRequestAjax(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "allRequestAjax", Nil,"GET", """""", Routes.prefix + """request"""))
        

// @LINE:41
private[this] lazy val controllers_Assets_at18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at18_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.ApplicationController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.ApplicationController.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.ApplicationController.aboutProject()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """not-found""","""controllers.ApplicationController.errorNotFound()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """error""","""controllers.ApplicationController.error()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.AdminController.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate""","""controllers.AdminController.authenticateLogin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dashboard""","""controllers.AdminController.dashboard()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """settings""","""controllers.AdminController.settings()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """settings""","""controllers.AdminController.updateSettings()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """error/not-found""","""controllers.AdminController.errorNotFound()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """request/$id<[^/]+>""","""controllers.AdminController.viewRequest(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """request/v1""","""controllers.ApplicationController.requestRestCall()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """request/$id<[^/]+>""","""controllers.AdminController.resolveRequest(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """request/unresolve/$id<[^/]+>""","""controllers.AdminController.unresolveRequest(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """visualize""","""controllers.AdminController.visualizations()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """locations""","""controllers.AdminController.locations()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """request""","""controllers.AdminController.allRequestAjax()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:3
case controllers_ApplicationController_index0_route(params) => {
   call { 
        controllers_ApplicationController_index0_invoker.call(controllers.ApplicationController.index())
   }
}
        

// @LINE:5
case controllers_ApplicationController_logout1_route(params) => {
   call { 
        controllers_ApplicationController_logout1_invoker.call(controllers.ApplicationController.logout())
   }
}
        

// @LINE:7
case controllers_ApplicationController_aboutProject2_route(params) => {
   call { 
        controllers_ApplicationController_aboutProject2_invoker.call(controllers.ApplicationController.aboutProject())
   }
}
        

// @LINE:9
case controllers_ApplicationController_errorNotFound3_route(params) => {
   call { 
        controllers_ApplicationController_errorNotFound3_invoker.call(controllers.ApplicationController.errorNotFound())
   }
}
        

// @LINE:11
case controllers_ApplicationController_error4_route(params) => {
   call { 
        controllers_ApplicationController_error4_invoker.call(controllers.ApplicationController.error())
   }
}
        

// @LINE:14
case controllers_AdminController_login5_route(params) => {
   call { 
        controllers_AdminController_login5_invoker.call(controllers.AdminController.login())
   }
}
        

// @LINE:16
case controllers_AdminController_authenticateLogin6_route(params) => {
   call { 
        controllers_AdminController_authenticateLogin6_invoker.call(controllers.AdminController.authenticateLogin())
   }
}
        

// @LINE:18
case controllers_AdminController_dashboard7_route(params) => {
   call { 
        controllers_AdminController_dashboard7_invoker.call(controllers.AdminController.dashboard())
   }
}
        

// @LINE:20
case controllers_AdminController_settings8_route(params) => {
   call { 
        controllers_AdminController_settings8_invoker.call(controllers.AdminController.settings())
   }
}
        

// @LINE:22
case controllers_AdminController_updateSettings9_route(params) => {
   call { 
        controllers_AdminController_updateSettings9_invoker.call(controllers.AdminController.updateSettings())
   }
}
        

// @LINE:24
case controllers_AdminController_errorNotFound10_route(params) => {
   call { 
        controllers_AdminController_errorNotFound10_invoker.call(controllers.AdminController.errorNotFound())
   }
}
        

// @LINE:26
case controllers_AdminController_viewRequest11_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_AdminController_viewRequest11_invoker.call(controllers.AdminController.viewRequest(id))
   }
}
        

// @LINE:28
case controllers_ApplicationController_requestRestCall12_route(params) => {
   call { 
        controllers_ApplicationController_requestRestCall12_invoker.call(controllers.ApplicationController.requestRestCall())
   }
}
        

// @LINE:30
case controllers_AdminController_resolveRequest13_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_AdminController_resolveRequest13_invoker.call(controllers.AdminController.resolveRequest(id))
   }
}
        

// @LINE:32
case controllers_AdminController_unresolveRequest14_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_AdminController_unresolveRequest14_invoker.call(controllers.AdminController.unresolveRequest(id))
   }
}
        

// @LINE:34
case controllers_AdminController_visualizations15_route(params) => {
   call { 
        controllers_AdminController_visualizations15_invoker.call(controllers.AdminController.visualizations())
   }
}
        

// @LINE:36
case controllers_AdminController_locations16_route(params) => {
   call { 
        controllers_AdminController_locations16_invoker.call(controllers.AdminController.locations())
   }
}
        

// @LINE:38
case controllers_AdminController_allRequestAjax17_route(params) => {
   call { 
        controllers_AdminController_allRequestAjax17_invoker.call(controllers.AdminController.allRequestAjax())
   }
}
        

// @LINE:41
case controllers_Assets_at18_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at18_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     