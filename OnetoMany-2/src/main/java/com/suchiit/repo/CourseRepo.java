package com.suchiit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.suchiit.entity.CourseEntity;
import com.suchiit.entity.StudentEntity;
import com.suchiit.helper.StudentCourse;

@Repository
public interface CourseRepo extends JpaRepository<CourseEntity, Long> {

	@Query("select new  com.suchiit.helper.StudentCourse(s.sno,s.sname,s.sadd,c.cname,c.cduration,c.cfee) from com.suchiit.entity.StudentEntity s,com.suchiit.entity.CourseEntity c")
	List<StudentCourse> getStudentInfo();

}
