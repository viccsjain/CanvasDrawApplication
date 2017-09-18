package com.cs.app.model;

public class ColourCanvas implements Item {

	int startX = 1, startY = 1, endX, endY;
	char colorCode;

	public ColourCanvas(Dimension dimension, char colorCode) {
		endX = dimension.x2;
		endY = dimension.y2;
		this.colorCode = colorCode;
	}

	public void fillColor(Canvas canvas) {
		int col = canvas.getCol();
		int row = canvas.getRow();
		char arr[][] = canvas.getArr();
		if (startX > col || endY > row || endX > col || startY > row) {
			System.out.println("Dimensions are out of Canvas.");
			throw new IllegalArgumentException();
		}

		for (int i = startY; i <= endY; i++) {
			for (int j = startX; j <= endX; j++) {
				if (arr[i][j] == ' ' || canvas.colorsAdded.contains(arr[i][j]))
					arr[i][j] = colorCode;
			}
		}
		canvas.addColor(colorCode);
	}

	public void populateCanvas(Canvas canvas) {
		fillColor(canvas);
	}

	public String getName() {
		return "Color";
	}
}
