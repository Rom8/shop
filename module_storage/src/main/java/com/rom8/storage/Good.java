package com.rom8.storage;

import java.util.Locale;

public class Good {

	private String name;
	private String description;
	private double price;
	
	public Good(String name, double price){
		this(name, price, "");
	}
	
	public Good(String name, double price, String description) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this){
			return true;
		}
		if(!(obj instanceof Good)){
			return false;
		}
		Good good = (Good) obj;
		return name.equalsIgnoreCase(good.name);
	}
	
	@Override
	public int hashCode() {
		return name.toUpperCase(Locale.ENGLISH).hashCode();
	}
}
