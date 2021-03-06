name := "PlayTest"
 
version := "1.0" 
      
lazy val `playtest` = (project in file(".")).enablePlugins(PlayScala, PlayEbean)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.2"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice ,
  evolutions,
  "com.typesafe.play" %% "anorm" % "2.5.3",
  "com.h2database" % "h2" % "1.4.196")

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

      