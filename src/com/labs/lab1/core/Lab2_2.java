package com.labs.lab1.core;

import java.util.ArrayList;
import java.util.List;

public class Lab2_2 {
	
	private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public String getKeyPhrase(String inputText, int key) {
		String output = "";
		
		inputText = inputText.toUpperCase();
		List<Integer> chars = new ArrayList<Integer>();
		inputText.toUpperCase();
		
		for (int i = 0; i < inputText.length(); i++) {
			int index = (ALPHABET.indexOf(Character.toString(inputText.charAt(i))) * key) % ALPHABET.length();
			chars.add(index);
		}
		
		for (int i = 0; i < chars.size(); i++) {
			output += ALPHABET.charAt(chars.get(i));
		}
		
		return output;
	}
	
	public String getKeyPhraseBack(String inputText, int key) {
		String output = "";
		
		inputText = inputText.toUpperCase();
		List<Integer> chars = new ArrayList<Integer>();
		inputText.toUpperCase();
		
		for (int i = 0; i < inputText.length(); i++) {
			int index = ALPHABET.indexOf(Character.toString(inputText.charAt(i)));
			
			while (index % key != 0) {
				index = index + ALPHABET.length();
			}
			
			index = (index / key) % ALPHABET.length();
			
			chars.add(index);
		}
		
		for (int i = 0; i < chars.size(); i++) {
			output += ALPHABET.charAt(chars.get(i));
		}
		
		return output;
	}

}