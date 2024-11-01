First-commit=> creating a config package and create SpringBootCourse class inside it.and implements main class with commandLineRunner interface implement run method then create WebAppplicationContext container.

Second-commit=> remove @Component annotation from top of the SpringBootCourse class and create this class object/bean inside a main CustomAutoConfigurationApplication class.

Third-commit=> create AppConfig class and give them @Configuration annotation and make SpringBootCourseBean inside it.

Fourth-commit=> remove @Configuration replace with @AutoConfiguration annotation on top of the AppConfig class. so now we run it give error so we do some configuration which is spring boot follow so Create META-INF folder -> create spring folder inside it-> create org.springframeworkboot.autoconfigure.AutoConfiguration.imports file -> inside it give complete path or qualified path name of your AppConfig class (Just like Spring boot frame work follow same structure) now run the application so everything working fine

Fifth-commit=> create one more class inside autoConfig package called UsrCondition.java So now inside our AppConfig class give @ConditionalOnClass so when we run the application because of @AutoConfiguration our AppConfig class bean going to create but it create only when UsrCondition.java class same class path which you give inside @ConditionalOnClass . you can do one thing first run and see then after deleting UsrCondition class and then run and see this "A component required a bean of type 'com.example.customAutoConfiguration.autoConfig.SpringBootCourse' that could not be found." error will come.

Sixth-commit=> (we can write value=UsrCondition.class instead of name=give class path ) inside @ConditionalOnClass which is inside AppConfig class But difference between writing value or name .But value give compilation error if class is not present inside project name are'nt even class doesn't exist.


Seventh-commit=> now we create SpringBootCourse bean based on @ConditionalOnBean("college") inside AppConfig class. So we create college class and give them @Component annotation to just to show you it is working fine or not . So check after adding then removing college class both cases


Eighth-commit=> remove @Component from top of College class . so till now because we use @component so Spring context will create bean of this class now we create bean of this class manually inside main CustomAutoConfigurationApplication class