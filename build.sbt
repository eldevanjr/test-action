name := "test-action"

version := "0.3"

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