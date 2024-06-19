package com.teja.objectoriented;

public class Fan {

	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void setSpeed(byte speed) {
		if (this.isOn) {
			this.speed = speed;
		} else {
			this.speed = (byte) 0;
		}
	}

	public void switchOn() {
		this.isOn = true;
		this.setSpeed((byte) 1);

	}

	public void switchOff() {
		this.isOn = false;
		this.setSpeed((byte) 0);

	}

	@Override
	public String toString() {
		return (String.format("make:  %s ,radius: %f ,color: %s,isOn: %b ,speed: %d", make, radius, color, isOn,
				speed));
	}

}
