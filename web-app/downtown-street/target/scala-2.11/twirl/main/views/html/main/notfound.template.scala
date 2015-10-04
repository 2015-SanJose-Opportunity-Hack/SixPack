
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
object notfound extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import views.html.bootstrap3._

Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*5.1*/("""

"""),_display_(/*7.2*/main(title)/*7.13*/ {_display_(Seq[Any](format.raw/*7.15*/("""
		
			"""),format.raw/*9.4*/("""<div class="col-md-12 login-wrap text-center">
			
				<h3 class="text-center"> Not Found!</h3>
			        Looks like the stuff you are looking for in the system doesn't exists!
			        
			</div>
		
	

""")))}),format.raw/*18.2*/("""
"""))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Oct 03 19:40:12 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/main/notfound.scala.html
                  HASH: a23067300aa145e429a5d0ff6924e5e76d246239
                  MATRIX: 731->1|880->16|908->67|936->70|955->81|994->83|1027->90|1264->297
                  LINES: 26->1|30->1|32->5|34->7|34->7|34->7|36->9|45->18
                  -- GENERATED --
              */
          