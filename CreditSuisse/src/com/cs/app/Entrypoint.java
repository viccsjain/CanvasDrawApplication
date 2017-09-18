package com.cs.app;

import com.cs.app.controller.CanvasController;
import com.cs.app.model.AppController;

/**
 * Entrypoint of Application
 * 
 * @author Vikram Chhajer
 *
 */
public class Entrypoint {

	public static void main(String[] args) {
		AppController controller = new CanvasController();
		controller.launchApplication();
	}

}
