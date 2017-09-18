package com.cs.app.model;

/**
 * Parent Factory for all Other Factories.
 * 
 * @author Vikram Chhajer
 *
 */
public class AbstractFactory {

	public static Item getItem(String inputLine) {
		String[] arr = inputLine.split(" ");

		if (arr[0].equals("C")) {
			return CanvasFactory.getCanvas(inputLine);
		} else {
			return ItemFactory.getItem(inputLine);
		}
	}
}
