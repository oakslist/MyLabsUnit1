package com.labs.lab1.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Lab1_2 {

	public String getKeyPhrase(String inputText, String keyPhrase) {
		String output = "";

		inputText = createFinalInput(inputText, keyPhrase);
		List<Integer> finalChars = getPositionCollection(inputText, keyPhrase);

		for (int i = 0; i < inputText.length(); i++) {
			output += inputText.charAt(finalChars.get(i));
		}

		return output;
	}

	public String getKeyPhraseBack(String inputText, String keyPhrase) {
		String output = "";
		
		inputText = createFinalInput(inputText, keyPhrase);
		List<Integer> finalChars = getPositionCollection(inputText, keyPhrase);

		Map<Integer, String> map = new TreeMap<Integer, String>();

		int nextNumber = 0;
		for (int num : finalChars) {
			map.put(num, new StringBuilder().append(inputText.charAt(nextNumber)).toString());
			nextNumber++;
		}

		for (int key : map.keySet()) {
			output += map.get(key);
		}

		return output;
	}
	
	private String createFinalInput(String inputText, String keyPhrase) {
		int mod = inputText.length() % keyPhrase.length();
		if (mod != 0) {
			for (int i = 0; i < keyPhrase.length() - mod; i++) {
				inputText += " ";
			}
		}
		return inputText;
	}

	private List<Integer> getPositionCollection(String inputText,
			String keyPhrase) {

		// get all chars from keyPhrase to array
		List<String> charsKeyPhrase = new ArrayList<String>();
		for (int i = 0; i < keyPhrase.length(); i++) {
			charsKeyPhrase.add(new StringBuilder().append(keyPhrase.charAt(i)).toString());
		}

		// create new array to sort chars in increased order
		List<String> charsSorted = new ArrayList<String>(charsKeyPhrase);
		Collections.sort(charsSorted);

		// create the output collection with necessary indexes
		int rows = (int) (inputText.length() / keyPhrase.length());
		String tempKeyPhrase;
		List<Integer> finalChars = new ArrayList<Integer>();

		for (int row = 0; row < rows; row++) {
			tempKeyPhrase = keyPhrase;
			for (int ch = 0; ch < keyPhrase.length(); ch++) {
				int charIndex = tempKeyPhrase.indexOf(charsSorted.get(ch));
				finalChars.add(charIndex + (row * keyPhrase.length()));
				StringBuilder myName = new StringBuilder(tempKeyPhrase);
				myName.setCharAt(tempKeyPhrase.indexOf(charsSorted.get(ch)), ' ');
				tempKeyPhrase = myName.toString();
			}
		}

		return finalChars;
	}

}