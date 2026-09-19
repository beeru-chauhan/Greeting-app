package com.beeru.Greetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.beeru.Greetings.service.GreetingsService;

@SpringBootApplication
public class GreetingsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(GreetingsApplication.class, args);
		  GreetingsService service = container.getBean(GreetingsService.class);
		 System.out.println( service.generateGreetings("Rishu singh"));
	}

	
}
