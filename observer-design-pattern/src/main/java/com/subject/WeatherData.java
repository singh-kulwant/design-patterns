package com.subject;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class WeatherData extends Observable {

	private float temp;
	private float humidity;
	private float pressure;
	private String forecast;

	public WeatherData() {
	}

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temp = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.forecast = "Weather Forecast: More of the same.";
		measurementsChanged();
	}

	public String getForecast() {
		return forecast;
	}

	public float getTemp() {
		return temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
