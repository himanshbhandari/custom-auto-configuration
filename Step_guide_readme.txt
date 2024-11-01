First-commit=> creating a config package and create SpringBootCourse class inside it.and implements main class with commandLineRunner interface implement run method then create WebAppplicationContext container.

Second-commit=> remove @Component annotation from top of the SpringBootCourse class and create this class object/bean inside a main CustomAutoConfigurationApplication class.

Third-commit=> create AppConfig class and give them @Configuration annotation and make SpringBootCourseBean inside it.

Fourth-commit=> remove @Configuration replace with @AutoConfiguration annotation on top of the AppConfig class. so now we run it give error so we do some configuration which is spring boot follow so Create META-INF folder -> create spring folder inside it-> create org.springframeworkboot.autoconfigure.AutoConfiguration.imports file -> inside it give complete path or qualified path name of your AppConfig class (Just like Spring boot frame work follow same structure) now run the application so everything working fine
