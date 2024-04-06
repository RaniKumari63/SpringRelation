package com.suchiit.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "STUDENT")
public class Student {
	@Id
	@GenericGenerator(name = "myGenerator",strategy = "increment")
	@GeneratedValue(strategy = GenerationType.AUTO,generator ="myGenerator")
	@Column(name="SNO")
private int sno;
private String sname;
private String sadd;

@ManyToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
@JoinTable(
		
		name="student_course", joinColumns= {@JoinColumn(name="s_no",referencedColumnName = "SNO")},
				
				
		inverseJoinColumns = {@JoinColumn(name="c_no",referencedColumnName = "CID")}
		
		
		)
private List<Course> clist=new ArrayList<Course>();
}
