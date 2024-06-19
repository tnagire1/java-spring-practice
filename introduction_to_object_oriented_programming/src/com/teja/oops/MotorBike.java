package com.teja.oops;

public class MotorBike {

	private int speed = 0;// member variable

	MotorBike(int speed) {
		start();
		this.speed = speed;
	}

	MotorBike() {
		this(5);

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int increaseSpeedBy) {
		setSpeed(this.speed + increaseSpeedBy);
	}

	public void decreaseSpeed(int decreaseSpeedBy) {
		setSpeed(this.speed - decreaseSpeedBy);
	}

	void start() {
		System.out.println("started the bike");
	}

}
