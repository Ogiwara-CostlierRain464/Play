package services

import javax.inject.{Inject, Singleton}
import play.api.db.DBApi
import scala.language.postfixOps
import anorm.SqlParser._
import anorm._

case class Todo(name: String)

@Singleton
class TodoService @Inject() (dbapi: DBApi){

  private val db = dbapi.database("default")

  val simple = {
    get[String]("todo.name") map {
      case name => Todo(name)
    }
  }

  def list() = {
    db.withConnection { implicit connection =>
      SQL(
        """
          select * from todo
        """
      ).as(simple *)
    }
  }
}
