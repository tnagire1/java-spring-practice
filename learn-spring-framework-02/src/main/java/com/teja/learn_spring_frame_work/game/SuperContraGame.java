package com.teja.learn_spring_frame_work.game;

public class SuperContraGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("crouch down");
	}

	@Override
	public void down() {
		System.out.println("jump up");
	}

	@Override
	public void right() {
		System.out.println("jump right");
	}

	@Override
	public void left() {
		System.out.println("jump back");
	}

	@Override
	public String toString() {
		return "Contra Game Successfully Running";
	}

}
