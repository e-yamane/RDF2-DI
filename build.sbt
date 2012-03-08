//import de.johoop.jacoco4sbt._
//import JacocoPlugin._

//no mean

name := "rdf2-di"

description := "Rough Diamond Framework DI Container"

organization := "jp.rough_diamond"

version := "2.0.1"

scalaVersion := "2.9.1"

javacOptions ++= Seq("-encoding", "UTF-8")

libraryDependencies +=  "org.slf4j"             %   "jcl-over-slf4j"    % "1.6.2"

libraryDependencies +=  "junit"                 %   "junit"             % "4.10"    % "test"

libraryDependencies +=  "com.novocode"          %   "junit-interface"   % "0.8"     % "test -> default"

seq(jacoco.settings : _*)

testListeners <<= target.map(t => Seq(new eu.henkelmann.sbt.JUnitXmlTestsListener(t.getAbsolutePath)))