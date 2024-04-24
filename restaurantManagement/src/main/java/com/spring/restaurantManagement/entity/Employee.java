package com.spring.restaurantManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String emp_name;
	
	private String emp_desgn;
	
	private String emp_phn_no;
	
	private String emp_email_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_desgn() {
		return emp_desgn;
	}

	public void setEmp_desgn(String emp_desgn) {
		this.emp_desgn = emp_desgn;
	}

	public String getEmp_phn_no() {
		return emp_phn_no;
	}

	public void setEmp_phn_no(String emp_phn_no) {
		this.emp_phn_no = emp_phn_no;
	}

	public String getEmp_email_id() {
		return emp_email_id;
	}

	public void setEmp_email_id(String emp_email_id) {
		this.emp_email_id = emp_email_id;
	}

	public Employee(int id, String emp_name, String emp_desgn, String emp_phn_no, String emp_email_id) {
		super();
		this.id = id;
		this.emp_name = emp_name;
		this.emp_desgn = emp_desgn;
		this.emp_phn_no = emp_phn_no;
		this.emp_email_id = emp_email_id;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
