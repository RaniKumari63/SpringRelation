 package com.suchiit.service;

import java.util.List;

import com.suchiit.model.Student;

public interface StudenService {
void addStudent(Student student);
void updateStudent(Student student);
void deleteStudent(int studentId);
Student getById(int studentId);
List<Student>getAll();
List<Student> getByDepartment(String depatment);
}
