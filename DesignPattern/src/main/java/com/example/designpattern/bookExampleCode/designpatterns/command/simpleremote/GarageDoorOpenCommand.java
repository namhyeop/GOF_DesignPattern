package com.example.designpattern.bookExampleCode.designpatterns.command.simpleremote;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
