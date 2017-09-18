package com.cs.app.model;

import java.util.Set;

import com.cs.app.Utility;

public abstract class Canvas {

	private char[][] arr;
	private int row;
	private int col;
	boolean isCanvasInitialized = false;
	Set<Character> colorsAdded;

	public abstract void populate();

	public void drawCanvas() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == Utility.RECT_INTERNAL) {
					System.out.print(' ');
				} else
					System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public boolean isCanvasInitialized() {
		return isCanvasInitialized;
	}

	public char[][] getArr() {
		return arr;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public void setArr(char[][] arr) {
		this.arr = arr;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public void addColor(Character colorCode) {
		colorsAdded.add(colorCode);
	}

}
