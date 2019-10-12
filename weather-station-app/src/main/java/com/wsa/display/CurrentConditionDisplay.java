package com.wsa.display;

import com.wsa.observer.Observer;
import com.wsa.subject.Subject;

public class CurrentConditionDisplay implements DisplayElement, Observer {
	private float temp;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(
				"Current Conditions: " + temp + "F degrees, " + humidity + "% humidity, " + pressure + "pascal.");
	}
}
