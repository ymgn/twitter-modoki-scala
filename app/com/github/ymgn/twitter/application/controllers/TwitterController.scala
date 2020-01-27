package com.github.ymgn.twitter.application.controllers

import com.github.ymgn.twitter.domain.tweet.entity.Tweet
import com.github.ymgn.twitter.domain.user.entity.User
import javax.inject._
import play.api.mvc._

class TwitterController @Inject()(mcc: MessagesControllerComponents)
extends MessagesAbstractController(mcc) {

  def index() = Action { implicit request: MessagesRequest[AnyContent] =>
    val tweets = Seq(new Tweet(1, "ツイートだよ", new User(1, "ツイートする太郎")))

    Ok(views.html.index(tweets))
  }
}
