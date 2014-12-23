package com.labs.lab1.core;

public class Lab3 {
	
	public Lab3() {
	}
	
	public String get(String inputText, int p, int q,  int e, int h0) {
		System.out.println(inputText + "; " + p + "; " + q + "; " + e + "; " + h0);
		String output = "";
		int r = p * q;
		int d = generateD(p, q, e);
		
		int m = getSurnameHash(inputText, p, q, h0);
		int s = quickExp(m, d, r);
		
		output += "inputText = " + inputText + "; hash h(M) = " + m + "; s = " + s + "\n";
		output += "signature d = " + d + "; e = " + e + "\n";

		output += "Kopen  = (e, r) = (" + e + ", " + r + ")\n";
		output += "Ksecret (d, r) = (" + d + ", " + r + ")\n";
		output += "to send: {" + inputText + ", " + s + "}\n\n";
		
		return output;
	}
	
	public String getBack(String inputText, int p, int q,  int e, int h0, int s) {
		System.out.println(inputText + "; " + p + "; " + q + "; " + e + "; " + h0);
		String output = "";
		int r = p * q;
		
		int m_client = getSurnameHash(inputText, p, q, h0);
		output += "client m = " + m_client + "\n";
		int s_client = quickExp(s, e, r);
		output += "S = " + s_client + "\n";
		
		return output;
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
