
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
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css")),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png")),format.raw/*10.97*/("""">
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/chart.js")),format.raw/*11.63*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("javascripts/app.js")),format.raw/*12.61*/("""" type="text/javascript"></script>
         <!-- Bootstrap imports -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
		
		<link rel="stylesheet" href="https://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
		<link rel="stylesheet" href="https://cdn.datatables.net/plug-ins/1.10.7/integration/jqueryui/dataTables.jqueryui.css">
		
		
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
		
		<!-- SELECT DROPDOWN AUTOCOMPLETER  -->		
		<link href="//cdnjs.cloudflare.com/ajax/libs/select2/4.0.0/css/select2.min.css" rel="stylesheet" />
		<script src="//cdnjs.cloudflare.com/ajax/libs/select2/4.0.0/js/select2.min.js"></script>
		<script src="https://cdn.datatables.net/1.10.7/js/jquery.dataTables.min.js"></script>
       <script src="https://cdn.datatables.net/plug-ins/1.10.7/integration/bootstrap/3/dataTables.bootstrap.js"></script>
		<!-- END SELECT DROPDOWN -->
	
    </head>
    <body>
    <nav class="navbar navbar-default navbar-static-top">
         <div class="container-fluid">
		    <div class="navbar-header col-md-12">
		     
		        <ul class="nav navbar-nav col-md-12">
		        	<li>
 		  				<a href=""""),_display_(/*38.20*/if(isLoggedIn)/*38.34*/{_display_(Seq[Any](format.raw/*38.35*/(""" """),_display_(/*38.37*/routes/*38.43*/.AdminController.dashboard()),format.raw/*38.71*/(""" """)))}/*38.73*/else/*38.77*/{_display_(Seq[Any](format.raw/*38.78*/(""" """),format.raw/*38.79*/("""/ """)))}),format.raw/*38.82*/(""""><strong>Downtown Street</strong> <span style="font-size: 9px">Beta v1.0</span></a>
	      			</li>
	      			
   		      		"""),_display_(/*41.15*/if(isLoggedIn)/*41.29*/{_display_(Seq[Any](format.raw/*41.30*/("""
   		      			"""),format.raw/*42.15*/("""<li role="presentation" class="dropdown pull-right">
						    <a class="dropdown-toggle pull-right" data-toggle="dropdown" href="#" role="button" aria-expanded="false">
						      <li class="pull-right"><span class="glyphicon glyphicon-user"></span>  My Account <span class="caret"></span>
						    </a>
						    <ul class="dropdown-menu" role="menu">
						    	<li><a href=""""),_display_(/*47.26*/routes/*47.32*/.AdminController.settings()),format.raw/*47.59*/("""" >Settings</a></li>
					  			<li class=""><a href=""""),_display_(/*48.34*/routes/*48.40*/.ApplicationController.logout()),format.raw/*48.71*/("""">Logout</a></li>
						    </ul>
						</li>
						
   		      		""")))}),format.raw/*52.15*/("""
		        """),format.raw/*53.11*/("""</ul>
		      
		    </div>
		  </div>
    	</nav>
	
	<div class=""""),_display_(/*59.15*/if(isLoggedIn)/*59.29*/{_display_(Seq[Any](format.raw/*59.30*/(""" """),format.raw/*59.31*/("""container-fluid """)))}/*59.49*/else/*59.53*/{_display_(Seq[Any](format.raw/*59.54*/(""" """),format.raw/*59.55*/("""container """)))}),format.raw/*59.66*/("""">
		<div class="dashboard-content """),_display_(/*60.34*/if(isLoggedIn)/*60.48*/{_display_(Seq[Any](format.raw/*60.49*/(""" """),format.raw/*60.50*/("""full-width """)))}),format.raw/*60.62*/("""">
			<div class="col-md-12">
				"""),_display_(/*62.6*/content),format.raw/*62.13*/("""
			"""),format.raw/*63.4*/("""</div>
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
                  DATE: Sat Oct 03 15:17:04 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/backend.scala.html
                  HASH: b0418511325eb61c1370e5c3837529f10ab50186
                  MATRIX: 744->1|883->52|911->54|988->105|1013->110|1172->243|1186->249|1240->283|1328->344|1343->350|1396->382|1448->407|1463->413|1518->447|1602->504|1617->510|1670->542|3041->1886|3064->1900|3103->1901|3132->1903|3147->1909|3196->1937|3217->1939|3230->1943|3269->1944|3298->1945|3332->1948|3485->2074|3508->2088|3547->2089|3590->2104|3998->2485|4013->2491|4061->2518|4142->2572|4157->2578|4209->2609|4307->2676|4346->2687|4440->2754|4463->2768|4502->2769|4531->2770|4567->2788|4580->2792|4619->2793|4648->2794|4690->2805|4753->2841|4776->2855|4815->2856|4844->2857|4887->2869|4948->2904|4976->2911|5007->2915
                  LINES: 26->1|29->1|31->3|35->7|35->7|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|66->38|66->38|66->38|66->38|66->38|66->38|66->38|66->38|66->38|66->38|66->38|69->41|69->41|69->41|70->42|75->47|75->47|75->47|76->48|76->48|76->48|80->52|81->53|87->59|87->59|87->59|87->59|87->59|87->59|87->59|87->59|87->59|88->60|88->60|88->60|88->60|88->60|90->62|90->62|91->63
                  -- GENERATED --
              */
          