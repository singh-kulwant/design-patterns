package com.componznt.condiment;

import com.component.Beverage;
import com.component.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator{

	public Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.20;
	}

}
