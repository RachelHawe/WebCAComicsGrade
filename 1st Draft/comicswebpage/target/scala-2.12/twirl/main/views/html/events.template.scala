
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object events extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <style>
    body.events
"""),format.raw/*12.1*/("""{"""),format.raw/*12.2*/("""
	"""),format.raw/*13.2*/("""background-image: url('"""),_display_(/*13.26*/routes/*13.32*/.Assets.versioned("images/comicbookbg.jpg")),format.raw/*13.75*/("""');
	background-repeat: repeat;
    background-attachment: fixed;
    background-position: center; 
"""),format.raw/*17.1*/("""}"""),format.raw/*17.2*/("""
"""),format.raw/*18.1*/("""body.NewReleases
"""),format.raw/*19.1*/("""{"""),format.raw/*19.2*/("""
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""

"""),format.raw/*22.1*/(""".nav
"""),format.raw/*23.1*/("""{"""),format.raw/*23.2*/("""
	"""),format.raw/*24.2*/("""padding-left:3em;
	padding-right:3em;
	
	
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/("""
"""),format.raw/*29.1*/("""h1
"""),format.raw/*30.1*/("""{"""),format.raw/*30.2*/("""
	"""),format.raw/*31.2*/("""font-family:Impact;
	font-style: italic;
	text-align:center;
	color:white;
"""),format.raw/*35.1*/("""}"""),format.raw/*35.2*/("""
"""),format.raw/*36.1*/("""h2
"""),format.raw/*37.1*/("""{"""),format.raw/*37.2*/("""
	"""),format.raw/*38.2*/("""text-align:center;
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""
"""),format.raw/*40.1*/("""h3
"""),format.raw/*41.1*/("""{"""),format.raw/*41.2*/("""
	"""),format.raw/*42.2*/("""text-align:center;
"""),format.raw/*43.1*/("""}"""),format.raw/*43.2*/("""
"""),format.raw/*44.1*/("""h4
"""),format.raw/*45.1*/("""{"""),format.raw/*45.2*/("""
	"""),format.raw/*46.2*/("""text-align:center;
"""),format.raw/*47.1*/("""}"""),format.raw/*47.2*/("""
"""),format.raw/*48.1*/("""img.center
"""),format.raw/*49.1*/("""{"""),format.raw/*49.2*/("""
	"""),format.raw/*50.2*/("""display: block;
    margin-left: auto;
	margin-right: auto;
"""),format.raw/*53.1*/("""}"""),format.raw/*53.2*/("""
"""),format.raw/*54.1*/("""table, th, td """),format.raw/*54.15*/("""{"""),format.raw/*54.16*/("""
    
	"""),format.raw/*56.2*/("""background-color:#2D2B2B;
	padding-left:5em;
	padding-top:.5em;
	padding-right:5em;
	margin-align:center;
	height-align:center;
	width:72em;
"""),format.raw/*63.1*/("""}"""),format.raw/*63.2*/("""

"""),format.raw/*65.1*/("""tr.odd td
"""),format.raw/*66.1*/("""{"""),format.raw/*66.2*/("""
	"""),format.raw/*67.2*/("""background-color:#D6D6D6;;
"""),format.raw/*68.1*/("""}"""),format.raw/*68.2*/("""

"""),format.raw/*70.1*/(""".panel-collapse 
"""),format.raw/*71.1*/("""{"""),format.raw/*71.2*/("""
	"""),format.raw/*72.2*/("""margin-left:8em;	
"""),format.raw/*73.1*/("""}"""),format.raw/*73.2*/("""
   
    """),format.raw/*75.5*/(""".navbar """),format.raw/*75.13*/("""{"""),format.raw/*75.14*/("""
        """),format.raw/*76.9*/("""margin-bottom: 0;
        border-radius: 0;
      """),format.raw/*78.7*/("""}"""),format.raw/*78.8*/("""
      
      
      """),format.raw/*81.7*/("""footer """),format.raw/*81.14*/("""{"""),format.raw/*81.15*/("""
        """),format.raw/*82.9*/("""background-color: grey;
        padding: 25px;
      """),format.raw/*84.7*/("""}"""),format.raw/*84.8*/("""
      
    """),format.raw/*86.5*/(""".carousel-inner img """),format.raw/*86.25*/("""{"""),format.raw/*86.26*/("""
        """),format.raw/*87.9*/("""width: 100%; 
        margin: auto;
        min-height:200px;
    """),format.raw/*90.5*/("""}"""),format.raw/*90.6*/("""
  
    
    """),format.raw/*93.5*/("""@media (max-width: 600px) """),format.raw/*93.32*/("""{"""),format.raw/*93.33*/("""
      """),format.raw/*94.7*/(""".carousel-caption """),format.raw/*94.25*/("""{"""),format.raw/*94.26*/("""
        """),format.raw/*95.9*/("""display: none; 
      """),format.raw/*96.7*/("""}"""),format.raw/*96.8*/("""
    """),format.raw/*97.5*/("""}"""),format.raw/*97.6*/("""
    """),format.raw/*98.5*/("""</style>

</head>
<body class="events">
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
              <div class="navbar-header">
                <a class="navbar-brand">Comic Book Page</a>
              </div>
              <ul class="nav navbar-nav">
              <li><a href="/">Home</a></li>
                <li><a href="/aboutus">About</a></li>
                <li class="dropdown">
                  <a class="dropdown-toggle" data-toggle="dropdown" href="#">Timeline
                  <span class="caret"></span></a>
                  <ul class="dropdown-menu">
                    <li><a href="#">DC</a></li>
                    <li><a href="#">Marvel</a></li>
                  </ul>
                </li>
                <li class ="active"><a href="/events">Events</a></li>
                <li><a href="/newreleases">New Releases</a></li>
                
              </ul>
              <ul class="nav navbar-nav navbar-right">
      <li><a href="/sgn"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="/lgn"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
              </ul>
          
              <form class="navbar-form navbar-right">
                <div class="form-group">
                  <input type="text" class="form-control" placeholder="Search">
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
              </form>
        </div>
      </nav>


<table align="center">
<tr>		<td><img src=""""),_display_(/*138.22*/routes/*138.28*/.Assets.versioned("images/eventslocalcomicshopday.png")),format.raw/*138.83*/("""" alt="LCSD" class="center"></td></tr>
<tr >		<td><h1>
			Local Comic Shop Day
		</h1></td>
</tr>
<tr class="odd">		
		<td><h2>
		18th November 2027
		</h2></td>
</tr>		
<tr class="odd">	<td><h4>	
		Location: Big Bang Comics
		<br>Address: Unit 2.3 Sandyford Road, Dundrum Town Centre, Dundrum, Dublin
		<br>About event:
		<br>Contact Information  
		<br>Phone Number:(01 216 5093)
		<br>Email: info@thebigbang.ie 
		</h4></td>
</tr>
		<br>
<tr>		<td><img src=""""),_display_(/*158.22*/routes/*158.28*/.Assets.versioned("images/eventsirishcomicsshowcase.png")),format.raw/*158.85*/("""" alt="Shamrock" class="center"></td> </tr>

<tr>		<td> <h1>
			Irish Comics Showcase
		</h1></td> 
</tr>		
<tr class="odd">		<td> <h2>
			19th November 2027
		</h2></td> 
</tr>
<tr class="odd">	<td><h4>	
		Location: Big Bang Comics
		<br>Address: Unit 2.3 Sandyford Road, Dundrum Town Centre, Dundrum, Dublin
		<br>About event:
		<br>Contact Information  
		<br>Phone Number:(01 216 5093)
		<br>Email: info@thebigbang.ie 
		</h4></td>
</tr>
		<br>
		<tr><td> <img src=""""),_display_(/*178.23*/routes/*178.29*/.Assets.versioned("images/events.doomsdayclock.jpg")),format.raw/*178.81*/("""" alt="Doomsdayclock" class="center"></td> </tr>
		<tr><td> <h1>
			Doomsday Clock #1 Midnight Launch
		</h1></td> </tr>
		<tr class="odd"><td><h2>
			21st November 2027
		</h2></td> </tr>
<tr class="odd">	<td><h4>	
		Location: Big Bang Comics
		<br>Address: Unit 2.3 Sandyford Road, Dundrum Town Centre, Dundrum, Dublin
		<br>About event:
		<br>Contact Information  
		<br>Phone Number:(01 216 5093)
		<br>Email: info@thebigbang.ie 
		</h4></td>
</tr>
		<br>
		<tr><td> <img src=""""),_display_(/*195.23*/routes/*195.29*/.Assets.versioned("images/eventsspiderman.png")),format.raw/*195.76*/("""" alt="spiderman" class="center"></tr></td> 
		<tr><td> <h1>
			Spider-Man Day! Special Guests
		</h1></td> </tr>
		<tr class="odd"><td> <h2>
			2nd December 2027
		</h2></td> </tr>
		<tr  class="odd"><td> <h3>
			Nick Roche, Will Sliney and Nate Stockman
		</h3></td> </tr>
<tr class="odd">	<td><h4>	
<tr class="odd">	<td><h4>	
		Location: Big Bang Comics
		<br>Address: Unit 2.3 Sandyford Road, Dundrum Town Centre, Dundrum, Dublin
		<br>About event:
		<br>Contact Information  
		<br>Phone Number:(01 216 5093)
		<br>Email: info@thebigbang.ie 
		</h4></td>
</tr>
</table>


  
</div>
</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jan 12 15:10:46 GMT 2018
                  SOURCE: /media/sf_student/ImagesWorking/1st Draft/comicswebpage/app/views/events.scala.html
                  HASH: 401deda9050074597d6a22062fbc8d833d4b6400
                  MATRIX: 1031->0|1499->441|1527->442|1556->444|1607->468|1622->474|1686->517|1813->617|1841->618|1869->619|1913->636|1941->637|1969->638|1997->639|2026->641|2058->646|2086->647|2115->649|2184->691|2212->692|2240->693|2270->696|2298->697|2327->699|2429->774|2457->775|2485->776|2515->779|2543->780|2572->782|2618->801|2646->802|2674->803|2704->806|2732->807|2761->809|2807->828|2835->829|2863->830|2893->833|2921->834|2950->836|2996->855|3024->856|3052->857|3090->868|3118->869|3147->871|3234->931|3262->932|3290->933|3332->947|3361->948|3395->955|3563->1096|3591->1097|3620->1099|3657->1109|3685->1110|3714->1112|3768->1139|3796->1140|3825->1142|3869->1159|3897->1160|3926->1162|3971->1180|3999->1181|4035->1190|4071->1198|4100->1199|4136->1208|4213->1258|4241->1259|4289->1280|4324->1287|4353->1288|4389->1297|4469->1350|4497->1351|4536->1363|4584->1383|4613->1384|4649->1393|4742->1459|4770->1460|4810->1473|4864->1500|4893->1501|4927->1508|4973->1526|5002->1527|5038->1536|5087->1558|5115->1559|5147->1564|5175->1565|5207->1570|6789->3124|6805->3130|6882->3185|7372->3648|7388->3654|7467->3711|7966->4183|7982->4189|8056->4241|8566->4724|8582->4730|8651->4777
                  LINES: 33->1|44->12|44->12|45->13|45->13|45->13|45->13|49->17|49->17|50->18|51->19|51->19|52->20|52->20|54->22|55->23|55->23|56->24|60->28|60->28|61->29|62->30|62->30|63->31|67->35|67->35|68->36|69->37|69->37|70->38|71->39|71->39|72->40|73->41|73->41|74->42|75->43|75->43|76->44|77->45|77->45|78->46|79->47|79->47|80->48|81->49|81->49|82->50|85->53|85->53|86->54|86->54|86->54|88->56|95->63|95->63|97->65|98->66|98->66|99->67|100->68|100->68|102->70|103->71|103->71|104->72|105->73|105->73|107->75|107->75|107->75|108->76|110->78|110->78|113->81|113->81|113->81|114->82|116->84|116->84|118->86|118->86|118->86|119->87|122->90|122->90|125->93|125->93|125->93|126->94|126->94|126->94|127->95|128->96|128->96|129->97|129->97|130->98|170->138|170->138|170->138|190->158|190->158|190->158|210->178|210->178|210->178|227->195|227->195|227->195
                  -- GENERATED --
              */
          