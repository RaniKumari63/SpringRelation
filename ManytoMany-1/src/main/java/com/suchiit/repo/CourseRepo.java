package com.suchiit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suchiit.entity.Course;



@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

}