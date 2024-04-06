package com.suchiit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suchiit.entity.Tag;
@Repository
public interface TagRepo extends JpaRepository<Tag, Long>{

}
