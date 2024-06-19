package com.teja.inheritance;

// Making the interface public so it can be accessed from any package
interface Flyable {
	void fly();
}

// Making the class public so it can be accessed from any package
class Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("Bird is flying");
	}
}

public class FlyableRunner {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly(); // Output: Bird is flying
	}
}
