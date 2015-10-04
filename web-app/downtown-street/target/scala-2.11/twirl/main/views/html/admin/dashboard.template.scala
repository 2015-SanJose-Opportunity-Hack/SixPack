
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
object dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,Boolean,models.Admin,List[models.Request],Integer,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, isLoggedIn: Boolean, department: models.Admin, requestList: List[models.Request],  all: Integer,  resolved: Integer, pending: Integer):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import views.html.bootstrap3._

Seq[Any](format.raw/*1.152*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/backend(title, isLoggedIn)/*6.28*/ {_display_(Seq[Any](format.raw/*6.30*/("""

    
    """),format.raw/*9.5*/("""<div class="row stats-container">
                    <div class="col s12 m4 l4 center-align">
						<div class="">
							
						</div>
                        
                        <div class="stats waves-effect waves-light btn stats center-align">
							<span class="stats-header">All </span> """),_display_(/*16.48*/all),format.raw/*16.51*/("""</div>

                    </div>
                    <div class="col s12 m4 l4 center-align">
                    <div class="">
                        
                        <div class="stats waves-effect waves-light btn stats green darken-1"><span class="stats-header"> Resolved </span> """),_display_(/*22.140*/resolved),format.raw/*22.148*/("""</div>
                        </div>
                    </div>

                    <div class="col s12 m4 l4 center-align">
                    <div class="">
                        
                        <div class="stats waves-effect waves-light btn stats unr amber accent-4"><span class="stats-header"> Pending </span> """),_display_(/*29.143*/pending),format.raw/*29.150*/("""</div>
					</div>
                    </div>
                </div>
    
  	<div class="col-md-12 charts">
  	<div class="col-md-12 table-responsive">
	
		<table class="table bordered striped highlight display responsive nowrap" cellspacing="0" width="100%" id="search-table">
			<thead>
                            <tr>
                                <th class="text-center">ID</th>
                                <th class="text-center">Thumb</th>
                                <th class="text-center">Name</th>
                                <th class="text-center">Address</th>
                                <th class="text-center">Status</th>
                                <th class="text-center">Details</th>
                            </tr>
                        </thead>
                        
			<tbody>
				"""),_display_(/*50.6*/for(request <- requestList) yield /*50.33*/{_display_(Seq[Any](format.raw/*50.34*/("""
					"""),format.raw/*51.6*/("""<tr>
						<td><strong>"""),_display_(/*52.20*/request/*52.27*/.getId()),format.raw/*52.35*/("""</strong></td>
						<td><img class="thumb" src="/assets/images/request-thumbs/thumb-"""),_display_(/*53.72*/request/*53.79*/.getImage()),format.raw/*53.90*/(""""></td>
						<td class="text-center">"""),_display_(/*54.32*/request/*54.39*/.getFirstName()),format.raw/*54.54*/(""" """),_display_(/*54.56*/request/*54.63*/.getLastName()),format.raw/*54.77*/("""</td>
						<td>"""),_display_(/*55.12*/request/*55.19*/.getAddress()),format.raw/*55.32*/("""</td>
						<td><span class=""""),_display_(/*56.25*/if(request.isResolved())/*56.49*/{_display_(Seq[Any](format.raw/*56.50*/("""status-resolved""")))}/*56.66*/else/*56.70*/{_display_(Seq[Any](format.raw/*56.71*/("""status-pending""")))}),format.raw/*56.86*/("""">"""),_display_(/*56.89*/if(request.isResolved())/*56.113*/{_display_(Seq[Any](format.raw/*56.114*/("""Resolved""")))}/*56.123*/else/*56.127*/{_display_(Seq[Any](format.raw/*56.128*/("""Pending""")))}),format.raw/*56.136*/("""</span></td>
						<td><a href=""""),_display_(/*57.21*/routes/*57.27*/.AdminController.viewRequest(request.getId())),format.raw/*57.72*/("""" class="btn btn-default">Details</a></td>
					</tr>
				""")))}),format.raw/*59.6*/("""
							
			"""),format.raw/*61.4*/("""</tbody>
			<tfoot>
                            <tr>
                                <th class="text-center">ID</th>
                                <th class="text-center">Thumb</th>
                                <th class="text-center">Name</th>
                                <th class="text-center">Address</th>
                                <th class="text-center">Details</th>
                                <th class="text-center">Status</th>
                            </tr>
                        </tfoot>
		</table>
	</div>
	
	</hr>
	
	
	</div>
	
	
""")))}),format.raw/*81.2*/("""
"""))}
  }

  def render(title:String,isLoggedIn:Boolean,department:models.Admin,requestList:List[models.Request],all:Integer,resolved:Integer,pending:Integer): play.twirl.api.HtmlFormat.Appendable = apply(title,isLoggedIn,department,requestList,all,resolved,pending)

  def f:((String,Boolean,models.Admin,List[models.Request],Integer,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (title,isLoggedIn,department,requestList,all,resolved,pending) => apply(title,isLoggedIn,department,requestList,all,resolved,pending)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 06:02:39 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/dashboard.scala.html
                  HASH: a275a09ac234b042218f0ed6526d797352f15418
                  MATRIX: 799->1|1084->151|1112->202|1139->204|1173->230|1212->232|1249->243|1577->544|1601->547|1924->842|1954->850|2311->1179|2340->1186|3199->2019|3242->2046|3281->2047|3314->2053|3365->2077|3381->2084|3410->2092|3523->2178|3539->2185|3571->2196|3637->2235|3653->2242|3689->2257|3718->2259|3734->2266|3769->2280|3813->2297|3829->2304|3863->2317|3920->2347|3953->2371|3992->2372|4027->2388|4040->2392|4079->2393|4125->2408|4155->2411|4189->2435|4229->2436|4258->2445|4272->2449|4312->2450|4352->2458|4412->2491|4427->2497|4493->2542|4582->2601|4621->2613|5219->3181
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|36->9|43->16|43->16|49->22|49->22|56->29|56->29|77->50|77->50|77->50|78->51|79->52|79->52|79->52|80->53|80->53|80->53|81->54|81->54|81->54|81->54|81->54|81->54|82->55|82->55|82->55|83->56|83->56|83->56|83->56|83->56|83->56|83->56|83->56|83->56|83->56|83->56|83->56|83->56|83->56|84->57|84->57|84->57|86->59|88->61|108->81
                  -- GENERATED --
              */
          