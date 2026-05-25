package com.battlecity.ui;

import javax.swing.*;

import com.battlecity.util.SpriteLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GameWindow extends JFrame {
    public GameWindow() {
    	setTitle("Battle City");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel() {
        	@Override
        	protected void paintComponent(Graphics g) {
        	    super.paintComponent(g);
        	    BufferedImage[][][] allTanks = {
        	    	SpriteLoader.getYellowTanks(),
        	    	SpriteLoader.getGrayTanks(),
        	        SpriteLoader.getGreenTanks(),
        	        SpriteLoader.getPinkTanks()
        	    };
        	    
        	    int y = 10;
        	    for (BufferedImage[][] tankSet : allTanks) {
        	    	int x = 10;
        	    	for (BufferedImage[] tankLine : tankSet) {
        	    		for (BufferedImage tank : tankLine) {
        	    			g.drawImage(tank, x, y, 16, 16, null);
        	    			x += 20;
        	    		}
        	    		x = 10;
        	    		y += 20;
        	    	}
        	    	y += 20;
        	    }
        	}
        };
        
        panel.setPreferredSize(new Dimension(400, 800));
        panel.setBackground(Color.BLACK);
        add(panel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
