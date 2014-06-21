name := "UppwerLowerBound"

organization := "com.github.tnoda"

version := "0.0.1"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.0" % "test" withSources() withJavadoc())

initialCommands := "import com.github.tnoda._"
