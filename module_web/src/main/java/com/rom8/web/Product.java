package com.rom8.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.rom8.ejb.Entity;
import com.rom8.ejb.RetrieveData;

@ManagedBean(name="product", eager = true)
@SessionScoped
public class Product implements Serializable {

	private static final long serialVersionUID = 875764664L;

	@EJB
	private RetrieveData retrieveData;
	
	private String name;
	private double price;
	private String description;
	
	public Product(){
	}
	
	public Product(String name, double price, String description) {
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
	
	public List<Product> getProducts(){
		List<Product> result = new ArrayList<Product>();
		for(Entity entity: retrieveData.getAllGoods()){
			result.add(new Product(entity.getName(), entity.getPrice(), entity.getDescription()));
		}
		return result;
	}
	
	public String addProduct(){
		retrieveData.addGood(new Entity(name, price, description));
		return null;
	}
}
