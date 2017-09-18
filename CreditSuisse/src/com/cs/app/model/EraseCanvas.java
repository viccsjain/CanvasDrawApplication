package com.cs.app.model;

/**
 * Erase Content of Canvas
 * @author 531651
 *
 */
public class EraseCanvas implements Item {

	public EraseCanvas() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void populateCanvas(Canvas canvas) {
		// Populate matrix with desired values.
		int col = canvas.getCol();
		int row = canvas.getRow();
		char arr[][] = canvas.getArr();
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == 0 || i == row - 1) {
					arr[i][j] = '-';
				} else if (j == 0 || j == col - 1) {
					arr[i][j] = '|';
				} else {
					arr[i][j] = ' ';
				}
			}
		}
	}



	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
