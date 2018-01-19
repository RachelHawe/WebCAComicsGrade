
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

object aboutus extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>About Us</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
     body.sgn
     """),format.raw/*17.6*/("""{"""),format.raw/*17.7*/("""
       """),format.raw/*18.8*/("""background-image: url('"""),_display_(/*18.32*/routes/*18.38*/.Assets.versioned("images/sgnbg.jpg")),format.raw/*18.75*/("""');
         background-repeat: repeat;
         background-attachment: fixed;
         background-position: center; 
     """),format.raw/*22.6*/("""}"""),format.raw/*22.7*/("""

"""),format.raw/*24.1*/(""".nav
"""),format.raw/*25.1*/("""{"""),format.raw/*25.2*/("""
	"""),format.raw/*26.2*/("""padding-left:3em;
	padding-right:3em;
	
	
"""),format.raw/*30.1*/("""}"""),format.raw/*30.2*/("""
"""),format.raw/*31.1*/("""h1
"""),format.raw/*32.1*/("""{"""),format.raw/*32.2*/("""
	"""),format.raw/*33.2*/("""font-family:Impact;
	font-style: italic;
	text-align:center;
	color:white;
"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/("""
"""),format.raw/*38.1*/("""h2
"""),format.raw/*39.1*/("""{"""),format.raw/*39.2*/("""
	"""),format.raw/*40.2*/("""text-align:center;
"""),format.raw/*41.1*/("""}"""),format.raw/*41.2*/("""
"""),format.raw/*42.1*/("""h3
"""),format.raw/*43.1*/("""{"""),format.raw/*43.2*/("""
	"""),format.raw/*44.2*/("""text-align:center;
"""),format.raw/*45.1*/("""}"""),format.raw/*45.2*/("""
"""),format.raw/*46.1*/("""h4
"""),format.raw/*47.1*/("""{"""),format.raw/*47.2*/("""
	"""),format.raw/*48.2*/("""text-align:center;
"""),format.raw/*49.1*/("""}"""),format.raw/*49.2*/("""
"""),format.raw/*50.1*/("""img.center
"""),format.raw/*51.1*/("""{"""),format.raw/*51.2*/("""
	"""),format.raw/*52.2*/("""display: block;
    margin-left: auto;
	margin-right: auto;
"""),format.raw/*55.1*/("""}"""),format.raw/*55.2*/("""
"""),format.raw/*56.1*/("""table, th, td """),format.raw/*56.15*/("""{"""),format.raw/*56.16*/("""
    
	"""),format.raw/*58.2*/("""background-color:#2D2B2B;
	padding-left:5em;
	padding-top:.5em;
	padding-right:5em;
	margin-align:center;
	height-align:center;
	width:72em;
"""),format.raw/*65.1*/("""}"""),format.raw/*65.2*/("""

"""),format.raw/*67.1*/("""tr.odd td
"""),format.raw/*68.1*/("""{"""),format.raw/*68.2*/("""
	"""),format.raw/*69.2*/("""background-color:#D6D6D6;;
"""),format.raw/*70.1*/("""}"""),format.raw/*70.2*/("""

"""),format.raw/*72.1*/(""".panel-collapse 
"""),format.raw/*73.1*/("""{"""),format.raw/*73.2*/("""
	"""),format.raw/*74.2*/("""margin-left:8em;	
"""),format.raw/*75.1*/("""}"""),format.raw/*75.2*/("""
   
    """),format.raw/*77.5*/(""".navbar """),format.raw/*77.13*/("""{"""),format.raw/*77.14*/("""
        """),format.raw/*78.9*/("""margin-bottom: 0;
        border-radius: 0;
      """),format.raw/*80.7*/("""}"""),format.raw/*80.8*/("""
      
      
      """),format.raw/*83.7*/("""footer """),format.raw/*83.14*/("""{"""),format.raw/*83.15*/("""
        """),format.raw/*84.9*/("""background-color: grey;
        padding: 25px;
      """),format.raw/*86.7*/("""}"""),format.raw/*86.8*/("""
      
    """),format.raw/*88.5*/(""".carousel-inner img """),format.raw/*88.25*/("""{"""),format.raw/*88.26*/("""
        """),format.raw/*89.9*/("""width: 100%; 
        margin: auto;
        min-height:200px;
    """),format.raw/*92.5*/("""}"""),format.raw/*92.6*/("""
  
    
    """),format.raw/*95.5*/("""@media (max-width: 600px) """),format.raw/*95.32*/("""{"""),format.raw/*95.33*/("""
      """),format.raw/*96.7*/(""".carousel-caption """),format.raw/*96.25*/("""{"""),format.raw/*96.26*/("""
        """),format.raw/*97.9*/("""display: none; 
      """),format.raw/*98.7*/("""}"""),format.raw/*98.8*/("""
    """),format.raw/*99.5*/("""}"""),format.raw/*99.6*/("""
    """),format.raw/*100.5*/("""</style>

</head>
<body class = aboutus>
  <nav class="navbar navbar-inverse">
    <div class="container-fluid">
          <div class="navbar-header">
            <a class="navbar-brand">Comic Book Page</a>
          </div>
          <ul class="nav navbar-nav">
          <li><a href="/">Home</a></li>
            <li class ="active"><a href="/aboutus">About</a></li>
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
      
          <!-- Page Content -->
    <div class="container">
        
              <!-- Introduction Row -->
              <h1 class="my-4">About Us
                <small>It's Nice to Meet You!</small>
              </h1>
              <p>We are just a bunch of misfits who enjoy reading comics</p>

              <div class="row">
                <div class="col-lg-12">
                  <h2 class="my-4">Our Team</h2>
                </div>
                <div class="col-lg-4 col-sm-6 text-center mb-4">
                  <img class="rounded-circle img-fluid d-block mx-auto" src=""""),_display_(/*152.79*/routes/*152.85*/.Assets.versioned("images/john.jpg")),format.raw/*152.121*/("""" alt="">
                  <h3>John DG
                      <br>
                    <small>Job: Comic fan</small>
                  </h3>
                  <p>2nd year college student in IT Tallaght.</p>
                </div>
                <div class="col-lg-4 col-sm-6 text-center mb-4">
                  <img class="rounded-circle img-fluid d-block mx-auto" src=""""),_display_(/*160.79*/routes/*160.85*/.Assets.versioned("images/rachel.jpg")),format.raw/*160.123*/("""" style="width:70%"alt="">
                  <br>
                  <br>
                  <h3>Rachel Hawe
                      <br>
                    <small>Job:Left to do it all</small>
                  </h3>
                  <p></p>2nd year college student in IT Tallaght.
                </div>
                <div class="col-lg-4 col-sm-6 text-center mb-4">
                  <img class="rounded-circle img-fluid d-block mx-auto" src=""""),_display_(/*170.79*/routes/*170.85*/.Assets.versioned("images/aaron.jpg")),format.raw/*170.122*/("""" style="width:54%" alt="">
                  <h3>AAron Fan
                      <br>
                    <small>Job: Tried</small>
                  </h3>
                  <p>2nd year college student in IT Tallaght.</p>
                </div>    
              </div>
    </div>

              <footer class="py-5 bg-dark container-fluid text-center">
                    <div class="container">
                <li><a href="#">Home</a></li>
                <li><a href="#">About Us</a></li>
            <p class="m-0 text-center text-white">Copyright &copy; Your Website 2017</p>                 
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
                  DATE: Fri Jan 12 16:47:16 GMT 2018
                  SOURCE: /media/sf_student/ImagesWorking/1st Draft/comicswebpage/app/views/aboutus.scala.html
                  HASH: fd0f0da94afda96c14ac09a220c9d80d0e774864
                  MATRIX: 1032->0|1652->593|1680->594|1715->602|1766->626|1781->632|1839->669|1989->792|2017->793|2046->795|2078->800|2106->801|2135->803|2204->845|2232->846|2260->847|2290->850|2318->851|2347->853|2449->928|2477->929|2505->930|2535->933|2563->934|2592->936|2638->955|2666->956|2694->957|2724->960|2752->961|2781->963|2827->982|2855->983|2883->984|2913->987|2941->988|2970->990|3016->1009|3044->1010|3072->1011|3110->1022|3138->1023|3167->1025|3254->1085|3282->1086|3310->1087|3352->1101|3381->1102|3415->1109|3583->1250|3611->1251|3640->1253|3677->1263|3705->1264|3734->1266|3788->1293|3816->1294|3845->1296|3889->1313|3917->1314|3946->1316|3991->1334|4019->1335|4055->1344|4091->1352|4120->1353|4156->1362|4233->1412|4261->1413|4309->1434|4344->1441|4373->1442|4409->1451|4489->1504|4517->1505|4556->1517|4604->1537|4633->1538|4669->1547|4762->1613|4790->1614|4830->1627|4884->1654|4913->1655|4947->1662|4993->1680|5022->1681|5058->1690|5107->1712|5135->1713|5167->1718|5195->1719|5228->1724|7230->3698|7246->3704|7305->3740|7706->4113|7722->4119|7783->4157|8258->4604|8274->4610|8334->4647
                  LINES: 33->1|49->17|49->17|50->18|50->18|50->18|50->18|54->22|54->22|56->24|57->25|57->25|58->26|62->30|62->30|63->31|64->32|64->32|65->33|69->37|69->37|70->38|71->39|71->39|72->40|73->41|73->41|74->42|75->43|75->43|76->44|77->45|77->45|78->46|79->47|79->47|80->48|81->49|81->49|82->50|83->51|83->51|84->52|87->55|87->55|88->56|88->56|88->56|90->58|97->65|97->65|99->67|100->68|100->68|101->69|102->70|102->70|104->72|105->73|105->73|106->74|107->75|107->75|109->77|109->77|109->77|110->78|112->80|112->80|115->83|115->83|115->83|116->84|118->86|118->86|120->88|120->88|120->88|121->89|124->92|124->92|127->95|127->95|127->95|128->96|128->96|128->96|129->97|130->98|130->98|131->99|131->99|132->100|184->152|184->152|184->152|192->160|192->160|192->160|202->170|202->170|202->170
                  -- GENERATED --
              */
          