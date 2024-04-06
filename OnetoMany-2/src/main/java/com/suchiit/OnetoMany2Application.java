package com.suchiit;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.suchiit.entity.CourseEntity;
import com.suchiit.entity.StudentEntity;
import com.suchiit.helper.StudentCourse;
import com.suchiit.repo.CourseRepo;
import com.suchiit.repo.StudentRepo;

@SpringBootApplication
public class OnetoMany2Application {

	public static void main(String[] args) {
		
ConfigurableApplicationContext ctx=SpringApplication.run(OnetoMany2Application.class, args);

	CourseRepo courseimpl=ctx.getBean(CourseRepo.class);
	StudentRepo studentimpl=ctx.getBean(StudentRepo.class);

	/*
	 * StudentEntity stu=new StudentEntity();
	 * 
	 * stu.setSname("malli"); stu.setSadd("hyd"); StudentEntity stu1=new
	 * StudentEntity(); stu1.setSname("rani"); stu1.setSadd("hyd");
	 * 
	 * Set<StudentEntity> allstudents=new HashSet<StudentEntity>();
	 * allstudents.add(stu1); allstudents.add(stu); CourseEntity cus=new
	 * CourseEntity(); cus.setCname("SpringBoot"); cus.setCduration("80days");
	 * cus.setCfee(200000); cus.setStudents(allstudents); courseimpl.save(cus);
	 */
	List<StudentCourse> studentInfo=courseimpl.getStudentInfo();
	
	studentInfo.forEach(System.out::println);
	for(StudentCourse sc:studentInfo)
	{
		System.out.println("ffffffffffff"+sc);
	}
	}

}
