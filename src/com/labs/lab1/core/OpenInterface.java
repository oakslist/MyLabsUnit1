package com.labs.lab1.core;

public class OpenInterface {
	
	public String call1_1(String inputText, int key) {
		Lab1_1 lab1 = new Lab1_1();
		return lab1.generateRailway(inputText, key);
	}
	
	public String call1_1Back(String inputText, int key) {
		Lab1_1 lab1 = new Lab1_1();
		return lab1.generateRailwayBack(inputText, key);
	}
	
	public String call1_2(String inputText, String key) {
		Lab1_2 lab2 = new Lab1_2();
		return lab2.getKeyPhrase(inputText, key);
	}
	
	public String call1_2Back(String inputText, String key) {
		Lab1_2 lab2 = new Lab1_2();
		System.out.println(inputText + " = inputText");
		System.out.println(key + " = keyPhrase");
		return lab2.getKeyPhraseBack(inputText, key);
	}
	
	public String call2_1(String inputText, int key) {
		Lab2_1 lab3 = new Lab2_1();
		return lab3.getKeyPhrase(inputText, key);
	}
	
	public String call2_1Back(String inputText, int key) {
		Lab2_1 lab3 = new Lab2_1();
		return lab3.getKeyPhraseBack(inputText, key);
	}
	
	public String call2_2(String inputText, int key) {
		Lab2_2 lab4 = new Lab2_2();
		return lab4.getKeyPhrase(inputText, key);
	}
	
	public String call2_2Back(String inputText, int key) {
		Lab2_2 lab4 = new Lab2_2();
		return lab4.getKeyPhraseBack(inputText, key);
	}
	
	public String call3(String inputText, int p, int q, int e, int h0) {
		Lab3 lab5 = new Lab3();
		return lab5.get(inputText, p, q,  e, h0);
	}
	
	public String call3Back(String inputText, int p, int q, int d, int h0, int s) {
		Lab3 lab5 = new Lab3();
		return lab5.getBack(inputText, p, q,  d, h0, s);
	}

}
