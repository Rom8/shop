package com.rom8.storage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Warehouse {
	
	private static final List<Good> goods = new ArrayList<Good>(Arrays.asList(
		new Good("Seba IGOR Freestyle Skates", 599),
		new Good("Seba TRX 90 Freestyle Skates", 755),
		new Good("Seba Kim Sung-Jin KSJ Slalom Skates", 345),
		new Good("Seba High Light 80 Skates", 123),
		new Good("Seba Skates Seba High Black ", 234),
		new Good("Rollerblade Macroblade 90 Skates", 345),
		new Good("Rollerblade Maxxum 90 Black", 567),
		new Good("Fila NRK SD", 987),
		new Good("Fila NRK JP BLACK", 879),
		new Good("Fila NRK BX", 999),
		new Good("Fila NRK ST", 679),
		new Good("Fila Matrix Evolution", 990),
		new Good("Fila M 110", 455),
		new Good("Fila NINE 100", 1050),
		new Good("Fila PRIMO AIR WAVE MEN", 444)
		));
	
	public List<Good> getGoods(){
		return goods;
	}
		
}
