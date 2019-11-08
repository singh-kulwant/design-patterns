package com.componznt.condiment;

import com.component.Beverage;
import com.component.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

	public Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.getSize();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " Whip";
	}

	@Override
	public double cost() {

		double whipCost = 0;
		switch (beverage.getSize()) {
		case "medium":
			whipCost = .25;
			break;

		case "large":
			whipCost = .30;
			break;

		default:
			break;
		}
		return beverage.cost() + whipCost;

	}

}
