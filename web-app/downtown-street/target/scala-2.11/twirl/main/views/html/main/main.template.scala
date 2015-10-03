
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
         <script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png")),format.raw/*10.97*/("""">
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/hello.js")),format.raw/*11.63*/("""" type="text/javascript"></script>
        
        
       
        <!-- Bootstrap imports -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
		<!-- End Bootstrap imports -->
		
		<link rel="stylesheet" media="screen" href=""""),_display_(/*21.48*/routes/*21.54*/.Assets.at("stylesheets/main.css")),format.raw/*21.88*/("""">
    </head>
    <body>
    
    <nav class="navbar navbar-inverse navbar-static-top">
	  <div class="container">
	     <div class="container-fluid">
		    <div class="navbar-header">
		      
		        <ul class="nav navbar-nav">
   		      		<li><a href=""""),_display_(/*31.28*/routes/*31.34*/.ApplicationController.index()),format.raw/*31.64*/(""""><strong>Downtown Street</strong> <span style="font-size: 9px">Beta v1.0</span></a></li>
		        </ul>
		      
		    </div>
		  </div>
    		    
    		    
    		  
    		    
	     
	  </div>
	</nav>
	
	<div class="container">
	    """),_display_(/*45.7*/content),format.raw/*45.14*/("""
	"""),format.raw/*46.2*/("""</div>
    
        
        
        
    </body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Oct 03 16:07:37 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/main/main.scala.html
                  HASH: 80e8fda044ef65a1a36dc01c70d70e4dc0e9ed7b
                  MATRIX: 732->1|850->31|878->33|955->84|980->89|1155->237|1170->243|1223->275|1275->300|1290->306|1345->340|1857->825|1872->831|1927->865|2214->1125|2229->1131|2280->1161|2545->1400|2573->1407|2602->1409
                  LINES: 26->1|29->1|31->3|35->7|35->7|38->10|38->10|38->10|39->11|39->11|39->11|49->21|49->21|49->21|59->31|59->31|59->31|73->45|73->45|74->46
                  -- GENERATED --
              */
          