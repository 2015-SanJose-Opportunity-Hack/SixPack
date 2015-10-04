
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
						<td><img class="thumb" src="/assets/images/request-thumbs/thumb-"""),_display_(/*45.72*/request/*45.79*/.getImage()),format.raw/*45.90*/(""""></td>
						<td class="text-center">"""),_display_(/*46.32*/request/*46.39*/.getFirstName()),format.raw/*46.54*/(""" """),_display_(/*46.56*/request/*46.63*/.getLastName()),format.raw/*46.77*/("""</td>
						<td>"""),_display_(/*47.12*/request/*47.19*/.getAddress()),format.raw/*47.32*/("""</td>
						<td>"""),_display_(/*48.12*/request/*48.19*/.getComment()),format.raw/*48.32*/("""</td>
						
						<td><a href=""""),_display_(/*50.21*/routes/*50.27*/.AdminController.viewRequest(request.getId())),format.raw/*50.72*/("""" class="btn btn-default">Details</a></td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
					</tr>
				""")))}),format.raw/*54.6*/("""
							
			"""),format.raw/*56.4*/("""</tbody>
		</table>
	</div>
	
	</hr>
	
	
	
   <script type="text/javascript">
     	jQuery(document).ready(function()"""),format.raw/*65.40*/("""{"""),format.raw/*65.41*/("""
     		"""),format.raw/*66.8*/("""jQuery(".table-responsive").fadeIn(1000);
     		jQuery('#search-table').dataTable("""),format.raw/*67.42*/("""{"""),format.raw/*67.43*/("""
     			"""),format.raw/*68.9*/(""""scrollY":        800,
     	        "scrollCollapse": true,
     			"jQueryUI":       true
     			
     		"""),format.raw/*72.8*/("""}"""),format.raw/*72.9*/("""				
     		"""),format.raw/*73.8*/(""");
     		
     	"""),format.raw/*75.7*/("""}"""),format.raw/*75.8*/(""");
     </script>
	</div>
	
	
""")))}),format.raw/*80.2*/("""
"""))}
  }

  def render(title:String,isLoggedIn:Boolean,department:models.Admin,requestList:List[models.Request]): play.twirl.api.HtmlFormat.Appendable = apply(title,isLoggedIn,department,requestList)

  def f:((String,Boolean,models.Admin,List[models.Request]) => play.twirl.api.HtmlFormat.Appendable) = (title,isLoggedIn,department,requestList) => apply(title,isLoggedIn,department,requestList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 00:24:17 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/dashboard.scala.html
                  HASH: 0d30bf20c48e40e7413352f95ce0e3718c073bc9
                  MATRIX: 775->1|1006->98|1034->149|1061->151|1095->177|1134->179|1166->185|2118->1111|2161->1138|2200->1139|2233->1145|2284->1169|2300->1176|2329->1184|2442->1270|2458->1277|2490->1288|2556->1327|2572->1334|2608->1349|2637->1351|2653->1358|2688->1372|2732->1389|2748->1396|2782->1409|2826->1426|2842->1433|2876->1446|2936->1479|2951->1485|3017->1530|3176->1659|3215->1671|3360->1788|3389->1789|3424->1797|3535->1880|3564->1881|3600->1890|3735->1998|3763->1999|3802->2011|3846->2028|3874->2029|3935->2060
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|69->42|69->42|69->42|70->43|71->44|71->44|71->44|72->45|72->45|72->45|73->46|73->46|73->46|73->46|73->46|73->46|74->47|74->47|74->47|75->48|75->48|75->48|77->50|77->50|77->50|81->54|83->56|92->65|92->65|93->66|94->67|94->67|95->68|99->72|99->72|100->73|102->75|102->75|107->80
                  -- GENERATED --
              */
          