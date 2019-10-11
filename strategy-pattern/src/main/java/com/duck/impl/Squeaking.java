package com.duck.impl;

import com.duck.SoundBehaviour;

public class Squeaking implements SoundBehaviour{

	@Override
	public void makeSound() {
		System.out.println("Squeaking duck...");
	}

}
