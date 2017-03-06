# gradle-issue-1498
Test project for https://github.com/gradle/gradle/issues/1498

Build is successful when Gradle 3.1 is used.
> gradle build
:compileJava UP-TO-DATE
:compileScala
:processResources UP-TO-DATE
:classes
:findMainClass
:jar
:bootRepackage
:assemble
:compileTestJava
:compileTestScala UP-TO-DATE
:processTestResources UP-TO-DATE
:testClasses
:test
2017-03-06 09:05:46.621  INFO 4432 --- [       Thread-6] ationConfigEmbeddedWebApplicationContext : Closing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@52f8264a: startup date [Mon Mar 06 09:05:39 SGT 2017]; root of context hierarchy
2017-03-06 09:05:46.622  INFO 4432 --- [       Thread-9] o.s.w.c.s.GenericWebApplicationContext   : Closing org.springframework.web.context.support.GenericWebApplicationContext@3e45681e: startup date [Mon Mar 06 09:05:44 SGT 2017]; root of context hierarchy
:check
:build

BUILD SUCCESSFUL

Total time: 30.402 secs

Failes when Gradle 3.4 is used:
> c:\gradle-3.4\bin\gradle build
:compileJava NO-SOURCE
:compileScala
C:\git_wa\gs-spring-boot\complete\src\main\java\hello\HelloController.java:13: error: cannot find symbol
        log.info("Before return");
        ^
  symbol:   variable log
  location: class HelloController
1 error
:compileScala FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileScala'.
> javac returned nonzero exit code

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.

BUILD FAILED

Total time: 9.199 secs
