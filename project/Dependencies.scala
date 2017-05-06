import sbt._
import Keys._

object Dependencies {

  val scalaJs : Seq[ModuleID] = Seq(
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"
  )
//  val slf4jVersion = "1.6.4"
//  val slf4jNop = "org.slf4j" % "slf4j-nop" % slf4jVersion
//
//  val commonDependencies: Seq[ModuleID] = Seq(
//    "org.scalatest" %% "scalatest" % "2.2.4" % "test",
//    slf4jNop,
//    "org.threeten" % "threetenbp" % "1.3",
//    "junit" % "junit" % "4.12" % "test"
//  )
//
//  val sparkVersion = "1.4.1"
//
//  val json : Seq[ModuleID] = Seq(
//    "io.argonaut" %% "argonaut" % "6.0.4",
//    "com.propensive" %% "rapture-json-argonaut" % "1.1.0",
//    "com.typesafe.play" %% "play-json" % "2.4.2")
//
//  val apiDependencies    : Seq[ModuleID] = commonDependencies
//  val domainDependencies : Seq[ModuleID] = commonDependencies
//  val clientDependencies : Seq[ModuleID] = commonDependencies
//  val searchDependencies : Seq[ModuleID] = commonDependencies ++ Seq(
//    "com.sksamuel.elastic4s" %% "elastic4s-core" %  "1.7.0",
//    "com.sksamuel.elastic4s" %% "elastic4s-testkit" % "1.7.0" % "test"
//  )
}