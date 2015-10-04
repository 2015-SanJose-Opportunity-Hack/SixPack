
package views.html.admin

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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Boolean,Form[views.formdata.admin.AdminLoginForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, isLoggedIn: Boolean, adminLoginForm: Form[views.formdata.admin.AdminLoginForm]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import views.html.bootstrap3._

Seq[Any](format.raw/*1.97*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/backend(title, isLoggedIn)/*6.28*/ {_display_(Seq[Any](format.raw/*6.30*/("""

	"""),format.raw/*8.2*/("""<div class="col m6">
		<div class="panel panel-info">
				  <div class="panel-heading">
				      <h3 class="panel-title">Admin Safety Tips</h3>
				  </div>
				  <div class="panel-body">
						<ul>
							<li>Keep your password private</li>
							<li>Do not share this login link with anyone</li>
							<li>Report suspicious activities to admin immediately</li>
						</ul> 
				  </div>
				</div>
	</div>

	<div class="col m6">
				<div class="panel panel-default">
				  <div class="panel-heading">
				      <h3 class="panel-title">Staff Login</h3>
				  </div>
				  <div class="panel-body">
						  """),_display_(/*29.10*/if(adminLoginForm.hasErrors)/*29.38*/{_display_(Seq[Any](format.raw/*29.39*/("""
				  			"""),format.raw/*30.10*/("""<div class="alert alert-danger" role="alert">Username or Password do not match. Please try again</div>
				  		""")))}),format.raw/*31.10*/("""
			    
				    	"""),_display_(/*33.11*/form(routes.AdminController.authenticateLogin(), 'class -> "form-horizontal")/*33.88*/{_display_(Seq[Any](format.raw/*33.89*/("""
					    	"""),_display_(/*34.12*/text(adminLoginForm("username"),
							        	label = "Username",
							        	placeholder = "Username)")),format.raw/*36.43*/("""
							        	
					       	"""),_display_(/*38.15*/password(adminLoginForm("password"),
							        	label = "Password",
							        	placeholder = "Password (required)")),format.raw/*40.53*/("""
							
				    		"""),format.raw/*42.11*/("""<button type="submit" class="btn-default btn btn-primary pull-right">Staff Login</button>
					    	
					    """)))}),format.raw/*44.11*/("""
				  """),format.raw/*45.7*/("""</div>
				</div>
		</div>
	
""")))}))}
  }

  def render(title:String,isLoggedIn:Boolean,adminLoginForm:Form[views.formdata.admin.AdminLoginForm]): play.twirl.api.HtmlFormat.Appendable = apply(title,isLoggedIn,adminLoginForm)

  def f:((String,Boolean,Form[views.formdata.admin.AdminLoginForm]) => play.twirl.api.HtmlFormat.Appendable) = (title,isLoggedIn,adminLoginForm) => apply(title,isLoggedIn,adminLoginForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 11:33:07 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/login.scala.html
                  HASH: 268217974bb041a46beabb420fb687e2f83d2b24
                  MATRIX: 779->1|1008->96|1036->147|1063->149|1097->175|1136->177|1165->180|1802->790|1839->818|1878->819|1916->829|2059->941|2105->960|2191->1037|2230->1038|2269->1050|2401->1161|2460->1193|2606->1318|2653->1337|2795->1448|2829->1455
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|56->29|56->29|56->29|57->30|58->31|60->33|60->33|60->33|61->34|63->36|65->38|67->40|69->42|71->44|72->45
                  -- GENERATED --
              */
          