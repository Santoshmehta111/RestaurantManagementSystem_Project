package com.spring.restaurantManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.restaurantManagement.entity.SpecialList;

@Repository
public interface SpecialListRepository extends JpaRepository<SpecialList, Integer> {
	
}
