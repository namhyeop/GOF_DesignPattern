package com.example.designpattern.command.simpleremote;

public class RemoteControlTest {
	public static void main(String[] args) { //클라이언트
		SimpleRemoteControl remote = new SimpleRemoteControl(); // Invoker 객체 생성
		Light light = new Light(); //Command 객체의 실행 로직을 가지고 있는 객체 생성
		GarageDoor garageDoor = new GarageDoor();
		LightOnCommand lightOn = new LightOnCommand(light); //Command 객체 생성
		GarageDoorOpenCommand garageOpen =
		    new GarageDoorOpenCommand(garageDoor);
 
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
    }
	
}
