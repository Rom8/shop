package com.rom8.ejb;

import java.util.List;

import javax.ejb.Local;

@Local
public interface Cart {
	List<Entity> getEntities();
	boolean addToCart(Entity entity);
	boolean remove(Entity entity);
	void purchase();
}
