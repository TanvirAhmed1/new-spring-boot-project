package com.example.new_spring_boot_project;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NewSpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewSpringBootProjectApplication.class, args);
	}
	
	@GetMapping
	public List<String> hello() {
		return List.of("Hello", "World");
	}

}
