package globals
import com.google.inject.AbstractModule
import play.api.{Configuration, Environment}

class Module(environment: Environment, configuration: Configuration) extends AbstractModule {

  val _ = environment
}