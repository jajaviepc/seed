// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  HealthCheckController_0: controllers.HealthCheckController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    HealthCheckController_0: controllers.HealthCheckController
  ) = this(errorHandler, HealthCheckController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HealthCheckController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """healthcheck""", """controllers.HealthCheckController.healthCheck()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_HealthCheckController_healthCheck0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("healthcheck")))
  )
  private[this] lazy val controllers_HealthCheckController_healthCheck0_invoker = createInvoker(
    HealthCheckController_0.healthCheck(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HealthCheckController",
      "healthCheck",
      Nil,
      "GET",
      this.prefix + """healthcheck""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_HealthCheckController_healthCheck0_route(params@_) =>
      call { 
        controllers_HealthCheckController_healthCheck0_invoker.call(HealthCheckController_0.healthCheck())
      }
  }
}
