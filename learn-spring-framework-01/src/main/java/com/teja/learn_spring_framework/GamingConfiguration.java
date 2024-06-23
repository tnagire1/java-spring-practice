package com.teja.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.teja.learn_spring_frame_work.game.GameConsole;
import com.teja.learn_spring_frame_work.game.GameRunner;
import com.teja.learn_spring_frame_work.game.PacManGame;

@Configuration
public class GamingConfiguration {

	@Bean

	public GameConsole game() {
		return new PacManGame();
	}

	@Bean
	public GameRunner gameRunner(GameConsole game) {
		return new GameRunner(game);
	}

}
