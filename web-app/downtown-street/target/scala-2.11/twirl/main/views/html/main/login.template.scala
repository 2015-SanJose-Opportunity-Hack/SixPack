
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
	
	
	"""),format.raw/*9.2*/("""<div class="col-md-6">
			<div class="panel panel-default">
			  <div class="panel-heading">
			      <h3 class="panel-title">Staff Login</h3>
			  </div>
			  <div class="panel-body">
			    	"""),_display_(/*15.10*/form(routes.AdminController.authenticateLogin(), 'class -> "form-horizontal")/*15.87*/{_display_(Seq[Any](format.raw/*15.88*/("""
				    	"""),_display_(/*16.11*/text(loginForm("username"),
						        	label = "Username",
						        	placeholder = "Username)")),format.raw/*18.42*/("""
						        	
				       	"""),_display_(/*20.14*/password(loginForm("password"),
						        	label = "Password",
						        	placeholder = "Password (required)")),format.raw/*22.52*/("""
						"""),format.raw/*23.7*/("""<button type="submit" class="btn-default btn btn-primary pull-right">Login</button>
				    """)))}),format.raw/*24.10*/("""
			  """),format.raw/*25.6*/("""</div>
			</div>
	</div>
""")))}),format.raw/*28.2*/("""
"""))}
  }

  def render(loginForm:Form[views.formdata.admin.AdminLoginForm]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[views.formdata.admin.AdminLoginForm]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Oct 03 15:17:05 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/main/login.scala.html
                  HASH: 0bd4f559f721684953a0def7f10147b42c6b917c
                  MATRIX: 763->1|951->55|979->106|1006->108|1037->131|1076->133|1108->139|1329->333|1415->410|1454->411|1492->422|1617->526|1674->556|1813->674|1847->681|1971->774|2004->780|2060->806
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|36->9|42->15|42->15|42->15|43->16|45->18|47->20|49->22|50->23|51->24|52->25|55->28
                  -- GENERATED --
              */
          