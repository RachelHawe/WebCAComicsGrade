
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

object sgn extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang ="en">
<head>
<body background="Marvel.jpg">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>

    body.sgn
    """),format.raw/*14.5*/("""{"""),format.raw/*14.6*/("""
        """),format.raw/*15.9*/("""background-image: url('"""),_display_(/*15.33*/routes/*15.39*/.Assets.versioned("images/sgnbg.jpeg")),format.raw/*15.77*/("""');
          background-repeat: repeat;
          background-attachment: fixed;
          background-position: center; 
      """),format.raw/*19.7*/("""}"""),format.raw/*19.8*/("""
    
    """),format.raw/*21.5*/(""".nav
    """),format.raw/*22.5*/("""{"""),format.raw/*22.6*/("""
        """),format.raw/*23.9*/("""padding-left:3em;
        padding-right:3em;
        
        
    """),format.raw/*27.5*/("""}"""),format.raw/*27.6*/("""
    """),format.raw/*28.5*/("""h1
    """),format.raw/*29.5*/("""{"""),format.raw/*29.6*/("""
        """),format.raw/*30.9*/("""font-family:Impact;
        font-style: italic;
        text-align:center;
        color:white;
    """),format.raw/*34.5*/("""}"""),format.raw/*34.6*/("""
    """),format.raw/*35.5*/("""h2
    """),format.raw/*36.5*/("""{"""),format.raw/*36.6*/("""
        """),format.raw/*37.9*/("""text-align:center;
    """),format.raw/*38.5*/("""}"""),format.raw/*38.6*/("""
    """),format.raw/*39.5*/("""h3
    """),format.raw/*40.5*/("""{"""),format.raw/*40.6*/("""
        """),format.raw/*41.9*/("""text-align:center;
    """),format.raw/*42.5*/("""}"""),format.raw/*42.6*/("""
    """),format.raw/*43.5*/("""h4
    """),format.raw/*44.5*/("""{"""),format.raw/*44.6*/("""
        """),format.raw/*45.9*/("""text-align:center;
    """),format.raw/*46.5*/("""}"""),format.raw/*46.6*/("""
    """),format.raw/*47.5*/("""img.center
    """),format.raw/*48.5*/("""{"""),format.raw/*48.6*/("""
        """),format.raw/*49.9*/("""display: block;
        margin-left: auto;
        margin-right: auto;
    """),format.raw/*52.5*/("""}"""),format.raw/*52.6*/("""
    """),format.raw/*53.5*/("""table, th, td """),format.raw/*53.19*/("""{"""),format.raw/*53.20*/("""
        
        """),format.raw/*55.9*/("""background-color:#2D2B2B;
        padding-left:5em;
        padding-top:.5em;
        padding-right:5em;
        margin-align:center;
        height-align:center;
        width:72em;
    """),format.raw/*62.5*/("""}"""),format.raw/*62.6*/("""
    
    """),format.raw/*64.5*/("""tr.odd td
    """),format.raw/*65.5*/("""{"""),format.raw/*65.6*/("""
        """),format.raw/*66.9*/("""background-color:#D6D6D6;;
    """),format.raw/*67.5*/("""}"""),format.raw/*67.6*/("""
    
    """),format.raw/*69.5*/(""".panel-collapse 
    """),format.raw/*70.5*/("""{"""),format.raw/*70.6*/("""
        """),format.raw/*71.9*/("""margin-left:8em;	
    """),format.raw/*72.5*/("""}"""),format.raw/*72.6*/("""
       
        """),format.raw/*74.9*/(""".navbar """),format.raw/*74.17*/("""{"""),format.raw/*74.18*/("""
            """),format.raw/*75.13*/("""margin-bottom: 0;
            border-radius: 0;
          """),format.raw/*77.11*/("""}"""),format.raw/*77.12*/("""
          
          
          """),format.raw/*80.11*/("""footer """),format.raw/*80.18*/("""{"""),format.raw/*80.19*/("""
            """),format.raw/*81.13*/("""background-color: grey;
            padding: 25px;
          """),format.raw/*83.11*/("""}"""),format.raw/*83.12*/("""
          
        """),format.raw/*85.9*/(""".carousel-inner img """),format.raw/*85.29*/("""{"""),format.raw/*85.30*/("""
            """),format.raw/*86.13*/("""width: 100%; 
            margin: auto;
            min-height:200px;
        """),format.raw/*89.9*/("""}"""),format.raw/*89.10*/("""
      
        
        """),format.raw/*92.9*/("""@media (max-width: 600px) """),format.raw/*92.36*/("""{"""),format.raw/*92.37*/("""
          """),format.raw/*93.11*/(""".carousel-caption """),format.raw/*93.29*/("""{"""),format.raw/*93.30*/("""
            """),format.raw/*94.13*/("""display: none; 
          """),format.raw/*95.11*/("""}"""),format.raw/*95.12*/("""
        """),format.raw/*96.9*/("""}"""),format.raw/*96.10*/("""
        """),format.raw/*97.9*/("""</style>

<head>
    <body class = sgn>
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
                        <li><a href="/events">Events</a></li>
                        <li><a href="/newreleases">New Releases</a></li>
                        
                      </ul>
                      <ul class="nav navbar-nav navbar-right">
              <li class ="active"><a href="/sgn"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
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
</head>
<body>
    <P><b>Sign Up</b></P>
<form action="/action_page.php">
  <div class="container">
    <label><b>Email</b></label>
	<div>
    <input type="text" placeholder="Enter Email" name="email" required>
	</div>
<div>
    <label><b>Password</b></label>
	<div>
	</div>
    <input type="password" placeholder="Enter Password" name="psw" required>
<div>
    <label><b>Repeat Password</b></label>
	</div>
	<div>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" required>
    <p>By Signing up you agree to our <a href="T&P.html">Terms & Privacy</a>.</p>
	</div>
    <div class="clearfix">
      <button type="button"  class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>
</div></body>
<footer>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jan 12 17:11:03 GMT 2018
                  SOURCE: /media/sf_student/ImagesWorking/1st Draft/comicswebpage/app/views/sgn.scala.html
                  HASH: d89de97dd2497e755b8fa5dc8910809fd71b48b3
                  MATRIX: 1028->0|1438->383|1466->384|1502->393|1553->417|1568->423|1627->461|1781->588|1809->589|1846->599|1882->608|1910->609|1946->618|2040->685|2068->686|2100->691|2134->698|2162->699|2198->708|2325->808|2353->809|2385->814|2419->821|2447->822|2483->831|2533->854|2561->855|2593->860|2627->867|2655->868|2691->877|2741->900|2769->901|2801->906|2835->913|2863->914|2899->923|2949->946|2977->947|3009->952|3051->967|3079->968|3115->977|3217->1052|3245->1053|3277->1058|3319->1072|3348->1073|3393->1091|3607->1278|3635->1279|3672->1289|3713->1303|3741->1304|3777->1313|3835->1344|3863->1345|3900->1355|3948->1376|3976->1377|4012->1386|4061->1408|4089->1409|4133->1426|4169->1434|4198->1435|4239->1448|4325->1506|4354->1507|4415->1540|4450->1547|4479->1548|4520->1561|4609->1622|4638->1623|4685->1643|4733->1663|4762->1664|4803->1677|4908->1755|4937->1756|4989->1781|5043->1808|5072->1809|5111->1820|5157->1838|5186->1839|5227->1852|5281->1878|5310->1879|5346->1888|5375->1889|5411->1898
                  LINES: 33->1|46->14|46->14|47->15|47->15|47->15|47->15|51->19|51->19|53->21|54->22|54->22|55->23|59->27|59->27|60->28|61->29|61->29|62->30|66->34|66->34|67->35|68->36|68->36|69->37|70->38|70->38|71->39|72->40|72->40|73->41|74->42|74->42|75->43|76->44|76->44|77->45|78->46|78->46|79->47|80->48|80->48|81->49|84->52|84->52|85->53|85->53|85->53|87->55|94->62|94->62|96->64|97->65|97->65|98->66|99->67|99->67|101->69|102->70|102->70|103->71|104->72|104->72|106->74|106->74|106->74|107->75|109->77|109->77|112->80|112->80|112->80|113->81|115->83|115->83|117->85|117->85|117->85|118->86|121->89|121->89|124->92|124->92|124->92|125->93|125->93|125->93|126->94|127->95|127->95|128->96|128->96|129->97
                  -- GENERATED --
              */
          