val scalaJSVersion =
// use Scala.js 1.0  SCALAJS_VERSION=1.0.0-M6
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.28")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.0.0")
