package com.suchiit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suchiit.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

List<Student> findByDepartment(String department);
}
