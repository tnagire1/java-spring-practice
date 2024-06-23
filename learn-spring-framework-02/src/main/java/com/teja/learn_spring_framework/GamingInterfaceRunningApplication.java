package com.teja.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.teja.learn_spring_frame_work.game.GameRunner;

@Configuration
@ComponentScan("com.teja.learn_spring_frame_work.game")

public class GamingInterfaceRunningApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingInterfaceRunningApplication.class)) {

			context.getBean(GameRunner.class).run();
		}

	}

}
