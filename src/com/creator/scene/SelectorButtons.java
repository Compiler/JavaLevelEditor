package com.creator.scene;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.creator.map.Map;

public class SelectorButtons {
	
	
	float x, y, width, height;
	
	private final String entity = "Entity", light = "Light", dynamic = "Dynamic", kinematic = "Kinematic", staticBody = "Static", cone = "Cone", point = "Point";
	public static final int ENTITY_INDEX = 0, LIGHT_INDEX = 1, DYNAMIC_INDEX = 2, KINEMATIC_INDEX = 3, STATIC_INDEX = 4, POINT_INDEX = 5, CONE_INDEX = 6;
	
	private ArrayList<JCheckBox> buttons = new ArrayList<JCheckBox>();
	public SelectorButtons(float x, float y, float width, float height, Color color){
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		int paddingX = (int) (x + width / 4);
		int paddingY = (int) (y + height / 16);
		int spacerY = (int) (height / 32);
		int count = 0;
		
		JCheckBox box = new JCheckBox(entity);
		box.setHorizontalAlignment(SwingConstants.LEFT);
		box.setVerticalAlignment(SwingConstants.CENTER);
		box.setHorizontalTextPosition(SwingConstants.LEFT);
		box.setVerticalTextPosition(SwingConstants.CENTER);
		box.setFont(new Font(entity, Font.LAYOUT_LEFT_TO_RIGHT, 15));
		box.setBackground(color);
		box.setForeground(Color.white);
		box.setSelected(false);
		box.setBounds(paddingX, paddingY + spacerY * count++, box.getFont().getSize() * entity.length(), box.getFont().getSize());
		box.setVisible(true);
		box.addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e) {
				if(buttons.get(0).isSelected()){
					buttons.get(1).setEnabled(false);
					buttons.get(2).setEnabled(true);
					buttons.get(3).setEnabled(true);
					buttons.get(4).setEnabled(true);
				}
				else{
					buttons.get(1).setEnabled(true);
					buttons.get(2).setEnabled(false);
					buttons.get(3).setEnabled(false);
					buttons.get(4).setEnabled(false);
					buttons.get(2).setSelected(false);
					buttons.get(3).setSelected(false);
					buttons.get(4).setSelected(false);
				}
			}});
				
				
		buttons.add(box);
		
		box = new JCheckBox(light);
		box.setHorizontalAlignment(SwingConstants.LEFT);
		box.setVerticalAlignment(SwingConstants.CENTER);
		box.setHorizontalTextPosition(SwingConstants.LEFT);
		box.setVerticalTextPosition(SwingConstants.CENTER);
		box.setFont(new Font(light, Font.LAYOUT_LEFT_TO_RIGHT, 15));
		box.setBackground(color);
		box.setForeground(Color.white);
		box.setSelected(false);
		box.setBounds(paddingX, paddingY + spacerY * count++, box.getFont().getSize() * entity.length(), box.getFont().getSize());
		box.setVisible(true);
		box.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
		        	buttons.get(0).setEnabled(false);
		        	buttons.get(5).setEnabled(true);
		        	buttons.get(6).setEnabled(true);
					buttons.get(0).setSelected(false);
					buttons.get(5).setSelected(false);
					buttons.get(6).setSelected(false);
					System.out.println("disabled entity");
		        } else if(e.getStateChange() == ItemEvent.DESELECTED){
		        	buttons.get(0).setEnabled(true);
		        	buttons.get(5).setEnabled(false);
		        	buttons.get(6).setEnabled(false);
		        	buttons.get(5).setSelected(false);
					buttons.get(6).setSelected(false);
					System.out.println("enabled entity");
		        };
		    }
		});
		
		
		buttons.add(box);
		
		box = new JCheckBox(dynamic);
		box.setHorizontalAlignment(SwingConstants.LEFT);
		box.setVerticalAlignment(SwingConstants.CENTER);
		box.setHorizontalTextPosition(SwingConstants.LEFT);
		box.setVerticalTextPosition(SwingConstants.CENTER);
		box.setFont(new Font(light, Font.LAYOUT_LEFT_TO_RIGHT, 15));
		box.setBackground(color);
		box.setForeground(Color.white);
		box.setSelected(false);
		box.setEnabled(false);
		box.setBounds(paddingX - 10, paddingY + spacerY * ++count, box.getFont().getSize() * entity.length(), box.getFont().getSize());
		box.setVisible(true);
		box.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
		        	buttons.get(3).setEnabled(false);
		        	Map.col = Color.pink;
					buttons.get(4).setEnabled(false);
					buttons.get(3).setSelected(false);
					buttons.get(4).setSelected(false);
					System.out.println("disabled static and kinematic");
		        } else if(e.getStateChange() == ItemEvent.DESELECTED){
		        	buttons.get(3).setEnabled(true);
					buttons.get(4).setEnabled(true);
					System.out.println("enabled static and kinematic");
		        };
		    }
		});
		
		buttons.add(box);
		
		box = new JCheckBox(kinematic);
		box.setHorizontalAlignment(SwingConstants.LEFT);
		box.setVerticalAlignment(SwingConstants.CENTER);
		box.setHorizontalTextPosition(SwingConstants.LEFT);
		box.setVerticalTextPosition(SwingConstants.CENTER);
		box.setFont(new Font(light, Font.LAYOUT_LEFT_TO_RIGHT, 15));
		box.setBackground(color);
		box.setForeground(Color.white);
		box.setSelected(false);
		box.setEnabled(false);
		box.setBounds(paddingX - 10, paddingY + spacerY * ++count, box.getFont().getSize() * entity.length(), box.getFont().getSize());
		box.setVisible(true);
		box.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
		        	buttons.get(2).setEnabled(false);
		        	Map.col = Color.cyan;
					buttons.get(4).setEnabled(false);
					buttons.get(2).setSelected(false);
					buttons.get(4).setSelected(false);
					System.out.println("disabled static and dynamic");
		        } else if(e.getStateChange() == ItemEvent.DESELECTED){
		        	buttons.get(2).setEnabled(true);
					buttons.get(4).setEnabled(true);
					System.out.println("enabled static and dynamic");
		        };
		    }
		});
		
		buttons.add(box);
		
		box = new JCheckBox(staticBody);
		box.setHorizontalAlignment(SwingConstants.LEFT);
		box.setVerticalAlignment(SwingConstants.CENTER);
		box.setHorizontalTextPosition(SwingConstants.LEFT);
		box.setVerticalTextPosition(SwingConstants.CENTER);
		box.setFont(new Font(light, Font.LAYOUT_LEFT_TO_RIGHT, 15));
		box.setBackground(color);
		box.setForeground(Color.white);
		box.setSelected(false);
		box.setEnabled(false);
		box.setBounds(paddingX - 10, paddingY + spacerY * ++count, box.getFont().getSize() * entity.length(), box.getFont().getSize());
		box.setVisible(true);
		box.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
		        	buttons.get(2).setEnabled(false);
		        	Map.col = Color.green;
					buttons.get(3).setEnabled(false);
					buttons.get(2).setSelected(false);
					buttons.get(3).setSelected(false);
					System.out.println("disabled dynamic and kinematic");
		        } else if(e.getStateChange() == ItemEvent.DESELECTED){
		        	buttons.get(2).setEnabled(true);
					buttons.get(3).setEnabled(true);
					System.out.println("enabled dynamic and kinematic");
		        };
		    }
		});

		
		
		buttons.add(box);
		
		
		count++;
		box = new JCheckBox(point);
		box.setHorizontalAlignment(SwingConstants.LEFT);
		box.setVerticalAlignment(SwingConstants.CENTER);
		box.setHorizontalTextPosition(SwingConstants.LEFT);
		box.setVerticalTextPosition(SwingConstants.CENTER);
		box.setFont(new Font(light, Font.LAYOUT_LEFT_TO_RIGHT, 15));
		box.setBackground(color);
		box.setForeground(Color.white);
		box.setSelected(false);
		box.setEnabled(false);
		box.setBounds(paddingX - 10, paddingY + spacerY * ++count, box.getFont().getSize() * entity.length(), box.getFont().getSize());
		box.setVisible(true);
		box.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
		        	buttons.get(6).setEnabled(false);
					buttons.get(6).setSelected(false);
					System.out.println("disabled cone");
		        } else if(e.getStateChange() == ItemEvent.DESELECTED){
		        	buttons.get(6).setEnabled(true);
		        	buttons.get(6).setSelected(false);
					System.out.println("enabled cone");
		        };
		    }
		});

		
		
		buttons.add(box);
		
		box = new JCheckBox(cone);
		box.setHorizontalAlignment(SwingConstants.LEFT);
		box.setVerticalAlignment(SwingConstants.CENTER);
		box.setHorizontalTextPosition(SwingConstants.LEFT);
		box.setVerticalTextPosition(SwingConstants.CENTER);
		box.setFont(new Font(light, Font.LAYOUT_LEFT_TO_RIGHT, 15));
		box.setBackground(color);
		box.setForeground(Color.white);
		box.setSelected(false);
		box.setEnabled(false);
		box.setBounds(paddingX - 10, paddingY + spacerY * ++count, box.getFont().getSize() * entity.length(), box.getFont().getSize());
		box.setVisible(true);
		box.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
		        	buttons.get(5).setEnabled(false);
					buttons.get(5).setSelected(false);
					Map.col = Color.red;
					System.out.println("disabled point");
		        } else if(e.getStateChange() == ItemEvent.DESELECTED){
		        	buttons.get(5).setEnabled(true);
					System.out.println("enabled point");
		        };
		    }
		});

		
		buttons.add(box);
		
	}
	
	
	public ArrayList<JCheckBox> getButtons(){ return this.buttons; }

}
