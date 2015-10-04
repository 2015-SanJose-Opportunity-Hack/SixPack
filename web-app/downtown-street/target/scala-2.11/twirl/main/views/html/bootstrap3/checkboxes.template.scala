
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
object checkboxes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,Map[String, Boolean],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", checkboxMap: Map[String, Boolean], help:String = ""):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.97*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div class="col-sm-10" id=""""),_display_(/*5.33*/field/*5.38*/.id),format.raw/*5.41*/("""">
      """),_display_(/*6.8*/for((checkboxName, isChecked) <- checkboxMap) yield /*6.53*/ {_display_(Seq[Any](format.raw/*6.55*/("""
        """),format.raw/*7.9*/("""<label class="checkbox-inline">
          <input
            type="checkbox"
            name=""""),_display_(/*10.20*/(field.name + "[]")),format.raw/*10.39*/(""""
            id=""""),_display_(/*11.18*/checkboxName),format.raw/*11.30*/(""""
            value=""""),_display_(/*12.21*/checkboxName),format.raw/*12.33*/(""""
            """),_display_(/*13.14*/if(isChecked)/*13.27*/ {_display_(Seq[Any](format.raw/*13.29*/("""checked""")))}),format.raw/*13.37*/(""">
          """),_display_(/*14.12*/checkboxName),format.raw/*14.24*/("""
        """),format.raw/*15.9*/("""</label>
      """)))}),format.raw/*16.8*/("""
      """),format.raw/*17.7*/("""<span class="help-block">"""),_display_(/*17.33*/help),format.raw/*17.37*/("""</span>
      <span class="help-block">"""),_display_(/*18.33*/{field.error.map { error => error.message }}),format.raw/*18.77*/("""</span>
    </div>
  </div>
"""))}
  }

  def render(field:Field,label:String,checkboxMap:Map[String, Boolean],help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,checkboxMap,help)

  def f:((Field,String,Map[String, Boolean],String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,checkboxMap,help) => apply(field,label,checkboxMap,help)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 11:01:07 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/bootstrap3/checkboxes.scala.html
                  HASH: e78d402bdc414d32daa5f4fd54cafcb62eebb0a5
                  MATRIX: 773->1|956->96|986->100|1036->124|1063->143|1102->145|1142->155|1219->206|1232->211|1255->214|1284->217|1309->222|1376->263|1389->268|1412->271|1447->281|1507->326|1546->328|1581->337|1704->433|1744->452|1790->471|1823->483|1872->505|1905->517|1947->532|1969->545|2009->547|2048->555|2088->568|2121->580|2157->589|2203->605|2237->612|2290->638|2315->642|2382->682|2447->726
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|31->3|32->4|32->4|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|38->10|38->10|39->11|39->11|40->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|43->15|44->16|45->17|45->17|45->17|46->18|46->18
                  -- GENERATED --
              */
          