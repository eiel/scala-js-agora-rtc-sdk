lazy val scala212 = "2.12.11"
lazy val scala213 = "2.13.0"

ThisBuild / organization := "info.eiel"
ThisBuild / scalaVersion := scala213
ThisBuild / crossScalaVersions := Seq(scala212, scala213)

ThisBuild / scalacOptions ++= ScalacOptions.basic
ThisBuild / scalacOptions ++= (CrossVersion.partialVersion(scalaVersion.value) match {
  case Some((2, 12)) => ScalacOptions.forScala212
  case _             => Seq()
})
ThisBuild / scalacOptions ++= {
  if (scalaJSVersion.startsWith("1.0")) ScalacOptions.forScalaJS06.filter(_ != "-P:scalajs:sjsDefinedByDefault")
  else ScalacOptions.forScalaJS06
}

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin).settings(
    name := "Scala.js facade for AgoraRTC SDK(Web)",
  )

publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging,
)
