package com.suchiit;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="subject89")
public class Subject {
	
	
	@ManyToMany
	@JoinTable(name="student_erolled",
	 joinColumns =@JoinColumn(name="subject_id")  ,
	 inverseJoinColumns = @JoinColumn(name="student_id"))
	//subject has many students
	private Set<Student> enrolledStudents=new HashSet<>();
	private String name;
	@Id
	@GenericGenerator(name="myGenerator",strategy="increment")
	@GeneratedValue(strategy=GenerationType.AUTO,generator = "myGenerator")
	private long id;
	
}
