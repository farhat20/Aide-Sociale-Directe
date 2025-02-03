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

@SpringBootApplication(scanBasePackages = "com.example.demo")
@RestController
@Configuration
public class ASDApplication {

	public static void main(String[] args) {
		SpringApplication.run(ASDApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(DatabaseService databaseService) {
		return args -> {
			// Check database connection
			databaseService.checkDatabaseConnection();
		};
	}

	// ✅ Fix: Register a Validator Bean to resolve "No target Validator set" issue
	@Bean
	public Validator validator() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		return factory.getValidator();
	}
}
