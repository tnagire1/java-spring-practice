package com.teja.learn_spring_framework;

import com.teja.learn_spring_frame_work.game.GameRunner;
import com.teja.learn_spring_frame_work.game.MarioGame;
import com.teja.learn_spring_frame_work.game.PacManGame;
import com.teja.learn_spring_frame_work.game.SuperContraGame;

public class AppGaming01BasicsJava {

	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var pacManGame = new PacManGame();
		var gameRunner = new GameRunner(pacManGame);
		gameRunner.run();

	}

}
