package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.app.Employee;
import com.app.Student;
import com.app.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Number of Beans: "+applicationContext.getBeanDefinitionCount());
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		System.out.println("Beans Names:");
		for (String string : beanDefinitionNames) {
			System.out.println(string);
		}
		
		Employee employee = applicationContext.getBean(Employee.class);
		System.out.println(employee);
		
		Student student = applicationContext.getBean(Student.class);
		System.out.println(student);
	}
}
