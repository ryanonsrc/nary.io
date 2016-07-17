organization := "io.nary"

name := "site"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.6"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
  "org.http4s" % "http4s-blazeserver_2.11" % "0.7.0",
  "org.http4s" %% "http4s-blazeclient"  % "0.7.0",
  "org.http4s" % "http4s-argonaut_2.11" % "0.7.0",
  "org.http4s" % "http4s-dsl_2.11" % "0.7.0"
)
