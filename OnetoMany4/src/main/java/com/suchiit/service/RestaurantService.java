package com.suchiit.service;

import java.util.List;

import com.suchiit.model.Restaurant;

public interface RestaurantService {
Restaurant addRestaurant(Restaurant restaurant);
void updateRestaurant(Restaurant restaurant);
void deleteRestaurant(int restaurantId);
List<Restaurant>getAll();
Restaurant getById(int restaurantId);

List<Restaurant> getByCity(String City);
List<Restaurant> getByType(String type);


List<Restaurant> getByItemName(String itemName);
List<Restaurant> getByCuisine(String cuisine);
}
