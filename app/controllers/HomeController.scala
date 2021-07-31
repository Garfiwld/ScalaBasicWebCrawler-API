package controllers

import com.google.gson.Gson
import play.api.libs.json._
import play.api.mvc._

import javax.inject._

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def explore() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.explore())
  }

  def tutorial() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tutorial())
  }

  def companies() = Action {request =>
    val gson = new Gson()
    Ok(
      Json.parse(
        gson.toJson(
          views.ScalaBasicWebCrawler.resScalaBasicWebCrawler()
        )
      )
    )
  }

}
