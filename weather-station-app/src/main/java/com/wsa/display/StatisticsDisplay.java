package com.wsa.display;

import java.util.ArrayList;
import java.util.Optional;

import com.wsa.observer.Observer;
import com.wsa.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

	ArrayList<Double> temps;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.temps = new ArrayList<Double>();
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Avg/Max/Min: " + avg() + ", " + max() + ", " + min());
	}

	private Double avg() {
		Double sum = 0.0;
		for (Double t : temps) {
			sum = t + sum;
		}

		return sum / temps.size();
	}

	private Optional<Double> max() {
		return temps.stream().max((a, b) -> a.compareTo(b));
	}

	private Optional<Double> min() {
		return temps.stream().min((a, b) -> a.compareTo(b));
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		temps.add(Double.valueOf(temp));
		display();
	}

}
