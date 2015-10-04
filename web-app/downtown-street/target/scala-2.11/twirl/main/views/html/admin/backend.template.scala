
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
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png")),format.raw/*10.97*/("""">
        
        
         <!-- Bootstrap imports -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
		
		<link rel="stylesheet" href="https://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
		<link rel="stylesheet" href="https://cdn.datatables.net/plug-ins/1.10.7/integration/jqueryui/dataTables.jqueryui.css">
		
		<link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,700,400italic,300italic,300' rel='stylesheet' type='text/css'>
		
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
		
		<!-- Data Tables -->		
		<script src="https://cdn.datatables.net/1.10.7/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/plug-ins/1.10.7/integration/bootstrap/3/dataTables.bootstrap.js"></script>
       <!-- End Data Tables -->
       
       <!--  Google Maps  -->
		<script type="text/javascript" src="https://www.google.com/jsapi"></script>
    	<script src="http://maps.googleapis.com/maps/api/js?sensor=false&libraries=places"></script>
    	<link href='http://fonts.googleapis.com/css?family=Fjalla+One' rel='stylesheet' type='text/css'>
    	<link href='http://fonts.googleapis.com/css?family=Black+Ops+One' rel='stylesheet' type='text/css'>
		<!-- End Google Maps -->
		
		<script src=""""),_display_(/*36.17*/routes/*36.23*/.Assets.at("javascripts/chart.js")),format.raw/*36.57*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*37.23*/routes/*37.29*/.Assets.at("javascripts/app.js")),format.raw/*37.61*/("""" type="text/javascript"></script>
		
		
		<link rel="stylesheet" media="screen" href=""""),_display_(/*40.48*/routes/*40.54*/.Assets.at("stylesheets/main.css")),format.raw/*40.88*/("""">
	
    </head>
    <body>
    <nav class="navbar navbar-inverse navbar-static-top">
         <div class="container-fluid">
		    <div class="navbar-header col-md-12">
		     
		        <ul class="nav navbar-nav col-md-12">
		        	<li>
 		  				<a href=""""),_display_(/*50.20*/if(isLoggedIn)/*50.34*/{_display_(Seq[Any](format.raw/*50.35*/(""" """),_display_(/*50.37*/routes/*50.43*/.AdminController.dashboard()),format.raw/*50.71*/(""" """)))}/*50.73*/else/*50.77*/{_display_(Seq[Any](format.raw/*50.78*/(""" """),format.raw/*50.79*/("""/ """)))}),format.raw/*50.82*/(""""><strong>Downtown Street</strong> <span style="font-size: 9px">Beta v1.0</span></a>
	      			</li>
	      			
   		      		"""),_display_(/*53.15*/if(isLoggedIn)/*53.29*/{_display_(Seq[Any](format.raw/*53.30*/("""
   		      			"""),format.raw/*54.15*/("""<li role="presentation" class="dropdown pull-right">
						    <a class="dropdown-toggle pull-right" data-toggle="dropdown" href="#" role="button" aria-expanded="false">
						      <li class="pull-right"><span class="glyphicon glyphicon-user"></span>  My Account <span class="caret"></span>
						    </a>
						    <ul class="dropdown-menu" role="menu">
						    	<li><a href=""""),_display_(/*59.26*/routes/*59.32*/.AdminController.settings()),format.raw/*59.59*/("""" >Settings</a></li>
					  			<li class=""><a href=""""),_display_(/*60.34*/routes/*60.40*/.ApplicationController.logout()),format.raw/*60.71*/("""">Logout</a></li>
						    </ul>
						</li>
						
   		      		""")))}),format.raw/*64.15*/("""
		        """),format.raw/*65.11*/("""</ul>
		      
		    </div>
		  </div>
    	</nav>
	
	<div class="main-container """),_display_(/*71.30*/if(isLoggedIn)/*71.44*/{_display_(Seq[Any](format.raw/*71.45*/(""" """),format.raw/*71.46*/("""container-fluid """)))}/*71.64*/else/*71.68*/{_display_(Seq[Any](format.raw/*71.69*/(""" """),format.raw/*71.70*/("""container """)))}),format.raw/*71.81*/("""">
		<div class="dashboard-content """),_display_(/*72.34*/if(isLoggedIn)/*72.48*/{_display_(Seq[Any](format.raw/*72.49*/(""" """),format.raw/*72.50*/("""full-width """)))}),format.raw/*72.62*/("""">
			<div class="col-md-12">
				"""),_display_(/*74.6*/content),format.raw/*74.13*/("""
			"""),format.raw/*75.4*/("""</div>
		</div>
	</div>    
        
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
                  DATE: Sun Oct 04 00:24:17 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/backend.scala.html
                  HASH: 203b2af715e7a7a0882fef6be728f2f6ac841f84
                  MATRIX: 744->1|883->52|911->54|988->105|1013->110|1187->257|1202->263|1255->295|2747->1760|2762->1766|2817->1800|2901->1857|2916->1863|2969->1895|3084->1983|3099->1989|3154->2023|3441->2283|3464->2297|3503->2298|3532->2300|3547->2306|3596->2334|3617->2336|3630->2340|3669->2341|3698->2342|3732->2345|3885->2471|3908->2485|3947->2486|3990->2501|4398->2882|4413->2888|4461->2915|4542->2969|4557->2975|4609->3006|4707->3073|4746->3084|4855->3166|4878->3180|4917->3181|4946->3182|4982->3200|4995->3204|5034->3205|5063->3206|5105->3217|5168->3253|5191->3267|5230->3268|5259->3269|5302->3281|5363->3316|5391->3323|5422->3327
                  LINES: 26->1|29->1|31->3|35->7|35->7|38->10|38->10|38->10|64->36|64->36|64->36|65->37|65->37|65->37|68->40|68->40|68->40|78->50|78->50|78->50|78->50|78->50|78->50|78->50|78->50|78->50|78->50|78->50|81->53|81->53|81->53|82->54|87->59|87->59|87->59|88->60|88->60|88->60|92->64|93->65|99->71|99->71|99->71|99->71|99->71|99->71|99->71|99->71|99->71|100->72|100->72|100->72|100->72|100->72|102->74|102->74|103->75
                  -- GENERATED --
              */
          