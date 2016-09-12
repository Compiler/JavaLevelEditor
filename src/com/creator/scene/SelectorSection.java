package com.creator.scene;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class SelectorSection {
	
	
	private Rectangle2D overlay, entity, light;
	public SelectorSection(float x, float y, float width, float height){
		overlay = new Rectangle2D.Float(x, y, width, height);
	}
	
	
	public void render(Graphics2D graphics){
		graphics.setColor(Color.black);
		graphics.fill(overlay);
		
	}

	
}
