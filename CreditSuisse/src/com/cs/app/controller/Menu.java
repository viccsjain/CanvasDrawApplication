package com.cs.app.controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.cs.app.Utility;

public class Menu {

	Scanner in;

	public Menu() {
		in = new Scanner(System.in);
	}

	public void showWelcomeMessage() {
		System.out.println("Welcome to Canvas Draw");
		System.out.println("********************************************");
		System.out.println("This canvas support following operations: ");
		System.out.println("1. C -> Create a canvas with given width and height.");
		System.out.println("2. L -> Make a line inside canvas.");
		System.out.println("3. R -> Make a rectangle inside Canvas.");
		System.out.println("3. B -> Fill color in Canvas.");
		System.out.println("3. E -> Erase the Canvas.");
		System.out.println("4. Q -> Quit Canvas.");
		System.out.println("********************************************\n\n");

	}

	public String showMenuAndGetInput(boolean isInitialized) {
		List<Character> supportedCommand = new LinkedList<Character>();
		System.out.println("Commands:");
		System.out.println("C w h      <Create Canvas of given width and height>");
		supportedCommand.add('C');
		if (isInitialized) {
			System.out.println("L x1 y1 x2 y2       <Draw a line inside Canvas based on given dimensions>");
			supportedCommand.add('L');
			System.out.println("R x1 y1 x2 y2       <Make a rectangle inside Canvas basec on given dimensions.>");
			supportedCommand.add('R');
			System.out
					.println("B x2 y2 c      <Fill empty space of Canvas in given dimensions with given color code.>");
			supportedCommand.add('B');
			System.out.println("E      <Erase the canvas.>");
			supportedCommand.add('E');
		}
		System.out.println("Q      <Quit Canvas.>");
		supportedCommand.add('Q');
		String inputLine = in.nextLine().trim();
		if (validateInput(inputLine, supportedCommand, isInitialized)) {
			return inputLine;
		} else {
			return showMenuAndGetInput(isInitialized);
		}

	}

	private boolean validateInput(String inputLine, List<Character> supportedCommand, boolean isInitialized) {

		if (inputLine.length() == 0) {
			Utility.clrscr();
			System.err.println("Warning:   No Input provided.");
			return false;
		} else if (!supportedCommand.contains(inputLine.charAt(0))) {
			System.err.println("Command Not Supported.");
			return false;
		} else if (inputLine.equals("E")) {
			System.out.println("This will erase complete Canvas. Do you want to continue ? (Y/N)");
			String input = in.nextLine();
			if (input.toLowerCase().equals("n"))
				return false;
		} else if (isInitialized && inputLine.startsWith("C")) {
			System.out.println("Do you want to delete current Canvas and Create new one ? (Y/N)");
			String input = in.nextLine();
			if (input.toLowerCase().equals("n"))
				return false;
		}
		return true;

	}

	public void close() {
		in.close();
	}

}
