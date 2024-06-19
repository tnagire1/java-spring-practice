package com.teja.exceptions;

class CustomCurrenciesException extends Exception {

}

class Amount {

	String currency;
	int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public String add(Amount that) throws Exception, CustomCurrenciesException {
		if (!this.currency.equals(that.currency)) {
			// throw new Exception("Currencies doesn't match");

			throw new CustomCurrenciesException();
		}

		return this.amount + that.amount + " " + this.currency;

	}
}

public class ThrowExceptionRunner {

	public static void main(String[] args) {

		Amount amount1 = new Amount("USD", 20);
		Amount amount2 = new Amount("EUR", 20);

		try {
			System.out.println(amount1.add(amount2));
		} catch (Exception e) {
			System.out.println("Please Enter Valid Currencies:");
		}

	}

}
