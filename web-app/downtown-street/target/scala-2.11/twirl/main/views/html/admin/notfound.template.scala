
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
object notfound extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, isLoggedIn: Boolean):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/backend(title, isLoggedIn)/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""

    """),format.raw/*5.5*/("""<h2>Not found!</h2>
    </hr>
    Looks like the request you are looking for does not exists in the system.  
		 
     
	
""")))}),format.raw/*11.2*/("""
"""))}
  }

  def render(title:String,isLoggedIn:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(title,isLoggedIn)

  def f:((String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (title,isLoggedIn) => apply(title,isLoggedIn)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Oct 03 15:17:04 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/notfound.scala.html
                  HASH: 770670e605fa7c85cdf70bab70b3789c0129494a
                  MATRIX: 740->1|864->37|892->40|926->66|965->68|997->74|1150->197
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|39->11
                  -- GENERATED --
              */
          