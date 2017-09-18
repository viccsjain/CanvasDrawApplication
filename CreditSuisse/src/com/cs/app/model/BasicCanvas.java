package com.cs.app.model;

import java.util.LinkedHashSet;

import com.cs.app.Utility;

public class BasicCanvas extends Canvas implements Item {
	int col;
	int row;

	public BasicCanvas(Dimension dimensions) {
		col = dimensions.x2 + 2;
		row = dimensions.y2 + 2;
		init();

	}

	public BasicCanvas(int width, int height) {
		col = width + 2;
		row = height + 2;
		init();
	}

	private void init() {
		char[][] arr = new char[row][col];
		setArr(arr);
		setCol(col);
		setRow(row);
		isCanvasInitialized = true;
		colorsAdded = new LinkedHashSet<>();
	}

	public void populateCanvas(Canvas canvas) {
		int col = canvas.getCol();
		int row = canvas.getRow();
		char arr[][] = canvas.getArr();

		// Populate matrix with desired values.
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == 0 || i == row - 1) {
					arr[i][j] = Utility.CANVAS_X;
				} else if (j == 0 || j == col - 1) {

					arr[i][j] = Utility.CANVAS_Y;
				} else {
					arr[i][j] = Utility.CANVAS_INTERNAL;
				}
			}
		}
	}

	public void populate() {

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Canvas";
	}

}
