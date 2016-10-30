package com.create.main;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.creator.scene.Scene;

public class Core {

	
	public static void main(String[] args) throws InterruptedException{
		
		

		
		
		
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		Scene scene = new Scene(screenWidth, screenHeight); 
		JFrame frame = new JFrame();
		frame.add(scene);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(screenWidth / 2, screenHeight / 2);
		frame.setLocation(screenWidth / 4, screenHeight / 4);
		frame.getContentPane().setBackground(Color.black);
		frame.setVisible(true);
		
		while(true){
			scene.repaint();
		}
	}
	
}
