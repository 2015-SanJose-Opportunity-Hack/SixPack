// @SOURCE:/Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/conf/routes
// @HASH:7c8476fc74761ef12fa768130f4c2dfe3283988f
// @DATE:Sun Oct 04 11:23:23 PDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:41
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:3
package controllers {

// @LINE:28
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:3
class ReverseApplicationController {


// @LINE:7
def aboutProject(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "about")
}
                        

// @LINE:28
def requestRestCall(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "request/v1")
}
                        

// @LINE:5
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:9
def errorNotFound(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "not-found")
}
                        

// @LINE:3
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:11
def error(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "error")
}
                        

}
                          

// @LINE:41
class ReverseAssets {


// @LINE:41
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:30
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
class ReverseAdminController {


// @LINE:22
def updateSettings(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "settings")
}
                        

// @LINE:16
def authenticateLogin(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "authenticate")
}
                        

// @LINE:36
def locations(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "locations")
}
                        

// @LINE:34
def visualizations(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "visualize")
}
                        

// @LINE:26
def viewRequest(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "request/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:38
def allRequestAjax(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "request")
}
                        

// @LINE:18
def dashboard(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dashboard")
}
                        

// @LINE:20
def settings(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "settings")
}
                        

// @LINE:32
def unresolveRequest(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "request/unresolve/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:30
def resolveRequest(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "request/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:24
def errorNotFound(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "error/not-found")
}
                        

// @LINE:14
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          
}
                  


// @LINE:41
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:3
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:28
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:3
class ReverseApplicationController {


// @LINE:7
def aboutProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ApplicationController.aboutProject",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
   """
)
                        

// @LINE:28
def requestRestCall : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ApplicationController.requestRestCall",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "request/v1"})
      }
   """
)
                        

// @LINE:5
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ApplicationController.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:9
def errorNotFound : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ApplicationController.errorNotFound",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "not-found"})
      }
   """
)
                        

// @LINE:3
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ApplicationController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:11
def error : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ApplicationController.error",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "error"})
      }
   """
)
                        

}
              

// @LINE:41
class ReverseAssets {


// @LINE:41
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:30
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
class ReverseAdminController {


// @LINE:22
def updateSettings : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminController.updateSettings",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settings"})
      }
   """
)
                        

// @LINE:16
def authenticateLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminController.authenticateLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate"})
      }
   """
)
                        

// @LINE:36
def locations : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminController.locations",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "locations"})
      }
   """
)
                        

// @LINE:34
def visualizations : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminController.visualizations",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "visualize"})
      }
   """
)
                        

// @LINE:26
def viewRequest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminController.viewRequest",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "request/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:38
def allRequestAjax : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminController.allRequestAjax",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "request"})
      }
   """
)
                        

// @LINE:18
def dashboard : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminController.dashboard",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
      }
   """
)
                        

// @LINE:20
def settings : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminController.settings",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings"})
      }
   """
)
                        

// @LINE:32
def unresolveRequest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminController.unresolveRequest",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "request/unresolve/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:30
def resolveRequest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminController.resolveRequest",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "request/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:24
def errorNotFound : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminController.errorNotFound",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "error/not-found"})
      }
   """
)
                        

// @LINE:14
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminController.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              
}
        


// @LINE:41
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:3
package controllers.ref {


// @LINE:28
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:3
class ReverseApplicationController {


// @LINE:7
def aboutProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ApplicationController.aboutProject(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ApplicationController", "aboutProject", Seq(), "GET", """""", _prefix + """about""")
)
                      

// @LINE:28
def requestRestCall(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ApplicationController.requestRestCall(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ApplicationController", "requestRestCall", Seq(), "POST", """""", _prefix + """request/v1""")
)
                      

// @LINE:5
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ApplicationController.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ApplicationController", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:9
def errorNotFound(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ApplicationController.errorNotFound(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ApplicationController", "errorNotFound", Seq(), "GET", """""", _prefix + """not-found""")
)
                      

// @LINE:3
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ApplicationController.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ApplicationController", "index", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:11
def error(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ApplicationController.error(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ApplicationController", "error", Seq(), "GET", """""", _prefix + """error""")
)
                      

}
                          

// @LINE:41
class ReverseAssets {


// @LINE:41
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:30
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
class ReverseAdminController {


// @LINE:22
def updateSettings(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminController.updateSettings(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "updateSettings", Seq(), "POST", """""", _prefix + """settings""")
)
                      

// @LINE:16
def authenticateLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminController.authenticateLogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "authenticateLogin", Seq(), "POST", """""", _prefix + """authenticate""")
)
                      

// @LINE:36
def locations(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminController.locations(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "locations", Seq(), "GET", """""", _prefix + """locations""")
)
                      

// @LINE:34
def visualizations(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminController.visualizations(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "visualizations", Seq(), "GET", """""", _prefix + """visualize""")
)
                      

// @LINE:26
def viewRequest(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminController.viewRequest(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "viewRequest", Seq(classOf[Integer]), "GET", """""", _prefix + """request/$id<[^/]+>""")
)
                      

// @LINE:38
def allRequestAjax(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminController.allRequestAjax(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "allRequestAjax", Seq(), "GET", """""", _prefix + """request""")
)
                      

// @LINE:18
def dashboard(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminController.dashboard(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "dashboard", Seq(), "GET", """""", _prefix + """dashboard""")
)
                      

// @LINE:20
def settings(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminController.settings(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "settings", Seq(), "GET", """""", _prefix + """settings""")
)
                      

// @LINE:32
def unresolveRequest(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminController.unresolveRequest(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "unresolveRequest", Seq(classOf[Integer]), "GET", """""", _prefix + """request/unresolve/$id<[^/]+>""")
)
                      

// @LINE:30
def resolveRequest(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminController.resolveRequest(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "resolveRequest", Seq(classOf[Integer]), "POST", """""", _prefix + """request/$id<[^/]+>""")
)
                      

// @LINE:24
def errorNotFound(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminController.errorNotFound(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "errorNotFound", Seq(), "GET", """""", _prefix + """error/not-found""")
)
                      

// @LINE:14
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminController.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

}
                          
}
        
    