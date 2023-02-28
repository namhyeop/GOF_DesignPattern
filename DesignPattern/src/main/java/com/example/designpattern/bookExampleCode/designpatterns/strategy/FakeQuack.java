package com.example.designpattern.bookExampleCode.designpatterns.strategy;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
