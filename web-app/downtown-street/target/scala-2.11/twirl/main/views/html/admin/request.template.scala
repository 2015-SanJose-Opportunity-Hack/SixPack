
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

    
    """),format.raw/*9.5*/("""<div class="request-container col m12">
    	<div class="maps col m6">
    		<div id="map">
        	</div>
    	</div>
    	<div class="maps col m6">
    	<div class="request-info-group">
    			<div class="col m6 image-container">
    			<p class="image-title">Before</p>
    			
    				<img class="full-image materialboxed" src=""""),_display_(/*19.53*/routes/*19.59*/.Assets.at("images/request-images/" + request.getImage())),format.raw/*19.116*/("""">
   				
    			</div>
    			<div class="col m6 image-container">
    			
    				
   				"""),_display_(/*25.9*/if(request.getResolvedImage())/*25.39*/{_display_(Seq[Any](format.raw/*25.40*/("""
   					"""),format.raw/*26.9*/("""<p class="image-title">After</p>	
   					
   						<img class="full-image materialboxed" src=""""),_display_(/*28.54*/routes/*28.60*/.Assets.at("images/request-images/" + request.getResolvedImage())),format.raw/*28.125*/("""">
   					
    				
    			""")))}/*31.9*/else/*31.13*/{_display_(Seq[Any](format.raw/*31.14*/("""
    				"""),format.raw/*32.9*/("""<p class="image-title">No After Image</p>	
   					
					<img class="full-image" src="data:image/svg+xml;charset=utf-8,%3Csvg%20xmlns%3D'http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg'%20xmlns%3Axlink%3D'http%3A%2F%2Fwww.w3.org%2F1999%2Fxlink'%20viewBox%3D'0%200%201400%20933'%3E%3Cdefs%3E%3Csymbol%20id%3D'a'%20viewBox%3D'0%200%2090%2066'%20opacity%3D'0.3'%3E%3Cpath%20d%3D'M85%205v56H5V5h80m5-5H0v66h90V0z'%2F%3E%3Ccircle%20cx%3D'18'%20cy%3D'20'%20r%3D'6'%2F%3E%3Cpath%20d%3D'M56%2014L37%2039l-8-6-17%2023h67z'%2F%3E%3C%2Fsymbol%3E%3C%2Fdefs%3E%3Cuse%20xlink%3Ahref%3D'%23a'%20width%3D'20%25'%20x%3D'40%25'%2F%3E%3C%2Fsvg%3E">
   					
    			""")))}),format.raw/*36.9*/("""
    			
    			"""),format.raw/*38.8*/("""</div>
    		</div>
    		
    		<div class="request-info-group col m12">
    			
    			"""),_display_(/*43.9*/request/*43.16*/.getFirstName()),format.raw/*43.31*/(""" """),_display_(/*43.33*/request/*43.40*/.getLastName()),format.raw/*43.54*/("""
    			
    		"""),format.raw/*45.7*/("""</div>
    		
    		<div class="request-info-group col m12">
    			"""),_display_(/*48.9*/request/*48.16*/.getContact()),format.raw/*48.29*/("""
    		"""),format.raw/*49.7*/("""</div>
    		
    		<div class="request-info-group col m12">
    			"""),_display_(/*52.9*/request/*52.16*/.getEmail()),format.raw/*52.27*/("""
    		"""),format.raw/*53.7*/("""</div>
    		
    		<div class="request-info-group col m12">
    			"""),_display_(/*56.9*/request/*56.16*/.getAddress()),format.raw/*56.29*/("""
    		"""),format.raw/*57.7*/("""</div>
    		
    		"""),_display_(/*59.8*/if(request.isResolved())/*59.32*/{_display_(Seq[Any](format.raw/*59.33*/("""
    			"""),format.raw/*60.8*/("""<a href=""""),_display_(/*60.18*/routes/*60.24*/.AdminController.unresolveRequest(request.getId())),format.raw/*60.74*/("""" class="waves-effect green darken-1 waves-light btn resolved resolve-btn">"""),_display_(/*60.150*/if(request.isResolved)/*60.172*/{_display_(Seq[Any](format.raw/*60.173*/(""" """),format.raw/*60.174*/("""Resolved """)))}/*60.184*/else/*60.188*/{_display_(Seq[Any](format.raw/*60.189*/(""" """),format.raw/*60.190*/("""Unresolved """)))}),format.raw/*60.202*/(""" """),format.raw/*60.203*/("""</a>
    		""")))}/*61.8*/else/*61.12*/{_display_(Seq[Any](format.raw/*61.13*/("""
    			
    			"""),format.raw/*63.8*/("""<a class="waves-effect waves-light btn unresolved resolve-btn modal-trigger amber accent-4" href="#modal1">Unresolved</a>
    		""")))}),format.raw/*64.8*/("""
    		
    	"""),format.raw/*66.6*/("""</div>
    	

    	
    	
	</div>
	<div class="details col m12">
		<h2>Comments</h2>
		<p>	
			"""),_display_(/*75.5*/if(request.getComment())/*75.29*/{_display_(Seq[Any](format.raw/*75.30*/("""
				"""),_display_(/*76.6*/request/*76.13*/.getComment()),format.raw/*76.26*/("""
			""")))}/*77.5*/else/*77.9*/{_display_(Seq[Any](format.raw/*77.10*/("""
				"""),format.raw/*78.5*/("""No comments
			""")))}),format.raw/*79.5*/("""
		
		"""),format.raw/*81.3*/("""</p>
	</div>
	
	  
	
	"""),_display_(/*86.3*/if(!request.isResolved())/*86.28*/{_display_(Seq[Any](format.raw/*86.29*/("""
	
		"""),format.raw/*88.3*/("""<!-- Modal Structure -->
		  <div id="modal1" class="modal">
		  <form action=""""),_display_(/*90.20*/routes/*90.26*/.AdminController.resolveRequest(request.getId())),format.raw/*90.74*/("""" method="POST" enctype="multipart/form-data">
			    <div class="modal-content">
			      <h4>Want to upload a picture?</h4>
			      <input type="file" id="resolvedImage" name="resolvedImage" data-max-size='4m' accept="image/*" />
				      	<span class="help-block">Upload a picture. 4MB max size(optional)</span>
				    
			    </div>
			    <div class="modal-footer">
			      <button type="submit" class="modal-action modal-close waves-effect waves-green btn modal-resolve">Resolve</button>
			    </div>
		    </form>
		  </div>
  
  
		
	""")))}),format.raw/*105.3*/("""
	
	"""),_display_(/*107.3*/if(!request.getImage().equals(""))/*107.37*/{_display_(Seq[Any](format.raw/*107.38*/("""
		"""),format.raw/*108.3*/("""<div class="modal fade" id="beforeImageModal">
		  <div class="modal-dialog">
		    <div class="modal-content">
		    
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title">Before Image</h4>
		      </div>
		      <div class="modal-body">
		        <div class="form-group">
				    <label class="col s3 control-label" for="picture">Picture</label>
				    <div class="col s9">
				    
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
	""")))}),format.raw/*135.3*/("""
	
	
	"""),format.raw/*138.2*/("""<script src=""""),_display_(/*138.16*/routes/*138.22*/.Assets.at("javascripts/file-validator.js")),format.raw/*138.65*/("""" type="text/javascript"></script>
	
	
	 
	    <script type="text/javascript">
	    	//google maps
	      function initialize() """),format.raw/*144.30*/("""{"""),format.raw/*144.31*/("""
	    		"""),format.raw/*145.8*/("""//37.3351874,-121.8832655
	    	  var myLatLng = """),format.raw/*146.24*/("""{"""),format.raw/*146.25*/("""lat: 37.3351874, lng: -121.8832655"""),format.raw/*146.59*/("""}"""),format.raw/*146.60*/(""";

	    	  var map = new google.maps.Map(document.getElementById('map'), """),format.raw/*148.71*/("""{"""),format.raw/*148.72*/("""
	    	    """),format.raw/*149.11*/("""zoom: 17,
	    	    center: myLatLng
	    	  """),format.raw/*151.9*/("""}"""),format.raw/*151.10*/(""");

	    	  var marker = new google.maps.Marker("""),format.raw/*153.45*/("""{"""),format.raw/*153.46*/("""
	    	    """),format.raw/*154.11*/("""position: myLatLng,
	    	    map: map,
	    	    title: 'Hello World!'
	    	  """),format.raw/*157.9*/("""}"""),format.raw/*157.10*/(""");
	      """),format.raw/*158.8*/("""}"""),format.raw/*158.9*/("""
	      """),format.raw/*159.8*/("""google.maps.event.addDomListener(window, 'load', initialize);
	      
	      jQuery(document).ready(function() """),format.raw/*161.42*/("""{"""),format.raw/*161.43*/("""
			  """),format.raw/*162.6*/("""jQuery( "input[type=file]" ).fileValidator("""),format.raw/*162.49*/("""{"""),format.raw/*162.50*/("""
				  """),format.raw/*163.7*/("""onValidation: function(files)"""),format.raw/*163.36*/("""{"""),format.raw/*163.37*/("""      """),format.raw/*163.43*/("""$(this).attr('class','');          """),format.raw/*163.78*/("""}"""),format.raw/*163.79*/(""",
				  onInvalid:    function(type, file)"""),format.raw/*164.41*/("""{"""),format.raw/*164.42*/(""" 
					  					"""),format.raw/*165.13*/("""$(this).addClass('invalid '+type); 
				  						jQuery("form").on("submit",function()"""),format.raw/*166.50*/("""{"""),format.raw/*166.51*/("""
				  							"""),format.raw/*167.14*/("""alert("File size is too big. Please use an image lesser than MB");
				  							return false;
				  						"""),format.raw/*169.13*/("""}"""),format.raw/*169.14*/(""")
		  						"""),format.raw/*170.11*/("""}"""),format.raw/*170.12*/(""",
				  maxSize:      '4m',
				  type:         'image' //optional
				"""),format.raw/*173.5*/("""}"""),format.raw/*173.6*/(""");
			  
			  jQuery(".modal-trigger").leanModal();
	      """),format.raw/*176.8*/("""}"""),format.raw/*176.9*/(""");
	      
	      
				
	    </script>
	
	
	
""")))}),format.raw/*184.2*/("""
"""))}
  }

  def render(title:String,isLoggedIn:Boolean,request:models.Request): play.twirl.api.HtmlFormat.Appendable = apply(title,isLoggedIn,request)

  def f:((String,Boolean,models.Request) => play.twirl.api.HtmlFormat.Appendable) = (title,isLoggedIn,request) => apply(title,isLoggedIn,request)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 05:49:03 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/request.scala.html
                  HASH: 911f40f7cb171604fb8c2ca10b8f23ea9b7c104e
                  MATRIX: 754->1|949->62|977->113|1004->115|1038->141|1077->143|1114->154|1475->488|1490->494|1569->551|1689->645|1728->675|1767->676|1803->685|1926->781|1941->787|2028->852|2075->881|2088->885|2127->886|2163->895|2829->1531|2872->1547|2988->1637|3004->1644|3040->1659|3069->1661|3085->1668|3120->1682|3162->1697|3257->1766|3273->1773|3307->1786|3341->1793|3436->1862|3452->1869|3484->1880|3518->1887|3613->1956|3629->1963|3663->1976|3697->1983|3744->2004|3777->2028|3816->2029|3851->2037|3888->2047|3903->2053|3974->2103|4078->2179|4110->2201|4150->2202|4180->2203|4210->2213|4224->2217|4264->2218|4294->2219|4338->2231|4368->2232|4398->2244|4411->2248|4450->2249|4493->2265|4652->2394|4692->2407|4814->2503|4847->2527|4886->2528|4918->2534|4934->2541|4968->2554|4991->2559|5003->2563|5042->2564|5074->2569|5120->2585|5153->2591|5202->2614|5236->2639|5275->2640|5307->2645|5414->2725|5429->2731|5498->2779|6077->3327|6109->3332|6153->3366|6193->3367|6224->3370|7211->4326|7245->4332|7287->4346|7303->4352|7368->4395|7525->4523|7555->4524|7591->4532|7669->4581|7699->4582|7762->4616|7792->4617|7894->4690|7924->4691|7964->4702|8037->4747|8067->4748|8144->4796|8174->4797|8214->4808|8322->4888|8352->4889|8390->4899|8419->4900|8455->4908|8595->5019|8625->5020|8659->5026|8731->5069|8761->5070|8796->5077|8854->5106|8884->5107|8919->5113|8983->5148|9013->5149|9084->5191|9114->5192|9157->5206|9271->5291|9301->5292|9344->5306|9479->5412|9509->5413|9550->5425|9580->5426|9679->5497|9708->5498|9795->5557|9824->5558|9901->5604
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|36->9|46->19|46->19|46->19|52->25|52->25|52->25|53->26|55->28|55->28|55->28|58->31|58->31|58->31|59->32|63->36|65->38|70->43|70->43|70->43|70->43|70->43|70->43|72->45|75->48|75->48|75->48|76->49|79->52|79->52|79->52|80->53|83->56|83->56|83->56|84->57|86->59|86->59|86->59|87->60|87->60|87->60|87->60|87->60|87->60|87->60|87->60|87->60|87->60|87->60|87->60|87->60|87->60|88->61|88->61|88->61|90->63|91->64|93->66|102->75|102->75|102->75|103->76|103->76|103->76|104->77|104->77|104->77|105->78|106->79|108->81|113->86|113->86|113->86|115->88|117->90|117->90|117->90|132->105|134->107|134->107|134->107|135->108|162->135|165->138|165->138|165->138|165->138|171->144|171->144|172->145|173->146|173->146|173->146|173->146|175->148|175->148|176->149|178->151|178->151|180->153|180->153|181->154|184->157|184->157|185->158|185->158|186->159|188->161|188->161|189->162|189->162|189->162|190->163|190->163|190->163|190->163|190->163|190->163|191->164|191->164|192->165|193->166|193->166|194->167|196->169|196->169|197->170|197->170|200->173|200->173|203->176|203->176|211->184
                  -- GENERATED --
              */
          