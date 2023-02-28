package com.example.designpattern.bookExampleCode.designpatterns.decorator.pizza;

public abstract class ToppingDecorator extends Pizza {
	Pizza pizza;
	public abstract String getDescription();
}
