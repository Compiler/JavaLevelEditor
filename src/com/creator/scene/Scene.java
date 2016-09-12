package com.creator.scene;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Scene extends JPanel {

	int mapWidth, mapHeight, screenHeight, screenWidth;

	private SelectorSection section;
	public Scene(int sWidth, int sHeight) {
		
		this.setLayout(null);
		this.screenWidth = sWidth;
		this.screenHeight = sHeight;
		//initMap();
		this.setOpaque(false);
		this.setBackground(Color.gray);
		section = new SelectorSection(0, 0, screenWidth / 16, screenHeight);
		section.add(this);
	} 
	
	public void initMap(){
		boolean canPass = false;

		while (!canPass) {
			try{
				mapWidth = Integer.parseInt(JOptionPane.showInputDialog(null, "Width: ", "Enter width", JOptionPane.QUESTION_MESSAGE));
			}catch(Exception e){
				canPass = false;
				JOptionPane.showMessageDialog(null, "Must be in integer format", "Error", JOptionPane.ERROR_MESSAGE);
				continue;
			}
			canPass = true;
		}
		
		System.out.println("width: " + mapWidth);
		
		
		canPass = false;
		while (!canPass) {
			try{
				mapHeight = Integer.parseInt(JOptionPane.showInputDialog(null, "Height: ", "Enter height", JOptionPane.QUESTION_MESSAGE));
			}catch(Exception e){
				canPass = false;
				JOptionPane.showMessageDialog(null, "Must be in integer format", "Error", JOptionPane.ERROR_MESSAGE);
				continue;
			}
			canPass = true;
		}
		
		System.out.println("height: " + mapHeight);
	}

	@Override
	public void paint(Graphics g) {
		setDoubleBuffered(true);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		section.render(g2d);
		super.paint(g);
		
	}

}
