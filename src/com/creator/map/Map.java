package com.creator.map;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.InputEvent;

public class Map {
	
	private MapObject map[][];
	
	private int width, height;
	
	private final int cell = 25;
	
	public static Color col;
	
	public Map(int width, int height){
		
		this.width = width;
		this.height = height;
		
		map = new MapObject[width][height];
		
		Color tmp = new Color(.5f, .5f, .5f, .5f);
		for(int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				map[x][y] = new MapObject(x, y, tmp);
			}
		}
		
		col = Color.black;
		
	}
	
	public void update(float x, float y){
		map[(int) (x / cell > 0 && x / cell < width ? x / cell: 0)][(int) (y / cell > 0 && y / cell < height ? y / cell: 0)].setColor(col);
		System.out.println("(" + x + ", " + y + ")");
	}
	
	public void render(Graphics2D graphics){
		
		for(int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				graphics.setColor(map[x][y].getColor());
				graphics.drawRect(x * cell, y * cell, cell, cell);
			}
		}
		
	}

}
