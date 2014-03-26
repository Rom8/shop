package com.rom8.storage;

import static org.junit.Assert.*;

import org.junit.Test;

public class GoodTest {

	Good good1a = new Good("Rollerblade Twister Le 2013", 12672);
	Good good1b = new Good("Rollerblade Twister Le 2013", 12672);
	Good good1c = new Good("Rollerblade TWISTER Le 2013", 555);
	Good good2 = new Good("Rollerblade Fusion 84 2013", 9933);

	@Test
	public void testHashCode() {
		assertTrue(good1a.hashCode() == good1c.hashCode());
	}

	@Test
	public void testEqualsObject() {
		assertTrue(good1a.equals(good1b));
		assertTrue(good1a.equals(good1c));
		assertTrue(good1b.equals(good1c));
		assertFalse(good1a.equals(good2));
	}

}
