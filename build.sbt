organization := "com.iservport"

name := "sbt-iservport"

version := "0.4"

crossPaths := false

scalaVersion := "2.13.6"

Compile/mainClass := Some("com.test.Main")

//githubOwner := "eldevanjr"
//githubRepository := "test-action"
//githubTokenSource := TokenSource.GitConfig("github.token")

publishTo := Some("GitHub eldevanjr Apache Maven Packages" at "https://maven.pkg.github.com/eldevanjr/test-action")
publishMavenStyle := true
credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  "eldevanjr",
  System.getenv("GITHUB_TOKEN")
)
