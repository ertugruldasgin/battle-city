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
        	    BufferedImage brick = SpriteLoader.getBrick();
        	    BufferedImage brickRight = SpriteLoader.getBrickRight();
        	    BufferedImage brickBottom = SpriteLoader.getBrickBottom();
        	    BufferedImage brickLeft = SpriteLoader.getBrickLeft();
        	    BufferedImage brickTop = SpriteLoader.getBrickTop();
        	    BufferedImage miniBrick = SpriteLoader.getMiniBrick();
        	    BufferedImage miniBrickRight = SpriteLoader.getMiniBrickRight();
        	    BufferedImage miniBrickBottom = SpriteLoader.getMiniBrickBottom();
        	    BufferedImage miniBrickLeft = SpriteLoader.getMiniBrickLeft();
        	    BufferedImage miniBrickTop = SpriteLoader.getMiniBrickTop();
        	    
        	    BufferedImage steel = SpriteLoader.getSteel();
        	    BufferedImage steelRight = SpriteLoader.getSteelRight();
        	    BufferedImage steelBottom = SpriteLoader.getSteelBottom();
        	    BufferedImage steelLeft = SpriteLoader.getSteelLeft();
        	    BufferedImage steelTop = SpriteLoader.getSteelTop();
        	    BufferedImage miniSteel = SpriteLoader.getMiniSteel();
        	    
        	    int x = 10, y = 10;
        	    g.drawImage(brick, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(brickRight, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(brickBottom, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(brickLeft, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(brickTop, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(miniBrick, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(miniBrickRight, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(miniBrickBottom, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(miniBrickLeft, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(miniBrickTop, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(steel, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(steelRight, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(steelBottom, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(steelLeft, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(steelTop, x, y, 32, 32, null);
           	    y += 42;
        	    g.drawImage(miniSteel, x, y, 32, 32, null);
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
