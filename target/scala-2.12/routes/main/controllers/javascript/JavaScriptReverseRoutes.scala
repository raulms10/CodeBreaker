// @GENERATOR:play-routes-compiler
// @SOURCE:/home/estudiantes/rantonio.martinez/Scala/CodeBreaker/conf/routes
// @DATE:Sat May 19 08:34:31 COT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def codeBreakerService: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.codeBreakerService",
      """
        function(n0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "codebreaker/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("n", n0))})
        }
      """
    )
  
    // @LINE:8
    def dec2rom: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.dec2rom",
      """
        function(n0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dec2rom/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("n", n0))})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
