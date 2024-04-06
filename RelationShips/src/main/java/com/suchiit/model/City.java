package com.suchiit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "City")
public class City {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="city_id")
	private long id;
	private String name;
	public City(String name) {
		super();
		this.name = name;
	}
	
}
