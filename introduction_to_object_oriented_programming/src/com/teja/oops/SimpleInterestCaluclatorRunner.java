package com.teja.oops;

import java.math.BigDecimal;

public class SimpleInterestCaluclatorRunner {

	public static void main(String[] args) {

		SimpleInterestCaluclator Caluclator = new SimpleInterestCaluclator("4500.00", "7.5");
		BigDecimal totalValue = Caluclator.caluclate(5);
		System.out.println(totalValue);

	}

}
