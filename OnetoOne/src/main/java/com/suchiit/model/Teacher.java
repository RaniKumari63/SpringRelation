package com.suchiit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Teacher {
	
	//@SequenceGenerator(name="teacher_gen",sequenceName="tec_seq",initialValue = 1,allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacherId;
private String name;
private String designation;
public Teacher(String name, String designation) {
	super();
	
	this.name = name;
	this.designation = designation;
}
//@OneToOne(mappedBy = "teacher")
//private Student student;
}
