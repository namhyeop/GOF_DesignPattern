package com.example.designpattern.observer.weather;

//화면 설정 정보를 갱신하기 위해 Observer를 정의, 정보를 보여주기 위해 DisplayElement를 정의
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private WeatherData weatherData;

	//생성자에 WeatherData 객체를 생성할때 전달하며 Observer에 등록한다.
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	//update를 호출하며 온도와 습도를 저장하고 display()를 호출한다.
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	//가장 최근에 받은 온도와 습도를 출력한다.
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
