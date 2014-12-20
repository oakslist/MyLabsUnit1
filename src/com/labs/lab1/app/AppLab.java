package com.labs.lab1.app;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.labs.lab1.AppConstants;

public class AppLab extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private final static AppPresentationPanel PRESENTATION_AREA = new AppPresentationPanel();
	private final static AppMessagesPanel MESSAGE_AREA = new AppMessagesPanel();
//	private static JButton button = new JButton("START");
	
	public AppLab(String title) {
		super(title);
		setSize(AppConstants.APP_MAIN_WIDTH, AppConstants.APP_MAIN_HEIGHT);
		setResizable(false);
		setVisible(true);
		
		// set layout manager
		setLayout(new BorderLayout());

		// set swing component to JFrame
		super.add(MESSAGE_AREA, BorderLayout.CENTER);
//		super.add(button, BorderLayout.SOUTH);
		super.add(PRESENTATION_AREA, BorderLayout.WEST);
		
		// add behavior
//		button.addActionListener(new ActionListener() {

//			@Override
//			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
//			}

//		});
	
	}
	

}
