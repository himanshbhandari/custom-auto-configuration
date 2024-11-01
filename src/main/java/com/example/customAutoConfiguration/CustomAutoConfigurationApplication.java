package com.example.customAutoConfiguration;

import com.example.customAutoConfiguration.autoConfig.SpringBootCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
public class CustomAutoConfigurationApplication implements CommandLineRunner {

	@Autowired
	WebApplicationContext container;
	public static void main(String[] args) {
		SpringApplication.run(CustomAutoConfigurationApplication.class, args);
		//this run method internally create container-> this create WebApplicationContext (spring contaienr) behind the schene

	}

	/**first main method will run application will bootstraping and application context and container will created
	 * once all thing done then below run method is automatically called by spring boot. so this is calld back method called by framework automatically
	 **/
	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello world....");
		SpringBootCourse springBootCourse=container.getBean(SpringBootCourse.class);//this give bean or object of SpringBootCourse class
		springBootCourse.showSpringBootCourseDetails();
	}

	//give this method name as same as which you define inside @ConditionalOnBean which is inside AppConfig
	@Bean(name="college") // so when you specify same name here which you give @ConditionalOnBean so then you write below method name anything
	College college(){ //if you method name here collegexyz instead of college so it doesn't work
		return new College();
	}
}
