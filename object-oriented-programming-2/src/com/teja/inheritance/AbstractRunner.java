package com.teja.inheritance;

abstract class Animal {
	abstract void bark();
}

class Dog extends Animal {
	@Override
	void bark() {
		System.out.println("Bow-Bow");
	}
}

class Cat extends Animal {
	@Override
	void bark() {
		System.out.println("Meow-Meow");
	}
}

public class AbstractRunner {

	public static void main(String[] args) {
		Animal[] objects = { new Dog(), new Cat() };

		for (Animal object : objects) {
			object.bark();
		}

	}

}
