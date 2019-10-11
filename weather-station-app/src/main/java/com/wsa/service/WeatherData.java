package com.wsa.service;

import java.util.ArrayList;
import java.util.List;

import com.wsa.observer.Observer;
import com.wsa.subject.Subject;

public class WeatherData implements Subject {

	List<Observer> observers;
	float temp;
	float humidity;
	float pressure;

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
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < this.observers.size(); i++) {
			this.observers.get(i).update(temp, humidity, pressure);
		}

	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temp = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
