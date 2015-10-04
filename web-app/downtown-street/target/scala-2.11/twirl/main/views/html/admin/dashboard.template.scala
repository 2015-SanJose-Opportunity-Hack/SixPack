
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
object dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Boolean,models.Admin,List[models.Request],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, isLoggedIn: Boolean, department: models.Admin, requestList: List[models.Request]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import views.html.bootstrap3._

Seq[Any](format.raw/*1.99*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/backend(title, isLoggedIn)/*6.28*/ {_display_(Seq[Any](format.raw/*6.30*/("""

    """),format.raw/*8.5*/("""<h2 class="welcome">Welcome Admin!</h2>
    <hr>
    
    <div class="col-md-12 text-center">
	    <div class="col-md-4">
	    	<h3>Total Requests</h3>
	    	<h1>100</h1>
	    </div>
	    <div class="col-md-4">
	    	<h3>Resolved</h3>
	    	<h1>143</h1>
	    </div>
	    <div class="col-md-4">
	    	<h3>Unresolved</h3>
	    	<h1>10</h1>
	    </div>
    </div>
    
  	<div class="col-md-12 charts">
  	<div class="col-md-12 table-responsive" style="display: none">
	
		<table class="table table-bordered table-striped table-hover text-center display"  id="search-table" width="100%">
			<thead>
				<tr>
					<th class="text-center">ID</th>
					<th class="text-center">Thumb</th>
					<th class="text-center">Name</th>
					<th class="text-center">Address</th>
					<th class="text-center">Comment</th>
					<th class="text-center">Details</th>
					<th class="text-center">Action</th>
				</tr>
			</thead>
			<tbody>
				"""),_display_(/*42.6*/for(request <- requestList) yield /*42.33*/{_display_(Seq[Any](format.raw/*42.34*/("""
					"""),format.raw/*43.6*/("""<tr>
						<td><strong>"""),_display_(/*44.20*/request/*44.27*/.getId()),format.raw/*44.35*/("""</strong></td>
						<td><img src=""""),_display_(/*45.22*/request/*45.29*/.getImage()),format.raw/*45.40*/(""""</td>
						<td class="text-center">"""),_display_(/*46.32*/request/*46.39*/.getFirstName()),format.raw/*46.54*/(""" """),_display_(/*46.56*/request/*46.63*/.getLastName()),format.raw/*46.77*/("""</td>
						<td>"""),_display_(/*47.12*/request/*47.19*/.getAddress()),format.raw/*47.32*/("""</td>
						<td>"""),_display_(/*48.12*/request/*48.19*/.getComment()),format.raw/*48.32*/("""</td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
					</tr>
				""")))}),format.raw/*54.6*/("""
					
				
						
			"""),format.raw/*58.4*/("""</tbody>
		</table>
	</div>
	
	</hr>
	
	
	
   <script type="text/javascript">
     	jQuery(document).ready(function()"""),format.raw/*67.40*/("""{"""),format.raw/*67.41*/("""
     		"""),format.raw/*68.8*/("""jQuery(".table-responsive").fadeIn(1000);
     		jQuery('#search-table').dataTable("""),format.raw/*69.42*/("""{"""),format.raw/*69.43*/("""
     			"""),format.raw/*70.9*/(""""scrollY":        800,
     	        "scrollCollapse": true,
     			"jQueryUI":       true,
     			"autoWidth": false
     		"""),format.raw/*74.8*/("""}"""),format.raw/*74.9*/("""				
     		"""),format.raw/*75.8*/(""");
     		
     	"""),format.raw/*77.7*/("""}"""),format.raw/*77.8*/(""");
     </script>
	</div>
	
	
""")))}),format.raw/*82.2*/("""
"""))}
  }

  def render(title:String,isLoggedIn:Boolean,department:models.Admin,requestList:List[models.Request]): play.twirl.api.HtmlFormat.Appendable = apply(title,isLoggedIn,department,requestList)

  def f:((String,Boolean,models.Admin,List[models.Request]) => play.twirl.api.HtmlFormat.Appendable) = (title,isLoggedIn,department,requestList) => apply(title,isLoggedIn,department,requestList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Oct 03 17:23:55 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/dashboard.scala.html
                  HASH: 3861ec61d0095001d16f994be1b1b6a51e4e89f7
                  MATRIX: 775->1|1006->98|1034->149|1061->151|1095->177|1134->179|1166->185|2118->1111|2161->1138|2200->1139|2233->1145|2284->1169|2300->1176|2329->1184|2392->1220|2408->1227|2440->1238|2505->1276|2521->1283|2557->1298|2586->1300|2602->1307|2637->1321|2681->1338|2697->1345|2731->1358|2775->1375|2791->1382|2825->1395|3017->1557|3066->1579|3211->1696|3240->1697|3275->1705|3386->1788|3415->1789|3451->1798|3605->1925|3633->1926|3672->1938|3716->1955|3744->1956|3805->1987
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|69->42|69->42|69->42|70->43|71->44|71->44|71->44|72->45|72->45|72->45|73->46|73->46|73->46|73->46|73->46|73->46|74->47|74->47|74->47|75->48|75->48|75->48|81->54|85->58|94->67|94->67|95->68|96->69|96->69|97->70|101->74|101->74|102->75|104->77|104->77|109->82
                  -- GENERATED --
              */
          