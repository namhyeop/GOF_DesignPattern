package com.example.designpattern.decorator.starbuzz;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", 두유";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
