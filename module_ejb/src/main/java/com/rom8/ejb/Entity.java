package com.rom8.ejb;

import java.util.Locale;

public class Entity {
	
	private String name;
	private double price;
	private String description;
	
	public Entity(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
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
		if(!(obj instanceof Entity)){
			return false;
		}
		Entity good = (Entity) obj;
		return name.equalsIgnoreCase(good.name);
	}
	
	@Override
	public int hashCode() {
		return name.toUpperCase(Locale.ENGLISH).hashCode();
	}
	
}
