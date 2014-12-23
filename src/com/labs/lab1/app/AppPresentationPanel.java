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
	
	JLabel labelP = new JLabel("Type p: ");
	JLabel labelQ = new JLabel("Type q: ");
	JLabel labelE = new JLabel("Type e: ");
	JLabel labelD = new JLabel("Type d: ");
	JLabel labelH0 = new JLabel("Type H0: ");
	
	JLabel labelPBack = new JLabel("Type p: ");
	JLabel labelQBack = new JLabel("Type q: ");
	JLabel labelEBack = new JLabel("Type e: ");
	JLabel labelDBack = new JLabel("Type d: ");
	JLabel labelH0Back = new JLabel("Type H0: ");
	
	JLabel labelSBack = new JLabel("Type s: ");
	private static JTextArea editTextAreaSBack = new JTextArea();
	
	private static JTextArea editTextAreaP = new JTextArea();
	private static JTextArea editTextAreaQ = new JTextArea();
	private static JTextArea editTextAreaE = new JTextArea();
	private static JTextArea editTextAreaD = new JTextArea();
	private static JTextArea editTextAreaH0 = new JTextArea();
	
	private static JTextArea editTextAreaPBack = new JTextArea();
	private static JTextArea editTextAreaQBack = new JTextArea();
	private static JTextArea editTextAreaEBack = new JTextArea();
	private static JTextArea editTextAreaDBack = new JTextArea();
	private static JTextArea editTextAreaH0Back = new JTextArea();
	
	private static JLabel label3 = new JLabel("Type a key: ");
	private static JLabel label3Back = new JLabel("Type a key: ");
	
	private static int variant = 0;
	
	private static int checkBoxPlace = 450;
	
	private static JLabel task = new JLabel("check the neccessary task");
	
	public AppPresentationPanel() {
		Dimension size = getPreferredSize();
		size.width = AppConstants.APP_PRESENTATION_AREA_WIDTH;
		setPreferredSize(size);
		
		super.setLayout(null);
				
	    ButtonGroup bGroup = new ButtonGroup();
	    ActionListener radioAL = getRadioActionListener();
	    task.setLocation(30, 30);
	    task.setSize(300, 30);
	    
	    //		 ============= start =============
    
	    JLabel label2 = new JLabel("Type a input text: ");
	    label2.setLocation(10, 100);
	    label2.setSize(100, 20);
	    
	    editTextArea.setLocation(115, 100);
	    editTextArea.setSize(235, 40);
	    
//	    JLabel label3 = new JLabel("Type a key: ");
	    label3.setLocation(10, 135);
	    label3.setSize(100, 40);
	    
	    editTextAreaKey.setLocation(115, 150);
	    editTextAreaKey.setSize(235, 40);
	    
	    //	 ============= end =============
	    
	    //	 ============= start back =============
	    
	    JLabel label2Back = new JLabel("Type a input text: ");
	    label2Back.setLocation(10, 330);
	    label2Back.setSize(100, 20);
	    
	    editTextAreaBack.setLocation(115, 330);
	    editTextAreaBack.setSize(250, 40);
	    
//	    JLabel label3Back = new JLabel("Type a key: ");
	    label3Back.setLocation(10, 380);
	    label3Back.setSize(100, 20);
	    
	    editTextAreaKeyBack.setLocation(115, 380);
	    editTextAreaKeyBack.setSize(250, 40);
	    //   ============= end back =============	
	    
	    JButton	jButton = new JButton("Check!");
	    jButton.setLocation(150, 270);
	    jButton.setSize(150, 30);
	    jButton.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent event) {
	        	
	        	String inputText = "";
	        	String stringKey = "";
	        	String output = "";
	        	int key = 0;
	        	
	        	switch (variant) {
		        	case 11: 
		        		inputText = editTextArea.getText();
			        	key = Integer.parseInt(editTextAreaKey.getText());
			        	output = new OpenInterface().call1_1(inputText, key);
		        		AppMessagesPanel.setAppLog(output);
		        		editTextAreaBack.setText(output);
		        		editTextAreaKeyBack.setText(String.valueOf(key));
		        		break;
		        	case 12: 
		        		inputText = editTextArea.getText();
		        		stringKey = editTextAreaKey.getText();
		        		output = new OpenInterface().call1_2(inputText, stringKey);
		        		AppMessagesPanel.setAppLog(output);
		        		editTextAreaBack.setText(output);
		        		editTextAreaKeyBack.setText(stringKey);
		        		break;
		        	case 21: 
		        		inputText = editTextArea.getText();
			        	key = Integer.parseInt(editTextAreaKey.getText());
			        	output = new OpenInterface().call2_1(inputText, key);
		        		AppMessagesPanel.setAppLog(output);
		        		editTextAreaBack.setText(output);
		        		editTextAreaKeyBack.setText(String.valueOf(key));
		        		break;
		        	case 22: 
		        		inputText = editTextArea.getText();
			        	key = Integer.parseInt(editTextAreaKey.getText());
			        	output = new OpenInterface().call2_2(inputText, key);
		        		AppMessagesPanel.setAppLog(output);
		        		editTextAreaBack.setText(output);
		        		editTextAreaKeyBack.setText(String.valueOf(key));
		        		break;
    				case 3:
    					inputText = editTextArea.getText();
    					int p = Integer.parseInt(editTextAreaP.getText());
    					int q = Integer.parseInt(editTextAreaQ.getText());
    					int e = Integer.parseInt(editTextAreaE.getText());
    					int h0 = Integer.parseInt(editTextAreaH0.getText());
    					
    					
    					editTextAreaPBack.setText(editTextAreaP.getText());
    					editTextAreaQBack.setText(editTextAreaQ.getText());
    					editTextAreaH0Back.setText(editTextAreaH0.getText());
    					
    					AppMessagesPanel.setAppLog(new OpenInterface().call3(inputText, p, q, e, h0));
    					break;
	        	}
    		}
		});
	    
	    JButton	jButtonBack = new JButton("Check Back!");
	    jButtonBack.setLocation(150, 505);
	    jButtonBack.setSize(150, 30);
	    jButtonBack.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent event) {
    			
    			String inputTextBack = "";
	        	String stringKeyBack = "";
	        	int key = 0;
	        	
    			switch (variant) {
    				case 11: 
    					inputTextBack = editTextAreaBack.getText();
    					key = Integer.parseInt(editTextAreaKeyBack.getText());
    					AppMessagesPanel.setAppLog(new OpenInterface().call1_1Back(inputTextBack, key));
    					break;
    				case 12:
    					inputTextBack = editTextAreaBack.getText();
    					stringKeyBack = editTextAreaKeyBack.getText();
		        		AppMessagesPanel.setAppLog(new OpenInterface().call1_2Back(inputTextBack, stringKeyBack));
		        		break;
    				case 21:
    					inputTextBack = editTextAreaBack.getText();
    					key = Integer.parseInt(editTextAreaKeyBack.getText());
    					AppMessagesPanel.setAppLog(new OpenInterface().call2_1Back(inputTextBack, key));
    					break;
    				case 22:
    					inputTextBack = editTextAreaBack.getText();
    					key = Integer.parseInt(editTextAreaKeyBack.getText());
    					AppMessagesPanel.setAppLog(new OpenInterface().call2_2Back(inputTextBack, key));
    					break;
    				case 3:
    					inputTextBack = editTextAreaBack.getText();
    					int p = Integer.parseInt(editTextAreaPBack.getText());
    					int q = Integer.parseInt(editTextAreaQBack.getText());
    					int d = Integer.parseInt(editTextAreaDBack.getText());
    					int h0 = Integer.parseInt(editTextAreaH0Back.getText());
    					int s = Integer.parseInt(editTextAreaSBack.getText());
    					AppMessagesPanel.setAppLog(new OpenInterface().call3Back(inputTextBack, p, q, d, h0, s));
    					break;
    			}

    		}
		});
	    
	    super.add(jButton);
	    super.add(jButtonBack);
	    super.add(task);
	    super.add(label2);
	    super.add(editTextArea);
	    super.add(label3);
	    super.add(editTextAreaKey);
	    super.add(label2Back);
	    super.add(editTextAreaBack);
	    super.add(label3Back);
	    super.add(editTextAreaKeyBack);
	    
    
	    labelP.setLocation(10, 220);
	    labelP.setSize(50, 20);
	    editTextAreaP.setLocation(65, 220);
	    editTextAreaP.setSize(40, 20);
	    
	    labelQ.setLocation(115, 220);
	    labelQ.setSize(50, 20);
	    editTextAreaQ.setLocation(170, 220);
	    editTextAreaQ.setSize(40, 20);
	    
	    labelE.setLocation(220, 220);
	    labelE.setSize(50, 20);
	    editTextAreaE.setLocation(275, 220);
	    editTextAreaE.setSize(40, 20);
	    
	    labelH0.setLocation(325, 220);
	    labelH0.setSize(55, 20);
	    editTextAreaH0.setLocation(380, 220);
	    editTextAreaH0.setSize(40, 20);
	    
	    
	    labelPBack.setLocation(10, 455);
	    labelPBack.setSize(50, 20);
	    editTextAreaPBack.setLocation(65, 455);
	    editTextAreaPBack.setSize(40, 20);
	    
	    labelQBack.setLocation(115, 455);
	    labelQBack.setSize(50, 20);
	    editTextAreaQBack.setLocation(170, 455);
	    editTextAreaQBack.setSize(40, 20);
	    
	    labelDBack.setLocation(220, 455);
	    labelDBack.setSize(50, 20);
	    editTextAreaDBack.setLocation(275, 455);
	    editTextAreaDBack.setSize(40, 20);
	    
	    labelH0Back.setLocation(325, 455);
	    labelH0Back.setSize(55, 20);
	    editTextAreaH0Back.setLocation(380, 455);
	    editTextAreaH0Back.setSize(40, 20);
	    
	    labelSBack.setLocation(430, 455);
	    labelSBack.setSize(55, 20);
	    editTextAreaSBack.setLocation(490, 455);
	    editTextAreaSBack.setSize(40, 20);
	    
	    
	    createJRadioButton("railway hedge", radioAL, bGroup, checkBoxPlace, 20);
	    createJRadioButton("key phrase", radioAL, bGroup, checkBoxPlace, 45);
	    createJRadioButton("addition method", radioAL, bGroup, checkBoxPlace, 70);
	    createJRadioButton("multiplication method", radioAL, bGroup, checkBoxPlace, 95);
	    createJRadioButton("digital signature", radioAL, bGroup, checkBoxPlace, 120);
	    
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
	
	private void clearPanel() {
	    super.remove(labelSBack);
	    super.remove(editTextAreaSBack);
		super.remove(labelP);
	    super.remove(labelQ);
	    super.remove(labelE);
	    super.remove(labelD);
	    super.remove(labelH0);
	    super.remove(editTextAreaP);
	    super.remove(editTextAreaQ);
	    super.remove(editTextAreaE);
	    super.remove(editTextAreaD);
	    super.remove(editTextAreaH0);
	    
	    super.remove(labelPBack);
	    super.remove(labelQBack);
	    super.remove(labelEBack);
	    super.remove(labelDBack);
	    super.remove(labelH0Back);
	    super.remove(editTextAreaPBack);
	    super.remove(editTextAreaQBack);
	    super.remove(editTextAreaEBack);
	    super.remove(editTextAreaDBack);
	    super.remove(editTextAreaH0Back);
	    super.add(label3);
	    super.add(editTextAreaKey);
	    super.add(label3Back);
	    super.add(editTextAreaKeyBack);
	    super.repaint();
	}
	
	private void createPanel() {
		super.add(labelP);
	    super.add(labelQ);
	    super.add(labelE);
	    super.add(labelD);
	    super.add(labelH0);
	    super.add(editTextAreaP);
	    super.add(editTextAreaQ);
	    super.add(editTextAreaE);
	    super.add(editTextAreaD);
	    super.add(editTextAreaH0);
	    
	    super.add(labelPBack);
	    super.add(labelQBack);
	    super.add(labelEBack);
	    super.add(labelDBack);
	    super.add(labelH0Back);
	    super.add(editTextAreaPBack);
	    super.add(editTextAreaQBack);
	    super.add(editTextAreaEBack);
	    super.add(editTextAreaDBack);
	    super.add(editTextAreaH0Back);
	    super.remove(label3);
	    super.remove(editTextAreaKey);
	    super.remove(label3Back);
	    super.remove(editTextAreaKeyBack);
	    super.add(labelSBack);
	    super.add(editTextAreaSBack);
	    super.repaint();
	}
	
	private ActionListener getRadioActionListener() {
		ActionListener aL = new  ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	String log = "was checked " + ((JRadioButton)e.getSource()).getText() + "\nwaiting input data...\n";
	            System.out.println(log);
	            AppMessagesPanel.setAppLog(log);
		        
		        if(((JRadioButton)e.getSource()).getText() == "railway hedge") {
		        	AppMessagesPanel.setAppLog("you can use default value:\nCRYPTOGRAPHY and 3");
		        	String output = "write a PHRASE and a NUMBER KEY";
		        	task.setText(output);
		        	variant = 11;
		        	clearPanel();
		        }		        
		        if(((JRadioButton)e.getSource()).getText() == "key phrase") {
		        	AppMessagesPanel.setAppLog("you can use default value:\nHELLO_MY_FRIEND!!! and CRYPTO");
		        	String output = "write a PHRASE and a KEY PHRASE";
		        	task.setText(output);
		        	variant = 12;
		        	clearPanel();
		        }		        
		        if(((JRadioButton)e.getSource()).getText() == "addition method") {
		        	AppMessagesPanel.setAppLog("you can use default value:\nCRYPTOGRAPHYANDDATASECURITY and 3");
		        	String output = "write a PHRASE and a NUMBER KEY";
		        	task.setText(output);
		        	variant = 21;
		        	clearPanel();
		        }		        
		        if(((JRadioButton)e.getSource()).getText() == "multiplication method") {
		        	AppMessagesPanel.setAppLog("you can use default value:\nCRYPTOGRAPHYANDDATASECURITY and 3");
		        	String output = "write a PHRASE and a NUMBER KEY";
		        	task.setText(output);
		        	variant = 22;
		        	clearPanel();
		        }		        
		        if(((JRadioButton)e.getSource()).getText() == "digital signature") {
		        	AppMessagesPanel.setAppLog("you can use default value:\np = 13, q = 17, e = 23, H0 = 30 and\ninputText = VARACHAI");
		        	String output = "write a PHRASE, H0, p, q and e values";
		        	task.setText(output);
		        	variant = 3;
		        	createPanel();
		        }
	        }
	    };
	    return aL;
	}
	
}
