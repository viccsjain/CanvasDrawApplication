package com.cs.app.model;

/**
 * Marker object to Quit Application
 * @author Vikram Chhajer
 *
 */
public class QuitCanvas implements Item {

	public QuitCanvas() {
		System.out.println("\n\t\tThanks for using Canvas.\n\n");
	}

	// Marker Class. Do not perform any operation.
	// Or perform any operation which are required
	// When application quit.

	@Override
	public void populateCanvas(Canvas canvas) {

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
