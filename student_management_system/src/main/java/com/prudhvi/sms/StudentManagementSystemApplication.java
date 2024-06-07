package com.prudhvi.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prudhvi.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student(123 ,"Virat" , "Kohli" , "virat123@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student(124 , "Rohit" , "Sharma" , "rohit123@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student(125 , "Surya" , "yadav" , "surya123@gmail.com");
//		studentRepository.save(student3);
	}

}
