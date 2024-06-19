package com.teja.loops.practice;

public class WhileNumberPlayer {
	private int player;

	WhileNumberPlayer(int player) {
		this.player = player;
	}

	public void printCubesUptoLimit() {

		int i = 1;

		while (i * i * i <= player) {
			System.out.print(i * i * i + " ");
			i++;
		}
		System.out.println();

	}

	public void printSquaresUptoLimit() {
		int i = 1;
		while (i * i <= player) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();

	}

}
