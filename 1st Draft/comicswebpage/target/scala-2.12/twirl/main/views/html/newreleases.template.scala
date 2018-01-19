
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

object newreleases extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

  
    """),format.raw/*4.5*/("""<!DOCTYPE html>
    <html lang="en">



<html>
        <link href=""""),_display_(/*10.22*/routes/*10.28*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.69*/("""" rel="stylesheet" type="text/css" />
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
      body.events
  """),format.raw/*19.3*/("""{"""),format.raw/*19.4*/("""
    """),format.raw/*20.5*/("""background-image: url('"""),_display_(/*20.29*/routes/*20.35*/.Assets.versioned("images/comicbookbg.jpg")),format.raw/*20.78*/("""');
    background-repeat: repeat;
      background-attachment: fixed;
      background-position: center; 
  """),format.raw/*24.3*/("""}"""),format.raw/*24.4*/("""
  """),format.raw/*25.3*/("""body.NewReleases
  """),format.raw/*26.3*/("""{"""),format.raw/*26.4*/("""
  """),format.raw/*27.3*/("""}"""),format.raw/*27.4*/("""
  
  """),format.raw/*29.3*/(""".nav
  """),format.raw/*30.3*/("""{"""),format.raw/*30.4*/("""
    """),format.raw/*31.5*/("""padding-left:3em;
    padding-right:3em;
    
    
  """),format.raw/*35.3*/("""}"""),format.raw/*35.4*/("""
  """),format.raw/*36.3*/("""h1
  """),format.raw/*37.3*/("""{"""),format.raw/*37.4*/("""
    """),format.raw/*38.5*/("""font-family:Impact;
    font-style: italic;
    text-align:center;
    color:white;
  """),format.raw/*42.3*/("""}"""),format.raw/*42.4*/("""
  """),format.raw/*43.3*/("""h2
  """),format.raw/*44.3*/("""{"""),format.raw/*44.4*/("""
    """),format.raw/*45.5*/("""text-align:center;
  """),format.raw/*46.3*/("""}"""),format.raw/*46.4*/("""
  """),format.raw/*47.3*/("""h3
  """),format.raw/*48.3*/("""{"""),format.raw/*48.4*/("""
    """),format.raw/*49.5*/("""text-align:center;
  """),format.raw/*50.3*/("""}"""),format.raw/*50.4*/("""
  """),format.raw/*51.3*/("""h4
  """),format.raw/*52.3*/("""{"""),format.raw/*52.4*/("""
    """),format.raw/*53.5*/("""text-align:center;
  """),format.raw/*54.3*/("""}"""),format.raw/*54.4*/("""
  """),format.raw/*55.3*/("""img.center
  """),format.raw/*56.3*/("""{"""),format.raw/*56.4*/("""
    """),format.raw/*57.5*/("""display: block;
      margin-left: auto;
    margin-right: auto;
  """),format.raw/*60.3*/("""}"""),format.raw/*60.4*/("""
  """),format.raw/*61.3*/("""table, th, td """),format.raw/*61.17*/("""{"""),format.raw/*61.18*/("""
      
    """),format.raw/*63.5*/("""background-color:#2D2B2B;
    padding-left:5em;
    padding-top:.5em;
    padding-right:5em;
    margin-align:center;
    height-align:center;
    width:72em;
  """),format.raw/*70.3*/("""}"""),format.raw/*70.4*/("""
  
  """),format.raw/*72.3*/("""tr.odd td
  """),format.raw/*73.3*/("""{"""),format.raw/*73.4*/("""
    """),format.raw/*74.5*/("""background-color:#D6D6D6;;
  """),format.raw/*75.3*/("""}"""),format.raw/*75.4*/("""
  
  """),format.raw/*77.3*/(""".panel-collapse 
  """),format.raw/*78.3*/("""{"""),format.raw/*78.4*/("""
    """),format.raw/*79.5*/("""margin-left:8em;	
  """),format.raw/*80.3*/("""}"""),format.raw/*80.4*/("""
     
      """),format.raw/*82.7*/(""".navbar """),format.raw/*82.15*/("""{"""),format.raw/*82.16*/("""
          """),format.raw/*83.11*/("""margin-bottom: 0;
          border-radius: 0;
        """),format.raw/*85.9*/("""}"""),format.raw/*85.10*/("""
        
        
        """),format.raw/*88.9*/("""footer """),format.raw/*88.16*/("""{"""),format.raw/*88.17*/("""
          """),format.raw/*89.11*/("""background-color: grey;
          padding: 25px;
        """),format.raw/*91.9*/("""}"""),format.raw/*91.10*/("""
        
      """),format.raw/*93.7*/(""".carousel-inner img """),format.raw/*93.27*/("""{"""),format.raw/*93.28*/("""
          """),format.raw/*94.11*/("""width: 100%; 
          margin: auto;
          min-height:200px;
      """),format.raw/*97.7*/("""}"""),format.raw/*97.8*/("""
    
      
      """),format.raw/*100.7*/("""@media (max-width: 600px) """),format.raw/*100.34*/("""{"""),format.raw/*100.35*/("""
        """),format.raw/*101.9*/(""".carousel-caption """),format.raw/*101.27*/("""{"""),format.raw/*101.28*/("""
          """),format.raw/*102.11*/("""display: none; 
        """),format.raw/*103.9*/("""}"""),format.raw/*103.10*/("""
      """),format.raw/*104.7*/("""}"""),format.raw/*104.8*/("""
      """),format.raw/*105.7*/("""</style>
  
  </head>
  <body class="events">
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
                <li><a href="/events">Events</a></li>
                <li class ="active"><a href="/newreleases">New Releases</a></li>
                
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

      <h2> November 2017 </h2>
      <div class="panel-group" id="accordion">
          <div class="panel panel-default">
              <div class="panel-heading">
                  <h4 class="panel-title">
                      <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">
                          Releases For 17th November 2017 
                      </a>
                  </h4>
              </div>
              <div id="collapse1" class="panel-collapse collapse in" ><div id="collapse1" class="panel-collapse collapse in" >
                  <div class="panel-body" >
                  <br>
                  
                      <div class="container-fluid bg-3 text-center">  
                          <div class="row" >
                              <div class="col-sm-2">
                                  <p>Apocalypse Girl</p>
                                  <img src=""""),_display_(/*163.46*/routes/*163.52*/.Assets.versioned("images/rel.week3img1.jpg")),format.raw/*163.97*/("""" class="img-responsive" style="width:100%" alt="Image" >
                              </div>
                          
                              <div class="col-sm-2"> 
                                  <p>Betty and Veronica Vixens</p>
                                  <img src=""""),_display_(/*168.46*/routes/*168.52*/.Assets.versioned("images/rel.week3img2.jpg")),format.raw/*168.97*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                              
                              <div class="col-sm-2"> 
                                  <p>Demon Hell Is Earth</p>
                                  <img src=""""),_display_(/*173.46*/routes/*173.52*/.Assets.versioned("images/rel.week3img3.jpg")),format.raw/*173.97*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                                  
                              <div class="col-sm-2">
                                  <p>Doctor Radar</p>
                                    <img src=""""),_display_(/*178.48*/routes/*178.54*/.Assets.versioned("images/rel.week3img4.jpg")),format.raw/*178.99*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                              
                              <div class="col-sm-2">
                                  <p>Doomsday Clock</p>
                                  <img src=""""),_display_(/*183.46*/routes/*183.52*/.Assets.versioned("images/rel.week3img5.gif")),format.raw/*183.97*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                          </div>
                      </div>
                      
                      <br>

                      <div class="container-fluid bg-3 text-center">    
                          <div class="row">
                              <div class="col-sm-2"> 
                                  <p>Doppelganger</p>
                                  <img src=""""),_display_(/*194.46*/routes/*194.52*/.Assets.versioned("images/rel.week3img6.jpg")),format.raw/*194.97*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                              
                              <div class="col-sm-2"> 
                                  <p>Giant Days 2017 Special</p>
                                  <img src=""""),_display_(/*199.46*/routes/*199.52*/.Assets.versioned("images/rel.week3img7.jpg")),format.raw/*199.97*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>

                              <div class="col-sm-2">
                                  <p>Imaginary Fiends</p>
                                  <img src=""""),_display_(/*204.46*/routes/*204.52*/.Assets.versioned("images/rel.week3img8.jpg")),format.raw/*204.97*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                              
                              <div class="col-sm-2">
                                   <p>James Bond Solstice</p>
                                  <img src=""""),_display_(/*209.46*/routes/*209.52*/.Assets.versioned("images/rel.week3img9.jpg")),format.raw/*209.97*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                              
                              <div class="col-sm-2"> 
                                  <p>Maxwell's Demons</p>
                                  <img src=""""),_display_(/*214.46*/routes/*214.52*/.Assets.versioned("images/rel.week3img10.jpeg")),format.raw/*214.99*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                          </div>
                      </div>
                      
                      <br>
                      <br>
                      
                      <div class="container-fluid bg-3 text-center">    
                          <div class="row">
                              <div class="col-sm-2"> 
                                  <p>Tomb Raider Survivor's Crusade</p>
                                  <img src=""""),_display_(/*226.46*/routes/*226.52*/.Assets.versioned("images/rel.week3img11.jpg")),format.raw/*226.98*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                              
                              <div class="col-sm-2">
                                  <p>Villain</p>
                                  <img src=""""),_display_(/*231.46*/routes/*231.52*/.Assets.versioned("images/rel.week3img12.jpg")),format.raw/*231.98*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                              
                              <div class="col-sm-2">
                                  <p>Void Trip</p>
                                  <img src=""""),_display_(/*236.46*/routes/*236.52*/.Assets.versioned("images/rel.week3img14.png")),format.raw/*236.98*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                          </div>
                      </div>
                      
                      <br>
                      <br>
                                  
                  </div>
              </div>
                </div>
                
                <div class="panel panel-default">
                  <div class="panel-heading">
                    <h4 class="panel-title">
                      <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">
                      Release For 10th November 2017</a>
                    </h4>
                  </div>
                  <div id="collapse2" class="panel-collapse collapse">
                    <div class="panel-body">
                    
                      <div class="container-fluid bg-3 text-center">  
                <div class="row">
                  <div class="col-sm-2">
                    <p>Batman Who Laughs</p>
                    <img src=""""),_display_(/*262.32*/routes/*262.38*/.Assets.versioned("images/rel.week2img1.jpg")),format.raw/*262.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                    </div>
                  <div class="col-sm-2"> 
                    <p>Brilliant Trash</p>
                    <img src=""""),_display_(/*266.32*/routes/*266.38*/.Assets.versioned("images/rel.week2img2.jpg")),format.raw/*266.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Dark Fang</p>
                    <img src=""""),_display_(/*270.32*/routes/*270.38*/.Assets.versioned("images/rel.week2img3.jpg")),format.raw/*270.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Evolution</p>
                    <img src=""""),_display_(/*274.32*/routes/*274.38*/.Assets.versioned("images/rel.week2img4.jpg")),format.raw/*274.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Fences</p>
                    <img src=""""),_display_(/*278.32*/routes/*278.38*/.Assets.versioned("images/rel.week2img5.jpg")),format.raw/*278.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                </div>
              </div><br><br>

                      <div class="container-fluid bg-3 text-center">  
                <div class="row">

                  <div class="col-sm-2"> 
                    <p>Jenny Finn</p><br>
                    <img src=""""),_display_(/*288.32*/routes/*288.38*/.Assets.versioned("images/rel.week2img6.jpg")),format.raw/*288.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Minky Woodcock Girl Who Handcuffed Houdini</p>
                    <img src=""""),_display_(/*292.32*/routes/*292.38*/.Assets.versioned("images/rel.week2img7.jpg")),format.raw/*292.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Ninja-k</p><br>
                    <img src=""""),_display_(/*296.32*/routes/*296.38*/.Assets.versioned("images/rel.week2img8.jpg")),format.raw/*296.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                   <div class="col-sm-2">
                    <p>Not Brand Echh</p><br>
                    <img src=""""),_display_(/*300.32*/routes/*300.38*/.Assets.versioned("images/rel.week2img9.jpg")),format.raw/*300.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Priceless Raven The Pirate Princess Year Two Love and Revenge</p>
                    <img src=""""),_display_(/*304.32*/routes/*304.38*/.Assets.versioned("images/rel.week2img10.jpg")),format.raw/*304.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  </div>
              </div><br><br>

                      <div class="container-fluid bg-3 text-center">  
                <div class="row">  
                  <div class="col-sm-2"> 
                    <p>Rasputin The Voice of the Dragon</p>
                    <img src=""""),_display_(/*313.32*/routes/*313.38*/.Assets.versioned("images/rel.week2img11.jpg")),format.raw/*313.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Rock & Roll Biographies Opeth-k</p>
                    <img src=""""),_display_(/*317.32*/routes/*317.38*/.Assets.versioned("images/rel.week2img12.jpg")),format.raw/*317.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>The Willows</p>
                    <img src=""""),_display_(/*321.32*/routes/*321.38*/.Assets.versioned("images/rel.week2img13.jpg")),format.raw/*321.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>WWE Survivors Series 2017 Special</p>
                    <img src=""""),_display_(/*325.32*/routes/*325.38*/.Assets.versioned("images/rel.week2img14.jpg")),format.raw/*325.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                </div>
              </div><br><br>
                    </div>
                  </div>
                </div>
                
                <div class="panel panel-default">
                  <div class="panel-heading">
                    <h4 class="panel-title">
                      <a data-toggle="collapse" data-parent="#accordion" href="#collapse3">
                      Releases For 3rd  November 2017</a>
                    </h4>
                  </div>
                  <div id="collapse3" class="panel-collapse collapse">
                    <div class="panel-body">
                    
                    <br>
                <div class="container-fluid bg-3 text-center">  
                <div class="row">
                  <div class="col-sm-2">
                    <p>1985 Black Hole Repo</p>
                    <img src=""""),_display_(/*348.32*/routes/*348.38*/.Assets.versioned("images/rel.week1img1.jpg")),format.raw/*348.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Batman Lost</p>
                    <img src=""""),_display_(/*352.32*/routes/*352.38*/.Assets.versioned("images/rel.week1img2.jpg")),format.raw/*352.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Coyetes</p>
                    <img src=""""),_display_(/*356.32*/routes/*356.38*/.Assets.versioned("images/rel.week1img3.jpg")),format.raw/*356.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Deuce of Hearts</p>
                    <img src=""""),_display_(/*360.32*/routes/*360.38*/.Assets.versioned("images/rel.week1img4.jpg")),format.raw/*360.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Fallen Suns</p>
                    <img src=""""),_display_(/*364.32*/routes/*364.38*/.Assets.versioned("images/rel.week1img5.jpg")),format.raw/*364.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                </div>
              </div><br>

              <br>
                <div class="container-fluid bg-3 text-center">  
                <div class="row">
                  <div class="col-sm-2">
                    <p>Harbinger Renegade</p>
                    <img src=""""),_display_(/*374.32*/routes/*374.38*/.Assets.versioned("images/rel.week1img6.jpg")),format.raw/*374.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Harcourt Legacy</p>
                    <img src=""""),_display_(/*378.32*/routes/*378.38*/.Assets.versioned("images/rel.week1img7.jpg")),format.raw/*378.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Iron Maiden Legacy of the Beast</p>
                    <img src=""""),_display_(/*382.32*/routes/*382.38*/.Assets.versioned("images/rel.week1img8.jpeg")),format.raw/*382.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Kong On The Planet of the Apes</p>
                    <img src=""""),_display_(/*386.32*/routes/*386.38*/.Assets.versioned("images/rel.week1img9.jpg")),format.raw/*386.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Master of Kung Fu</p>
                    <img src=""""),_display_(/*390.32*/routes/*390.38*/.Assets.versioned("images/rel.week1img10.jpg")),format.raw/*390.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                </div>
              </div><br>

              <br>
                <div class="container-fluid bg-3 text-center">  
                <div class="row">
                  <div class="col-sm-2">
                    <p>Moon Knight</p>
                    <img src=""""),_display_(/*400.32*/routes/*400.38*/.Assets.versioned("images/rel.week1img11.jpg")),format.raw/*400.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Port of Earth</p>
                    <img src=""""),_display_(/*404.32*/routes/*404.38*/.Assets.versioned("images/rel.week1img12.jpg")),format.raw/*404.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Rivers of London Cry Fox</p>
                    <img src=""""),_display_(/*408.32*/routes/*408.38*/.Assets.versioned("images/rel.week1img13.jpg")),format.raw/*408.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Skylanders Spyro And Friends </p>
                    <img src=""""),_display_(/*412.32*/routes/*412.38*/.Assets.versioned("images/rel.week1img14.jpg")),format.raw/*412.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Wonderful World Of Tank Girl </p>
                    <img src=""""),_display_(/*416.32*/routes/*416.38*/.Assets.versioned("images/rel.week1img15.jpg")),format.raw/*416.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                </div>
              </div><br>
                    
                    
                    </div>
                  </div>
          </div>
      </div>
      
      
      
      <h2>October 2017 </h2>
      
      <div class="panel-group" id="accordion">
          <div class="panel panel-default">
              <div class="panel-heading">
                  <h4 class="panel-title">
                      <a data-toggle="collapse" data-parent="#accordion" href="#collapse4">
                          Releases For December 2017 
                      </a>
                  </h4>
              </div>
              <div id="collapse4" class="panel-collapse collapse" >
                  <div class="panel-body" >
                  <br>
                  
                      <div class="container-fluid bg-3 text-center">  
                          <div class="row" >
                              <div class="col-sm-2">
                                  <p>Apocalypse Girl</p>
                                  <img src=""""),_display_(/*448.46*/routes/*448.52*/.Assets.versioned("images/rel.week3img1.jpg")),format.raw/*448.97*/("""" class="img-responsive" style="width:100%" alt="Image" >
                              </div>
                          
                              <div class="col-sm-2"> 
                                  <p>Betty and Veronica Vixens</p>
                                  <img src=""""),_display_(/*453.46*/routes/*453.52*/.Assets.versioned("images/rel.week3img2.jpg")),format.raw/*453.97*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                              
                              <div class="col-sm-2"> 
                                  <p>Demon Hell Is Earth</p>
                                  <img src=""""),_display_(/*458.46*/routes/*458.52*/.Assets.versioned("images/rel.week3img3.jpg")),format.raw/*458.97*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                                  
                              <div class="col-sm-2">
                                  <p>Doctor Radar</p>
                                    <img src=""""),_display_(/*463.48*/routes/*463.54*/.Assets.versioned("images/rel.week3img4.jpg")),format.raw/*463.99*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                              
                              <div class="col-sm-2">
                                  <p>Doomsday Clock</p>
                                  <img src=""""),_display_(/*468.46*/routes/*468.52*/.Assets.versioned("images/rel.week3img5.gif")),format.raw/*468.97*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                          </div>
                      </div>
                      
                      <br>

                      <div class="container-fluid bg-3 text-center">    
                          <div class="row">
                              <div class="col-sm-2"> 
                                  <p>Doppelganger</p>
                                  <img src=""""),_display_(/*479.46*/routes/*479.52*/.Assets.versioned("images/rel.week3img6.jpg")),format.raw/*479.97*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                              
                              <div class="col-sm-2"> 
                                  <p>Giant Days 2017 Special</p>
                                  <img src=""""),_display_(/*484.46*/routes/*484.52*/.Assets.versioned("images/rel.week3img7.jpg")),format.raw/*484.97*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>

                              <div class="col-sm-2">
                                  <p>Imaginary Fiends</p>
                                  <img src=""""),_display_(/*489.46*/routes/*489.52*/.Assets.versioned("images/rel.week3img8.jpg")),format.raw/*489.97*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                              
                              <div class="col-sm-2">
                                   <p>James Bond Solstice</p>
                                  <img src=""""),_display_(/*494.46*/routes/*494.52*/.Assets.versioned("images/rel.week3img9.jpg")),format.raw/*494.97*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                              
                              <div class="col-sm-2"> 
                                  <p>Maxwell's Demons</p>
                                  <img src=""""),_display_(/*499.46*/routes/*499.52*/.Assets.versioned("images/rel.week3img10.jpeg")),format.raw/*499.99*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                          </div>
                      </div>
                      
                      <br>
                      <br>
                      
                      <div class="container-fluid bg-3 text-center">    
                          <div class="row">
                              <div class="col-sm-2"> 
                                  <p>Tomb Raider Survivor's Crusade</p>
                                  <img src=""""),_display_(/*511.46*/routes/*511.52*/.Assets.versioned("images/rel.week3img11.jpg")),format.raw/*511.98*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                              
                              <div class="col-sm-2">
                                  <p>Villain</p>
                                  <img src=""""),_display_(/*516.46*/routes/*516.52*/.Assets.versioned("images/rel.week3img12.jpg")),format.raw/*516.98*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                              
                              <div class="col-sm-2">
                                  <p>Void Trip</p>
                                  <img src=""""),_display_(/*521.46*/routes/*521.52*/.Assets.versioned("images/rel.week3img14.png")),format.raw/*521.98*/("""" class="img-responsive" style="width:100%" alt="Image">
                              </div>
                          </div>
                      </div>
                      
                      <br>
                      <br>
                                  
                  </div>
              </div>
                </div>
                
                <div class="panel panel-default">
                  <div class="panel-heading">
                    <h4 class="panel-title">
                      <a data-toggle="collapse" data-parent="#accordion" href="#collapse5">
                      Release For 10th November 2017</a>
                    </h4>
                  </div>
                  <div id="collapse5" class="panel-collapse collapse">
                    <div class="panel-body">
                    
                      <div class="container-fluid bg-3 text-center">  
                <div class="row">
                  <div class="col-sm-2">
                    <p>Batman Who Laughs</p>
                    <img src=""""),_display_(/*547.32*/routes/*547.38*/.Assets.versioned("images/rel.week2img1.jpg")),format.raw/*547.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                    </div>
                  <div class="col-sm-2"> 
                    <p>Brilliant Trash</p>
                    <img src=""""),_display_(/*551.32*/routes/*551.38*/.Assets.versioned("images/rel.week2img2.jpg")),format.raw/*551.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Dark Fang</p>
                    <img src=""""),_display_(/*555.32*/routes/*555.38*/.Assets.versioned("images/rel.week2img3.jpg")),format.raw/*555.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Evolution</p>
                    <img src=""""),_display_(/*559.32*/routes/*559.38*/.Assets.versioned("images/rel.week2img4.jpg")),format.raw/*559.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Fences</p>
                    <img src=""""),_display_(/*563.32*/routes/*563.38*/.Assets.versioned("images/rel.week2img5.jpg")),format.raw/*563.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                </div>
              </div><br><br>

                      <div class="container-fluid bg-3 text-center">  
                <div class="row">

                  <div class="col-sm-2"> 
                    <p>Jenny Finn</p><br>
                    <img src=""""),_display_(/*573.32*/routes/*573.38*/.Assets.versioned("images/rel.week2img6.jpg")),format.raw/*573.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Minky Woodcock Girl Who Handcuffed Houdini</p>
                    <img src=""""),_display_(/*577.32*/routes/*577.38*/.Assets.versioned("images/rel.week2img7.jpg")),format.raw/*577.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Ninja-k</p><br>
                    <img src=""""),_display_(/*581.32*/routes/*581.38*/.Assets.versioned("images/rel.week2img8.jpg")),format.raw/*581.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                   <div class="col-sm-2">
                    <p>Not Brand Echh</p><br>
                    <img src=""""),_display_(/*585.32*/routes/*585.38*/.Assets.versioned("images/rel.week2img9.jpg")),format.raw/*585.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Priceless Raven The Pirate Princess Year Two Love and Revenge</p>
                    <img src=""""),_display_(/*589.32*/routes/*589.38*/.Assets.versioned("images/rel.week2img10.jpg")),format.raw/*589.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  </div>
              </div><br><br>

                      <div class="container-fluid bg-3 text-center">  
                <div class="row">  
                  <div class="col-sm-2"> 
                    <p>Rasputin The Voice of the Dragon</p>
                    <img src=""""),_display_(/*598.32*/routes/*598.38*/.Assets.versioned("images/rel.week2img11.jpg")),format.raw/*598.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Rock & Roll Biographies Opeth-k</p>
                    <img src=""""),_display_(/*602.32*/routes/*602.38*/.Assets.versioned("images/rel.week2img12.jpg")),format.raw/*602.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>The Willows</p>
                    <img src=""""),_display_(/*606.32*/routes/*606.38*/.Assets.versioned("images/rel.week2img13.jpg")),format.raw/*606.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>WWE Survivors Series 2017 Special</p>
                    <img src=""""),_display_(/*610.32*/routes/*610.38*/.Assets.versioned("images/rel.week2img14.jpg")),format.raw/*610.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                </div>
              </div><br><br>
                    </div>
                  </div>
                </div>
                
                <div class="panel panel-default">
                  <div class="panel-heading">
                    <h4 class="panel-title">
                      <a data-toggle="collapse" data-parent="#accordion" href="#collapse6">
                      Releases For 3rd  November 2017</a>
                    </h4>
                  </div>
                  <div id="collapse6" class="panel-collapse collapse">
                    <div class="panel-body">
                    
                    <br>
                <div class="container-fluid bg-3 text-center">  
                <div class="row">
                  <div class="col-sm-2">
                    <p>1985 Black Hole Repo</p>
                    <img src=""""),_display_(/*633.32*/routes/*633.38*/.Assets.versioned("images/rel.week1img1.jpg")),format.raw/*633.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Batman Lost</p>
                    <img src=""""),_display_(/*637.32*/routes/*637.38*/.Assets.versioned("images/rel.week1img2.jpg")),format.raw/*637.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Coyetes</p>
                    <img src=""""),_display_(/*641.32*/routes/*641.38*/.Assets.versioned("images/rel.week1img3.jpg")),format.raw/*641.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Deuce of Hearts</p>
                    <img src=""""),_display_(/*645.32*/routes/*645.38*/.Assets.versioned("images/rel.week1img4.jpg")),format.raw/*645.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Fallen Suns</p>
                    <img src=""""),_display_(/*649.32*/routes/*649.38*/.Assets.versioned("images/rel.week1img5.jpg")),format.raw/*649.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                </div>
              </div><br>

              <br>
                <div class="container-fluid bg-3 text-center">  
                <div class="row">
                  <div class="col-sm-2">
                    <p>Harbinger Renegade</p>
                    <img src=""""),_display_(/*659.32*/routes/*659.38*/.Assets.versioned("images/rel.week1img6.jpg")),format.raw/*659.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Harcourt Legacy</p>
                    <img src=""""),_display_(/*663.32*/routes/*663.38*/.Assets.versioned("images/rel.week1img7.jpg")),format.raw/*663.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Iron Maiden Legacy of the Beast</p>
                    <img src=""""),_display_(/*667.32*/routes/*667.38*/.Assets.versioned("images/rel.week1img8.jpeg")),format.raw/*667.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Kong On The Planet of the Apes</p>
                    <img src=""""),_display_(/*671.32*/routes/*671.38*/.Assets.versioned("images/rel.week1img9.jpg")),format.raw/*671.83*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Master of Kung Fu</p>
                    <img src=""""),_display_(/*675.32*/routes/*675.38*/.Assets.versioned("images/rel.week1img10.jpg")),format.raw/*675.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                </div>
              </div><br>

              <br>
                <div class="container-fluid bg-3 text-center">  
                <div class="row">
                  <div class="col-sm-2">
                    <p>Moon Knight</p>
                    <img src=""""),_display_(/*685.32*/routes/*685.38*/.Assets.versioned("images/rel.week1img11.jpg")),format.raw/*685.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Port of Earth</p>
                    <img src=""""),_display_(/*689.32*/routes/*689.38*/.Assets.versioned("images/rel.week1img12.jpg")),format.raw/*689.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2"> 
                    <p>Rivers of London Cry Fox</p>
                    <img src=""""),_display_(/*693.32*/routes/*693.38*/.Assets.versioned("images/rel.week1img13.jpg")),format.raw/*693.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Skylanders Spyro And Friends Quarterly </p>
                    <img src=""""),_display_(/*697.32*/routes/*697.38*/.Assets.versioned("images/rel.week1img14.jpg")),format.raw/*697.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                  <div class="col-sm-2">
                    <p>Wonderful World Of Tank Girl </p>
                    <img src=""""),_display_(/*701.32*/routes/*701.38*/.Assets.versioned("images/rel.week1img15.jpg")),format.raw/*701.84*/("""" class="img-responsive" style="width:100%" alt="Image">
                  </div>
                </div>
              </div><br>
                    
                    
                    </div>
                  </div>
          </div>
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
                  DATE: Fri Jan 12 15:36:15 GMT 2018
                  SOURCE: /media/sf_student/ImagesWorking/1st Draft/comicswebpage/app/views/newreleases.scala.html
                  HASH: 7790eaa787b1c26bf9509f45d74d47116206fa88
                  MATRIX: 947->1|1043->3|1078->12|1173->80|1188->86|1250->127|1734->584|1762->585|1794->590|1845->614|1860->620|1924->663|2060->772|2088->773|2118->776|2164->795|2192->796|2222->799|2250->800|2283->806|2317->813|2345->814|2377->819|2457->872|2485->873|2515->876|2547->881|2575->882|2607->887|2720->973|2748->974|2778->977|2810->982|2838->983|2870->988|2918->1009|2946->1010|2976->1013|3008->1018|3036->1019|3068->1024|3116->1045|3144->1046|3174->1049|3206->1054|3234->1055|3266->1060|3314->1081|3342->1082|3372->1085|3412->1098|3440->1099|3472->1104|3566->1171|3594->1172|3624->1175|3666->1189|3695->1190|3734->1202|3922->1363|3950->1364|3983->1370|4022->1382|4050->1383|4082->1388|4138->1417|4166->1418|4199->1424|4245->1443|4273->1444|4305->1449|4352->1469|4380->1470|4420->1483|4456->1491|4485->1492|4524->1503|4605->1557|4634->1558|4688->1585|4723->1592|4752->1593|4791->1604|4875->1661|4904->1662|4947->1678|4995->1698|5024->1699|5063->1710|5162->1782|5190->1783|5237->1802|5292->1829|5322->1830|5359->1839|5406->1857|5436->1858|5476->1869|5528->1893|5558->1894|5593->1901|5622->1902|5657->1909|8144->4368|8160->4374|8227->4419|8543->4707|8559->4713|8626->4758|8939->5043|8955->5049|9022->5094|9333->5377|9349->5383|9416->5428|9723->5707|9739->5713|9806->5758|10311->6235|10327->6241|10394->6286|10711->6575|10727->6581|10794->6626|11073->6877|11089->6883|11156->6928|11469->7213|11485->7219|11552->7264|11862->7546|11878->7552|11947->7599|12519->8143|12535->8149|12603->8195|12903->8467|12919->8473|12987->8519|13289->8793|13305->8799|13373->8845|14455->9899|14471->9905|14538->9950|14766->10150|14782->10156|14849->10201|15069->10393|15085->10399|15152->10444|15371->10635|15387->10641|15454->10686|15670->10874|15686->10880|15753->10925|16137->11281|16153->11287|16220->11332|16473->11557|16489->11563|16556->11608|16777->11801|16793->11807|16860->11852|17089->12053|17105->12059|17172->12104|17444->12348|17460->12354|17528->12400|17933->12777|17949->12783|18017->12829|18258->13042|18274->13048|18342->13094|18563->13287|18579->13293|18647->13339|18891->13555|18907->13561|18975->13607|19952->14556|19968->14562|20035->14607|20257->14801|20273->14807|20340->14852|20558->15042|20574->15048|20641->15093|20866->15290|20882->15296|20949->15341|21170->15534|21186->15540|21253->15585|21648->15952|21664->15958|21731->16003|21957->16201|21973->16207|22040->16252|22282->16466|22298->16472|22366->16518|22606->16730|22622->16736|22689->16781|22916->16980|22932->16986|23000->17032|23388->17392|23404->17398|23472->17444|23696->17640|23712->17646|23780->17692|24015->17899|24031->17905|24099->17951|24338->18162|24354->18168|24422->18214|24661->18425|24677->18431|24745->18477|25903->19607|25919->19613|25986->19658|26302->19946|26318->19952|26385->19997|26698->20282|26714->20288|26781->20333|27092->20616|27108->20622|27175->20667|27482->20946|27498->20952|27565->20997|28070->21474|28086->21480|28153->21525|28470->21814|28486->21820|28553->21865|28832->22116|28848->22122|28915->22167|29228->22452|29244->22458|29311->22503|29621->22785|29637->22791|29706->22838|30278->23382|30294->23388|30362->23434|30662->23706|30678->23712|30746->23758|31048->24032|31064->24038|31132->24084|32214->25138|32230->25144|32297->25189|32525->25389|32541->25395|32608->25440|32828->25632|32844->25638|32911->25683|33130->25874|33146->25880|33213->25925|33429->26113|33445->26119|33512->26164|33896->26520|33912->26526|33979->26571|34232->26796|34248->26802|34315->26847|34536->27040|34552->27046|34619->27091|34848->27292|34864->27298|34931->27343|35203->27587|35219->27593|35287->27639|35692->28016|35708->28022|35776->28068|36017->28281|36033->28287|36101->28333|36322->28526|36338->28532|36406->28578|36650->28794|36666->28800|36734->28846|37711->29795|37727->29801|37794->29846|38016->30040|38032->30046|38099->30091|38317->30281|38333->30287|38400->30332|38625->30529|38641->30535|38708->30580|38929->30773|38945->30779|39012->30824|39407->31191|39423->31197|39490->31242|39716->31440|39732->31446|39799->31491|40041->31705|40057->31711|40125->31757|40365->31969|40381->31975|40448->32020|40675->32219|40691->32225|40759->32271|41147->32631|41163->32637|41231->32683|41455->32879|41471->32885|41539->32931|41774->33138|41790->33144|41858->33190|42107->33411|42123->33417|42191->33463|42430->33674|42446->33680|42514->33726
                  LINES: 28->1|33->1|36->4|42->10|42->10|42->10|51->19|51->19|52->20|52->20|52->20|52->20|56->24|56->24|57->25|58->26|58->26|59->27|59->27|61->29|62->30|62->30|63->31|67->35|67->35|68->36|69->37|69->37|70->38|74->42|74->42|75->43|76->44|76->44|77->45|78->46|78->46|79->47|80->48|80->48|81->49|82->50|82->50|83->51|84->52|84->52|85->53|86->54|86->54|87->55|88->56|88->56|89->57|92->60|92->60|93->61|93->61|93->61|95->63|102->70|102->70|104->72|105->73|105->73|106->74|107->75|107->75|109->77|110->78|110->78|111->79|112->80|112->80|114->82|114->82|114->82|115->83|117->85|117->85|120->88|120->88|120->88|121->89|123->91|123->91|125->93|125->93|125->93|126->94|129->97|129->97|132->100|132->100|132->100|133->101|133->101|133->101|134->102|135->103|135->103|136->104|136->104|137->105|195->163|195->163|195->163|200->168|200->168|200->168|205->173|205->173|205->173|210->178|210->178|210->178|215->183|215->183|215->183|226->194|226->194|226->194|231->199|231->199|231->199|236->204|236->204|236->204|241->209|241->209|241->209|246->214|246->214|246->214|258->226|258->226|258->226|263->231|263->231|263->231|268->236|268->236|268->236|294->262|294->262|294->262|298->266|298->266|298->266|302->270|302->270|302->270|306->274|306->274|306->274|310->278|310->278|310->278|320->288|320->288|320->288|324->292|324->292|324->292|328->296|328->296|328->296|332->300|332->300|332->300|336->304|336->304|336->304|345->313|345->313|345->313|349->317|349->317|349->317|353->321|353->321|353->321|357->325|357->325|357->325|380->348|380->348|380->348|384->352|384->352|384->352|388->356|388->356|388->356|392->360|392->360|392->360|396->364|396->364|396->364|406->374|406->374|406->374|410->378|410->378|410->378|414->382|414->382|414->382|418->386|418->386|418->386|422->390|422->390|422->390|432->400|432->400|432->400|436->404|436->404|436->404|440->408|440->408|440->408|444->412|444->412|444->412|448->416|448->416|448->416|480->448|480->448|480->448|485->453|485->453|485->453|490->458|490->458|490->458|495->463|495->463|495->463|500->468|500->468|500->468|511->479|511->479|511->479|516->484|516->484|516->484|521->489|521->489|521->489|526->494|526->494|526->494|531->499|531->499|531->499|543->511|543->511|543->511|548->516|548->516|548->516|553->521|553->521|553->521|579->547|579->547|579->547|583->551|583->551|583->551|587->555|587->555|587->555|591->559|591->559|591->559|595->563|595->563|595->563|605->573|605->573|605->573|609->577|609->577|609->577|613->581|613->581|613->581|617->585|617->585|617->585|621->589|621->589|621->589|630->598|630->598|630->598|634->602|634->602|634->602|638->606|638->606|638->606|642->610|642->610|642->610|665->633|665->633|665->633|669->637|669->637|669->637|673->641|673->641|673->641|677->645|677->645|677->645|681->649|681->649|681->649|691->659|691->659|691->659|695->663|695->663|695->663|699->667|699->667|699->667|703->671|703->671|703->671|707->675|707->675|707->675|717->685|717->685|717->685|721->689|721->689|721->689|725->693|725->693|725->693|729->697|729->697|729->697|733->701|733->701|733->701
                  -- GENERATED --
              */
          