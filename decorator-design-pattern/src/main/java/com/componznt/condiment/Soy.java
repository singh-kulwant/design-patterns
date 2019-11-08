package com.componznt.condiment;

import com.component.Beverage;
import com.component.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {

	public Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.getSize();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " Soy";
	}

	@Override
	public double cost() {

		double soyCost = 0;
		switch (beverage.getSize()) {
		case "medium":
			soyCost = .15;
			break;

		case "large":
			soyCost = .20;
			break;

		default:
			break;
		}
		return beverage.cost() + soyCost;

	}

}
