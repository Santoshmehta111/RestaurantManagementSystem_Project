package com.spring.restaurantManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.restaurantManagement.entity.Menu;
import com.spring.restaurantManagement.repository.MenuRepository;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Flow.Publisher;

@Service
public class MenuService {
	
	@Autowired
	
	private MenuRepository mRepo;
	public void save(Menu m) {
		mRepo.save(m);
	}
	
	public List<Menu> getAllItems(){
		return mRepo.findAll();
	}
	public Menu getMenubyId(int id) {
		return mRepo.findById(id).get();
	}
	public void deleteById(int id) {
		mRepo.deleteById(id);
	}
}
