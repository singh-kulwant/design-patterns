package com.duck.app;

import com.duck.impl.FlyNoWays;
import com.duck.impl.FlyWithWings;
import com.duck.impl.MuteQuack;
import com.duck.impl.Squeaking;
import com.duck.model.RedheadDuck;
import com.duck.model.RubberDuck;

public class GameApplication {

	public static void main(String[] args) {

		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.setFlyBehaviour(new FlyNoWays());
		rubberDuck.setSoundBehaviour(new MuteQuack());
		rubberDuck.play();

		System.out.println("------------------------------------------");

		RedheadDuck redheadDuck = new RedheadDuck();
		redheadDuck.setFlyBehaviour(new FlyWithWings());
		redheadDuck.setSoundBehaviour(new Squeaking());
		redheadDuck.play();
	}
}
