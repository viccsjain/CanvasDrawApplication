package com.cs.app.model;

/**
 * Dimensions for All items.
 * @author Vikram Chhajer
 *
 */
public class Dimension {

	int x1 = 0;
	int y1 = 0;
	int x2 = 0;
	int y2 = 0;

	public Dimension(String x2, String y2) {
		super();
		this.x2 = Integer.valueOf(x2);
		this.y2 = Integer.valueOf(y2);
	}

	public Dimension(String x1, String y1, String x2, String y2) {
		super();
		int t1 = Integer.valueOf(x1);
		int t2 = Integer.valueOf(x2);
		if (t1 > t2) {
			this.x1 = t2;
			this.x2 = t1;
		} else {
			this.x2 = t2;
			this.x1 = t1;
		}

		t1 = Integer.valueOf(y1);
		t2 = Integer.valueOf(y2);
		if (t1 > t2) {
			this.y1 = t2;
			this.y2 = t1;
		} else {
			this.y2 = t2;
			this.y1 = t1;
		}

	}

}
