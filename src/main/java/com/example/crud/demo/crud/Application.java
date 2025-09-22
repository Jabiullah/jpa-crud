package com.example.crud.demo.crud;

import com.example.crud.demo.crud.dao.StudentDAO;
import com.example.crud.demo.crud.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//System.out.println("Main Function");
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
			//System.out.println("Hello World!");

			//createStudent(studentDAO);

			//createMultipleStudents(studentDAO);

			readStudent(studentDAO);
		};
	}

	private void readStudent(StudentDAO studentDAO) {
		// Create a student object
		System.out.println("Creating new student...");
		Student student = new Student("Karim","Fayez","karim@gmail.com");
		// Save the student
		studentDAO.save(student);
		System.out.println("Student Saved.");
		// Display the student
		int theId = student.getId();

		// Retrieve student based on the id: PK
		Student myStudent = studentDAO.findById(theId);
		// display Student
		System.out.println(myStudent);
	}


	private void createStudent(StudentDAO studentDAO) {
		//create student object
		System.out.println("Creating Student");
		Student tempStudent = new Student("Paul", "Willam","paul@gmail.com");
		//save the student object
		studentDAO.save(tempStudent);
		System.out.println("Saving the Student");
		//display the id of the saved student
		System.out.println("Saved Student id: "+tempStudent.getId());
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating Student Objects");
		Student tempStudent = new Student("Rabius", "Sani","rabius@gmail.com");
		Student tempStudent2 = new Student("Zoya", "Akter","zoya@gmail.com");
		Student tempStudent3 = new Student("Zareen", "Khan","Zareen@gmail.com");

		System.out.println("Saving students");
		studentDAO.save(tempStudent);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		System.out.println("Completed..");
	}
}
