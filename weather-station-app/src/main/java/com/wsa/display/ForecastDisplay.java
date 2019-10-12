package com.wsa.display;

import com.wsa.observer.Observer;
import com.wsa.subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement {

	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Weather Forecast: More of the same.");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		display();
	}

}
