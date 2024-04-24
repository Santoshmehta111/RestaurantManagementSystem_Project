package com.spring.restaurantManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restaurantManagement.entity.Employee;
import com.spring.restaurantManagement.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	
	private EmployeeRepository eRepo;
	public void save(Employee e) {
		eRepo.save(e);
	}
	
	public List<Employee> getAllItems(){
		return eRepo.findAll();
	}
	public Employee getEmployeeById(int id) {
		return eRepo.findById(id).get();
	}
	public void deleteById(int id) {
		eRepo.deleteById(id);
	}
}


