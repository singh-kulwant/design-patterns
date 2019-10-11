package com.duck.model;

import com.duck.Duck;
import com.duck.FlyBehaviour;
import com.duck.SoundBehaviour;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
	}

	public void setFlyBehaviour(FlyBehaviour fly) {
		flyBehaviour = fly;
	}

	public void setSoundBehaviour(SoundBehaviour sound) {
		quackBehaviour = sound;
	}

	@Override
	public void display() {
		System.out.println("Readhead Duck...");
	}

}
