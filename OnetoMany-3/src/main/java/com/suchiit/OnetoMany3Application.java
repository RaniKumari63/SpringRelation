package com.suchiit;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OnetoMany3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(OnetoMany3Application.class, args);
	StudentRepo stimpl=ctx.getBean(StudentRepo.class);
	SubjectRepo  subimpl=ctx.getBean(SubjectRepo.class);
		
	/*
	 * Student stu=new Student(); Student stu1=new Student(); Subject sub=new
	 * Subject(); Subject sub1=new Subject(); stu.setName("st1");
	 * stu1.setName("st2"); sub.setName("sub1"); Set<Student> allStudents=new
	 * HashSet<Student>(); allStudents.add(stu); allStudents.add(stu1);
	 * sub.setEnrolledStudents(allStudents); sub1.setName("sub2"); Set<Subject>
	 * allsubjects=new HashSet<Subject>(); allsubjects.add(sub1);
	 * stu.setSubjects(allsubjects); stimpl.save(stu); //subimpl.save(sub);
	 */	}

}
