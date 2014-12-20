package com.labs.lab1.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Lab1_1 {

	public Lab1_1() {
	}

	public String generateRailwayBack(String inputText, int keyNumber) {
		String output = "";

		List<Integer> numbers = getRailwayArray(inputText.length(), keyNumber);
		Map<Integer, String> map = new TreeMap<Integer, String>();

		int nextNumber = 0;
		for (int num : numbers) {
			map.put(num,
					new StringBuilder().append(inputText.charAt(nextNumber))
							.toString());
			nextNumber++;
		}

		for (int key : map.keySet()) {
			output += map.get(key);
		}

		return output;
	}

	public String generateRailway(String inputText, int keyNumber) {
		String output = "";

		List<Integer> numbers = getRailwayArray(inputText.length(), keyNumber);

		for (int num : numbers) {
			output += new StringBuilder().append(inputText.charAt(num - 1));
		}

		return output;
	}

	private List<Integer> getRailwayArray(int textLength, int keyNumber) {
		List<Integer> numbers = new ArrayList<Integer>();

		int CONST = (keyNumber - 1) * 2;
		boolean isMode;
		int withMode;
		int time;

		for (int row = 1; row <= keyNumber; row++) {
			time = 0;
			isMode = true;
			for (int ch = row; ch <= textLength;) {
				withMode = (keyNumber - row) * 2;
				if (row == 1 || row == keyNumber) {
					numbers.add(ch);
					ch += CONST;
				} else {
					numbers.add(ch);
					if (isMode) {
						ch = row + withMode + (CONST * time);
						isMode = false;
					} else {
						time++;
						ch = row + (CONST * time);
						isMode = true;
					}
				}
			}
		}
		return numbers;
	}
}
