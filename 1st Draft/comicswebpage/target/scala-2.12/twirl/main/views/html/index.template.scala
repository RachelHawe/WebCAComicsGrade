
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
<style>
  body.events
"""),format.raw/*14.1*/("""{"""),format.raw/*14.2*/("""
	"""),format.raw/*15.2*/("""background-image: url("comicbookbg.jpg");
	background-repeat: repeat;
    background-attachment: fixed;
    background-position: center; 
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""
"""),format.raw/*20.1*/("""body.NewReleases
"""),format.raw/*21.1*/("""{"""),format.raw/*21.2*/("""
"""),format.raw/*22.1*/("""}"""),format.raw/*22.2*/("""
"""),format.raw/*23.1*/("""body.index
"""),format.raw/*24.1*/("""{"""),format.raw/*24.2*/("""
  """),format.raw/*25.3*/("""background-color: #A2AB58;
"""),format.raw/*26.1*/("""}"""),format.raw/*26.2*/("""

"""),format.raw/*28.1*/(""".nav
"""),format.raw/*29.1*/("""{"""),format.raw/*29.2*/("""
	"""),format.raw/*30.2*/("""padding-left:3em;
	padding-right:3em;
	
	
"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""
"""),format.raw/*35.1*/("""h1
"""),format.raw/*36.1*/("""{"""),format.raw/*36.2*/("""
	"""),format.raw/*37.2*/("""font-family:Impact;
	font-style: italic;
	text-align:center;
	color:white;
"""),format.raw/*41.1*/("""}"""),format.raw/*41.2*/("""
"""),format.raw/*42.1*/("""h2
"""),format.raw/*43.1*/("""{"""),format.raw/*43.2*/("""
	"""),format.raw/*44.2*/("""text-align:center;
"""),format.raw/*45.1*/("""}"""),format.raw/*45.2*/("""
"""),format.raw/*46.1*/("""h3
"""),format.raw/*47.1*/("""{"""),format.raw/*47.2*/("""
	"""),format.raw/*48.2*/("""text-align:center;
"""),format.raw/*49.1*/("""}"""),format.raw/*49.2*/("""
"""),format.raw/*50.1*/("""h4
"""),format.raw/*51.1*/("""{"""),format.raw/*51.2*/("""
	"""),format.raw/*52.2*/("""text-align:center;
"""),format.raw/*53.1*/("""}"""),format.raw/*53.2*/("""
"""),format.raw/*54.1*/("""img.center
"""),format.raw/*55.1*/("""{"""),format.raw/*55.2*/("""
	"""),format.raw/*56.2*/("""display: block;
    margin-left: auto;
	margin-right: auto;
"""),format.raw/*59.1*/("""}"""),format.raw/*59.2*/("""
"""),format.raw/*60.1*/("""table, th, td """),format.raw/*60.15*/("""{"""),format.raw/*60.16*/("""
    
	"""),format.raw/*62.2*/("""background-color:#2D2B2B;
	padding-left:5em;
	padding-top:.5em;
	padding-right:5em;
	margin-align:center;
	height-align:center;
	width:72em;
"""),format.raw/*69.1*/("""}"""),format.raw/*69.2*/("""

"""),format.raw/*71.1*/("""tr.odd td
"""),format.raw/*72.1*/("""{"""),format.raw/*72.2*/("""
	"""),format.raw/*73.2*/("""background-color:#D6D6D6;;
"""),format.raw/*74.1*/("""}"""),format.raw/*74.2*/("""

"""),format.raw/*76.1*/(""".panel-collapse 
"""),format.raw/*77.1*/("""{"""),format.raw/*77.2*/("""
	"""),format.raw/*78.2*/("""margin-left:8em;	
  
"""),format.raw/*80.1*/("""}"""),format.raw/*80.2*/("""
   
    """),format.raw/*82.5*/(""".navbar """),format.raw/*82.13*/("""{"""),format.raw/*82.14*/("""
        """),format.raw/*83.9*/("""margin-bottom: 0;
        border-radius: 0;
      """),format.raw/*85.7*/("""}"""),format.raw/*85.8*/("""
      
      
      """),format.raw/*88.7*/("""footer """),format.raw/*88.14*/("""{"""),format.raw/*88.15*/("""
        """),format.raw/*89.9*/("""background-color: grey;
        padding: 25px;
      """),format.raw/*91.7*/("""}"""),format.raw/*91.8*/("""
      
    """),format.raw/*93.5*/(""".carousel-inner img """),format.raw/*93.25*/("""{"""),format.raw/*93.26*/("""
        """),format.raw/*94.9*/("""width: 100%; 
        margin: auto;
        min-height:200px;
    """),format.raw/*97.5*/("""}"""),format.raw/*97.6*/("""
  
    
    """),format.raw/*100.5*/("""@media (max-width: 600px) """),format.raw/*100.32*/("""{"""),format.raw/*100.33*/("""
      """),format.raw/*101.7*/(""".carousel-caption """),format.raw/*101.25*/("""{"""),format.raw/*101.26*/("""
        """),format.raw/*102.9*/("""display: none; 
        
      """),format.raw/*104.7*/("""}"""),format.raw/*104.8*/("""
    """),format.raw/*105.5*/("""}"""),format.raw/*105.6*/("""
"""),format.raw/*106.1*/("""</style>

</head>
<body class="index">

  <nav class="navbar navbar-inverse">
    <div class="container-fluid">
          <div class="navbar-header">
            <a class="navbar-brand">Comic Book Page</a>
          </div>
          <ul class="nav navbar-nav">
          <li class ="active"><a href="/">Home</a></li>
            <li><a href="/aboutus">About</a></li>
            <li class="dropdown">
              <a class="dropdown-toggle" data-toggle="dropdown" href="#">Timeline
              <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="#">DC</a></li>
                <li><a href="#">Marvel</a></li>
              </ul>
            </li>
            <li><a href="/events">Events</a></li>
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
		

<div id="myCarousel" class="carousel slide" data-ride="carousel">
   
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
    </ol>

    
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src=""""),_display_(/*156.20*/routes/*156.26*/.Assets.versioned("images/index.DCRebirth.jpg")),format.raw/*156.73*/("""" style="width:35%" alt="Image">
        <div class="carousel-caption">
          <h3>DC Rebirth</h3>
          <p>Watchmen Meet DC Universe</p>
        </div>      
      </div>

      <div class="item">
        <img src=""""),_display_(/*164.20*/routes/*164.26*/.Assets.versioned("images/index.DDSM.jpg")),format.raw/*164.68*/("""" style="width:18%"  alt="Image">
        <div class="carousel-caption">
          <h3>New Upcoming Series and Movies</h3>
          <p>Daredevil, Punisher, Spider-Man Homecoming</p>
        </div>      
      </div>
    </div>

   
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
  
<div class="container text-center">    
  <h3>What we love</h3><br>
  <div class="row">
    <div class="col-sm-4">
        <div class="well">
      <img src=""""),_display_(/*188.18*/routes/*188.24*/.Assets.versioned("images/index.Hinterkind.jpg")),format.raw/*188.72*/("""" style="width:35%" alt="Image">
      <p>Current Trend</p>
      </div>
    </div>
    <div class="col-sm-4"> 
        <div class="well">
      <img src=""""),_display_(/*194.18*/routes/*194.24*/.Assets.versioned("images/index.RIsingStar.jpg")),format.raw/*194.72*/("""" style="width:35%" alt="Image">
      <p>Features</p>   
      </div> 
    </div>
    <div class="col-sm-4">
      <div class="well">
       <p>Website by Rachel, John & Aaron</p>
       <p>Comics offers something for everyone</p>
       <p>We hope you enjoy our website</p>
      </div>
    </div>
  </div>
</div>

<footer class="container-fluid text-center">
  <li><a href="index.html">Home</a></li>
  <li><a href="/aboutus">About Us</a></li>
  <p>Footer Text</p>
</footer>

</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jan 12 17:01:55 GMT 2018
                  SOURCE: /media/sf_student/ImagesWorking/1st Draft/comicswebpage/app/views/index.scala.html
                  HASH: e29649c97ca08ef09612bcd98ca54521337e71b7
                  MATRIX: 941->1|1037->3|1064->4|1562->475|1590->476|1619->478|1784->616|1812->617|1840->618|1884->635|1912->636|1940->637|1968->638|1996->639|2034->650|2062->651|2092->654|2146->681|2174->682|2203->684|2235->689|2263->690|2292->692|2361->734|2389->735|2417->736|2447->739|2475->740|2504->742|2606->817|2634->818|2662->819|2692->822|2720->823|2749->825|2795->844|2823->845|2851->846|2881->849|2909->850|2938->852|2984->871|3012->872|3040->873|3070->876|3098->877|3127->879|3173->898|3201->899|3229->900|3267->911|3295->912|3324->914|3411->974|3439->975|3467->976|3509->990|3538->991|3572->998|3740->1139|3768->1140|3797->1142|3834->1152|3862->1153|3891->1155|3945->1182|3973->1183|4002->1185|4046->1202|4074->1203|4103->1205|4151->1226|4179->1227|4215->1236|4251->1244|4280->1245|4316->1254|4393->1304|4421->1305|4469->1326|4504->1333|4533->1334|4569->1343|4649->1396|4677->1397|4716->1409|4764->1429|4793->1430|4829->1439|4922->1505|4950->1506|4991->1519|5046->1546|5076->1547|5111->1554|5158->1572|5188->1573|5225->1582|5284->1613|5313->1614|5346->1619|5375->1620|5404->1621|7171->3360|7187->3366|7256->3413|7508->3637|7524->3643|7588->3685|8460->4529|8476->4535|8546->4583|8730->4739|8746->4745|8816->4793
                  LINES: 28->1|33->1|34->2|46->14|46->14|47->15|51->19|51->19|52->20|53->21|53->21|54->22|54->22|55->23|56->24|56->24|57->25|58->26|58->26|60->28|61->29|61->29|62->30|66->34|66->34|67->35|68->36|68->36|69->37|73->41|73->41|74->42|75->43|75->43|76->44|77->45|77->45|78->46|79->47|79->47|80->48|81->49|81->49|82->50|83->51|83->51|84->52|85->53|85->53|86->54|87->55|87->55|88->56|91->59|91->59|92->60|92->60|92->60|94->62|101->69|101->69|103->71|104->72|104->72|105->73|106->74|106->74|108->76|109->77|109->77|110->78|112->80|112->80|114->82|114->82|114->82|115->83|117->85|117->85|120->88|120->88|120->88|121->89|123->91|123->91|125->93|125->93|125->93|126->94|129->97|129->97|132->100|132->100|132->100|133->101|133->101|133->101|134->102|136->104|136->104|137->105|137->105|138->106|188->156|188->156|188->156|196->164|196->164|196->164|220->188|220->188|220->188|226->194|226->194|226->194
                  -- GENERATED --
              */
          