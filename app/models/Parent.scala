package models

import java.util.Date

import io.ebean.Model
import io.ebean.annotation.{CreatedTimestamp, NotNull}
import javax.persistence.{Entity, Id, Version}

@Entity
case class Parent() extends Model{
  @Id
  var id: Long = 0
  @NotNull
  var name: String = null
  @CreatedTimestamp
  var createDate: Date = null
  @Version
  var updateDate: Date = null
}
