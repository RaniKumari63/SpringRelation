package com.suchiit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.suchiit.model.Item;
import com.suchiit.model.Restaurant;
import com.suchiit.service.RestaurantService;

@SpringBootApplication
public class OnetoMany4Application implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(OnetoMany4Application.class, args);
	}
@Autowired
	private RestaurantService restaurantservice;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Item item1=new Item("dosa","breakfast","si",100);
		Item item2=new Item("friedrice","maincourse","chinese",200);
		Item item3=new Item("Noodles","maincourse","chinese",300);
		/*
		 * Set<Item> items=new HashSet<Item>(); items.add(item1); items.add(item2);
		 * items.add(item3);
		 */
		
		
		
		Set<Item> items=new HashSet<Item>(Arrays.asList(item1,item2,item3)); 
	
		Restaurant restaurant=new Restaurant("taj","non-veg","hyd",items);
	
	restaurantservice.addRestaurant(restaurant);
	Restaurant restaurant1=restaurantservice.getById(100);
	restaurant1.getItems().forEach(System.out::println);
	}

}
