package com.cs.app.model;

import com.cs.app.Utility;
/**
 * Create Rectangle on Canvas
 * @author Vikram Chhajer
 *
 */
public class Rectangle implements Item {

	int startX, startY, endX, endY;

	public Rectangle(Dimension dimension) {
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
			System.out.println("Rectangle does not fit into Canvas. Please enter proper dimensions");
			throw new IllegalArgumentException();
		}

		for (int i = startY; i <= endY; i++) {
			for (int j = startX; j <= endX; j++) {
				if (i == startY || i == endY || j == startX || j == endX) {
					arr[i][j] = Utility.RECT_SYMBOL;
				} else {
					arr[i][j] = Utility.RECT_INTERNAL;
				}
			}
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}
}
