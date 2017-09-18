package com.cs.app.model;

import com.cs.app.Utility;

public class LineItem implements Item {

	int startX, startY, endX, endY;

	public LineItem(Dimension dimension) {
		startX = dimension.x1;
		startY = dimension.y1;
		endX = dimension.x2;
		endY = dimension.y2;
	}

	@Override
	public void populateCanvas(Canvas canvas) {

		int col = canvas.getCol();
		int row = canvas.getRow();
		char arr[][] = canvas.getArr();

		if (startX > col || endY > row || endX > col || startY > row) {
			System.out.println("Line does not fit into Canvas. Please enter proper dimensions");
			throw new IllegalArgumentException();
		}
		if (startX == endX) {
			for (int i = startY; i <= endY; i++) {
				arr[i][startX] = Utility.LINE_SYMBOL;
			}
		} else if (startY == endY) {
			for (int j = startX; j <= endX; j++) {
				arr[startY][j] = Utility.LINE_SYMBOL;
			}
		} else {
			System.err.println("Line can be drawn either Vertical or Horizontal");
			throw new IllegalArgumentException();
		}

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Line";
	}
}
