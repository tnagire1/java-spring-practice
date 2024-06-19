package com.teja.objectoriented;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer1", 0, "Black");
		fan.switchOn();
		fan.setSpeed((byte) 3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
		fan.setSpeed((byte) 3);
		System.out.println(fan);

	}

}
