# play-pac4j-slick
Sample Play project coded in Scala that uses pac4j for authentication and slick to store user information

## Creation Steps
The following steps were used creating this project.

### 1 initialization
Project was initialized via "sbt new playframework/play-scala-seed.g8" see [Play Seeds](https://www.playframework.com/download#seeds) for more details.

### 2 Intellij import
When the project was imported into intellij there was an [error](http://stackoverflow.com/questions/33203437/sbt-compilation-for-play-framework-2-x-disabled-by-default) which the following intellij config changed fixed

Preferences > Languages & Frameworks > Play2
Under 'Compiler' enable 'Use Play 2 compiler for this project'