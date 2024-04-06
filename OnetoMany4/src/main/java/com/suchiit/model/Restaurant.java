
package com.suchiit.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Restaurant {
	
	@Id
	@SequenceGenerator(name="restaurant_gen",sequenceName = "restaurant_seq",initialValue = 100,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "restaurant_gen")
private int restaurantId;
	@Column(length=30)
private String restaurantName;
	@Column(length=10)
private String type;
	@Column(length=30)
private String city;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="res_item")
	Set<Item> items;
	public Restaurant(String restaurantName, String type, String city, Set<Item> items) {
		super();
		this.restaurantName = restaurantName;
		this.type = type;
		this.city = city;
		this.items = items;
	}

}
