package com.suchiit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suchiit.model.Teacher;
@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer>{

}
