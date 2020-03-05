package com.grocerylist.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
	private Integer serialNumber;
	private String name;
	private String type;
	private float price;
	
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Item(int serialNumber, String name, String type, float price) {
		super();
		this.serialNumber = serialNumber;
		this.name = name;
		this.type = type;
		this.price = price;
	}


	public Integer getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}


	public String getName() {
		return name;  
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Item [serialNumber=" + serialNumber + ", name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	
	

}
