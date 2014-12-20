package com.labs.lab1.app;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import com.labs.lab1.AppConstants;
import com.labs.lab1.core.OpenInterface;

public class AppPresentationPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private static JTextArea editTextArea = new JTextArea();
	private static JTextArea editTextAreaKey = new JTextArea();
	private static JTextArea editTextAreaBack = new JTextArea();
	private static JTextArea editTextAreaKeyBack = new JTextArea();
	
	public AppPresentationPanel() {
		Dimension size = getPreferredSize();
		size.width = AppConstants.APP_PRESENTATION_AREA_WIDTH;
		setPreferredSize(size);
		
		super.setLayout(null);
				
	    ButtonGroup bGroup = new ButtonGroup();
	    ActionListener radioAL = getRadioActionListener();
	    
	    JLabel label = new JLabel("Task: create railway key");
	    label.setLocation(30, 30);
	    label.setSize(200, 30);
	    
	    JLabel label2 = new JLabel("Type a input text: ");
	    label2.setLocation(30, 100);
	    label2.setSize(100, 20);
	    
	    editTextArea.setLocation(130, 100);
	    editTextArea.setSize(200, 20);
//	    editTextArea.setBackground(Color.GRAY);
//	    editTextArea.setForeground(Color.WHITE);
	    
	    JLabel label3 = new JLabel("Type a key: ");
	    label3.setLocation(30, 130);
	    label3.setSize(100, 20);
	    
//	    JTextArea editTextAreaKey = new JTextArea();
	    editTextAreaKey.setLocation(130, 130);
	    editTextAreaKey.setSize(200, 20);
	    
	    //	    	back
	    
	    JLabel label2Back = new JLabel("Type a input text: ");
	    label2Back.setLocation(30, 330);
	    label2Back.setSize(100, 20);
	    
//	    JTextArea editTextAreaBack = new JTextArea();
	    editTextAreaBack.setLocation(130, 330);
	    editTextAreaBack.setSize(200, 20);
	    
	    JLabel label3Back = new JLabel("Type a key: ");
	    label3Back.setLocation(30, 360);
	    label3Back.setSize(100, 20);
	    
//	    JTextArea editTextAreaKeyBack = new JTextArea();
	    editTextAreaKeyBack.setLocation(130, 360);
	    editTextAreaKeyBack.setSize(200, 20);
//	    =======
	    
	    JButton	jButton = new JButton("Check!");
	    jButton.setLocation(150, 200);
	    jButton.setSize(150, 30);
	    jButton.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
	        	
	        	String inputText = editTextArea.getText();
	        	int key = Integer.parseInt(editTextAreaKey.getText());
//	        	editTextArea.setText("");
//	        	editTextAreaKey.setText("");

	            AppMessagesPanel.setAppLog(new OpenInterface().call1_1(inputText, key));
    		}
		});
	    
	    JButton	jButtonBack = new JButton("Check Back!");
	    jButtonBack.setLocation(150, 450);
	    jButtonBack.setSize(150, 30);
	    jButtonBack.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
	        	String inputText = editTextAreaBack.getText();
	        	int key = Integer.parseInt(editTextAreaKeyBack.getText());
//	        	editTextArea.setText("");
//	        	editTextAreaKey.setText("");

	            AppMessagesPanel.setAppLog(new OpenInterface().call1_1Back(inputText, key));

    		}
		});
	    
	    super.add(jButton);
	    super.add(jButtonBack);
	    super.add(label);
	    super.add(label2);
	    super.add(editTextArea);
	    super.add(label3);
	    super.add(editTextAreaKey);
	    super.add(label2Back);
	    super.add(editTextAreaBack);
	    super.add(label3Back);
	    super.add(editTextAreaKeyBack);

	    createJRadioButton("lab1_1", radioAL, bGroup, 350, 20);
	    createJRadioButton("lab1_2", radioAL, bGroup, 350, 45);
	    createJRadioButton("lab2_1", radioAL, bGroup, 350, 70);
	    createJRadioButton("lab2_2", radioAL, bGroup, 350, 95);
	    createJRadioButton("lab3", radioAL, bGroup, 350, 120);
	    
	}
	
	private void createJRadioButton(String name, ActionListener aL, ButtonGroup bGroup, int x, int y) {
		JRadioButton jRadioButton = new JRadioButton();
        jRadioButton.setText(name);
        jRadioButton.addActionListener(aL);
        bGroup.add(jRadioButton);
        jRadioButton.setLocation(x, y);
        jRadioButton.setSize(200, 15);
        super.add(jRadioButton);
	}
	
	private ActionListener getRadioActionListener() {
		ActionListener aL = new  ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	String log = "was checked " + ((JRadioButton)e.getSource()).getText();
	            System.out.println(log);
	            AppMessagesPanel.setAppLog(log);
		        
		        if(((JRadioButton)e.getSource()).getText() == "lab1_1") {
        			        	
		        }
		        
	        }
	    };
	    return aL;
	}
	
}