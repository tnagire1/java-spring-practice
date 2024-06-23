package com.teja.learn_spring_framework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.teja.learn_spring_framework")

public class DataRetrievalRunner {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DataRetrievalRunner.class)) {

			int[] dataRetrieval = context.getBean(DataRetrievalMongoDB.class).dataRetrieval();
			System.out.println(Arrays.toString(dataRetrieval));

			System.out.println(context.getBean(BusinessLogic.class).findMax());

		}

	}

}
