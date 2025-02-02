package com.suchiit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suchiit.model.Restaurant;
@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Integer>{

}
