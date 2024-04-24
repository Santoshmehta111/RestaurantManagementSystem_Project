package com.spring.restaurantManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restaurantManagement.entity.SpecialList;
import com.spring.restaurantManagement.repository.SpecialListRepository;

@Service
public class SpecialListService {
	
	@Autowired
	private SpecialListRepository special;
	
	public void saveSpecials(SpecialList specialList) {
		special.save(specialList);
	}
	
	public List<SpecialList> getSpecialLists(){
		return special.findAll();
	}
	
	public void deleteById(int id) {
		special.deleteById(id);
	}
}
