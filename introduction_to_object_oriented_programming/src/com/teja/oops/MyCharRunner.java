package com.teja.oops;

public class MyCharRunner {
	public static void main(String[] args) {
		MyChar myChar = new MyChar('U');
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsonant());
		myChar.printLowerCaseAlphabets();
		myChar.printUpperCaseAlphabets();
	}
}
