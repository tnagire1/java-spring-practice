package com.teja.learn_spring_framework;

import org.springframework.stereotype.Component;

@Component

public class DataRetrievalMySQL implements DataRetrieval {

	@Override
	public int[] dataRetrieval() {
		return new int[] { 1, 2, 3, 4, 8 };
	}

}
