
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
						"""),_display_(/*51.8*/for(request <- requestList) yield /*51.35*/{_display_(Seq[Any](format.raw/*51.36*/("""
							"""),format.raw/*52.8*/("""<tr>
								<td><strong>"""),_display_(/*53.22*/request/*53.29*/.getId()),format.raw/*53.37*/("""</strong></td>
								<td><img class="thumb" src="/assets/images/request-thumbs/thumb-"""),_display_(/*54.74*/request/*54.81*/.getImage()),format.raw/*54.92*/(""""></td>
								<td class="text-center">"""),_display_(/*55.34*/request/*55.41*/.getFirstName()),format.raw/*55.56*/(""" """),_display_(/*55.58*/request/*55.65*/.getLastName()),format.raw/*55.79*/("""</td>
								<td>"""),_display_(/*56.14*/request/*56.21*/.getAddress()),format.raw/*56.34*/("""</td>
								<td>"""),_display_(/*57.14*/request/*57.21*/.getCreatedAt()),format.raw/*57.36*/("""</td>
								<td><span class=""""),_display_(/*58.27*/if(request.isResolved())/*58.51*/{_display_(Seq[Any](format.raw/*58.52*/("""status-resolved""")))}/*58.68*/else/*58.72*/{_display_(Seq[Any](format.raw/*58.73*/("""status-pending""")))}),format.raw/*58.88*/("""">"""),_display_(/*58.91*/if(request.isResolved())/*58.115*/{_display_(Seq[Any](format.raw/*58.116*/("""Resolved""")))}/*58.125*/else/*58.129*/{_display_(Seq[Any](format.raw/*58.130*/("""Pending""")))}),format.raw/*58.138*/("""</span></td>
								<td><a href=""""),_display_(/*59.23*/routes/*59.29*/.AdminController.viewRequest(request.getId())),format.raw/*59.74*/("""" class="btn btn-default">Details</a></td>
							</tr>
						""")))}),format.raw/*61.8*/("""
			"""),format.raw/*62.4*/("""</tbody>
			
		</table>
	</div>
	
	</hr>
	
	
	</div>
	
	<script type="text/javascript">
		jQuery(document).ready(function()"""),format.raw/*73.36*/("""{"""),format.raw/*73.37*/("""
			"""),format.raw/*74.4*/("""jQuery("head").append('<meta http-equiv="refresh" content="15">');
		"""),format.raw/*75.3*/("""}"""),format.raw/*75.4*/(""");
	</script>
	
""")))}),format.raw/*78.2*/("""
"""))}
  }

  def render(title:String,isLoggedIn:Boolean,department:models.Admin,requestList:List[models.Request],all:Integer,resolved:Integer,pending:Integer): play.twirl.api.HtmlFormat.Appendable = apply(title,isLoggedIn,department,requestList,all,resolved,pending)

  def f:((String,Boolean,models.Admin,List[models.Request],Integer,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (title,isLoggedIn,department,requestList,all,resolved,pending) => apply(title,isLoggedIn,department,requestList,all,resolved,pending)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 11:01:07 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/dashboard.scala.html
                  HASH: 81676c72fe64199b33c1e0fb81b179bb9e8731b6
                  MATRIX: 799->1|1084->151|1112->202|1139->204|1173->230|1212->232|1249->243|1577->544|1601->547|1924->842|1954->850|2311->1179|2340->1186|3267->2087|3310->2114|3349->2115|3384->2123|3437->2149|3453->2156|3482->2164|3597->2252|3613->2259|3645->2270|3713->2311|3729->2318|3765->2333|3794->2335|3810->2342|3845->2356|3891->2375|3907->2382|3941->2395|3987->2414|4003->2421|4039->2436|4098->2468|4131->2492|4170->2493|4205->2509|4218->2513|4257->2514|4303->2529|4333->2532|4367->2556|4407->2557|4436->2566|4450->2570|4490->2571|4530->2579|4592->2614|4607->2620|4673->2665|4766->2728|4797->2732|4948->2855|4977->2856|5008->2860|5104->2929|5132->2930|5179->2947
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|36->9|43->16|43->16|49->22|49->22|56->29|56->29|78->51|78->51|78->51|79->52|80->53|80->53|80->53|81->54|81->54|81->54|82->55|82->55|82->55|82->55|82->55|82->55|83->56|83->56|83->56|84->57|84->57|84->57|85->58|85->58|85->58|85->58|85->58|85->58|85->58|85->58|85->58|85->58|85->58|85->58|85->58|85->58|86->59|86->59|86->59|88->61|89->62|100->73|100->73|101->74|102->75|102->75|105->78
                  -- GENERATED --
              */
          