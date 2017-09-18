package com.cs.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utility {

	public static char LINE_SYMBOL = 'X';
	public static char RECT_SYMBOL = 'X';
	public static char CANVAS_X = '-';
	public static char CANVAS_Y = '|';
	public static char RECT_INTERNAL = 'x';
	public static char CANVAS_INTERNAL = ' ';
	public static List<Character> reservedChars = new ArrayList<Character>();

	static {
		reservedChars.add(LINE_SYMBOL);
		reservedChars.add(RECT_SYMBOL);
		reservedChars.add(CANVAS_X);
		reservedChars.add(CANVAS_Y);
		reservedChars.add(RECT_INTERNAL);
	}

	public static boolean isResevedColor(char c) {
		return reservedChars.contains(c);
	}

	public static void clrscr() {
		try {
			if (System.getProperty("os.name").contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033\143");
			}
		} catch (IOException ex) {

		} catch (InterruptedException e) {
			
		}
	}

	public static void log(String msg) {
		System.out.println(msg);

	}
}
