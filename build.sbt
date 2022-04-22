import Dependencies._

ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "scala-library-usage-sample01",
    libraryDependencies += "com.example" %% "scala-library-sample-001" % "0.4.7-SNAPSHOT",
    libraryDependencies += scalaTest % Test
  )

githubOwner := "thachi"
githubRepository := "scala-library-sample001"
githubTokenSource := {
  if (sys.env.contains("GITHUB_TOKEN")) TokenSource.Environment("GITHUB_TOKEN")
  else TokenSource.GitConfig("github.token")
}

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
