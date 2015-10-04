
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
                                <th class="text-center">Time</th>
                                <th class="text-center">Status</th>
                                <th class="text-center">Details</th>
                            </tr>
                        </thead>
                        
			<tbody>
				"""),_display_(/*51.6*/for(request <- requestList) yield /*51.33*/{_display_(Seq[Any](format.raw/*51.34*/("""
					"""),format.raw/*52.6*/("""<tr>
						<td><strong>"""),_display_(/*53.20*/request/*53.27*/.getId()),format.raw/*53.35*/("""</strong></td>
						<td><img class="thumb" src="/assets/images/request-thumbs/thumb-"""),_display_(/*54.72*/request/*54.79*/.getImage()),format.raw/*54.90*/(""""></td>
						<td class="text-center">"""),_display_(/*55.32*/request/*55.39*/.getFirstName()),format.raw/*55.54*/(""" """),_display_(/*55.56*/request/*55.63*/.getLastName()),format.raw/*55.77*/("""</td>
						<td>"""),_display_(/*56.12*/request/*56.19*/.getAddress()),format.raw/*56.32*/("""</td>
						<td>"""),_display_(/*57.12*/request/*57.19*/.getCreatedAt()),format.raw/*57.34*/("""</td>
						<td><span class=""""),_display_(/*58.25*/if(request.isResolved())/*58.49*/{_display_(Seq[Any](format.raw/*58.50*/("""status-resolved""")))}/*58.66*/else/*58.70*/{_display_(Seq[Any](format.raw/*58.71*/("""status-pending""")))}),format.raw/*58.86*/("""">"""),_display_(/*58.89*/if(request.isResolved())/*58.113*/{_display_(Seq[Any](format.raw/*58.114*/("""Resolved""")))}/*58.123*/else/*58.127*/{_display_(Seq[Any](format.raw/*58.128*/("""Pending""")))}),format.raw/*58.136*/("""</span></td>
						<td><a href=""""),_display_(/*59.21*/routes/*59.27*/.AdminController.viewRequest(request.getId())),format.raw/*59.72*/("""" class="btn btn-default">Details</a></td>
					</tr>
				""")))}),format.raw/*61.6*/("""
							
			"""),format.raw/*63.4*/("""</tbody>
			
		</table>
	</div>
	
	</hr>
	
	
	</div>
	
	
""")))}),format.raw/*74.2*/("""
"""))}
  }

  def render(title:String,isLoggedIn:Boolean,department:models.Admin,requestList:List[models.Request],all:Integer,resolved:Integer,pending:Integer): play.twirl.api.HtmlFormat.Appendable = apply(title,isLoggedIn,department,requestList,all,resolved,pending)

  def f:((String,Boolean,models.Admin,List[models.Request],Integer,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (title,isLoggedIn,department,requestList,all,resolved,pending) => apply(title,isLoggedIn,department,requestList,all,resolved,pending)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 06:16:43 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/dashboard.scala.html
                  HASH: bd9eb9b68e474df472aa7058c9edf1baa622a404
                  MATRIX: 799->1|1084->151|1112->202|1139->204|1173->230|1212->232|1249->243|1577->544|1601->547|1924->842|1954->850|2311->1179|2340->1186|3265->2085|3308->2112|3347->2113|3380->2119|3431->2143|3447->2150|3476->2158|3589->2244|3605->2251|3637->2262|3703->2301|3719->2308|3755->2323|3784->2325|3800->2332|3835->2346|3879->2363|3895->2370|3929->2383|3973->2400|3989->2407|4025->2422|4082->2452|4115->2476|4154->2477|4189->2493|4202->2497|4241->2498|4287->2513|4317->2516|4351->2540|4391->2541|4420->2550|4434->2554|4474->2555|4514->2563|4574->2596|4589->2602|4655->2647|4744->2706|4783->2718|4871->2776
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|36->9|43->16|43->16|49->22|49->22|56->29|56->29|78->51|78->51|78->51|79->52|80->53|80->53|80->53|81->54|81->54|81->54|82->55|82->55|82->55|82->55|82->55|82->55|83->56|83->56|83->56|84->57|84->57|84->57|85->58|85->58|85->58|85->58|85->58|85->58|85->58|85->58|85->58|85->58|85->58|85->58|85->58|85->58|86->59|86->59|86->59|88->61|90->63|101->74
                  -- GENERATED --
              */
          