package com.suchiit.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="Zipcode")
public class ZipCode {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="zip_id")
private long id;
private String name;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="city_id")
private City city;
public ZipCode(String name, City city) {
	super();
	this.name = name;
	this.city = city;
}

}
