
package com.suchiit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suchiit.model.Student;
import com.suchiit.repo.StudentRepo;
import com.suchiit.service.StudenService;
@Service
public class StudentServiceImpl implements StudenService{
@Autowired
private StudentRepo studentrepo;
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
	studentrepo.save(student);	
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentrepo.save(student);
	}

	@Override
	public void deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		
		studentrepo.deleteById(studentId);
	}

	@Override
	public Student getById(int studentId) {
		// TODO Auto-generated method stub
		return studentrepo.findById(studentId).get();
		
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}

	@Override
	public List<Student> getByDepartment(String depatment) {
		// TODO Auto-generated method stub
		return studentrepo.findByDepartment(depatment);
	}

}
