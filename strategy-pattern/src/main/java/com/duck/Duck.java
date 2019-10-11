package com.duck;

public class Duck {

	protected FlyBehaviour flyBehaviour;

	protected SoundBehaviour quackBehaviour;

	public void play() {
		display();
		swim();
		flyBehaviour.fly();
		quackBehaviour.makeSound();
	}

	public void display() {
		System.out.println("Duck prototype...");
	}

	public void swim() {
		System.out.println("Duck swimming...");
	}

}