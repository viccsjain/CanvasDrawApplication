package com.cs.app.model;

import com.cs.app.Utility;

public class ItemFactory {

	public static Item getItem(String input) {
		String[] inputArr = input.trim().split(" ");
		Dimension dimension;

		switch (inputArr[0]) {
		case "R":
			if (inputArr.length == 5) {
				dimension = new Dimension(inputArr[1], inputArr[2], inputArr[3], inputArr[4]);
				Rectangle item = new Rectangle(dimension);
				return item;
			} else {
				throw new IllegalArgumentException("R x1 y1 x2 y2");
			}
		case "L":
			if (inputArr.length == 5) {
				dimension = new Dimension(inputArr[1], inputArr[2], inputArr[3], inputArr[4]);
				LineItem item = new LineItem(dimension);
				return item;
			} else {
				throw new IllegalArgumentException("L x1 y1 x2 y2");
			}
		case "B":
			if (inputArr.length == 4) {
				char c = inputArr[3].charAt(0);
				if (!Utility.isResevedColor(c)) {
					dimension = new Dimension(inputArr[1], inputArr[2]);
					ColourCanvas item = new ColourCanvas(dimension, c);
					return item;
				} else {
					System.err.println("Can not use Reserved Color. Please use other color");
					throw new IllegalArgumentException();
				}
			} else {
				throw new IllegalArgumentException("B x2 y2 o");
			}
		case "Q":
			return new QuitCanvas();
		case "E":
			return new EraseCanvas();

		default:
			throw new IllegalArgumentException(String.valueOf(inputArr[0]));
		}
	}

}
