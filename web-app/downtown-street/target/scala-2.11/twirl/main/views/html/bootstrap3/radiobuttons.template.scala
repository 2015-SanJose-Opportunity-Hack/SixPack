
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
object radiobuttons extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", buttonNameList: List[String], help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.93*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div id=""""),_display_(/*5.15*/(field.id + "s")),format.raw/*5.31*/("""" class="col-sm-10" >
      """),_display_(/*6.8*/for(buttonName <- buttonNameList) yield /*6.41*/ {_display_(Seq[Any](format.raw/*6.43*/("""
      """),format.raw/*7.7*/("""<label class="radio-inline">
        <input
          type="radio"
          name=""""),_display_(/*10.18*/field/*10.23*/.name),format.raw/*10.28*/(""""
          id=""""),_display_(/*11.16*/buttonName),format.raw/*11.26*/(""""
          value=""""),_display_(/*12.19*/buttonName),format.raw/*12.29*/(""""
          """),_display_(/*13.12*/if(buttonName == field.value.getOrElse(""))/*13.55*/ {_display_(Seq[Any](format.raw/*13.57*/("""checked""")))}),format.raw/*13.65*/(""" """),format.raw/*13.66*/("""/>
        """),_display_(/*14.10*/buttonName),format.raw/*14.20*/("""
      """),format.raw/*15.7*/("""</label>
      """)))}),format.raw/*16.8*/("""
      """),format.raw/*17.7*/("""<span class="help-block">"""),_display_(/*17.33*/help),format.raw/*17.37*/("""</span>
      <span class="help-block">"""),_display_(/*18.33*/{field.error.map { error => error.message }}),format.raw/*18.77*/("""</span>
    </div>
  </div>
"""))}
  }

  def render(field:Field,label:String,buttonNameList:List[String],help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,buttonNameList,help)

  def f:((Field,String,List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,buttonNameList,help) => apply(field,label,buttonNameList,help)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Oct 03 19:40:12 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/bootstrap3/radiobuttons.scala.html
                  HASH: 5bb12275e8ea2fb50ab6ead3915bcea543e25e34
                  MATRIX: 767->1|946->92|976->96|1026->120|1053->139|1092->141|1132->151|1209->202|1222->207|1245->210|1274->213|1299->218|1348->241|1384->257|1438->286|1486->319|1525->321|1558->328|1669->412|1683->417|1709->422|1753->439|1784->449|1831->469|1862->479|1902->492|1954->535|1994->537|2033->545|2062->546|2101->558|2132->568|2166->575|2212->591|2246->598|2299->624|2324->628|2391->668|2456->712
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|31->3|32->4|32->4|32->4|32->4|32->4|33->5|33->5|34->6|34->6|34->6|35->7|38->10|38->10|38->10|39->11|39->11|40->12|40->12|41->13|41->13|41->13|41->13|41->13|42->14|42->14|43->15|44->16|45->17|45->17|45->17|46->18|46->18
                  -- GENERATED --
              */
          