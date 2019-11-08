package com.items;

import com.component.Beverage;

public class DarkRoast  extends Beverage{

	public DarkRoast() {
		description = "Darkroast";
	}
	@Override
	public double cost() {
		return 1.99;
	}

}
