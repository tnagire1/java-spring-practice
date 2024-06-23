package com.teja.learn_spring_frame_work.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("Eat up");
	}

	@Override
	public void down() {
		System.out.println("Eat down");
	}

	@Override
	public void right() {
		System.out.println("Eat right");
	}

	@Override
	public void left() {
		System.out.println("Eat left");
	}

	@Override
	public String toString() {
		return "Pacman Game Successfully Running";
	}

}
