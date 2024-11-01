package com.example.customAutoConfiguration.autoConfig;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;


/*I only want to trigger this AppConfig class based on condition if when i have class here called UsrCondition.java
 */
@AutoConfiguration
@ConditionalOnClass(value=UsrCondition.class)
public class AppConfig {
    /*
    * instead of create bean inside main class now we do that creating bean n all configuration we do here
     */

    @Bean
    SpringBootCourse springBootCourse(){
        return new SpringBootCourse();
    }
}
