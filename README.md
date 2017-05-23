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

### 3 Basic pac4j integration
Next the pac4j play integration as added as per https://github.com/pac4j/play-pac4j

Note during this step an attempt was made to clearly delineate all files that were added by placing them in a separate file/folder when possilble.
These files/folders were named "auth" or "pac4j.xxx" whenever possible. When this was not possible comments were added to delineate the pac4j content.
