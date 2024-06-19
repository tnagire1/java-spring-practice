package com.teja.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapRunner {

	public static void main(String[] args) {
		String inputSentence = "I am a I ,very God am i";
		inputSentence.toLowerCase();
		Map<Character, Integer> sentence = new HashMap<>();

		for (int i = 0; i < inputSentence.length(); i++) {
			char currentCharacter = inputSentence.charAt(i);

			if (currentCharacter == ' ') {
				continue;
			}
			if (sentence.get(currentCharacter) == null) {

				sentence.put(currentCharacter, 1);
			}

			else {
				int currentValue = sentence.get(currentCharacter) + 1;
				sentence.put(currentCharacter, currentValue);
			}

		}

		Map<String, Integer> wordCount = new HashMap<>();

		String[] words = inputSentence.split(" ");

		for (int i = 0; i < words.length; i++) {
			String currentWord = words[i];

			if (wordCount.get(currentWord) == null) {

				wordCount.put(currentWord, 1);
			}

			else {
				int currentValue = wordCount.get(currentWord) + 1;
				wordCount.put(currentWord, currentValue);
			}

		}
		System.out.println(wordCount);
	}

}
