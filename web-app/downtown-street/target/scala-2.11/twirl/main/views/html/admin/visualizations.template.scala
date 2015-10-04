
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
object visualizations extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Boolean,List[models.Request],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, isLoggedIn: Boolean, requestList: List[models.Request]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import views.html.bootstrap3._

Seq[Any](format.raw/*1.73*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/backend(title, isLoggedIn)/*6.28*/ {_display_(Seq[Any](format.raw/*6.30*/("""

    
    """),format.raw/*9.5*/("""<div class="request-container col m12">
    	<div class="maps col m6">
    		<div id="map">
        	</div>
    	</div>
   	</div>
   	""")))}),format.raw/*15.6*/("""
   	
   	"""),format.raw/*17.5*/("""<script type = "text/javascript">
   	function drawMap()
   	"""),format.raw/*19.5*/("""{"""),format.raw/*19.6*/("""

   		   """),format.raw/*21.9*/("""alert('Hello')
   	       var map = new google.maps.Map(document.getElementById('map'), """),format.raw/*22.74*/("""{"""),format.raw/*22.75*/("""
   	         """),format.raw/*23.14*/("""zoom: 8,
   	         center: new google.maps.LatLng(-33.92, 151.25),
   	         mapTypeId: google.maps.MapTypeId.ROADMAP
   	       """),format.raw/*26.12*/("""}"""),format.raw/*26.13*/(""");

   	        var infowindow = new google.maps.InfoWindow();

   	        var marker, i;

   	    	"""),_display_(/*32.11*/for(request <- requestList) yield /*32.38*/{_display_(Seq[Any](format.raw/*32.39*/("""
   	        """),format.raw/*33.13*/("""{"""),format.raw/*33.14*/("""
   	                
   	        	"""),_display_(/*35.15*/if(request.getLatitude() && request.getLatitude())/*35.65*/{_display_(Seq[Any](format.raw/*35.66*/("""
   	        		"""),format.raw/*36.15*/("""alert("""),_display_(/*36.22*/request/*36.29*/.getLatitude()),format.raw/*36.43*/(""");
   	                marker = new google.maps.Marker("""),format.raw/*37.53*/("""{"""),format.raw/*37.54*/("""
   	                  """),format.raw/*38.23*/("""position: new google.maps.LatLng( """),_display_(/*38.58*/request/*38.65*/.getLatitude()),format.raw/*38.79*/(""", """),_display_(/*38.82*/request/*38.89*/.getLongitude()),format.raw/*38.104*/("""),
   	                  map: map,
   	                  icon: image
   	                """),format.raw/*41.21*/("""}"""),format.raw/*41.22*/(""");

   	                google.maps.event.addListener(marker, 'click', (function(marker, i)
   	                """),format.raw/*44.21*/("""{"""),format.raw/*44.22*/("""
   	                  """),format.raw/*45.23*/("""return function()
   	                  """),format.raw/*46.23*/("""{"""),format.raw/*46.24*/("""
   	                    """),format.raw/*47.25*/("""infowindow.setContent('Sentiment : '+data[i].sentiment);
   	                    infowindow.open(map, marker);
   	                  """),format.raw/*49.23*/("""}"""),format.raw/*49.24*/("""
   	                """),format.raw/*50.21*/("""}"""),format.raw/*50.22*/(""")(marker, i));
	
   	        	""")))}),format.raw/*52.15*/("""
   	        """),format.raw/*53.13*/("""}"""),format.raw/*53.14*/("""



   	""")))}),format.raw/*57.6*/("""	
   	    	
   	 """),format.raw/*59.6*/("""drawMap();
   	</script>
   	"""),format.raw/*61.5*/("""}"""),format.raw/*61.6*/("""
   	    
"""))}
  }

  def render(title:String,isLoggedIn:Boolean,requestList:List[models.Request]): play.twirl.api.HtmlFormat.Appendable = apply(title,isLoggedIn,requestList)

  def f:((String,Boolean,List[models.Request]) => play.twirl.api.HtmlFormat.Appendable) = (title,isLoggedIn,requestList) => apply(title,isLoggedIn,requestList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 11:19:57 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/visualizations.scala.html
                  HASH: 38216c1b77b57d0df7a61a4fdf3b8658ae29e99b
                  MATRIX: 767->1|972->72|1000->123|1027->125|1061->151|1100->153|1137->164|1303->300|1340->310|1428->371|1456->372|1493->382|1609->470|1638->471|1680->485|1843->620|1872->621|2001->723|2044->750|2083->751|2124->764|2153->765|2216->801|2275->851|2314->852|2357->867|2391->874|2407->881|2442->895|2525->950|2554->951|2605->974|2667->1009|2683->1016|2718->1030|2748->1033|2764->1040|2801->1055|2918->1144|2947->1145|3087->1257|3116->1258|3167->1281|3235->1321|3264->1322|3317->1347|3478->1480|3507->1481|3556->1502|3585->1503|3647->1534|3688->1547|3717->1548|3756->1557|3800->1574|3856->1603|3884->1604
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|36->9|42->15|44->17|46->19|46->19|48->21|49->22|49->22|50->23|53->26|53->26|59->32|59->32|59->32|60->33|60->33|62->35|62->35|62->35|63->36|63->36|63->36|63->36|64->37|64->37|65->38|65->38|65->38|65->38|65->38|65->38|65->38|68->41|68->41|71->44|71->44|72->45|73->46|73->46|74->47|76->49|76->49|77->50|77->50|79->52|80->53|80->53|84->57|86->59|88->61|88->61
                  -- GENERATED --
              */
          