name := "sbt-slf4j"
organization := "com.eltimn"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.25",
  "org.scala-sbt" %% "util-logging" % sbtVersion.value % "provided"
)

enablePlugins(GitVersioning)
