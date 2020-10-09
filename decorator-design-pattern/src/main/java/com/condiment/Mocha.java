package com.componznt.condiment;

import com.component.Beverage;
import com.component.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

	public Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.getSize();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " Mocha";
	}

	@Override
	public double cost() {
		double mochaCost = 0;
		switch (beverage.getSize()) {
		case "medium":
			mochaCost = .20;
			break;

		case "large":
			mochaCost = .25;
			break;

		default:
			break;
		}
		return beverage.cost() + mochaCost;

	}

}
