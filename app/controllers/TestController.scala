package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}
import services.Timer

@Singleton
class TestController @Inject() (cc: ControllerComponents,val timer: Timer) extends AbstractController(cc){

  var count = 0

  def index = Action {
    val a = timer.incrementAndGet()
    Ok(a.toString)
  }
}
