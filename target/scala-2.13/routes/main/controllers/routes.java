// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHealthCheckController HealthCheckController = new controllers.ReverseHealthCheckController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHealthCheckController HealthCheckController = new controllers.javascript.ReverseHealthCheckController(RoutesPrefix.byNamePrefix());
  }

}
