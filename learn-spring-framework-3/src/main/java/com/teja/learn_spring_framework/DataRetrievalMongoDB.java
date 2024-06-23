package com.teja.learn_spring_framework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DataRetrievalMongoDB implements DataRetrieval {

	@Override
	public int[] dataRetrieval() {
		return new int[] { 1, 2, 3, 4, 100 };
	}

}
