package com.duck.impl;

import com.duck.SoundBehaviour;

public class MuteQuack implements SoundBehaviour {

	@Override
	public void makeSound() {
		System.out.println("No Quacking...");
	}

}
