package com.suchiit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suchiit.model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long>{

}
