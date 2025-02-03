package com.example.asd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Bean;
import com.example.asd.service.DatabaseService;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = "com.example.asd")
@RestController
@Configuration
public class AsdApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsdApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(DatabaseService databaseService) {
		return args -> {
			// Check database connection
			databaseService.checkDatabaseConnection();
		};
	}

	@Bean
	public Validator validator() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		return factory.getValidator();
	}
}
