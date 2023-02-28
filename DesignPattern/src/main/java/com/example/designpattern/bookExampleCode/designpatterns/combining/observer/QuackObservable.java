package com.example.designpattern.bookExampleCode.designpatterns.combining.observer;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
