enablePlugins(ScalaJSPlugin)

name := "reactive-web-missile"

version := "1.0"

scalaVersion := "2.12.2"

resolvers += Resolver.sonatypeRepo("snapshots")

scalaJSUseMainModuleInitializer := true
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"
//libraryDependencies += "com.github.ahnfelt" % "react4s_2,11" % "0.8.4-SNAPSHOT"
//libraryDependencies += "org.scala-js" % "scalajs-dom_2.11" % "0.9.0"
        