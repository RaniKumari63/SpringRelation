package com.suchiit.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Author")
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String name;


@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
@JoinColumn(name="zip_id")
private ZipCode zipcode;

public Author(String name, ZipCode zipcode, List<Book> books) {
	super();
	this.name = name;
	this.zipcode = zipcode;
	this.books = books;
}
@ManyToMany(mappedBy = "categories",cascade=CascadeType.ALL)
private List<Book> books=new ArrayList<Book>();

}
