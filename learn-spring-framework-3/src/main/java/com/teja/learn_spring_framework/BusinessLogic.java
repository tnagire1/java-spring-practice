package com.teja.learn_spring_framework;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessLogic {
	private DataRetrieval dataService;

	@Autowired
	public BusinessLogic(DataRetrieval dataService) {
		this.dataService = dataService;
	}

	int findMax() {
		return Arrays.stream(dataService.dataRetrieval()).max().orElse(0);
	}

}
