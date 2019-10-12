package com.wsa.subject;

import java.util.ArrayList;

import com.wsa.observer.Observer;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temp;
	private float humidity;
	private float pressure;

	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void removeObserver(Observer o) {

		int i = observers.indexOf(o);

		if (i > 0) {
			observers.remove(i);
		}

	}

	@Override
	public void registerObserver(Observer o) {
		this.observers.add(o);
		System.out.println("Observer registered: " + o.toString());
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < this.observers.size(); i++) {
			this.observers.get(i).update(temp, humidity, pressure);
		}

	}

	public void measurementsChanged() {
		System.out.println("Measurements updated.");
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temp = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
