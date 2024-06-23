package com.teja.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.teja.learn_spring_frame_work.game.GameConsole;
import com.teja.learn_spring_frame_work.game.GameRunner;

public class AppGaming01BasicsJava2 {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

			System.out.println(context.getBean(GameConsole.class));
			context.getBean(GameRunner.class).run();
		}

	}

}
