val scalaJSVersion =
// use Scala.js 1.0  SCALAJS_VERSION=0.6.32
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.0.1")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.0.0")
