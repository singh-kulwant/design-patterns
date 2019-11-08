package com.items;

import com.component.Beverage;

public class DarkRoast  extends Beverage{

	public DarkRoast(String orderSize) {
		description = "Darkroast";
		this.size = orderSize;
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
