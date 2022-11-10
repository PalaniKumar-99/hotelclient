package com.example.demo.model;

import java.io.Serializable;

public class Rooms implements Serializable
{
	private Integer id;
	
	private String displayName;
	
	private Integer quantity;
	
	private Double price;
	

	public Rooms() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rooms(Integer id, String displayName, Integer quantity, Double price) {
		super();
		this.id = id;
		this.displayName = displayName;
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
