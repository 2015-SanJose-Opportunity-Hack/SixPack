// @SOURCE:/Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/conf/routes
// @HASH:f3fe5ee664547a443b571e3223003e2b04aa57a7
// @DATE:Sat Oct 03 15:17:04 PDT 2015


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
private[this] lazy val controllers_ApplicationController_requestRestCall11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("request/v1"))))
private[this] lazy val controllers_ApplicationController_requestRestCall11_invoker = createInvoker(
controllers.ApplicationController.requestRestCall(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ApplicationController", "requestRestCall", Nil,"POST", """""", Routes.prefix + """request/v1"""))
        

// @LINE:30
private[this] lazy val controllers_Assets_at12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at12_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.ApplicationController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.ApplicationController.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.ApplicationController.aboutProject()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """not-found""","""controllers.ApplicationController.errorNotFound()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """error""","""controllers.ApplicationController.error()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.AdminController.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate""","""controllers.AdminController.authenticateLogin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dashboard""","""controllers.AdminController.dashboard()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """settings""","""controllers.AdminController.settings()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """settings""","""controllers.AdminController.updateSettings()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """error/not-found""","""controllers.AdminController.errorNotFound()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """request/v1""","""controllers.ApplicationController.requestRestCall()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_ApplicationController_requestRestCall11_route(params) => {
   call { 
        controllers_ApplicationController_requestRestCall11_invoker.call(controllers.ApplicationController.requestRestCall())
   }
}
        

// @LINE:30
case controllers_Assets_at12_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at12_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     