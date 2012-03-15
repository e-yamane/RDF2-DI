
libraryDependencies += "com.novocode" % "junit-interface" % "0.8" % "test -> default"

seq(rdf.settings : _*)

seq(jacoco.settings : _*)

testListeners <<= target.map(t => Seq(new eu.henkelmann.sbt.JUnitXmlTestsListener(t.getAbsolutePath)))
