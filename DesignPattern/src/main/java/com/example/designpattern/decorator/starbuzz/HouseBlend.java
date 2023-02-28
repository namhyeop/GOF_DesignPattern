package com.example.designpattern.decorator.starbuzz;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "하우스 블랜드 커피";
	}
 
	public double cost() {
		return .89;
	}
}

