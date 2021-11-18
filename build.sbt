name := "ScalaExperiment"

version := "0.1"

scalaVersion := "2.11.8"

val testcontainersScalaVersion = "0.36.0"

libraryDependencies ++= Seq(
   "com.dimafeng" %% "testcontainers-scala-scalatest" % testcontainersScalaVersion % "test",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "com.dimafeng" %% "testcontainers-scala-mssqlserver" % testcontainersScalaVersion % "test",
  "com.microsoft.sqlserver" % "mssql-jdbc" % "7.2.1.jre8"
)