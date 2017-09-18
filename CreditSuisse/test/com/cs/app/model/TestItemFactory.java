package com.cs.app.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestItemFactory {

	String input;

	@Test(expected = IllegalArgumentException.class)
	public void testIllegalArgumentException() {
		String input = "q";
		ItemFactory.getItem(input);
	}

	@Test
	public void testRectangleCreation() {
		String input = "R 1 1 20 10";
		Item c = ItemFactory.getItem(input);
		assertTrue(c instanceof Rectangle);
	}

	@Test(expected = NullPointerException.class)
	public void testRectanglePopulationFailed() {
		String input = "R 1 1 20 10";
		Item c = ItemFactory.getItem(input);
		c.populateCanvas(null);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testRectanglePopulation() {
		Canvas canvas = new BasicCanvas(10, 5);
		String input = "R 1 1 20 10";
		Item c = ItemFactory.getItem(input);
		c.populateCanvas(canvas);
	}

	@Test
	public void testRectanglePopulation2() {
		Canvas canvas = new BasicCanvas(10, 5);
		String input = "R 1 1 8 5";
		Item c = ItemFactory.getItem(input);
		c.populateCanvas(canvas);
	}

	@Test
	public void testLineCreation() {
		String input = "L 1 1 20 10";
		Item c = ItemFactory.getItem(input);
		assertTrue(c instanceof LineItem);
	}

	@Test(expected = NullPointerException.class)
	public void testLinePopulationFailed() {
		String input = "L 1 1 20 10";
		Item c = ItemFactory.getItem(input);
		c.populateCanvas(null);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testLinePopulation() {
		Canvas canvas = new BasicCanvas(10, 5);
		String input = "L 1 1 20 10";
		Item c = ItemFactory.getItem(input);
		c.populateCanvas(canvas);
	}

	@Test
	public void testLinePopulation2() {
		Canvas canvas = new BasicCanvas(10, 5);
		String input = "L 1 1 8 1";
		Item c = ItemFactory.getItem(input);
		c.populateCanvas(canvas);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testLinePopulation3() {
		Canvas canvas = new BasicCanvas(10, 5);
		String input = "L 1 1 8 4";
		Item c = ItemFactory.getItem(input);
		c.populateCanvas(canvas);
	}

}
