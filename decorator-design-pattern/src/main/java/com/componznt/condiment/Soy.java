package com.componznt.condiment;

import com.component.Beverage;
import com.component.decorator.CondimentDecorator;

public class Soy  extends CondimentDecorator {

	public Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.07;
	}


}
