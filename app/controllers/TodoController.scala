package controllers

import io.ebean.Finder
import javax.inject.Inject
import models.Parent
import play.api.mvc.{MessagesAbstractController, MessagesControllerComponents}

class TodoController @Inject()
 (mcc: MessagesControllerComponents)extends MessagesAbstractController(mcc){

  def list() = Action {

    val parent1 = Parent()
    parent1.name = "Taro"
    parent1.save()

    val parent2 = Parent()
    parent2.name = "Sasaki"
    parent2.save()

    val parent3 = Parent()
    parent3.name = "Jiro"
    parent3.save()

    val finder = ???

    Ok(views.html.list(finder))
  }

  def todoNew() = Action {
    Ok("w")
  }
}
