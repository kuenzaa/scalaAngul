
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ikebrown/Scalatest/jameswa/conf/routes
// @DATE:Fri Aug 28 21:28:57 CDT 2015


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
