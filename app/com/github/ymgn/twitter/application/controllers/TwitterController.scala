package com.github.ymgn.twitter.application.controllers

import javax.inject._
import play.api.mvc._

class TwitterController @Inject()(mcc: MessagesControllerComponents)
extends MessagesAbstractController(mcc) {

  def index() = Action { implicit request: MessagesRequest[AnyContent] =>
    Ok("Hello World")
  }
}
