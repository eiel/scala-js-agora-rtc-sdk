lazy val scala212 = "2.12.8"
lazy val scala213 = "2.13.0-RC1"

ThisBuild / organization := "info.eiel"
ThisBuild / scalaVersion := scala212
ThisBuild / crossScalaVersions := Seq(scala212, scala213)

ThisBuild / scalacOptions ++= ScalacOptions.basic
ThisBuild / scalacOptions ++= (CrossVersion.partialVersion(scalaVersion.value) match {
  case Some((2, 12)) => ScalacOptions.forScala212
  case _ => Seq()
})
ThisBuild / scalacOptions ++= ScalacOptions.forScalaJS

lazy val root = (project in file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(
    name := "Scala.js facade for AgoraRTC SDK(Web)",
  )

publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)