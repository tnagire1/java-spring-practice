package com.teja.inheritance;

public class Recipe1 extends AbstractRecipe {

	@Override
	void cook() {
		System.out.println("Cook");

	}

	@Override
	void prep() {
		System.out.println("Prep");

	}

	@Override
	void clean() {
		System.out.println("Clean");
	}

}
