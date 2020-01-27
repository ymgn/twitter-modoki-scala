package com.github.ymgn.twitter.domain.tweet.entity

import com.github.ymgn.twitter.domain.user.entity.User

case class Tweet(id: Int, message :String, user: User) {
}
