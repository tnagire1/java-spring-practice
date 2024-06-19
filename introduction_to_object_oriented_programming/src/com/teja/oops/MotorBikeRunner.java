package com.teja.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike honda = new MotorBike(100);
		System.out.println(honda.getSpeed());
		// MotorBike ducati = new MotorBike();
		// System.out.println(ducati.getSpeed());

		// ducati.increaseSpeed(100);

		honda.increaseSpeed(200);

		// System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
	}

}
