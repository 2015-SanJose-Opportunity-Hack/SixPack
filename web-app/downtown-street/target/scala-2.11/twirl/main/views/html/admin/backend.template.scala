
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
object backend extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Boolean,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, isLoggedIn: Boolean)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.53*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
    	<meta name="viewport" content="width=device-width, initial-scale=1">
        <title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
        <script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png")),format.raw/*10.97*/("""">
		<link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,700,400italic,300italic,300' rel='stylesheet' type='text/css'>
		
		<!-- Data Tables -->		
		
	    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/css/materialize.min.css">
	    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/js/materialize.min.js"></script>
	    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.9/css/jquery.dataTables.min.css">
	    <script src="https://cdn.datatables.net/1.10.9/js/jquery.dataTables.min.js"></script>
	    <!-- <script src="https://cdn.datatables.net/responsive/1.0.7/js/dataTables.responsive.min.js"></script>
	    <link rel="stylesheet" grf="https://cdn.datatables.net/responsive/1.0.7/css/responsive.dataTables.min.css"> -->
	    
	   <!-- End Data Tables -->
       
       <!--  Google Maps  -->
		<script type="text/javascript" src="https://www.google.com/jsapi"></script>
    	<script src="http://maps.googleapis.com/maps/api/js?sensor=false&libraries=places"></script>
    	<link href='http://fonts.googleapis.com/css?family=Fjalla+One' rel='stylesheet' type='text/css'>
    	<link href='http://fonts.googleapis.com/css?family=Black+Ops+One' rel='stylesheet' type='text/css'>
		<!-- End Google Maps -->
		
		<script src=""""),_display_(/*32.17*/routes/*32.23*/.Assets.at("javascripts/chart.js")),format.raw/*32.57*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*33.23*/routes/*33.29*/.Assets.at("javascripts/app.js")),format.raw/*33.61*/("""" type="text/javascript"></script>
		
		
		<link rel="stylesheet" media="screen" href=""""),_display_(/*36.48*/routes/*36.54*/.Assets.at("stylesheets/main.css")),format.raw/*36.88*/("""">
	
    </head>
    <body>
    
    	
    	<div class="navbar-fixed">
	        <nav>
	            <div class="nav-wrapper">
	                <a href=""""),_display_(/*45.28*/if(isLoggedIn)/*45.42*/{_display_(Seq[Any](format.raw/*45.43*/(""" """),_display_(/*45.45*/routes/*45.51*/.AdminController.dashboard()),format.raw/*45.79*/(""" """)))}/*45.81*/else/*45.85*/{_display_(Seq[Any](format.raw/*45.86*/(""" """),format.raw/*45.87*/("""/ """)))}),format.raw/*45.90*/("""" class=" logo-name">Downtown Street <span style="font-size: 9px">Beta v1.0</span></a>
	                """),_display_(/*46.19*/if(isLoggedIn)/*46.33*/{_display_(Seq[Any](format.raw/*46.34*/("""
		                """),format.raw/*47.19*/("""<ul id="nav-mobile" class="right">
		                    <li><a class="dropdown-button" href="#!" data-activates="dropdown1"><span class="glyphicon glyphicon-user"></span>  My Account<i class="material-icons right">arrow_drop_down</i> </a></li>
		
		                    <ul id="dropdown1" class="dropdown-content">
		                        <li><a href=""""),_display_(/*51.41*/routes/*51.47*/.AdminController.settings()),format.raw/*51.74*/("""">Settings</a></li>
		                        <li><a href=""""),_display_(/*52.41*/routes/*52.47*/.ApplicationController.logout()),format.raw/*52.78*/("""">logout</a></li>
		
		                    </ul>
		                </ul>
	                """)))}),format.raw/*56.19*/("""
	            """),format.raw/*57.14*/("""</div>
	        </nav>
	    </div>
	
	<div class="main-container content">
		<div class="dashboard-content """),_display_(/*62.34*/if(isLoggedIn)/*62.48*/{_display_(Seq[Any](format.raw/*62.49*/(""" """),format.raw/*62.50*/("""full-width """)))}),format.raw/*62.62*/("""">
			<div class="row">
				"""),_display_(/*64.6*/content),format.raw/*64.13*/("""
			"""),format.raw/*65.4*/("""</div>
		</div>
	</div>    
     
     <footer>
     	
     </footer>
     
    </body>
</html>
"""))}
  }

  def render(title:String,isLoggedIn:Boolean,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,isLoggedIn)(content)

  def f:((String,Boolean) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,isLoggedIn) => (content) => apply(title,isLoggedIn)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 11:07:35 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/backend.scala.html
                  HASH: 294ff7674581f438f14b48a02f839a7040930ae9
                  MATRIX: 744->1|883->52|911->54|1062->179|1087->184|1252->322|1267->328|1320->360|2755->1768|2770->1774|2825->1808|2909->1865|2924->1871|2977->1903|3092->1991|3107->1997|3162->2031|3341->2183|3364->2197|3403->2198|3432->2200|3447->2206|3496->2234|3517->2236|3530->2240|3569->2241|3598->2242|3632->2245|3764->2350|3787->2364|3826->2365|3873->2384|4255->2739|4270->2745|4318->2772|4405->2832|4420->2838|4472->2869|4594->2960|4636->2974|4771->3082|4794->3096|4833->3097|4862->3098|4905->3110|4960->3139|4988->3146|5019->3150
                  LINES: 26->1|29->1|31->3|36->8|36->8|38->10|38->10|38->10|60->32|60->32|60->32|61->33|61->33|61->33|64->36|64->36|64->36|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|74->46|74->46|74->46|75->47|79->51|79->51|79->51|80->52|80->52|80->52|84->56|85->57|90->62|90->62|90->62|90->62|90->62|92->64|92->64|93->65
                  -- GENERATED --
              */
          