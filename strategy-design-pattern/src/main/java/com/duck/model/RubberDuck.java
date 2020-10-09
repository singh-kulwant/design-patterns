package com.duck.model;

import com.duck.Duck;
import com.duck.FlyBehaviour;
import com.duck.SoundBehaviour;

public class RubberDuck extends Duck {

	public RubberDuck() {
	}

	public void setFlyBehaviour(FlyBehaviour fly) {
		flyBehaviour = fly;
	}

	public void setSoundBehaviour(SoundBehaviour sound) {
		quackBehaviour = sound;
	}

	@Override
	public void display() {
		System.out.println("Rubber Duck...");
	}

	@Override
	public void swim() {
		System.out.println("Doesn't swim...");
	}
}