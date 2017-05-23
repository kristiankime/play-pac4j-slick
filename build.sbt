name := """play-pac4j-slick"""
organization := "com.artclod"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.11"

libraryDependencies += filters
libraryDependencies += cache
//libraryDependencies += "com.typesafe.play" % "play-cache_2.11" % "2.5.4"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test

// === Start Pac4j includes ===, example project here https://github.com/pac4j/play-pac4j-scala-demo
libraryDependencies += "org.pac4j"  % "play-pac4j"      % "3.0.0"                                      withSources() withJavadoc()
libraryDependencies += "org.pac4j"  % "pac4j-http"      % "2.0.0"                                      withSources() withJavadoc()
libraryDependencies += "org.pac4j"  % "pac4j-cas"       % "2.0.0"                                      withSources() withJavadoc()
libraryDependencies += "org.pac4j"  % "pac4j-openid"    % "2.0.0" exclude("xml-apis" , "xml-apis")     withSources() withJavadoc()
libraryDependencies += "org.pac4j"  % "pac4j-oauth"     % "2.0.0"                                      withSources() withJavadoc()
libraryDependencies += "org.pac4j"  % "pac4j-saml"      % "2.0.0"                                      withSources() withJavadoc()
libraryDependencies += "org.pac4j"  % "pac4j-oidc"      % "2.0.0" exclude("commons-io" , "commons-io") withSources() withJavadoc()
libraryDependencies += "org.pac4j"  % "pac4j-gae"       % "2.0.0"                                      withSources() withJavadoc()
libraryDependencies += "org.pac4j"  % "pac4j-jwt"       % "2.0.0" exclude("commons-io" , "commons-io") withSources() withJavadoc()
libraryDependencies += "org.pac4j"  % "pac4j-ldap"      % "2.0.0"                                      withSources() withJavadoc()
libraryDependencies += "org.pac4j"  % "pac4j-sql"       % "2.0.0"                                      withSources() withJavadoc()
libraryDependencies += "org.pac4j"  % "pac4j-mongo"     % "2.0.0"                                      withSources() withJavadoc()
libraryDependencies += "org.pac4j"  % "pac4j-stormpath" % "2.0.0"                                      withSources() withJavadoc()
libraryDependencies += "commons-io" % "commons-io"      % "2.5"
// === End Pac4j includes ===

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.artclod.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.artclod.binders._"
