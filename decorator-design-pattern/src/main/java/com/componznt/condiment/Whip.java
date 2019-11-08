package com.componznt.condiment;

import com.component.Beverage;
import com.component.decorator.CondimentDecorator;

public class Whip  extends CondimentDecorator{

	public Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.05;
	}

}
