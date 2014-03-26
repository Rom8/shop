package com.rom8.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.rom8.storage.Good;

/**
 * Session Bean implementation class RetrieveDataBean
 */
@Stateless
public class RetrieveDataBean implements RetrieveData {

    public RetrieveDataBean() {
    }

	@Override
	public List<Entity> getAllGoods() {
		List<Entity> entities = new ArrayList<Entity>();
		for(Good good: Entity.list){
			entities.add(new Entity(good.getName(), good.getPrice(), good.getDescription()));
		}
		return entities;
	}

}
