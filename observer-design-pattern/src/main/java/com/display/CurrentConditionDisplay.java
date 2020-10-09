package com.display;

import java.util.Observable;
import java.util.Observer;

import com.subject.WeatherData;

@SuppressWarnings("deprecation")
public class CurrentConditionDisplay implements DisplayElement, Observer {
	private float temp;
	private float humidity;
	private float pressure;
	private Observable weatherData;


	public CurrentConditionDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(
				"Current Conditions: " + temp + "F degrees, " + humidity + "% humidity, " + pressure + "pascal.");
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temp = weatherData.getTemp();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
}
