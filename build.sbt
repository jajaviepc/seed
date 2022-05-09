name := """seed"""
organization := "com.seed"

version := "1.0-SNAPSHOT"

lazy val playSlickVersion = "4.0.2"
lazy val postgresVersion  = "42.2.2"
lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.8"

lazy val circeVersion = "0.12.2"

libraryDependencies ++= Seq(
  guice,
  ws,
  // Logs
  "net.logstash.logback" % "logstash-logback-encoder" % "5.1",
  // Json
  "com.dripower" %% "play-circe"           % "2812.0",
  "io.circe"     %% "circe-core"           % circeVersion,
  "io.circe"     %% "circe-generic"        % circeVersion,
  "io.circe"     %% "circe-parser"         % circeVersion,
  "io.circe"     %% "circe-generic-extras" % circeVersion,

  "com.typesafe.play" %% "play-slick"            % playSlickVersion,
  "org.postgresql"    % "postgresql"  % postgresVersion,
  // Test
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
  )