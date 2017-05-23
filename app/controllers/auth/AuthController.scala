package controllers.auth

import javax.inject._
import play.api._
import play.api.mvc._
import org.pac4j.core.client.{Clients, IndirectClient}
import play.api.mvc._
import org.pac4j.core.profile._
import org.pac4j.play.PlayWebContext
import org.pac4j.play.scala._
import org.pac4j.core.credentials.Credentials
import javax.inject.Inject
import play.libs.concurrent.HttpExecutionContext
import org.pac4j.core.config.Config
import org.pac4j.play.store.PlaySessionStore
import org.pac4j.play.scala.Security
import views.html.helper.CSRF
import scala.collection.JavaConversions._
import org.pac4j.http.client.indirect.FormClient

/**
 * This controller handles actions specifically related to Authentication and Authorization
 */
@Singleton
class AuthController @Inject()(val config: Config, val playSessionStore: PlaySessionStore, override val ec: HttpExecutionContext) extends Controller with Security[CommonProfile] {

  def signIn = Action { request =>
    Ok(views.html.auth.signIn.render())
  }

  def signUp = Action { request =>
    Ok(views.html.auth.signUp.render())
  }

  def formClient = Secure("FormClient") { profiles =>
    Action { request =>
      Redirect(controllers.routes.ApplicationController.secure)
    }
  }

  def googleClient = Secure("OidcClient") { profiles =>
    Action { request =>
      Redirect(controllers.routes.ApplicationController.secure)
    }
  }
    
  def loginForm = Action { implicit request =>
    val formClient = config.getClients.findClient("FormClient").asInstanceOf[FormClient]
    Ok(views.html.auth.loginForm(formClient, request))
  }

}
