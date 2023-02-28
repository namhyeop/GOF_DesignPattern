package com.example.designpattern.observer.weather;

import java.util.*;

public class WeatherData implements Subject {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	//옵저버 등록 요청 메소드
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	//옵저버가 탈퇴를 요청하면 List에서 빼기만 하면 된다.
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	//모든 옵저버에게 상태 변화를 알려 주는 부분.
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	//가상 스테이션으로부터 갱신된 측정값을 등록된 옵저버에게 알리는 메소드
	public void measurementsChanged() {
		notifyObservers();
	}

	//테스트를 위한 가상데이터를 설정하느 메소드
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	//기타 메소드
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}

}
