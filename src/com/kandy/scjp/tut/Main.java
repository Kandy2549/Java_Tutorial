package com.kandy.scjp.tut;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	
	private static JButton button;
	
	  public static void main(String[] args) {

	        JFrame frame = new JFrame();
	        button = new JButton("Click Me");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(button);
	        frame.setSize(300,300);
	        frame.setVisible(true);
	        Main.changeButtonText();

	    }

	    public static void changeButtonText(){
	    	button.setText("I've been clicked");
	    }

}
