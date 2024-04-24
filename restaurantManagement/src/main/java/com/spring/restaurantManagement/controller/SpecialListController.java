package com.spring.restaurantManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.restaurantManagement.service.SpecialListService;

@Controller
public class SpecialListController {
	
	@Autowired
	private SpecialListService specialService;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		specialService.deleteById(id);
		return "redirect:/today_special";
	}

}
