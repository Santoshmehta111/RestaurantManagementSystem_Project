package com.spring.restaurantManagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.restaurantManagement.entity.Menu;
@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer>{
	
}
