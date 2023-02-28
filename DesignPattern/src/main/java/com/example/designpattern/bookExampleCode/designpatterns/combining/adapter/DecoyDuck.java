package com.example.designpattern.bookExampleCode.designpatterns.combining.adapter;

public class DecoyDuck implements Quackable {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
