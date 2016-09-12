package com.creator.scene;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.creator.map.Map;

public class Scene extends JPanel {

	int mapWidth, mapHeight, screenHeight, screenWidth;

	private SelectorSection section;

	private Map map;

	private float mouseX, mouseY;
	boolean update = false;
	public Scene(int sWidth, int sHeight) {

		this.setLayout(null);
		this.screenWidth = sWidth;
		this.screenHeight = sHeight;
		// initMap();
		this.setOpaque(false);
		this.setBackground(Color.black);
		section = new SelectorSection(0, 0, screenWidth / 16, screenHeight);
		section.add(this);

		map = new Map(100, 100);

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				update = true;
			}
		});

	}

	public void initMap() {
		boolean canPass = false;

		while (!canPass) {
			try {
				mapWidth = Integer.parseInt(JOptionPane.showInputDialog(null, "Width: ", "Enter width", JOptionPane.QUESTION_MESSAGE));
			} catch (Exception e) {
				canPass = false;
				JOptionPane.showMessageDialog(null, "Must be in integer format", "Error", JOptionPane.ERROR_MESSAGE);
				continue;
			}
			canPass = true;
		}

		System.out.println("width: " + mapWidth);

		canPass = false;
		while (!canPass) {
			try {
				mapHeight = Integer.parseInt(JOptionPane.showInputDialog(null, "Height: ", "Enter height", JOptionPane.QUESTION_MESSAGE));
			} catch (Exception e) {
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
		if(update){
			map.update(mouseX, mouseY);
			update = false;
		}
		
		setDoubleBuffered(true);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		map.render(g2d);
		section.render(g2d);
		super.paint(g);

	}

}
