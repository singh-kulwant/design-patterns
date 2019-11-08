package com.items;

import com.component.Beverage;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
