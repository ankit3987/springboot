# Getting Started

### Reference Documentation
* [Spring Initializr](https://start.spring.io/)
  Select the following dependencies that will be required for the tutorial:
  - Web / Spring Web
  - SQL / Spring Data JDBC 
  - SQL / H2 Database

* [Kotlin Project](https://kotlinlang.org/docs/jvm-create-project-with-spring-boot.html)
  

### Java Setup
* [Install Java 17](https://www.oracle.com/in/java/technologies/downloads/#jdk17-windows)

Locate JDK -> C:\Program Files\Java\jdk-17

Set the JAVA_HOME variable via the command line

Run Command Prompt as an Administrator

setx /m JAVA_HOME "C:\Program Files\Java\jdk-17"
echo %JAVA_HOME%
java --version

### Run Command
./gradlew bootRun

### Open Browser
http://localhost:8080?name=John