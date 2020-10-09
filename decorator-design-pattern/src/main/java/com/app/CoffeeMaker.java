package com.app;

import com.component.Beverage;
import com.componznt.condiment.Milk;
import com.componznt.condiment.Mocha;
import com.componznt.condiment.Whip;
import com.items.DarkRoast;
import com.items.Decaf;

public class CoffeeMaker {

	public static void main(String[] args) {

		Beverage espresso = new DarkRoast("medium");
		espresso = new Milk(espresso);
		espresso = new Mocha(espresso);

		System.out.println("Beverage : " + espresso.getSize() + " " + espresso.getDescription() + " Beverage cost: "
				+ espresso.cost());

		Beverage decaf = new Decaf("large");
		decaf = new Milk(decaf);
		decaf = new Whip(decaf);

		System.out.println(
				"Beverage : " + decaf.getSize() + " " + decaf.getDescription() + " Beverage cost: " + decaf.cost());
	}
}
