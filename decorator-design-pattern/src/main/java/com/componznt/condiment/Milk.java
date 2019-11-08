package com.componznt.condiment;

import com.component.Beverage;
import com.component.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {

	public Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " Milk";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.10;
	}


}
