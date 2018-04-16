package controllers

import javax.inject.Inject
import play.api.mvc.{MessagesAbstractController, MessagesControllerComponents}
import services.{Todo, TodoService}

class TodoController @Inject()
 (todoService: TodoService,mcc: MessagesControllerComponents)extends MessagesAbstractController(mcc){

  def list() = Action {
    val items = todoService.list()

    Ok(views.html.list(items))
  }

  def todoNew() = Action {
    Ok("w")
  }
}
