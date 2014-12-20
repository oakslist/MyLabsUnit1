package com.labs.lab1.core;

public class Lab3 {
	
	public Lab3(String inputText, int p, int q, int e, int h0) {
		int r = p * q;
		int d = generateD(p, q, e);
		
		int m = getSurnameHash(inputText, p, q, h0);
		int s = quickExp(m, d, r);
		
		System.out.println("inputText = " + inputText + "; hash h(M) = " + m + "; s = " + s);
		System.out.println("signature d = " + d + "; e = " + e);

		System.out.println("Kopen  = (e, r) = (" + e + ", " + r + ")");
		System.out.println("Ksecret (d, r) = (" + d + ", " + r + ")");
		System.out.println();
		System.out.println("to send: {" + inputText + ", " + s + "}");
		System.out.println();
		
		
		System.out.println("Client side:");
		
		int m_client = getSurnameHash(inputText, p, q, h0);
		System.out.println("client m = " + m_client);
		int s_client = quickExp(s, e, r);
		System.out.println("S = " + s_client);
	}
	
	private int getSurnameHash(String surname, int p, int q, int h0) {
		int hash;
		final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int h = h0;
		
		for (int i = 0; i < surname.length(); i++) {		
			int temp = h + ALPHABET.indexOf(Character.toString(surname.charAt(i))) + 1;
			h = (temp * temp) % (p * q);
		}
		hash = h;
		
		return hash;
	}
	
	private int generateD(int p, int q, int e) {
		int d = 1;
		int eilerR = (p - 1) * (q - 1);
		while ((d * e) % eilerR != 1) {
			d = d + 1;
		}
		return d;
	}
	
	private int quickExp(int number, int exp, int module) {
		int result = 1;
		while (exp != 0) {
			while (exp % 2 == 0) {
				exp = exp / 2;
				number = (number * number) % module;
			}
			exp = exp - 1;
			result = (result * number) % module;
		}
		return result;
	}

}
