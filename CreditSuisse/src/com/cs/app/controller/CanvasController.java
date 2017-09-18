package com.cs.app.controller;

import com.cs.app.model.AbstractFactory;
import com.cs.app.model.AppController;
import com.cs.app.model.BasicCanvas;
import com.cs.app.model.Canvas;
import com.cs.app.model.Item;
import com.cs.app.model.QuitCanvas;

/**
 * Controller of Application
 * 
 * @author Vikram Chhajer
 *
 */
public class CanvasController implements AppController {

	Canvas canvas;
	Menu menu;
	Item item;

	public void launchApplication() {
		String input;
		try {
			menu = new Menu();
			menu.showWelcomeMessage();

			while (true) {
				boolean isCanvasInitialized = canvas == null ? false : canvas.isCanvasInitialized();
				input = menu.showMenuAndGetInput(isCanvasInitialized);

				try {
					item = AbstractFactory.getItem(input);
				} catch (IllegalArgumentException e) {
					System.err.println("Invalid Command/Input.");
					continue;
				}

				if (item instanceof QuitCanvas) {
					break;
				}
				if (item instanceof BasicCanvas) {
					canvas = null; // Making prev reference as null so it can
									// garbage collected.
					canvas = (Canvas) item;
				}
				try {
					item.populateCanvas(canvas);
					canvas.drawCanvas();
				} catch (IllegalArgumentException e) {

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			menu.close();
		}

	}

}
