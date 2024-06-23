package com.teja.learn_spring_frame_work.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mariogame")

public class MarioGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("up");
	}

	@Override
	public void down() {
		System.out.println("down");
	}

	@Override
	public void right() {
		System.out.println("right");
	}

	@Override
	public void left() {
		System.out.println("left");
	}

	@Override
	public String toString() {
		return "Mario Game Successfully Running";
	}

}
