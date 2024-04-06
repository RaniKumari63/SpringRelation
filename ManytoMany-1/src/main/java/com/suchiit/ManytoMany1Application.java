package com.suchiit;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.suchiit.entity.Course;
import com.suchiit.entity.Student;
import com.suchiit.repo.CourseRepo;
import com.suchiit.repo.StudentRepo;



@SpringBootApplication
public class ManytoMany1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext  ctx=	SpringApplication.run(ManytoMany1Application.class, args);
	
	
		com.suchiit.repo.CourseRepo courseRepo = ctx.getBean(CourseRepo.class);
		com.suchiit.repo.StudentRepo stuRepo=ctx.getBean(StudentRepo.class);
		
		Course course=new Course();
		Course course1=new Course();
		
		course.setCname("angular");
		course.setCduration("30");
		course.setCfee(25000);
		
		course1.setCname("Spring");
		course1.setCduration("25");
		course1.setCfee(35000);
		
		List<Course> addCourses=		new ArrayList<Course>();
		
		addCourses.add(course);
		addCourses.add(course1);
		
		
		Student s1=new Student();
		
		s1.setSname("rani");
		s1.setSadd("usa");
		s1.setClist(addCourses);
		
Student s2=new Student();
		
		s2.setSname("kumari");
		s2.setSadd("hyd");
		s2.setClist(addCourses);
		
		stuRepo.save(s1);
		stuRepo.save(s2);
		
	}

}
