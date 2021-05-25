package org.designPattern.commandPattern;

public class Person {

	public static void main(String[] args) {

		Television television = new Television();

		OnCommand onCommand = new OnCommand(television);
		RemoteControl remoteControl = new RemoteControl(onCommand);

		remoteControl.pressButton();
	}
}
