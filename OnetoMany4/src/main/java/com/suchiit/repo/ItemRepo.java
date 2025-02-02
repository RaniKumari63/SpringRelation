package com.suchiit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suchiit.model.Item;
@Repository
public interface ItemRepo extends JpaRepository<Item, Integer> {

}
