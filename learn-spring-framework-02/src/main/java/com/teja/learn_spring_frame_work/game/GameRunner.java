package com.teja.learn_spring_frame_work.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class GameRunner {

	private GameConsole game;

	@Autowired

	public GameRunner(@Qualifier("mariogame") GameConsole game) {
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
