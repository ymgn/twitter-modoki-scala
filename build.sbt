name := """twitter-modoki-scala"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.1"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

libraryDependencies += evolutions                                     // Playで使われているMigrationツール
libraryDependencies += jdbc                                           // JavaからDBを操作するためのAPI
libraryDependencies += "org.playframework.anorm" %% "anorm" % "2.6.5" // JDBCでSQLを使ってやり取りするためのAPI
libraryDependencies += "com.h2database" % "h2" % "1.4.200"            // H2 DBを使うライブラリ

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
