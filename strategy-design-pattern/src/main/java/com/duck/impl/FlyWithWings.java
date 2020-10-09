package com.duck.impl;

import com.duck.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Fly upto 2 mtrs");
	}

}
