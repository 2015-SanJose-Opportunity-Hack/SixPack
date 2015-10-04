
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
object text extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Field,String,String,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", placeholder: String = "", help: String = "", readOnly: Boolean = false):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.116*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-3 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-9">
      <input type="text" 
             class="form-control" 
             id=""""),_display_(/*8.19*/field/*8.24*/.id),format.raw/*8.27*/("""" 
             name=""""),_display_(/*9.21*/field/*9.26*/.name),format.raw/*9.31*/("""" 
             value=""""),_display_(/*10.22*/field/*10.27*/.value.getOrElse("")),format.raw/*10.47*/(""""
             """),_display_(/*11.15*/if( readOnly )/*11.29*/{_display_(Seq[Any](format.raw/*11.30*/("""
             	"""),format.raw/*12.15*/("""readonly="readonly"
             """)))}),format.raw/*13.15*/("""
             """),format.raw/*14.14*/("""placeholder=""""),_display_(/*14.28*/placeholder),format.raw/*14.39*/("""" />
      <span class="help-block">"""),_display_(/*15.33*/help),format.raw/*15.37*/("""</span>
      <span class="help-block """),_display_(/*16.32*/if(field.hasErrors)/*16.51*/ {_display_(Seq[Any](format.raw/*16.53*/("""er-msg red lighten-4""")))}),format.raw/*16.74*/("""">
      """),_display_(/*17.8*/{field.error.map { error => error.message }}),format.raw/*17.52*/("""</span>
    </div>
  </div>
"""))}
  }

  def render(field:Field,label:String,placeholder:String,help:String,readOnly:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(field,label,placeholder,help,readOnly)

  def f:((Field,String,String,String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (field,label,placeholder,help,readOnly) => apply(field,label,placeholder,help,readOnly)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 05:33:17 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/bootstrap3/text.scala.html
                  HASH: a776e0f7680e16275203e985cf5d098e66e35e0f
                  MATRIX: 761->1|964->115|994->119|1044->143|1071->162|1110->164|1150->174|1222->220|1247->225|1388->340|1401->345|1424->348|1473->371|1486->376|1511->381|1562->405|1576->410|1617->430|1660->446|1683->460|1722->461|1765->476|1830->510|1872->524|1913->538|1945->549|2009->586|2034->590|2100->629|2128->648|2168->650|2220->671|2256->681|2321->725
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|31->3|32->4|32->4|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|41->13|42->14|42->14|42->14|43->15|43->15|44->16|44->16|44->16|44->16|45->17|45->17
                  -- GENERATED --
              */
          