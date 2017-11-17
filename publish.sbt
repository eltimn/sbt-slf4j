pomExtra := {
  <developers>
    <developer>
      <id>eltimn</id>
      <name>Tim Nelson</name>
      <url>https://eltimn.com/</url>
    </developer>
  </developers>
}

publishArtifact in Test := false

homepage := Some(url("https://github.com/eltimn/sbt-slf4j"))
licenses := Seq(("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.txt")))
publishTo := Some("eltimn-maven" at "https://api.bintray.com/maven/eltimn/maven/sbt-slf4j/;publish=1")
bintrayOrganization := Some("eltimn")

publishArtifact in (Compile, packageBin) := true
publishArtifact in (Test, packageBin) := false
publishArtifact in (Compile, packageDoc) := false
publishArtifact in (Compile, packageSrc) := true
