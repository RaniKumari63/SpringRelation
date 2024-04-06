package com.suchiit;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.suchiit.entity.Post;
import com.suchiit.entity.Tag;
import com.suchiit.repo.PostRepo;
import com.suchiit.repo.TagRepo;

@SpringBootApplication
public class ManytoManyApplication implements CommandLineRunner {
 @Autowired
 private PostRepo postrepo;
// @Autowired
// private TagRepo tagrepo;
	public static void main(String[] args) {
		SpringApplication.run(ManytoManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		Post post=new Post("post1","post1","post1");
		//Set<Post> allpost=new HashSet<Post>();
		//allpost.add(post);
		Tag tag1=new Tag("tag1");
		Tag tag2=new Tag("tag2");
		//Set<Tag> allTags=new HashSet<Tag>();
		//allTags.add(tag1);
		//allTags.add(tag2);
		//add tag references post
		//post.setTags(allTags);
		post.getTags().add(tag1);
		post.getTags().add(tag2);
		//add post references tag
		
		//tag1.setPosts(allpost);
		tag1.getPosts().add(post);
		tag2.getPosts().add(post);
		this.postrepo.save(post);
		
		
	}

}
