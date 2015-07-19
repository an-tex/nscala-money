import sbt._
import Keys._

object Dependencies {
  // Versions
  object V {
    val jodaMoney   = "0.10.0"
    val jodaConvert = "1.2"
    val play        = "2.4.2"
    val scalacheck  = "1.11.6"
  }

  // Libraries
  val jodaMoney   = "org.joda"          %  "joda-money"   % V.jodaMoney
  val jodaConvert = "org.joda"          %  "joda-convert" % V.jodaConvert
  val playJson    = "com.typesafe.play" %% "play-json"    % V.play        % "provided"
  val scalacheck  = "org.scalacheck"    %% "scalacheck"   % V.scalacheck  % "test"

  // Projects
  val commonDependencies   = Seq(scalacheck)
  val coreDependencies     = Seq(jodaMoney, jodaConvert)
  val playJsonDependencies = Seq(playJson)
}