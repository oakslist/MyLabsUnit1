package com.labs.lab1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.labs.lab1.app.AppLab;

public class Main {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				AppLab frame = new AppLab("My labs");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
		
		// String input;
		// int keyNumber;
		// Scanner in = new Scanner(System.in);
		// System.out.println("write the input word: ");
		// input = in.nextLine();
		// System.out.println("write the key: ");
		// keyNumber = in.nextInt();
		// in.close();
		
//		OpenInterface oi = new OpenInterface();
//		oi.call1_1();
//		oi.call1_2("cryptography", "this");
//		System.out.println(oi.call1_2("cryptography", "this"));
//		System.out.println(oi.call1_2Back("rypcogrtphya", "this"));
//		oi.call2_1();
//		oi.call2_2();
		
		
		
//		int p = 13;
//		int q = 17;
//		int e = 23;
//		int h0 = 10;
//		String inputText = "VARACHAI";
//		String inputText = "BDUJR";
		
//		oi.call3(inputText, p, q, e, h0);
		
	}

}
