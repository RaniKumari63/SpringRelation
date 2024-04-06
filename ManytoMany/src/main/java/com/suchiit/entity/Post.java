package com.suchiit.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name="posts")
public class Post {
	@Id
	@GenericGenerator(name="myGenerstor",strategy="increment")
	@GeneratedValue(strategy = GenerationType.AUTO,generator="myGenerstor")
private  long id;
private String title;
private String descripton;
private String content;
public Post(String title, String descripton, String content) {
	super();
	this.title = title;
	this.descripton = descripton;
	this.content = content;
}

private Date postedAt=new Date();
private Date lastUpdatedAt=new Date();

@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
@JoinTable(name="post_tags",
joinColumns= { @JoinColumn(name="post_id")},
inverseJoinColumns = {@JoinColumn(name="tag_id")}

		
		)
private Set<Tag> tags=new HashSet<Tag>();

}
