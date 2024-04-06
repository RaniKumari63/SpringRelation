package com.suchiit.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="tags")
public class Tag {
	public Tag(String name) {
		super();
		this.name = name;
	}
	@Id
	@GenericGenerator(name="myGenerstor",strategy="increment")
	@GeneratedValue(strategy = GenerationType.AUTO,generator="myGenerstor")
private long id;
private String name;
@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "tags")
private Set<Post> posts=new HashSet<Post>();
}
