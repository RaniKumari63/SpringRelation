package com.example.demo;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="studententity1")
public class StudentEntity {
@Id
@GenericGenerator(name = "myGenerator",strategy = "increment")
@GeneratedValue(strategy = GenerationType.AUTO,generator ="myGenerator")
private long sno;
private String sname;
private String sadd;
}
