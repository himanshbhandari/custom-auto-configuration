package com.example.customAutoConfiguration.autoConfig;

import org.springframework.stereotype.Component;

@Component //because @SpringBootApplication internally have @component scan so that create bean of this class when application start
public class SpringBootCourse {
    public void showSpringBootCourseDetails(){
        System.out.println("------------ Spring boot course Details ----------");
        System.out.println("1. spring boot foundation ");
        System.out.println("2. spring boot mvc");
        System.out.println("3. spring boot rest");
        System.out.println("4. spring boot webflux");
    }
}
