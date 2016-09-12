package com.create.main;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Core {

	
	public static void main(String[] args){
		
		
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(screenWidth / 2, screenHeight / 2);
		frame.setLocation(screenWidth / 4, screenHeight / 4);
		frame.getContentPane().setBackground(new Color(.35f, .35f, .35f));
		frame.setVisible(true);
		
		
	}
	
}
