name := "test-action"

version := "0.1"

scalaVersion := "2.13.6"

Compile/mainClass := Some("com.test.Main")

githubOwner := "eldevanjr"
githubRepository := "test-action"
githubTokenSource := TokenSource.GitConfig("github.token")