package com.spring.restaurantManagement.controller;

import com.spring.restaurantManagement.entity.Employee;
import com.spring.restaurantManagement.entity.Menu;
import com.spring.restaurantManagement.entity.SpecialList;
import com.spring.restaurantManagement.service.EmployeeService;
import com.spring.restaurantManagement.service.MenuService;
import com.spring.restaurantManagement.service.SpecialListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class restaurantController {

    @Autowired
    private MenuService menuService;
    
    
    @Autowired
    private SpecialListService specialService;
    
    
    @Autowired
    private EmployeeService employeeService;
    

    
    @GetMapping("/")
	public String home() {
		return "home";
	}

     @GetMapping("/add_items")
     public String addItems() {
    	 return "addItems";
     }
     
     @GetMapping("/menu_card")
     public ModelAndView getAllItems() {
    	 
    	 List<Menu> list = menuService.getAllItems();
    	 
    	 return new ModelAndView("itemList","menu", list);
     }
     
     @PostMapping("/save")
     public String addMenu(@ModelAttribute Menu m) {
    	 menuService.save(m);
    	 return "redirect:/menu_card";
     }
     
     @GetMapping("/today_special")
     public String getSpecialitems(Model model) {
    	 
    	 List<SpecialList> list = specialService.getSpecialLists();
    	 model.addAttribute("menu",list);
    	 return "specialList";
     }
     
     @RequestMapping("/mylist/{id}")
     public String getMyList(@PathVariable("id") int id) {
    	 Menu m = menuService.getMenubyId(id);
    	 SpecialList sl =new SpecialList(m.getId(),m.getItem_name(),m.getItem_type(),m.getPrice());
    	 specialService.saveSpecials(sl);
    	 return "redirect:/today_special";
     }
     
     @RequestMapping("/editMenu/{id}")
     public String editMenu(@PathVariable("id") int id, Model model) {
    	 Menu m = menuService.getMenubyId(id);
    	 model.addAttribute("menu",m);
    	 return "itemEdit";
     }
     
     @RequestMapping("/deleteMenu/{id}")
     public String deleteMenu(@PathVariable("id")int id) {
    	 menuService.deleteById(id);
    	 return "redirect:/menu_card";
     }
     
     @GetMapping("/add_employees")
     public String addEmployees() {
    	 return "addEmployees";
     }
     
     @GetMapping("/emp_list")
     public ModelAndView getAllEmployees() {
    	 
    	 List<Employee> list = employeeService.getAllItems();

    	 return new ModelAndView("employeeList","employee", list);
     }
     
     @PostMapping("/save1")
     public String addEmployee(@ModelAttribute Employee e) {
    	 employeeService.save(e);
    	 return "redirect:/emp_list";
     }
     @RequestMapping("/editEmployee/{id}")
     public String editEmployee(@PathVariable("id") int id, Model model) {
    	 Employee e = employeeService.getEmployeeById(id);
    	 model.addAttribute("employee",e);
    	 return "employeeEdit";
     }
     
     @RequestMapping("/deleteEmployee/{id}")
     public String deleteEmployee(@PathVariable("id")int id) {
    	 employeeService.deleteById(id);
    	 return "redirect:/emp_list";
     }
     
     
     
     
     
     

}
