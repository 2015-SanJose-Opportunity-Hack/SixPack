
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
object decimal extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.89*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-3 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-9">
      <input type="number"
      		step="any"
      		min="0" 
             class="form-control" 
             id=""""),_display_(/*10.19*/field/*10.24*/.id),format.raw/*10.27*/("""" 
             name=""""),_display_(/*11.21*/field/*11.26*/.name),format.raw/*11.31*/("""" 
             value=""""),_display_(/*12.22*/field/*12.27*/.value.getOrElse("")),format.raw/*12.47*/(""""
             placeholder=""""),_display_(/*13.28*/placeholder),format.raw/*13.39*/("""" />
      <span class="help-block">"""),_display_(/*14.33*/help),format.raw/*14.37*/("""</span>
      <span class="help-block">"""),_display_(/*15.33*/{field.error.map { error => error.message }}),format.raw/*15.77*/("""</span>
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
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/bootstrap3/decimal.scala.html
                  HASH: 75b84f5fa7e559c674337c172121539f48e11421
                  MATRIX: 756->1|931->88|961->92|1011->116|1038->135|1077->137|1117->147|1189->193|1214->198|1393->350|1407->355|1431->358|1481->381|1495->386|1521->391|1572->415|1586->420|1627->440|1683->469|1715->480|1779->517|1804->521|1871->561|1936->605
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|31->3|32->4|32->4|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|42->14|42->14|43->15|43->15
                  -- GENERATED --
              */
          