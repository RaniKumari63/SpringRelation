package com.suchiit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
@Id
@SequenceGenerator(name="add_gen",sequenceName = "add_seq",initialValue = 1,allocationSize = 1)
@GeneratedValue(strategy = GenerationType.AUTO,generator = "add_gen")

private int addressId;
private String city;
private String state;
}
