package com.example.designpattern.bookExampleCode.designpatterns.strategy;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
