package com.display;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Optional;

import com.subject.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

	ArrayList<Double> temps;
	private Observable weatherData;

	public StatisticsDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		this.temps = new ArrayList<Double>();
		weatherData.addObserver(this);
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
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;

			temps.add(Double.valueOf(weatherData.getTemp()));
			display();
		}

	}

}
