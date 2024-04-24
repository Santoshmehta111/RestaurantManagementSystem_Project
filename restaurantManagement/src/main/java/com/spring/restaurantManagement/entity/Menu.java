package com.spring.restaurantManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String item_name;
	private String item_type;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	

	public String getItem_type() {
		return item_type;
	}

	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Menu(int id, String item_name, String item_type, double price) {
		super();
		this.id = id;
		this.item_name = item_name;
		this.item_type = item_type;
		this.price = price;
	}

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
