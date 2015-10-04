
package views.html.bootstrap3

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
object number extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Field,String,String,String,Boolean,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", placeholder: String = "", help: String = "", isMinZero: Boolean = false, readOnly: Boolean = false):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.144*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-3 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-9">
      <input type="number" 
             class="form-control" 
             """),_display_(/*8.15*/if( isMinZero )/*8.30*/{_display_(Seq[Any](format.raw/*8.31*/("""
             	"""),format.raw/*9.15*/("""min="0"
             """)))}/*10.15*/else/*10.19*/{_display_(Seq[Any](format.raw/*10.20*/("""
             	"""),format.raw/*11.15*/("""min = "1"
             """)))}),format.raw/*12.15*/("""
             
             """),format.raw/*14.14*/("""id=""""),_display_(/*14.19*/field/*14.24*/.id),format.raw/*14.27*/("""" 
             name=""""),_display_(/*15.21*/field/*15.26*/.name),format.raw/*15.31*/("""" 
             value=""""),_display_(/*16.22*/field/*16.27*/.value.getOrElse("")),format.raw/*16.47*/(""""
             """),_display_(/*17.15*/if( readOnly )/*17.29*/{_display_(Seq[Any](format.raw/*17.30*/("""
             	"""),format.raw/*18.15*/("""readonly="readonly"
             """)))}),format.raw/*19.15*/("""
             """),format.raw/*20.14*/("""placeholder=""""),_display_(/*20.28*/placeholder),format.raw/*20.39*/("""" />
      <span class="help-block">"""),_display_(/*21.33*/help),format.raw/*21.37*/("""</span>
      <span class="help-block">"""),_display_(/*22.33*/{field.error.map { error => error.message }}),format.raw/*22.77*/("""</span>
    </div>
  </div>
"""))}
  }

  def render(field:Field,label:String,placeholder:String,help:String,isMinZero:Boolean,readOnly:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(field,label,placeholder,help,isMinZero,readOnly)

  def f:((Field,String,String,String,Boolean,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (field,label,placeholder,help,isMinZero,readOnly) => apply(field,label,placeholder,help,isMinZero,readOnly)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Oct 03 19:40:12 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/bootstrap3/number.scala.html
                  HASH: 3d09df05d25af73ea59a8146823b840c0a181aa0
                  MATRIX: 771->1|1002->143|1032->147|1082->171|1109->190|1148->192|1188->202|1260->248|1285->253|1424->366|1447->381|1485->382|1527->397|1568->419|1581->423|1620->424|1663->439|1718->463|1774->491|1806->496|1820->501|1844->504|1894->527|1908->532|1934->537|1985->561|1999->566|2040->586|2083->602|2106->616|2145->617|2188->632|2253->666|2295->680|2336->694|2368->705|2432->742|2457->746|2524->786|2589->830
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|31->3|32->4|32->4|36->8|36->8|36->8|37->9|38->10|38->10|38->10|39->11|40->12|42->14|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|48->20|48->20|48->20|49->21|49->21|50->22|50->22
                  -- GENERATED --
              */
          