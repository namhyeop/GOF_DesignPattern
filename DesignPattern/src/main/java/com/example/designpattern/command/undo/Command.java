package com.example.designpattern.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
