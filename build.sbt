name := ReactiveWebMissileBuild.NamePrefix + "root"

version := "1.0"

scalaVersion := "2.12.2"

lazy val common = project.
  settings(Common.settings: _*)

lazy val visualisation = project.
//  dependsOn(common).
  enablePlugins(ScalaJSPlugin).
  settings(Common.settings: _*).
  settings(scalaJSUseMainModuleInitializer := true).
  settings(libraryDependencies ++= Dependencies.scalaJs)

lazy val cluster = project.
  dependsOn(common).
  settings(Common.settings: _*)

lazy val root = (project in file(".")).
  aggregate(common, visualisation, cluster)
        