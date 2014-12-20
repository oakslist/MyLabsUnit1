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
	
	public void call1_2() {
		Lab1_2 lab2 = new Lab1_2();
		System.out.println("back output is: "
				+ lab2.getKeyPhraseBack(lab2.getKeyPhrase(
						"HELLO_MY_FRIEND!_HOW_ARE_YOU?", "CRYPTOGRAPHY"),
						"CRYPTOGRAPHY"));
	}
	
	public void call2_1() {
		Lab2_1 lab3 = new Lab2_1();
		System.out.println("output is: " + lab3.getKeyPhrase("CRYPTOGRAPHYANDDATASECURITY", 3));
		System.out.println("output is: " + lab3.getKeyPhraseBack(lab3.getKeyPhrase("CRYPTOGRAPHYANDDATASECURITY", 3), 3));
	}
	
	public void call2_2() {
		Lab2_2 lab4 = new Lab2_2();
		System.out.println("output is: " + lab4.getKeyPhrase("CRYPTOGRAPHYANDDATASECURITY", 3));
		System.out.println("output is: " + lab4.getKeyPhraseBack(lab4.getKeyPhrase("CRYPTOGRAPHYANDDATASECURITY", 3), 3));
	}
	
	public void call3(String inputText, int p, int q, int e, int h0) {
		new Lab3(inputText, p, q,  e, h0);		
	}

}
