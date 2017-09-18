package com.cs.app;

public class Parent {

	private void display(){
		System.out.println("Parent display");
	}
	
	public static void main(String[] args) {
		Child p = new Child();
		p.display();
	}
	
}

class Child extends Parent{
	
	public void display(){
		System.out.println("child display");
	}
	
	public static void main(String[] args) {
		Parent p = new Child();
		//p.display();
	}
}