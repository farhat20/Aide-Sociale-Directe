package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DatabaseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@RestController
public class DemoApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//	}
//
//	@GetMapping
//	public String hello() {
//		return "Hello World ";
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(DatabaseService databaseService) {
		return args -> {
			// Check database connection
			databaseService.checkDatabaseConnection();
		};
	}


}
