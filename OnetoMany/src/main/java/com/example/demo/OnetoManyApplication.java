package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OnetoManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(OnetoManyApplication.class, args);
		CourseRepo courseRepo = ctx.getBean(CourseRepo.class);
		StudentRepo stuRepo = ctx.getBean(StudentRepo.class);
		StudentEntity stu=new StudentEntity(); //
		   stu.setSname("arya"); //
		  stu.setSadd("usa"); 
		//  stuRepo.save(stu);
			
			  StudentEntity stu1=new StudentEntity(); stu1.setSname("Jasmin");
			  stu1.setSadd("usa");
			 
		  Set<StudentEntity> studentSet=new HashSet<StudentEntity>(); 
		  studentSet.add(stu); //
		 studentSet.add(stu1); 
		 // stuRepo.save(stu1);
		  CourseEntity course=new CourseEntity(); //
		  course.setCname("Boomi"); 
		   course.setCduration("20"); 
		  course.setCfee("25000");
		  course.setStudents(studentSet);
		  courseRepo.save(course);
	}

}
