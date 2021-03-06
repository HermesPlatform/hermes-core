name := """hermes-core"""
organization := "hermesplatform.core"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies += "org.apache.ignite" % "ignite-core" % "2.9.1"
libraryDependencies += "org.apache.ignite" % "ignite-spring" % "2.9.1"
libraryDependencies += "org.hibernate.ogm" % "hibernate-ogm-bom" % "5.4.1.Final"
libraryDependencies += "org.hibernate.ogm" % "hibernate-ogm-ignite" % "5.3.1.Final"
libraryDependencies += "org.hibernate.javax.persistence" % "hibernate-jpa-2.1-api" % "1.0.2.Final"
libraryDependencies += "org.jboss.narayana.jta" % "narayana-jta" % "5.9.2.Final"
libraryDependencies += "org.apache.ignite" % "ignite-hibernate-core"% "2.9.1"

cancelable in Global := true
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "hermesplatform.core.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "hermesplatform.core.binders._"