package com.teja.oops;

import java.math.BigDecimal;

public class SimpleInterestCaluclator {

	private BigDecimal principalAmount;
	private BigDecimal interest;

	public SimpleInterestCaluclator(String principalAmount, String interest) {

		this.principalAmount = new BigDecimal(principalAmount);
		this.interest = new BigDecimal(interest);

	}

	public BigDecimal caluclate(int time) {

		return (principalAmount.add(
				((principalAmount.multiply(interest)).multiply(new BigDecimal(time))).divide(new BigDecimal(100))));
	}

}
