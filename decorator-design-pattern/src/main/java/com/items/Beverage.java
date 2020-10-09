package com.component;

public abstract class Beverage {

	public String description = "Unknown beverage";

	public String size;

	public abstract double cost();

	public String getDescription() {
		return description;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}