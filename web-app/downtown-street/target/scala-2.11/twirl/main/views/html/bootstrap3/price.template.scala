
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
object price extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Field,String,String,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", placeholder: String = "", help: String = "", readOnly: Boolean = false):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.116*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-3 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-9">
	    <div class="input-group">
	    	  <span class="input-group-addon" id="sizing-addon2">$</span>
		      <input type="number" 
		      		 step="any"
      				 min="0" 
		             class="form-control" 
		             id=""""),_display_(/*12.21*/field/*12.26*/.id),format.raw/*12.29*/("""" 
		             name=""""),_display_(/*13.23*/field/*13.28*/.name),format.raw/*13.33*/("""" 
		             value=""""),_display_(/*14.24*/field/*14.29*/.value.getOrElse("")),format.raw/*14.49*/(""""
		             placeholder=""""),_display_(/*15.30*/placeholder),format.raw/*15.41*/(""""
		             aria-describedby="sizing-addon2"
		             """),_display_(/*17.17*/if( readOnly )/*17.31*/{_display_(Seq[Any](format.raw/*17.32*/("""
		             	"""),format.raw/*18.17*/("""readonly="readonly"
		             """)))}),format.raw/*19.17*/("""
		              """),format.raw/*20.17*/("""/>
	    </div>
      <span class="help-block">"""),_display_(/*22.33*/help),format.raw/*22.37*/("""</span>
      <span class="help-block">"""),_display_(/*23.33*/{field.error.map { error => error.message }}),format.raw/*23.77*/("""</span>
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
                  DATE: Sat Oct 03 19:40:12 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/bootstrap3/price.scala.html
                  HASH: 37a8a2e9bbc5080d652336cdf90bbc29f917f86e
                  MATRIX: 762->1|965->115|995->119|1045->143|1072->162|1111->164|1151->174|1223->220|1248->225|1539->489|1553->494|1577->497|1629->522|1643->527|1669->532|1722->558|1736->563|1777->583|1835->614|1867->625|1960->691|1983->705|2022->706|2067->723|2134->759|2179->776|2253->823|2278->827|2345->867|2410->911
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|31->3|32->4|32->4|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|45->17|45->17|45->17|46->18|47->19|48->20|50->22|50->22|51->23|51->23
                  -- GENERATED --
              */
          