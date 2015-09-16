
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.6*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.36*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
  <head>
    <title>play-example-form</title>

        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/("""">
        <link rel='stylesheet' href='"""),_display_(/*11.39*/routes/*11.45*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.css"))),format.raw/*11.103*/("""'>
        <link rel='stylesheet' href='"""),_display_(/*12.39*/routes/*12.45*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.min.css"))),format.raw/*12.107*/("""'>
        <script type='text/javascript' src='"""),_display_(/*13.46*/routes/*13.52*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*13.106*/("""'></script>

        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*15.70*/("""" type="text/javascript"></script>

        <link rel="shortcut icon" type="image/png" href="/assets/images/favicon.png">
    <link rel='stylesheet' href='/webjars/bootstrap/3.3.5/css/bootstrap.css'>
    <link rel='stylesheet' href='/webjars/bootstrap/3.3.5/css/bootstrap.min.css'>
    <link rel="stylesheet" media="screen" href="/webjars/lib/font-awesome/css/font-awesome.min.css">
    <script type='text/javascript' src='/webjars/jquery/1.11.1/jquery.min.js'></script>
      <script type='text/javascript' src='/webjars/angularjs/1.4.3/angular.min.js'></script>

      <script src='/assets/lib/angularjs/angular.min.js' type="text/javascript"></script>


      <script src="/assets/javascripts/main.js" type="text/javascript"></script>



  </head>
  <body>
  <div class="navbar navbar-inverse" role="navigation">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <!--  Display three horizontal lines when navbar collapsed. -->
          <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/">play-example-form</a>
      </div>
    </div>
  </div>

    """),_display_(/*45.6*/content),format.raw/*45.13*/("""
    """),format.raw/*46.5*/("""<script src=""""),_display_(/*46.19*/routes/*46.25*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*46.79*/(""""></script>
        <script src=""""),_display_(/*47.23*/routes/*47.29*/.WebJarAssets.at(WebJarAssets.locate("js/bootstrap.min.js"))),format.raw/*47.89*/(""""></script>

    <!-- Enable tooltips. Used primarily to validate that JQuery + Bootstrap JS are loaded. Remove this script if you don't want tooltips. -->
    <script type="text/javascript">
    jQuery(function ($) """),format.raw/*51.25*/("""{"""),format.raw/*51.26*/("""
        """),format.raw/*52.9*/("""$("[rel='tooltip']").tooltip()
    """),format.raw/*53.5*/("""}"""),format.raw/*53.6*/(""");
    </script>
        </body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Sep 02 11:16:15 CDT 2015
                  SOURCE: /home/ikebrown/Scalatest/jameswa/app/views/main.scala.html
                  HASH: 25c4c5333a70703fff394f80b7a61e7ddb67f7e2
                  MATRIX: 530->7|655->37|683->39|838->167|853->173|914->212|982->253|997->259|1077->317|1145->358|1160->364|1244->426|1319->474|1334->480|1410->534|1472->569|1487->575|1549->616|2857->1898|2885->1905|2917->1910|2958->1924|2973->1930|3048->1984|3109->2018|3124->2024|3205->2084|3449->2300|3478->2301|3514->2310|3576->2345|3604->2346
                  LINES: 20->3|25->3|27->5|32->10|32->10|32->10|33->11|33->11|33->11|34->12|34->12|34->12|35->13|35->13|35->13|37->15|37->15|37->15|67->45|67->45|68->46|68->46|68->46|68->46|69->47|69->47|69->47|73->51|73->51|74->52|75->53|75->53
                  -- GENERATED --
              */
          