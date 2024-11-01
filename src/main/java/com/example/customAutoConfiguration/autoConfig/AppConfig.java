package com.example.customAutoConfiguration.autoConfig;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;


/*AutoConfiguration we only use those classes where you do wanted some automatic configuration
    so if we want our bean which is inside this class . that beans created or configure automatically
    so we follow same structure which spring boot follow create META-INF->spring->AutoConfiguration file
 */
@AutoConfiguration
public class AppConfig {
    /*
    * instead of create bean inside main class now we do that creating bean n all configuration we do here
     */

    @Bean
    SpringBootCourse springBootCourse(){
        return new SpringBootCourse();
    }
}
