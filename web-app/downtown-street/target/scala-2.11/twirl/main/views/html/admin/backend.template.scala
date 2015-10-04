
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
	    <script src="https://cdn.datatables.net/responsive/1.0.7/js/dataTables.responsive.min.js"></script>
	    <script src="https://cdn.datatables.net/responsive/1.0.7/css/responsive.dataTables.min.css"></script>
	   <!-- End Data Tables -->
       
       <!--  Google Maps  -->
		<script type="text/javascript" src="https://www.google.com/jsapi"></script>
    	<script src="http://maps.googleapis.com/maps/api/js?sensor=false&libraries=places"></script>
    	<link href='http://fonts.googleapis.com/css?family=Fjalla+One' rel='stylesheet' type='text/css'>
    	<link href='http://fonts.googleapis.com/css?family=Black+Ops+One' rel='stylesheet' type='text/css'>
		<!-- End Google Maps -->
		
		<script src=""""),_display_(/*31.17*/routes/*31.23*/.Assets.at("javascripts/chart.js")),format.raw/*31.57*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*32.23*/routes/*32.29*/.Assets.at("javascripts/app.js")),format.raw/*32.61*/("""" type="text/javascript"></script>
		
		
		<link rel="stylesheet" media="screen" href=""""),_display_(/*35.48*/routes/*35.54*/.Assets.at("stylesheets/main.css")),format.raw/*35.88*/("""">
	
    </head>
    <body>
    
    	
    	<div class="navbar-fixed">
	        <nav>
	            <div class="nav-wrapper">
	                <a href=""""),_display_(/*44.28*/if(isLoggedIn)/*44.42*/{_display_(Seq[Any](format.raw/*44.43*/(""" """),_display_(/*44.45*/routes/*44.51*/.AdminController.dashboard()),format.raw/*44.79*/(""" """)))}/*44.81*/else/*44.85*/{_display_(Seq[Any](format.raw/*44.86*/(""" """),format.raw/*44.87*/("""/ """)))}),format.raw/*44.90*/("""" class=" logo-name">Downtown Street <span style="font-size: 9px">Beta v1.0</span></a>
	                """),_display_(/*45.19*/if(isLoggedIn)/*45.33*/{_display_(Seq[Any](format.raw/*45.34*/("""
		                """),format.raw/*46.19*/("""<ul id="nav-mobile" class="right">
		                    <li><a class="dropdown-button" href="#!" data-activates="dropdown1"><span class="glyphicon glyphicon-user"></span>  My Account<i class="material-icons right">arrow_drop_down</i> </a></li>
		
		                    <ul id="dropdown1" class="dropdown-content">
		                        <li><a href="/settings">Settings</a></li>
		                        <li><a href="/logout">logout</a></li>
		
		                    </ul>
		                </ul>
	                """)))}),format.raw/*55.19*/("""
	            """),format.raw/*56.14*/("""</div>
	        </nav>
	    </div>
	
	<div class="main-container content">
		<div class="dashboard-content """),_display_(/*61.34*/if(isLoggedIn)/*61.48*/{_display_(Seq[Any](format.raw/*61.49*/(""" """),format.raw/*61.50*/("""full-width """)))}),format.raw/*61.62*/("""">
			<div class="row">
				"""),_display_(/*63.6*/content),format.raw/*63.13*/("""
			"""),format.raw/*64.4*/("""</div>
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
                  DATE: Sun Oct 04 06:02:09 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/backend.scala.html
                  HASH: 39e981419ac6d4b5538cff99ea150bbc124b642c
                  MATRIX: 744->1|883->52|911->54|1062->179|1087->184|1252->322|1267->328|1320->360|2734->1747|2749->1753|2804->1787|2888->1844|2903->1850|2956->1882|3071->1970|3086->1976|3141->2010|3320->2162|3343->2176|3382->2177|3411->2179|3426->2185|3475->2213|3496->2215|3509->2219|3548->2220|3577->2221|3611->2224|3743->2329|3766->2343|3805->2344|3852->2363|4403->2883|4445->2897|4580->3005|4603->3019|4642->3020|4671->3021|4714->3033|4769->3062|4797->3069|4828->3073
                  LINES: 26->1|29->1|31->3|36->8|36->8|38->10|38->10|38->10|59->31|59->31|59->31|60->32|60->32|60->32|63->35|63->35|63->35|72->44|72->44|72->44|72->44|72->44|72->44|72->44|72->44|72->44|72->44|72->44|73->45|73->45|73->45|74->46|83->55|84->56|89->61|89->61|89->61|89->61|89->61|91->63|91->63|92->64
                  -- GENERATED --
              */
          