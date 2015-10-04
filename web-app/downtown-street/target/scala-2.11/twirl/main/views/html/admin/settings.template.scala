
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
object settings extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Boolean,Form[views.formdata.admin.SettingsForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, isLoggedIn: Boolean, settingsForm: Form[views.formdata.admin.SettingsForm]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import views.html.bootstrap3._

Seq[Any](format.raw/*1.93*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/backend(title, isLoggedIn)/*6.28*/ {_display_(Seq[Any](format.raw/*6.30*/("""
	
	"""),format.raw/*8.2*/("""<h2>"""),_display_(/*8.7*/title),format.raw/*8.12*/(""" """),format.raw/*8.13*/("""<small> | Update your account settings</small></h2>
	<hr>
	
	<div class="col m6">
		"""),_display_(/*12.4*/form(routes.AdminController.updateSettings(), 'class -> "form-horizontal")/*12.78*/{_display_(Seq[Any](format.raw/*12.79*/("""
			
				"""),_display_(/*14.6*/text(settingsForm("username"),
		        	label = "Username",
		        	placeholder = "Username (required)")),format.raw/*16.48*/("""
		        

				"""),_display_(/*19.6*/password(settingsForm("oldPassword"),
		        	label = "Old Password",
		        	placeholder = "Department Old password",
		        	help = "6-20 characters"
		        	)),format.raw/*23.13*/("""
		        	
	       		"""),_display_(/*25.12*/password(settingsForm("newPassword"),
		        	label = "New Password",
		        	placeholder = "Department's new password (required)",
		        	help = "6-20 characters"
		        	)),format.raw/*29.13*/("""
		
				"""),_display_(/*31.6*/password(settingsForm("rePassword"),
		        	label = "Password again",
		        	placeholder = "Password again (required)")),format.raw/*33.54*/("""
				
				"""),_display_(/*35.6*/email(settingsForm("email"),
					label = "Email",
					placeholder = "Email"
				)),format.raw/*38.6*/("""
						        
				"""),_display_(/*40.6*/text(settingsForm("contact"),
		        	label = "Contact",
		        	placeholder = "Contact (required)")),format.raw/*42.47*/("""
		        	
				"""),format.raw/*44.5*/("""<button type="submit" class="btn-default btn btn-primary pull-right">Update Settings</button>			
		""")))}),format.raw/*45.4*/("""
	"""),format.raw/*46.2*/("""</div>
	
	
	
	
""")))}))}
  }

  def render(title:String,isLoggedIn:Boolean,settingsForm:Form[views.formdata.admin.SettingsForm]): play.twirl.api.HtmlFormat.Appendable = apply(title,isLoggedIn,settingsForm)

  def f:((String,Boolean,Form[views.formdata.admin.SettingsForm]) => play.twirl.api.HtmlFormat.Appendable) = (title,isLoggedIn,settingsForm) => apply(title,isLoggedIn,settingsForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 11:01:07 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/settings.scala.html
                  HASH: d1d6e98a556d8512d60abd7e445efdb8996455fe
                  MATRIX: 780->1|1005->92|1033->143|1060->145|1094->171|1133->173|1163->177|1193->182|1218->187|1246->188|1357->273|1440->347|1479->348|1515->358|1645->467|1689->485|1883->658|1934->682|2141->868|2176->877|2324->1004|2361->1015|2464->1098|2511->1119|2638->1225|2682->1242|2812->1342|2841->1344
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|35->8|35->8|35->8|39->12|39->12|39->12|41->14|43->16|46->19|50->23|52->25|56->29|58->31|60->33|62->35|65->38|67->40|69->42|71->44|72->45|73->46
                  -- GENERATED --
              */
          