package com.example.exercise2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Exercise2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercise2Application.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "Hello from DevOps NM exercise 2!";
	}

	@GetMapping("/status")
	public String status() {
		return "Application is running fine.";
	}
}
