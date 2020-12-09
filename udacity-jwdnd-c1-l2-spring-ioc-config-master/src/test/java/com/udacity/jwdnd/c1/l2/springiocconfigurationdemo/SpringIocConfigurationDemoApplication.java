package com.udacity.jwdnd.c1.l2.springiocconfigurationdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class SpringIocConfigurationDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringIocConfigurationDemoApplication.class, args);
	}
	
	@Primary
	@Bean
	public String basicMessage() {
		System.out.println("Inside basic message");
		return "Hello";
	}
	
	@Bean
	public String compoundMessage(String basicMessage) {
		System.out.println("Inside compound message, received="+basicMessage);
		return basicMessage+", Spring";
	}
	
	@Bean
	public int countMessage (String message) {
		return message.length();
	}
	
	/**
	 * When there are multiple beans that satisfy a specific dependency, 
	 * Spring's auto-configuration needs some help to decide which to use. 
	 * A common solution is to mark a bean with the @Primary annotation to indicate a universally-preferred bean for its type.
	 *  Or, you can use pairs of @Qualifier annotations on beans and the dependencies that reference 
	 *  them to gain a finer level of control.
	 */

}
