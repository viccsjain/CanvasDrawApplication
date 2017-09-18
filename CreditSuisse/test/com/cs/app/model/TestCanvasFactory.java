package com.cs.app.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCanvasFactory {

	String input;

	@Test(expected = IllegalArgumentException.class)
	public void testIllegalArgumentException() {
		String input = "q";
		CanvasFactory.getCanvas(input);
	}

	@Test
	public void testCanvasCreation() {
		String input = "C 40 8";
		Item c = CanvasFactory.getCanvas(input);
		assertTrue(c instanceof BasicCanvas);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCanvasCreationFailed() {
		String input = "C 40";
		CanvasFactory.getCanvas(input);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidArgument1() {
		String input = "c 40";
		CanvasFactory.getCanvas(input);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidArgument2() {
		String input = "C";
		CanvasFactory.getCanvas(input);
	}


}
