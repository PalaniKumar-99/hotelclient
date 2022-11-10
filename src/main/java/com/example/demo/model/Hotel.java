package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

public class Hotel implements Serializable {

	private Integer id;

	private String name;

	private Integer zipCode;

	private String description;

	private boolean isActive;

	private List<Rooms> rooms;
	

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(Integer id, String name, Integer zipCode, String description, boolean isActive, List<Rooms> rooms) {
		super();
		this.id = id;
		this.name = name;
		this.zipCode = zipCode;
		this.description = description;
		this.isActive = isActive;
		this.rooms = rooms;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public List<Rooms> getRooms() {
		return rooms;
	}

	public void setRooms(List<Rooms> rooms) {
		this.rooms = rooms;
	}
	
	
}
