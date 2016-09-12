package com.creator.map;

import java.awt.Color;

public class MapObject {
	
	private Color col;
	private int x, y, id;
	public MapObject(int x, int y, Color col){
		this.x = x;
		this.y = y;
		this.col = col;
		id = 0;
	}
	
	public void setColor(Color col){
		this.col = col;
	}
	
	public Color getColor(){ return col; }

}
