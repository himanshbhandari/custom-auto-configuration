package com.example.customAutoConfiguration.autoConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // this annotation tell this class contain beans
public class AppConfig {
    /*
    * instead of create bean inside main class now we do that creating bean n all configuration we do here
     */

    @Bean
    SpringBootCourse springBootCourse(){
        return new SpringBootCourse();
    }
}
