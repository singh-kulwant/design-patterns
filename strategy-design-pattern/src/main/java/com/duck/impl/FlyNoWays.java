package com.duck.impl;

import com.duck.FlyBehaviour;

public class FlyNoWays implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Doesn't fly...");
	}

}
