package com.suchiit.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suchiit.entity.ProductEntity;
@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Integer>{

}
