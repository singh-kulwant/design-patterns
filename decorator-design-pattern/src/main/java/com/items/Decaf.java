package com.items;

import com.component.Beverage;

public class Decaf extends Beverage {

	public Decaf(String orderSize) {
		description = "Decaf";
		size = orderSize;
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
