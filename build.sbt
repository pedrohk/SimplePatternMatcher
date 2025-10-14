ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.7.3"

lazy val root = (project in file("."))
  .settings(
    name := "SimplePatternMatcher",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % Test
  )
