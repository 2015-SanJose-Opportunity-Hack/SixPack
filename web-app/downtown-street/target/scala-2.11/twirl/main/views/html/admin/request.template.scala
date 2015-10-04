
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
object request extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Boolean,models.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, isLoggedIn: Boolean, request: models.Request):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import views.html.bootstrap3._

Seq[Any](format.raw/*1.63*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/backend(title, isLoggedIn)/*6.28*/ {_display_(Seq[Any](format.raw/*6.30*/("""

    
    """),format.raw/*9.5*/("""<div class="request-container col-md-12">
    	<div class="maps col-md-6">
    		<div id="map">
        	</div>
    	</div>
    	<div class="maps col-md-6">
    	<div class="request-info-group">
    			<div class="col-md-6">
    			<p class="image-title">Before</p>
    				<img class="full-image" src=""""),_display_(/*18.39*/routes/*18.45*/.Assets.at("images/request-images/" + request.getImage())),format.raw/*18.102*/("""">
    			</div>
    			<div class="col-md-6">
    			<p class="image-title">After</p>
    			<img class="full-image" src=""""),_display_(/*22.38*/routes/*22.44*/.Assets.at("images/request-images/" + request.getResolvedImage())),format.raw/*22.109*/("""">
    			</div>
    		</div>
    		
    		<div class="request-info-group col-md-12">
    			
    			"""),_display_(/*28.9*/request/*28.16*/.getFirstName()),format.raw/*28.31*/(""" """),_display_(/*28.33*/request/*28.40*/.getLastName()),format.raw/*28.54*/("""
    			
    		"""),format.raw/*30.7*/("""</div>
    		
    		<div class="request-info-group col-md-12">
    			+1800800800
    		</div>
    		
    		<div class="request-info-group col-md-12">
    			usermail.com	
    		</div>
    		
    		<div class="request-info-group col-md-12">
    			2211 N 1 st, San Jose, 95112
    		</div>
    		
    		"""),_display_(/*44.8*/if(request.isResolved())/*44.32*/{_display_(Seq[Any](format.raw/*44.33*/("""
    			"""),format.raw/*45.8*/("""<a href=""""),_display_(/*45.18*/routes/*45.24*/.AdminController.unresolveRequest(request.getId())),format.raw/*45.74*/("""" class="btn btn-success resolved resolve-btn">"""),_display_(/*45.122*/if(request.isResolved)/*45.144*/{_display_(Seq[Any](format.raw/*45.145*/(""" """),format.raw/*45.146*/("""Resolved """)))}/*45.156*/else/*45.160*/{_display_(Seq[Any](format.raw/*45.161*/(""" """),format.raw/*45.162*/("""Unresolved """)))}),format.raw/*45.174*/(""" """),format.raw/*45.175*/("""</a>
    		""")))}/*46.8*/else/*46.12*/{_display_(Seq[Any](format.raw/*46.13*/("""
    			
    			"""),format.raw/*48.8*/("""<a href="#" class="btn btn-warning unresolved resolve-btn"  data-toggle="modal" data-target="#resolveModal">Unresolved</a>
    		""")))}),format.raw/*49.8*/("""
    		
    	"""),format.raw/*51.6*/("""</div>
    	
    	<hr>
    	
    	
	</div>
	<div class="details col-md-12">
		<h2>Comments</h2>
		<p>	
			Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
		
		</p>
	</div>
	
	"""),_display_(/*65.3*/if(!request.isResolved())/*65.28*/{_display_(Seq[Any](format.raw/*65.29*/("""
		"""),format.raw/*66.3*/("""<div class="modal fade" id="resolveModal">
		  <div class="modal-dialog">
		    <div class="modal-content">
		    <form action=""""),_display_(/*69.22*/routes/*69.28*/.AdminController.resolveRequest(request.getId())),format.raw/*69.76*/("""" method="POST" enctype="multipart/form-data">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title">Do you have an image?</h4>
		      </div>
		      <div class="modal-body">
		        <div class="form-group">
				    <label class="col-sm-3 control-label" for="picture">Picture</label>
				    <div class="col-sm-9">
				    
				    	<input type="file" id="resolvedImage" name="resolvedImage" data-max-size='4m' accept="image/*" />
				      	<span class="help-block">Upload a picture. 4MB max size(optional)</span>
				    
				      
				    </div>
				  </div>
		        	
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
		        <button type="submit" class="btn btn-primary">Upload and Save</button>
		      </div>
		      </form>
		    </div><!-- /.modal-content -->
		    </div><!-- /.modal-dialog -->
		</div><!-- /.modal -->
	""")))}),format.raw/*95.3*/("""
	
	"""),_display_(/*97.3*/if(!request.getImage().equals(""))/*97.37*/{_display_(Seq[Any](format.raw/*97.38*/("""
		"""),format.raw/*98.3*/("""<div class="modal fade" id="beforeImageModal">
		  <div class="modal-dialog">
		    <div class="modal-content">
		    
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title">Before Image</h4>
		      </div>
		      <div class="modal-body">
		        <div class="form-group">
				    <label class="col-sm-3 control-label" for="picture">Picture</label>
				    <div class="col-sm-9">
				    
				    	<img src="">
				      
				    </div>
				  </div>
		        	
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
		        <button type="submit" class="btn btn-primary">Upload and Save</button>
		      </div>
		      
		    </div><!-- /.modal-content -->
		    </div><!-- /.modal-dialog -->
		</div><!-- /.modal -->
	""")))}),format.raw/*125.3*/("""
	
	
	"""),format.raw/*128.2*/("""<script src=""""),_display_(/*128.16*/routes/*128.22*/.Assets.at("javascripts/file-validator.js")),format.raw/*128.65*/("""" type="text/javascript"></script>
	
	
	 
	    <script type="text/javascript">
	    	//google maps
	      function initialize() """),format.raw/*134.30*/("""{"""),format.raw/*134.31*/("""
	        """),format.raw/*135.10*/("""var mapCanvas = document.getElementById('map');
	        var mapOptions = """),format.raw/*136.27*/("""{"""),format.raw/*136.28*/("""
	          """),format.raw/*137.12*/("""center: new google.maps.LatLng(44.5403, -78.5463),
	          zoom: 8,
	          mapTypeId: google.maps.MapTypeId.ROADMAP
	        """),format.raw/*140.10*/("""}"""),format.raw/*140.11*/("""
	        """),format.raw/*141.10*/("""var map = new google.maps.Map(mapCanvas, mapOptions)
	      """),format.raw/*142.8*/("""}"""),format.raw/*142.9*/("""
	      """),format.raw/*143.8*/("""google.maps.event.addDomListener(window, 'load', initialize);
	      
	      jQuery(document).ready(function() """),format.raw/*145.42*/("""{"""),format.raw/*145.43*/("""
			  """),format.raw/*146.6*/("""jQuery( "input[type=file]" ).fileValidator("""),format.raw/*146.49*/("""{"""),format.raw/*146.50*/("""
				  """),format.raw/*147.7*/("""onValidation: function(files)"""),format.raw/*147.36*/("""{"""),format.raw/*147.37*/("""      """),format.raw/*147.43*/("""$(this).attr('class','');          """),format.raw/*147.78*/("""}"""),format.raw/*147.79*/(""",
				  onInvalid:    function(type, file)"""),format.raw/*148.41*/("""{"""),format.raw/*148.42*/(""" 
					  					"""),format.raw/*149.13*/("""$(this).addClass('invalid '+type); 
				  						jQuery("form").on("submit",function()"""),format.raw/*150.50*/("""{"""),format.raw/*150.51*/("""
				  							"""),format.raw/*151.14*/("""alert("File size is too big. Please use an image lesser than MB");
				  							return false;
				  						"""),format.raw/*153.13*/("""}"""),format.raw/*153.14*/(""")
		  						"""),format.raw/*154.11*/("""}"""),format.raw/*154.12*/(""",
				  maxSize:      '4m',
				  type:         'image' //optional
				"""),format.raw/*157.5*/("""}"""),format.raw/*157.6*/(""");
	      """),format.raw/*158.8*/("""}"""),format.raw/*158.9*/(""");
				
	    </script>
	
	
	
""")))}),format.raw/*164.2*/("""
"""))}
  }

  def render(title:String,isLoggedIn:Boolean,request:models.Request): play.twirl.api.HtmlFormat.Appendable = apply(title,isLoggedIn,request)

  def f:((String,Boolean,models.Request) => play.twirl.api.HtmlFormat.Appendable) = (title,isLoggedIn,request) => apply(title,isLoggedIn,request)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 00:10:04 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/request.scala.html
                  HASH: 6ef01c90495f0cb92976a2ca0cdea79880afbc05
                  MATRIX: 754->1|949->62|977->113|1004->115|1038->141|1077->143|1114->154|1445->458|1460->464|1539->521|1690->645|1705->651|1792->716|1920->818|1936->825|1972->840|2001->842|2017->849|2052->863|2094->878|2424->1182|2457->1206|2496->1207|2531->1215|2568->1225|2583->1231|2654->1281|2730->1329|2762->1351|2802->1352|2832->1353|2862->1363|2876->1367|2916->1368|2946->1369|2990->1381|3020->1382|3050->1394|3063->1398|3102->1399|3145->1415|3305->1545|3345->1558|4074->2261|4108->2286|4147->2287|4177->2290|4333->2419|4348->2425|4417->2473|5529->3555|5560->3560|5603->3594|5642->3595|5672->3598|6663->4558|6697->4564|6739->4578|6755->4584|6820->4627|6977->4755|7007->4756|7046->4766|7149->4840|7179->4841|7220->4853|7381->4985|7411->4986|7450->4996|7538->5056|7567->5057|7603->5065|7743->5176|7773->5177|7807->5183|7879->5226|7909->5227|7944->5234|8002->5263|8032->5264|8067->5270|8131->5305|8161->5306|8232->5348|8262->5349|8305->5363|8419->5448|8449->5449|8492->5463|8627->5569|8657->5570|8698->5582|8728->5583|8827->5654|8856->5655|8894->5665|8923->5666|8984->5696
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|36->9|45->18|45->18|45->18|49->22|49->22|49->22|55->28|55->28|55->28|55->28|55->28|55->28|57->30|71->44|71->44|71->44|72->45|72->45|72->45|72->45|72->45|72->45|72->45|72->45|72->45|72->45|72->45|72->45|72->45|72->45|73->46|73->46|73->46|75->48|76->49|78->51|92->65|92->65|92->65|93->66|96->69|96->69|96->69|122->95|124->97|124->97|124->97|125->98|152->125|155->128|155->128|155->128|155->128|161->134|161->134|162->135|163->136|163->136|164->137|167->140|167->140|168->141|169->142|169->142|170->143|172->145|172->145|173->146|173->146|173->146|174->147|174->147|174->147|174->147|174->147|174->147|175->148|175->148|176->149|177->150|177->150|178->151|180->153|180->153|181->154|181->154|184->157|184->157|185->158|185->158|191->164
                  -- GENERATED --
              */
          