package com.creator.map;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.InputEvent;

public class Map {
	
	private short map[][];
	
	private int width, height;
	
	private final int cell = 25;
	
	public Map(int width, int height){
		
		this.width = width;
		this.height = height;
		
		map = new short[width][height];
		
	}
	
	public void update(float x, float y){
		
	}
	
	public void render(Graphics2D graphics){
		graphics.setColor(Color.darkGray);
		for(int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				graphics.drawRect(x * cell, y * cell, cell, cell);
			}
		}
		
	}

}
