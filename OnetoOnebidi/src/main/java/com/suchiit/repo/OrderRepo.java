package com.suchiit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suchiit.model.Order;
@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {

}
