# JVM Boilerplate
> A boilerplate for test-driven development on the JVM using IntelliJ

## Project overview

The boilerplate is designed for job interviews, code retreats or for in-house practise. Required for the project
is a [Java Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) version 8 or later and [Maven](https://maven.apache.org/) both available on the command line.

Current language support includes Java 8 and Kotlin.

Also included is a `jvm.iml` to startup for coding with [Intellij IDEA](https://www.jetbrains.com/idea/).

### Maven targets

- Run all tests: `mvn test` or `mvn test -q` for test output only
- Build jar-artifact: `mvn install`
- Run java application: `mvn exec:java` or `mvn exec:java -q` for application output only

## License

This project is licensed under [Apache License 2.0](LICENSE).
