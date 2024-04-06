package com.suchiit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suchiit.entity.ConsumerEntity;
@Repository
public interface ConsumerRepo extends JpaRepository<ConsumerEntity, Integer>{
	
	

}
