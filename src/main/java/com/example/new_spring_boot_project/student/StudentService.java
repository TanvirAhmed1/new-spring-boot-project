package com.example.new_spring_boot_project.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public List<Student> getStudents() {
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
