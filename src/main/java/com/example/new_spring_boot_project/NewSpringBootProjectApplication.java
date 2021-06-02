package com.example.new_spring_boot_project;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.new_spring_boot_project.student.Student;

@SpringBootApplication
@RestController
public class NewSpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewSpringBootProjectApplication.class, args);
	}
	
	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(
						1L,
						"Tanvir",
						"tanvirnoor38@gmail.com",
						LocalDate.of(1994, Month.OCTOBER, 4),
						26
						)
				);
	}

}
