package com.rom8.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.rom8.ejb.Cart;
import com.rom8.ejb.Entity;
import com.rom8.ejb.RetrieveData;

@ManagedBean(name="product", eager = true)
@SessionScoped
public class Product implements Serializable {

	private static final long serialVersionUID = 875764664L;

	@EJB
	private RetrieveData retrieveData;
	
	@EJB
	private Cart cart;
	
	private List<Product> products;
	
	private String name;
	private double price;
	private String description;
	private boolean added;
	
	@PostConstruct
	protected void before(){
		products = new ArrayList<Product>();
		for(Entity entity: retrieveData.getAllGoods()){
			products.add(new Product(entity.getName(), entity.getPrice(), entity.getDescription()));
		}
		System.out.println("I WAS CALLED! " + new Date());
	}
	
	public Product(){
	}
	
	public Product(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
		added = false;
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
	
	public boolean isAdded() {
		return added;
	}
	
	public void setAdded(boolean added) {
		this.added = added;
	}
	
	public List<Product> getProducts(){
		return products;
	}
	
	public String addProduct(){
		retrieveData.addGood(new Entity(name, price, description));
		return null;
	}
	
	public String addProductToCart(){
		cart.getEntities();		//will be exception, go to cart
		added = true;
		return null;
	}
}
