
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

object lgn extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    body.lgn
    """),format.raw/*13.5*/("""{"""),format.raw/*13.6*/("""
      """),format.raw/*14.7*/("""background-image: url('"""),_display_(/*14.31*/routes/*14.37*/.Assets.versioned("images/sgnbg.jpeg")),format.raw/*14.75*/("""');
        background-repeat: repeat;
        background-attachment: fixed;
        background-position: center; 
    """),format.raw/*18.5*/("""}"""),format.raw/*18.6*/("""
    
    """),format.raw/*20.5*/(""".nav
    """),format.raw/*21.5*/("""{"""),format.raw/*21.6*/("""
        """),format.raw/*22.9*/("""padding-left:3em;
        padding-right:3em;
        
        
    """),format.raw/*26.5*/("""}"""),format.raw/*26.6*/("""
    """),format.raw/*27.5*/("""h1
    """),format.raw/*28.5*/("""{"""),format.raw/*28.6*/("""
        """),format.raw/*29.9*/("""font-family:Impact;
        font-style: italic;
        text-align:center;
        color:white;
    """),format.raw/*33.5*/("""}"""),format.raw/*33.6*/("""
    """),format.raw/*34.5*/("""h2
    """),format.raw/*35.5*/("""{"""),format.raw/*35.6*/("""
        """),format.raw/*36.9*/("""text-align:center;
    """),format.raw/*37.5*/("""}"""),format.raw/*37.6*/("""
    """),format.raw/*38.5*/("""h3
    """),format.raw/*39.5*/("""{"""),format.raw/*39.6*/("""
        """),format.raw/*40.9*/("""text-align:center;
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/("""
    """),format.raw/*42.5*/("""h4
    """),format.raw/*43.5*/("""{"""),format.raw/*43.6*/("""
        """),format.raw/*44.9*/("""text-align:center;
    """),format.raw/*45.5*/("""}"""),format.raw/*45.6*/("""
    """),format.raw/*46.5*/("""img.center
    """),format.raw/*47.5*/("""{"""),format.raw/*47.6*/("""
        """),format.raw/*48.9*/("""display: block;
        margin-left: auto;
        margin-right: auto;
    """),format.raw/*51.5*/("""}"""),format.raw/*51.6*/("""
    """),format.raw/*52.5*/("""table, th, td """),format.raw/*52.19*/("""{"""),format.raw/*52.20*/("""
        
        """),format.raw/*54.9*/("""background-color:#2D2B2B;
        padding-left:5em;
        padding-top:.5em;
        padding-right:5em;
        margin-align:center;
        height-align:center;
        width:72em;
    """),format.raw/*61.5*/("""}"""),format.raw/*61.6*/("""
    
    """),format.raw/*63.5*/("""tr.odd td
    """),format.raw/*64.5*/("""{"""),format.raw/*64.6*/("""
        """),format.raw/*65.9*/("""background-color:#D6D6D6;;
    """),format.raw/*66.5*/("""}"""),format.raw/*66.6*/("""
    
    """),format.raw/*68.5*/(""".panel-collapse 
    """),format.raw/*69.5*/("""{"""),format.raw/*69.6*/("""
        """),format.raw/*70.9*/("""margin-left:8em;	
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""
       
        """),format.raw/*73.9*/(""".navbar """),format.raw/*73.17*/("""{"""),format.raw/*73.18*/("""
            """),format.raw/*74.13*/("""margin-bottom: 0;
            border-radius: 0;
          """),format.raw/*76.11*/("""}"""),format.raw/*76.12*/("""
          
          
          """),format.raw/*79.11*/("""footer """),format.raw/*79.18*/("""{"""),format.raw/*79.19*/("""
            """),format.raw/*80.13*/("""background-color: grey;
            padding: 25px;
          """),format.raw/*82.11*/("""}"""),format.raw/*82.12*/("""
          
        """),format.raw/*84.9*/(""".carousel-inner img """),format.raw/*84.29*/("""{"""),format.raw/*84.30*/("""
            """),format.raw/*85.13*/("""width: 100%; 
            margin: auto;
            min-height:200px;
        """),format.raw/*88.9*/("""}"""),format.raw/*88.10*/("""
      
        
        """),format.raw/*91.9*/("""@media (max-width: 600px) """),format.raw/*91.36*/("""{"""),format.raw/*91.37*/("""
          """),format.raw/*92.11*/(""".carousel-caption """),format.raw/*92.29*/("""{"""),format.raw/*92.30*/("""
            """),format.raw/*93.13*/("""display: none; 
          """),format.raw/*94.11*/("""}"""),format.raw/*94.12*/("""
        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/("""
        """),format.raw/*96.9*/("""</style>

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
      <li><a href="/sgn"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li class ="active"><a href="/lgn"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
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
<body class = lgn>
<form action="/action_page.php"> 
  </div>
<p><b>Login</b></p>
  <div class="container">
    <p><label><b>Username</b></label></p>
	</div>
	<div>
    <input type="text" placeholder="Enter Username" name="uname" required>
	</div>
<div>
    <label><b>Password</b></label>
	</div>
	<div>
    <input type="password" placeholder="Enter Password" name="psw" required>
</div>
    <button type="submit">Login</button>
    <input type="checkbox" checked="checked"> Remember me
  <div>
  <div>   
  <span class="psw">Forgot <a href="#">password?</a></span>  
  <div>
  </form>
  </div>
</body>
  <footer>
  <footer/>"""))
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
                  SOURCE: /media/sf_student/ImagesWorking/1st Draft/comicswebpage/app/views/lgn.scala.html
                  HASH: 95b9ba0505090c9eaa6e53969d6e7a12c9e1fcbb
                  MATRIX: 1028->0|1437->382|1465->383|1499->390|1550->414|1565->420|1624->458|1770->577|1798->578|1835->588|1871->597|1899->598|1935->607|2029->674|2057->675|2089->680|2123->687|2151->688|2187->697|2314->797|2342->798|2374->803|2408->810|2436->811|2472->820|2522->843|2550->844|2582->849|2616->856|2644->857|2680->866|2730->889|2758->890|2790->895|2824->902|2852->903|2888->912|2938->935|2966->936|2998->941|3040->956|3068->957|3104->966|3206->1041|3234->1042|3266->1047|3308->1061|3337->1062|3382->1080|3596->1267|3624->1268|3661->1278|3702->1292|3730->1293|3766->1302|3824->1333|3852->1334|3889->1344|3937->1365|3965->1366|4001->1375|4050->1397|4078->1398|4122->1415|4158->1423|4187->1424|4228->1437|4314->1495|4343->1496|4404->1529|4439->1536|4468->1537|4509->1550|4598->1611|4627->1612|4674->1632|4722->1652|4751->1653|4792->1666|4897->1744|4926->1745|4978->1770|5032->1797|5061->1798|5100->1809|5146->1827|5175->1828|5216->1841|5270->1867|5299->1868|5335->1877|5364->1878|5400->1887
                  LINES: 33->1|45->13|45->13|46->14|46->14|46->14|46->14|50->18|50->18|52->20|53->21|53->21|54->22|58->26|58->26|59->27|60->28|60->28|61->29|65->33|65->33|66->34|67->35|67->35|68->36|69->37|69->37|70->38|71->39|71->39|72->40|73->41|73->41|74->42|75->43|75->43|76->44|77->45|77->45|78->46|79->47|79->47|80->48|83->51|83->51|84->52|84->52|84->52|86->54|93->61|93->61|95->63|96->64|96->64|97->65|98->66|98->66|100->68|101->69|101->69|102->70|103->71|103->71|105->73|105->73|105->73|106->74|108->76|108->76|111->79|111->79|111->79|112->80|114->82|114->82|116->84|116->84|116->84|117->85|120->88|120->88|123->91|123->91|123->91|124->92|124->92|124->92|125->93|126->94|126->94|127->95|127->95|128->96
                  -- GENERATED --
              */
          