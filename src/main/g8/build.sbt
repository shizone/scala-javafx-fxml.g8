name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$2.10.2$"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "$scalatest_version$"
)

initialCommands := "import $package$._"

