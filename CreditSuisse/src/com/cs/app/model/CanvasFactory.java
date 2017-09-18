package com.cs.app.model;

/**
 * Factory for creating CAnvas Object.
 * 
 * @author Vikram Chhajer
 *
 */
public class CanvasFactory {

	public static Item getCanvas(String input) throws IllegalArgumentException {
		String[] inputArr = input.trim().split(" ");
		Dimension dimension;

		switch (inputArr[0]) {
		case "C":
			if (inputArr.length == 3) {
				dimension = new Dimension(inputArr[1], inputArr[2]);
				return new BasicCanvas(dimension);
			} else {
				throw new IllegalArgumentException();
			}
		default:
			throw new IllegalArgumentException();
		}
	}
}
