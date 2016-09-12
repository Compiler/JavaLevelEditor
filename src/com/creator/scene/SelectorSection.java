package com.creator.scene;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class SelectorSection {

	private Rectangle2D overlayRect, entityRect, lightRect;
	private Font font;


	private float x, y, width, height, fontWidth = 25;

	private SelectorButtons buttons;
	public SelectorSection(float x, float y, float width, float height) {
		overlayRect = new Rectangle2D.Float(x, y + height / 32, width, height - height / 32);


		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;

		
		buttons = new SelectorButtons(x, y, width, height, Color.darkGray);
	}
	public void add(JPanel panel){
		for(int i = 0; i < buttons.getButtons().size(); i++)
			panel.add(buttons.getButtons().get(i));
	}


	public void render(Graphics2D graphics) {
		graphics.setColor(Color.darkGray);
		graphics.fill(overlayRect);
		graphics.setColor(Color.lightGray);
		graphics.draw(overlayRect);

	}

}
