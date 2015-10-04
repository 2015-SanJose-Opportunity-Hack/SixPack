name := """downtown-street"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.29"


libraryDependencies += "net.coobird" % "thumbnailator" % "0.4.8"

libraryDependencies += "com.twilio.sdk" % "twilio-java-sdk" % "5.2.1"

