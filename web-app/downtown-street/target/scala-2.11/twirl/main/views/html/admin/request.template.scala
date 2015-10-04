
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
    		
    		<div class="request-info-group col m12">
    			"""),_display_(/*60.9*/request/*60.16*/.getCreatedAt()),format.raw/*60.31*/("""
    		"""),format.raw/*61.7*/("""</div>
    		
    		
    		"""),_display_(/*64.8*/if(request.isResolved())/*64.32*/{_display_(Seq[Any](format.raw/*64.33*/("""
    			"""),format.raw/*65.8*/("""<a href=""""),_display_(/*65.18*/routes/*65.24*/.AdminController.unresolveRequest(request.getId())),format.raw/*65.74*/("""" class="waves-effect green darken-1 waves-light btn resolved resolve-btn">"""),_display_(/*65.150*/if(request.isResolved)/*65.172*/{_display_(Seq[Any](format.raw/*65.173*/(""" """),format.raw/*65.174*/("""Resolved """)))}/*65.184*/else/*65.188*/{_display_(Seq[Any](format.raw/*65.189*/(""" """),format.raw/*65.190*/("""Unresolved """)))}),format.raw/*65.202*/(""" """),format.raw/*65.203*/("""</a>
    		""")))}/*66.8*/else/*66.12*/{_display_(Seq[Any](format.raw/*66.13*/("""
    			
    			"""),format.raw/*68.8*/("""<a class="waves-effect waves-light btn unresolved resolve-btn modal-trigger amber accent-4" href="#modal1">Unresolved</a>
    		""")))}),format.raw/*69.8*/("""
    		
    	"""),format.raw/*71.6*/("""</div>
    	

    	
    	
	</div>
	<div class="details col m12">
		<h2>Comments</h2>
		<p>	
			"""),_display_(/*80.5*/if(request.getComment())/*80.29*/{_display_(Seq[Any](format.raw/*80.30*/("""
				"""),_display_(/*81.6*/request/*81.13*/.getComment()),format.raw/*81.26*/("""
			""")))}/*82.5*/else/*82.9*/{_display_(Seq[Any](format.raw/*82.10*/("""
				"""),format.raw/*83.5*/("""No comments
			""")))}),format.raw/*84.5*/("""
		
		"""),format.raw/*86.3*/("""</p>
	</div>
	
	  
	
	"""),_display_(/*91.3*/if(!request.isResolved())/*91.28*/{_display_(Seq[Any](format.raw/*91.29*/("""
	
		"""),format.raw/*93.3*/("""<!-- Modal Structure -->
		  <div id="modal1" class="modal">
		  <form action=""""),_display_(/*95.20*/routes/*95.26*/.AdminController.resolveRequest(request.getId())),format.raw/*95.74*/("""" method="POST" enctype="multipart/form-data">
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
  
  
		
	""")))}),format.raw/*110.3*/("""
	
	"""),_display_(/*112.3*/if(!request.getImage().equals(""))/*112.37*/{_display_(Seq[Any](format.raw/*112.38*/("""
		"""),format.raw/*113.3*/("""<div class="modal fade" id="beforeImageModal">
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
	""")))}),format.raw/*140.3*/("""
	
	
	"""),format.raw/*143.2*/("""<script src=""""),_display_(/*143.16*/routes/*143.22*/.Assets.at("javascripts/file-validator.js")),format.raw/*143.65*/("""" type="text/javascript"></script>
	
	
	 
	    <script type="text/javascript">
	    	//google maps
	      function initialize() """),format.raw/*149.30*/("""{"""),format.raw/*149.31*/("""
	    		"""),format.raw/*150.8*/("""//37.3351874,-121.8832655
	    		"""),_display_(/*151.9*/if(request.getLatitude() && request.getLongitude())/*151.60*/{_display_(Seq[Any](format.raw/*151.61*/("""
	    			 """),format.raw/*152.10*/("""var myLatLng = """),format.raw/*152.25*/("""{"""),format.raw/*152.26*/("""lat: """),_display_(/*152.32*/request/*152.39*/.getLatitude()),format.raw/*152.53*/(""", lng: """),_display_(/*152.61*/request/*152.68*/.getLongitude()),format.raw/*152.83*/("""}"""),format.raw/*152.84*/(""";

		   	    	  var map = new google.maps.Map(document.getElementById('map'), """),format.raw/*154.76*/("""{"""),format.raw/*154.77*/("""
		   	    	    """),format.raw/*155.16*/("""zoom: 17,
		   	    	    center: myLatLng
		   	    	  """),format.raw/*157.14*/("""}"""),format.raw/*157.15*/(""");
	
		   	    	  var marker = new google.maps.Marker("""),format.raw/*159.50*/("""{"""),format.raw/*159.51*/("""
		   	    	    """),format.raw/*160.16*/("""position: myLatLng,
		   	    	    map: map,
		   	    	    title: 'Hello World!'
		   	    	  """),format.raw/*163.14*/("""}"""),format.raw/*163.15*/(""");
	    		""")))}),format.raw/*164.9*/("""	
	    	 
	      """),format.raw/*166.8*/("""}"""),format.raw/*166.9*/("""
	      """),format.raw/*167.8*/("""google.maps.event.addDomListener(window, 'load', initialize);
	      
	      jQuery(document).ready(function() """),format.raw/*169.42*/("""{"""),format.raw/*169.43*/("""
			  """),format.raw/*170.6*/("""jQuery( "input[type=file]" ).fileValidator("""),format.raw/*170.49*/("""{"""),format.raw/*170.50*/("""
				  """),format.raw/*171.7*/("""onValidation: function(files)"""),format.raw/*171.36*/("""{"""),format.raw/*171.37*/("""      """),format.raw/*171.43*/("""$(this).attr('class','');          """),format.raw/*171.78*/("""}"""),format.raw/*171.79*/(""",
				  onInvalid:    function(type, file)"""),format.raw/*172.41*/("""{"""),format.raw/*172.42*/(""" 
					  					"""),format.raw/*173.13*/("""$(this).addClass('invalid '+type); 
				  						jQuery("form").on("submit",function()"""),format.raw/*174.50*/("""{"""),format.raw/*174.51*/("""
				  							"""),format.raw/*175.14*/("""alert("File size is too big. Please use an image lesser than MB");
				  							return false;
				  						"""),format.raw/*177.13*/("""}"""),format.raw/*177.14*/(""")
		  						"""),format.raw/*178.11*/("""}"""),format.raw/*178.12*/(""",
				  maxSize:      '4m',
				  type:         'image' //optional
				"""),format.raw/*181.5*/("""}"""),format.raw/*181.6*/(""");
			  
			  jQuery(".modal-trigger").leanModal();
	      """),format.raw/*184.8*/("""}"""),format.raw/*184.9*/(""");
	      var time = new Date().getTime();
           jQuery(document.body).bind("mousemove keypress", function(e) """),format.raw/*186.73*/("""{"""),format.raw/*186.74*/("""
      """),format.raw/*187.7*/("""         time = new Date().getTime();
           """),format.raw/*188.12*/("""}"""),format.raw/*188.13*/(""");

           function refresh() """),format.raw/*190.31*/("""{"""),format.raw/*190.32*/("""
      """),format.raw/*191.7*/("""         if(new Date().getTime() - time >= 60000) 
                   window.location.reload(true);
               else 
                   setTimeout(refresh, 10000);
           """),format.raw/*195.12*/("""}"""),format.raw/*195.13*/("""

      """),format.raw/*197.7*/("""     setTimeout(refresh, 10000);
	      
				
	    </script>
	
	
	
""")))}),format.raw/*204.2*/("""
"""))}
  }

  def render(title:String,isLoggedIn:Boolean,request:models.Request): play.twirl.api.HtmlFormat.Appendable = apply(title,isLoggedIn,request)

  def f:((String,Boolean,models.Request) => play.twirl.api.HtmlFormat.Appendable) = (title,isLoggedIn,request) => apply(title,isLoggedIn,request)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 11:35:23 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/admin/request.scala.html
                  HASH: 4cd3faa0356c2a28ee0a10548f2c5cf00230e986
                  MATRIX: 754->1|949->62|977->113|1004->115|1038->141|1077->143|1114->154|1475->488|1490->494|1569->551|1689->645|1728->675|1767->676|1803->685|1926->781|1941->787|2028->852|2075->881|2088->885|2127->886|2163->895|2829->1531|2872->1547|2988->1637|3004->1644|3040->1659|3069->1661|3085->1668|3120->1682|3162->1697|3257->1766|3273->1773|3307->1786|3341->1793|3436->1862|3452->1869|3484->1880|3518->1887|3613->1956|3629->1963|3663->1976|3697->1983|3792->2052|3808->2059|3844->2074|3878->2081|3932->2109|3965->2133|4004->2134|4039->2142|4076->2152|4091->2158|4162->2208|4266->2284|4298->2306|4338->2307|4368->2308|4398->2318|4412->2322|4452->2323|4482->2324|4526->2336|4556->2337|4586->2349|4599->2353|4638->2354|4681->2370|4840->2499|4880->2512|5002->2608|5035->2632|5074->2633|5106->2639|5122->2646|5156->2659|5179->2664|5191->2668|5230->2669|5262->2674|5308->2690|5341->2696|5390->2719|5424->2744|5463->2745|5495->2750|5602->2830|5617->2836|5686->2884|6265->3432|6297->3437|6341->3471|6381->3472|6412->3475|7399->4431|7433->4437|7475->4451|7491->4457|7556->4500|7713->4628|7743->4629|7779->4637|7840->4671|7901->4722|7941->4723|7980->4733|8024->4748|8054->4749|8088->4755|8105->4762|8141->4776|8177->4784|8194->4791|8231->4806|8261->4807|8368->4885|8398->4886|8443->4902|8527->4957|8557->4958|8640->5012|8670->5013|8715->5029|8839->5124|8869->5125|8911->5136|8956->5153|8985->5154|9021->5162|9161->5273|9191->5274|9225->5280|9297->5323|9327->5324|9362->5331|9420->5360|9450->5361|9485->5367|9549->5402|9579->5403|9650->5445|9680->5446|9723->5460|9837->5545|9867->5546|9910->5560|10045->5666|10075->5667|10116->5679|10146->5680|10245->5751|10274->5752|10361->5811|10390->5812|10534->5927|10564->5928|10599->5935|10677->5984|10707->5985|10770->6019|10800->6020|10835->6027|11043->6206|11073->6207|11109->6215|11208->6283
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|36->9|46->19|46->19|46->19|52->25|52->25|52->25|53->26|55->28|55->28|55->28|58->31|58->31|58->31|59->32|63->36|65->38|70->43|70->43|70->43|70->43|70->43|70->43|72->45|75->48|75->48|75->48|76->49|79->52|79->52|79->52|80->53|83->56|83->56|83->56|84->57|87->60|87->60|87->60|88->61|91->64|91->64|91->64|92->65|92->65|92->65|92->65|92->65|92->65|92->65|92->65|92->65|92->65|92->65|92->65|92->65|92->65|93->66|93->66|93->66|95->68|96->69|98->71|107->80|107->80|107->80|108->81|108->81|108->81|109->82|109->82|109->82|110->83|111->84|113->86|118->91|118->91|118->91|120->93|122->95|122->95|122->95|137->110|139->112|139->112|139->112|140->113|167->140|170->143|170->143|170->143|170->143|176->149|176->149|177->150|178->151|178->151|178->151|179->152|179->152|179->152|179->152|179->152|179->152|179->152|179->152|179->152|179->152|181->154|181->154|182->155|184->157|184->157|186->159|186->159|187->160|190->163|190->163|191->164|193->166|193->166|194->167|196->169|196->169|197->170|197->170|197->170|198->171|198->171|198->171|198->171|198->171|198->171|199->172|199->172|200->173|201->174|201->174|202->175|204->177|204->177|205->178|205->178|208->181|208->181|211->184|211->184|213->186|213->186|214->187|215->188|215->188|217->190|217->190|218->191|222->195|222->195|224->197|231->204
                  -- GENERATED --
              */
          