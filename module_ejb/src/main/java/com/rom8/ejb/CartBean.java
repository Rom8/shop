package com.rom8.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class CartBean
 */
@Stateful
public class CartBean implements Cart {

	private List<Entity> entities = new ArrayList<Entity>();
	
	//TODO init entities in PosrConstruct, add dependency, 
	
    public CartBean() {
    }

    @Override
    public List<Entity> getEntities() {
		return entities;
	}


	@Override
	public boolean addToCart(Entity entity) {
		if(entities.contains(entity)){
			return false;
		}else{
			entities.add(entity);
			return true;
		}
	}

	@Override
	public boolean remove(Entity entity) {
		return entities.remove(entity);
	}

	@Override
	@Remove
	public void purchase() {
		//TODO add to orders
	}
		
}
