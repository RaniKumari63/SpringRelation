package com.suchiit.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cou")
public class CourseEntity {
	
	@GenericGenerator(name="myGenerator",strategy="increment")
	@GeneratedValue(strategy=GenerationType.AUTO,generator = "myGenerator")
	@Id
private int cid;
private String cname;
private String cduration;
private int cfee;
@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
private Set<StudentEntity> students;
}
