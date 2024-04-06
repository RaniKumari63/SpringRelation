package com.suchiit;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.suchiit.entity.ConsumerEntity;
import com.suchiit.entity.ProductEntity;
import com.suchiit.repo.ConsumerRepo;
import com.suchiit.repo.ProductRepo;



@SpringBootApplication
public class OnetoMany1Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(OnetoMany1Application.class, args);
		
		ConsumerRepo consumerepo=ctx.getBean(ConsumerRepo.class);
		ProductRepo productrepo=ctx.getBean(ProductRepo.class);
	
		ConsumerEntity consumer=new ConsumerEntity();
		consumer.setCname("aaa");
		consumer.setCadd("hyd");
		
		
		ConsumerEntity consumer1=new ConsumerEntity();
		consumer.setCname("bbb");
		consumer.setCadd("viz");	
		ConsumerEntity consumer2=new ConsumerEntity();
		consumer.setCname("ccc");
		consumer.setCadd("vijaya");
		 Set<ConsumerEntity> studentSet=new HashSet<ConsumerEntity>(); 
		 studentSet.add(consumer2);
		 studentSet.add(consumer);
		 studentSet.add(consumer1);
		ProductEntity product1=new ProductEntity();
		
		product1.setPname("ppp");
		product1.setPqty(8);
		product1.setConsumers(studentSet);
		productrepo.save(product1);
		
	}

}

