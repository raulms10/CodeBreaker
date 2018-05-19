// @GENERATOR:play-routes-compiler
// @SOURCE:/home/estudiantes/rantonio.martinez/Scala/CodeBreaker/conf/routes
// @DATE:Sat May 19 08:34:31 COT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def codeBreakerService(n:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "codebreaker/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("n", n)))
    }
  
    // @LINE:8
    def dec2rom(n:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dec2rom/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("n", n)))
    }
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
