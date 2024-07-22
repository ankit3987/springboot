# Getting Started

### Java Setup
* [Install Java 17](https://www.oracle.com/in/java/technologies/downloads/#jdk17-windows)

Locate JDK -> C:\Program Files\Java\jdk-17

Set the JAVA_HOME variable via the command line

Run Command Prompt as an Administrator

setx /m JAVA_HOME "C:\Program Files\Java\jdk-17"
echo %JAVA_HOME%
java --version

### Reference Documentation
* [Spring Initializr](https://start.spring.io/)
  Select the following dependencies that will be required for the tutorial:
  - Web / Spring Web
  - SQL / Spring Data JDBC 
  - SQL / H2 Database

* [Kotlin Project](https://kotlinlang.org/docs/jvm-create-project-with-spring-boot.html)

  - http://localhost:8080/static
  - http://localhost:8080
  - http://localhost:8080/hello?name=Inder
  - http://localhost:8080/messages
  - http://localhost:8080/notes

### Running H2 
  - http://localhost:8080/h2-console

### Run Command
`./gradlew bootRun`

### Build Command
`./gradlew build`
  
### Fundamentals

[Top 6 Most Popular API Architecture Styles](https://www.youtube.com/watch?v=4vLxWqE94l4)
[The Right Way To Build REST APIs](https://www.youtube.com/watch?v=CVBpYfPKGlE)
[Reactive REST API With Spring, Kotlin, and Coroutines](https://www.youtube.com/watch?v=ORPWK0NSPiw)
