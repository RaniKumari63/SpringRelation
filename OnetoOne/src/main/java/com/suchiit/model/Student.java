package com.suchiit.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Student {

	public Student(String studentName, String department, Address address,Teacher teacher) {
		super();
		this.studentName = studentName;
		this.department = department;
		this.address = address;
		this.teacher=teacher;
	}
	@Id
	@SequenceGenerator(name="stu_gen",sequenceName = "stu_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "stu_gen")
	
	private int studentId;
	private String studentName;
	private String department;
	//save the child ref before saving the parent ref
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	Address address;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="teacher_id")
	Teacher teacher;
	
}
