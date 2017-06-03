package dao.auth

import javax.inject.Inject

import models.auth.NamePassLogin
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

class LoginDAO @Inject()(protected val dbConfigProvider: DatabaseConfigProvider)(implicit executionContext: ExecutionContext) extends HasDatabaseConfigProvider[JdbcProfile] {
  import profile.api._

  private val Logins = TableQuery[LoginTable]

  def all(): Future[Seq[NamePassLogin]] = db.run(Logins.result)

  def insert(cat: NamePassLogin): Future[Unit] = db.run(Logins += cat).map { _ => () }

  private class LoginTable(tag: Tag) extends Table[NamePassLogin](tag, "LOGIN") {
    def name = column[String]("NAME", O.PrimaryKey)
    def color = column[String]("COLOR")
    def * = (name, color) <> (NamePassLogin.tupled, NamePassLogin.unapply)
  }
}