package com.rom8.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.rom8.storage.Good;
import com.rom8.storage.Warehouse;

/**
 * Session Bean implementation class RetrieveDataBean
 */
@Stateless
public class RetrieveDataBean implements RetrieveData {

	private Warehouse warehouse = new Warehouse();
	
    public RetrieveDataBean() {
    }

	@Override
	public List<Entity> getAllGoods() {
		List<Entity> entities = new ArrayList<Entity>();
		for(Good good: warehouse.getGoods()){
			entities.add(new Entity(good.getName(), good.getPrice(), good.getDescription()));
		}
		return entities;
	}

	@Override
	public boolean addGood(Entity entity) {
		List<Entity> entities = getAllGoods();
		if(entities.contains(entity)){
			return false;
		}else{
//			entities.add(entity);
			warehouse.getGoods().add(new Good(entity.getName(), entity.getPrice(), entity.getDescription()));
			return true;
		}
	}

}
