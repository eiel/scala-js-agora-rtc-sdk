object ScalacOptions {
  val basic: Seq[String] = Seq(
    "-feature",
    "-deprecation",
    "-unchecked",
    "-encoding",
    "UTF-8",
    "-Xfatal-warnings",
    "-language:_",
    // Warn when dead code is identified.
    "-Ywarn-dead-code",
    // Warn when numerics are widened.
    "-Ywarn-numeric-widen",
  )

  val forScala212: Seq[String] = Seq(
    // Warn if an argument list is modified to match the receiver
    "-Ywarn-adapted-args",
    // Warn about inaccessible types in method signatures.
    "-Ywarn-inaccessible",
    // Warn when a type argument is inferred to be `Any`.
    "-Ywarn-infer-any",
    // Warn when non-nullary `def f()' overrides nullary `def f'
    "-Ywarn-nullary-override",
    // Warn when nullary methods return Unit.
    "-Ywarn-nullary-unit",
    // Warn when imports are unused.
    "-Ywarn-unused-import",
  )

  val forScalaJS06: Seq[String] = Seq(
    "-P:scalajs:sjsDefinedByDefault",
  )
}
