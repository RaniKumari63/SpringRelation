package com.suchiit.model;

import javax.persistence.Column;
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
public class Item {
	@Id
	@SequenceGenerator(name="item_gen",sequenceName = "item_seq",initialValue = 100,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "item_gen")
private int itemId;
@Column(name="itemname",length = 20)
private String itemName;
@Column(length=20)
private String category;
@Column(length = 20)
private String cuisine;
private double price;

public Item(String itemName, String category, String cuisine, double price) {
	super();
	this.itemName = itemName;
	this.category = category;
	this.cuisine = cuisine;
	this.price = price;
}

}
