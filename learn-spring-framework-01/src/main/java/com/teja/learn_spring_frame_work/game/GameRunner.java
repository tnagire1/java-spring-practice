package com.teja.learn_spring_frame_work.game;

public class GameRunner {

	private GameConsole game;

	public GameRunner(GameConsole game) {
		this.game = game;
	}

	public void run() {

		System.out.println("Running Game:" + game);

		game.up();
		game.down();
		game.left();
		game.right();

	}

}
