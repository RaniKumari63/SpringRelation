package com.suchiit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="teacher89")
public class Teacher {

	private String name;
	@Id
	@GenericGenerator(name="myGenerator",strategy="increment")
	@GeneratedValue(strategy=GenerationType.AUTO,generator = "myGenerator")
	private long id;
	
}
