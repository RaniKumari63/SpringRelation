package com.suchiit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suchiit.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
