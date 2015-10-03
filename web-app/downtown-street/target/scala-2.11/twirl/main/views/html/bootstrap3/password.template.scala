
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
object password extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label:String = "CHANGEME", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.88*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-3 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-9">
      <input
        type="password"
        class="form-control"
        id=""""),_display_(/*9.14*/field/*9.19*/.id),format.raw/*9.22*/(""""
        name=""""),_display_(/*10.16*/field/*10.21*/.name),format.raw/*10.26*/(""""
        value=""""),_display_(/*11.17*/field/*11.22*/.value.getOrElse("")),format.raw/*11.42*/(""""
        placeholder=""""),_display_(/*12.23*/placeholder),format.raw/*12.34*/("""" />
      <span class="help-block">"""),_display_(/*13.33*/help),format.raw/*13.37*/("""</span>
      <span class="help-block">"""),_display_(/*14.33*/{field.error.map { error => error.message }}),format.raw/*14.77*/("""</span>
    </div>
  </div>
"""))}
  }

  def render(field:Field,label:String,placeholder:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,placeholder,help)

  def f:((Field,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,placeholder,help) => apply(field,label,placeholder,help)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Oct 03 15:17:04 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/bootstrap3/password.scala.html
                  HASH: 22986f2c5321c5fadd66500e98af83591b3d23a0
                  MATRIX: 757->1|931->87|961->91|1011->115|1038->134|1077->136|1117->146|1189->192|1214->197|1355->312|1368->317|1391->320|1435->337|1449->342|1475->347|1520->365|1534->370|1575->390|1626->414|1658->425|1722->462|1747->466|1814->506|1879->550
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|31->3|32->4|32->4|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|41->13|41->13|42->14|42->14
                  -- GENERATED --
              */
          