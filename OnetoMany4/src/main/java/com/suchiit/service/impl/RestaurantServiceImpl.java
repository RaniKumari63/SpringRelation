package com.suchiit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suchiit.model.Restaurant;
import com.suchiit.repo.ItemRepo;
import com.suchiit.repo.RestaurantRepo;
import com.suchiit.service.RestaurantService;
@Service
public class RestaurantServiceImpl implements RestaurantService{
@Autowired
private RestaurantRepo restaurantrepo;
private ItemRepo itemrepo;
	@Override
	public Restaurant addRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return restaurantrepo.save(restaurant);
	}

	@Override
	public void updateRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		restaurantrepo.save(restaurant);
	}

	@Override
	public void deleteRestaurant(int restaurantId) {
		// TODO Auto-generated method stub
		restaurantrepo.deleteById(restaurantId);
	}

	

	@Override
	public Restaurant getById(int restaurantId) {
		// TODO Auto-generated method stub
		return restaurantrepo.findById(restaurantId).get();
	}

	@Override
	public List<Restaurant> getByCity(String City) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getByItemName(String itemName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getAll() {
		// TODO Auto-generated method stub
		return restaurantrepo.findAll();
	}

}
