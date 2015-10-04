
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
object about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import views.html.bootstrap3._

Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*5.1*/("""

"""),_display_(/*7.2*/main(title)/*7.13*/ {_display_(Seq[Any](format.raw/*7.15*/("""
		
			"""),format.raw/*9.4*/("""<div class="col-md-12 login-wrap text-center">
			
				<h3 class="text-center"> """),_display_(/*11.31*/title),format.raw/*11.36*/(""" """),format.raw/*11.37*/("""</h3>
			       
			      <div class="col-md-12">
			      		
			      		
			      		
			      </div> 
			      
			        
			</div>
		
	

""")))}),format.raw/*24.2*/("""
"""))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 11:01:07 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/main/about.scala.html
                  HASH: acae64433f953702da50107afb84041ff512ca0d
                  MATRIX: 728->1|877->16|905->67|933->70|952->81|991->83|1024->90|1132->171|1158->176|1187->177|1359->319
                  LINES: 26->1|30->1|32->5|34->7|34->7|34->7|36->9|38->11|38->11|38->11|51->24
                  -- GENERATED --
              */
          