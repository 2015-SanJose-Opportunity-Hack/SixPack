
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
object dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Boolean,models.Admin,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, isLoggedIn: Boolean, department: models.Admin):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import views.html.bootstrap3._

Seq[Any](format.raw/*1.64*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/backend(title, isLoggedIn)/*6.28*/ {_display_(Seq[Any](format.raw/*6.30*/("""

    """),format.raw/*8.5*/("""<h2 class="welcome">Welcome Admin!</h2>
    <hr>
    
    <div class="col-md-12 text-center">
	    <div class="col-md-4">
	    	<h3>Total Requests</h3>
	    	<h1>100</h1>
	    </div>
	    <div class="col-md-4">
	    	<h3>Resolved</h3>
	    	<h1>143</h1>
	    </div>
	    <div class="col-md-4">
	    	<h3>Unresolved</h3>
	    	<h1>10</h1>
	    </div>
    </div>
    
  	<div class="col-md-12 charts">
  	<div class="col-md-12 table-responsive" style="display: none">
	
		<table class="table table-bordered table-striped table-hover text-center display"  id="search-table" width="100%">
			<thead>
				<tr>
					<th class="text-center">ID</th>
					<th class="text-center">Thumb</th>
					<th class="text-center">Name</th>
					<th class="text-center">Address</th>
					<th class="text-center">Comment</th>
					<th class="text-center">Details</th>
					<th class="text-center">Action</th>
				</tr>
			</thead>
			<tbody>
				
					<tr>
						<td><strong>1</strong></td>
						<td>IMG</td>
						<td class="text-center">John Doe</td>
						<td>2211 N 1st Street</td>
						<td>Some comments ...</td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
					</tr>
					
					<tr>
						<td><strong>2</strong></td>
						<td>IMG</td>
						<td class="text-center">John Doe</td>
						<td>2211 N 1st Street</td>
						<td>Some comments ...</td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
					</tr>
					
					
					<tr>
						<td><strong>3</strong></td>
						<td>IMG</td>
						<td class="text-center">John Doe</td>
						<td>2211 N 1st Street</td>
						<td>Some comments ...</td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
					</tr>
					
					
					<tr>
						<td><strong>4</strong></td>
						<td>IMG</td>
						<td class="text-center">John Doe</td>
						<td>2211 N 1st Street</td>
						<td>Some comments ...</td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
					</tr>
					
					
					<tr>
						<td><strong>5</strong></td>
						<td>IMG</td>
						<td class="text-center">John Doe</td>
						<td>2211 N 1st Street</td>
						<td>Some comments ...</td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
					</tr>
					
					
					<tr>
						<td><strong>6</strong></td>
						<td>IMG</td>
						<td class="text-center">John Doe</td>
						<td>2211 N 1st Street</td>
						<td>Some comments ...</td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
					</tr>
					
					
					<tr>
						<td><strong>7</strong></td>
						<td>IMG</td>
						<td class="text-center">John Doe</td>
						<td>2211 N 1st Street</td>
						<td>Some comments ...</td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
					</tr>
					
					<tr>
						<td><strong>8</strong></td>
						<td>IMG</td>
						<td class="text-center">John Doe</td>
						<td>2211 N 1st Street</td>
						<td>Some comments ...</td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
					</tr>
					
					<tr>
						<td><strong>9</strong></td>
						<td>IMG</td>
						<td class="text-center">John Doe</td>
						<td>2211 N 1st Street</td>
						<td>Some comments ...</td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
						
						<td><a href="#" class="btn btn-default">Resolve</a></td>
					</tr>
						
			</tbody>
		</table>
	</div>
	
	</hr>
	
	
	
   <script type="text/javascript">
     	jQuery(document).ready(function()"""),format.raw/*165.40*/("""{"""),format.raw/*165.41*/("""
     		"""),format.raw/*166.8*/("""jQuery(".table-responsive").fadeIn(1000);
     		jQuery('#search-table').dataTable("""),format.raw/*167.42*/("""{"""),format.raw/*167.43*/("""
     			"""),format.raw/*168.9*/(""""scrollY":        800,
     	        "scrollCollapse": true,
     			"jQueryUI":       true,
     			"autoWidth": false
     		"""),format.raw/*172.8*/("""}"""),format.raw/*172.9*/("""				
     		"""),format.raw/*173.8*/(""");
     		
     	"""),format.raw/*175.7*/("""}"""),format.raw/*175.8*/(""");
     </script>
	</div>
	
	
""")))}),format.raw/*180.2*/("""
"""))}
  }

  def render(title:String,isLoggedIn:Boolean,department:models.Admin): play.twirl.api.HtmlFormat.Appendable = apply(title,isLoggedIn,department)

  def f:((String,Boolean,models.Admin) => play.twirl.api.HtmlFormat.Appendable) = (title,isLoggedIn,department) => apply(title,isLoggedIn,department)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Oct 03 15:43:00 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/dashboard.scala.html
                  HASH: b6bd987256b91a4bb03d249acfa9b8e45c69c902
                  MATRIX: 754->1|950->63|978->114|1005->116|1039->142|1078->144|1110->150|5186->4197|5216->4198|5252->4206|5364->4289|5394->4290|5431->4299|5586->4426|5615->4427|5655->4439|5700->4456|5729->4457|5791->4488
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|192->165|192->165|193->166|194->167|194->167|195->168|199->172|199->172|200->173|202->175|202->175|207->180
                  -- GENERATED --
              */
          