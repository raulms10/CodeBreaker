// @GENERATOR:play-routes-compiler
// @SOURCE:/home/estudiantes/rantonio.martinez/Scala/CodeBreaker/conf/routes
// @DATE:Sat May 19 08:34:31 COT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
