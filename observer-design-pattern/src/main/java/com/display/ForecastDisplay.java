package com.display;

import java.util.Observable;
import java.util.Observer;

import com.subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
	private String forecast;
	private Observable weatherData;

	public ForecastDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(forecast);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			forecast = weatherData.getForecast();
			display();
		}

	}

}
