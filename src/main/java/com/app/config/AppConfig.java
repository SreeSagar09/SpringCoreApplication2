package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.Employee;
import com.app.Student;

@Configuration
public class AppConfig {
	
	@Bean
	public Employee getEmployee() {
		Employee employee = new Employee(102, "Michel", 28, "Software Tester");
		return employee;
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student(1101, "Lissa", 26, "Cyber Security");
		return student;
	}
}
