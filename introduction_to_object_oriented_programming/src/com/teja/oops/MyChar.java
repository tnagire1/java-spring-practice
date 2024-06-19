package com.teja.oops;

public class MyChar {

	private char alphabet;

	MyChar(char alphabet) {
		this.alphabet = alphabet;

	}

	boolean isVowel() {
		if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'
				|| alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
			return true;
		}
		return false;
	}

	boolean isConsonant() {
		return isAlphabet() && !isVowel();
	}

	boolean isNumber()

	{
		if (alphabet >= 48 && alphabet <= 57) {
			return true;
		}
		return false;
	}

	boolean isAlphabet()

	{
		if ((alphabet >= 65 && alphabet <= 90) || (alphabet >= 97 && alphabet <= 122)) {
			return true;
		}
		return false;
	}

	void printUpperCaseAlphabets() {
		System.out.println('\n');
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
	}

	void printLowerCaseAlphabets() {

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
	}

}
