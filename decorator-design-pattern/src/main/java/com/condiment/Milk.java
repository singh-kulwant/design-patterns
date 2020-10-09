package com.componznt.condiment;

import com.component.Beverage;
import com.component.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {

	public Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.getSize();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " Milk";
	}

	@Override
	public double cost() {
		double milkCost = 0;
		switch (beverage.getSize()) {
		case "medium":
			milkCost = .10;
			break;

		case "large":
			milkCost = .15;
			break;

		default:
			break;
		}
		return beverage.cost() + milkCost;
	}

}
