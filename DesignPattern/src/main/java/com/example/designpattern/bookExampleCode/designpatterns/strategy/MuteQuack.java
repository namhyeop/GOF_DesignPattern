package com.example.designpattern.bookExampleCode.designpatterns.strategy;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
