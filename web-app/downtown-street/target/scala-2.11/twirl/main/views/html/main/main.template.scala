
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
    <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
         <script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png")),format.raw/*11.97*/("""">
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("javascripts/hello.js")),format.raw/*12.63*/("""" type="text/javascript"></script>
        
        
       
        <!-- Bootstrap imports -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
		<!-- End Bootstrap imports -->
		
		<link rel="stylesheet" media="screen" href=""""),_display_(/*22.48*/routes/*22.54*/.Assets.at("stylesheets/main.css")),format.raw/*22.88*/("""">
    </head>
    <body>
    
    <nav class="navbar navbar-inverse navbar-static-top">
	  <div class="container">
	     <div class="container-fluid">
		    <div class="navbar-header">
		      
		        <ul class="nav navbar-nav">
   		      		<li><a href=""""),_display_(/*32.28*/routes/*32.34*/.ApplicationController.index()),format.raw/*32.64*/(""""><strong>Downtown Street</strong> <span style="font-size: 9px">Beta v1.0</span></a></li>
		        </ul>
		      
		    </div>
		  </div>
    		    
    		    
    		  
    		    
	     
	  </div>
	</nav>
	
	<div class="container">
	    """),_display_(/*46.7*/content),format.raw/*46.14*/("""
	"""),format.raw/*47.2*/("""</div>
    
        
        
        
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
                  DATE: Sun Oct 04 06:00:28 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/main/main.scala.html
                  HASH: ab297eee5215f8abaf58099fd154f07b488cc583
                  MATRIX: 732->1|850->31|878->33|1028->157|1053->162|1228->310|1243->316|1296->348|1348->373|1363->379|1418->413|1930->898|1945->904|2000->938|2287->1198|2302->1204|2353->1234|2618->1473|2646->1480|2675->1482
                  LINES: 26->1|29->1|31->3|36->8|36->8|39->11|39->11|39->11|40->12|40->12|40->12|50->22|50->22|50->22|60->32|60->32|60->32|74->46|74->46|75->47
                  -- GENERATED --
              */
          