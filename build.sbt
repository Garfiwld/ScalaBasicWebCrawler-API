lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """ScalaBasicWebCrawler-API""",
    organization := "com.example",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.6",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
      "com.google.code.gson" % "gson" % "2.8.7",
      "org.jsoup" % "jsoup" % "1.14.1"
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )



