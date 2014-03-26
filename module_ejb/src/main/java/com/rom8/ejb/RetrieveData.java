package com.rom8.ejb;

import java.util.List;

import javax.ejb.Local;

@Local
public interface RetrieveData {
	List<Entity> getAllGoods();
	boolean addGood(Entity entity);
}
