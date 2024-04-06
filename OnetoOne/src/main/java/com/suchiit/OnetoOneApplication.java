package com.suchiit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.suchiit.model.Address;
import com.suchiit.model.Student;
import com.suchiit.model.Teacher;
import com.suchiit.repo.StudentRepo;
import com.suchiit.service.StudenService;
import com.suchiit.service.impl.StudentServiceImpl;

@SpringBootApplication
public class OnetoOneApplication implements CommandLineRunner {
@Autowired
	private StudenService studentservice;
	public static void main(String[] args) {
		SpringApplication.run(OnetoOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	Address address=new Address("hyde","andhra");	
	Teacher teacher=new Teacher("t1111","ddddddd");
	Student stu =new Student("aaaa","Mech",address,teacher);
	studentservice.addStudent(stu);
	Student student=studentservice.getById(1);
	System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getDepartment()+"\t"+student.getAddress().getCity()+"\t"+student.getAddress().getState());
	System.out.println(student);
	student.setDepartment("ggggg");
	
	//Address naddress=student.getAddress();
	//naddress.setCity("aaa");
	//naddress.setState("bbb");
	
	studentservice.updateStudent(student);
	System.out.println(student);
	studentservice.getAll().forEach(System.out::println);
	studentservice.getByDepartment("Mech").forEach(System.out::println);
	}

}
