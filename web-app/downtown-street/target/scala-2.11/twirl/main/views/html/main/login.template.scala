
package views.html.main

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[views.formdata.admin.AdminLoginForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[views.formdata.admin.AdminLoginForm]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import views.html.bootstrap3._

Seq[Any](format.raw/*1.56*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Downtown Street")/*6.25*/ {_display_(Seq[Any](format.raw/*6.27*/("""

	"""),format.raw/*8.2*/("""<div class="col-md-6 login-form-container">
			<div class="login-form">
				  <h3 class="login-title"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Staff Login</h3>
			    	<form action="/authenticate" method="POST" class="form-horizontal">
    				
					  <div class="form-group ">
					    
					    <div class="col-sm-12">
					      <input type="text" class="form-control" id="username" name="username" value="" placeholder="Username">
					      <span class="help-block"></span>
					      <span class="help-block"></span>
					    </div>
					  </div>
					
											        	
									       	
					
					  <div class="form-group ">
					    
					    <div class="col-sm-12">
					      <input type="password" class="form-control" id="password" name="password" value="" placeholder="Password">
					      <span class="help-block"></span>
					      <span class="help-block"></span>
					    </div>
					  </div>
					
					<button type="submit" class="btn-default btn btn-primary">Login</button>
						<div class="forgot-password-container">
						    <a href="#" title="Forgot Password" class="forgot-password">Forgot Password</a>
						</div>
					</form>
			</div>
						  
	</div>
""")))}),format.raw/*42.2*/("""
"""))}
  }

  def render(loginForm:Form[views.formdata.admin.AdminLoginForm]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[views.formdata.admin.AdminLoginForm]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Oct 03 19:40:12 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/main/login.scala.html
                  HASH: 1b026e549a0059b7a2b433af4c5493dba28c2015
                  MATRIX: 763->1|951->55|979->106|1006->108|1037->131|1076->133|1105->136|2350->1351
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|69->42
                  -- GENERATED --
              */
          