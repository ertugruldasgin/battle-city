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
//        	    BufferedImage brick = SpriteLoader.getBrick();
//        	    BufferedImage brickRight = SpriteLoader.getBrickRight();
//        	    BufferedImage brickBottom = SpriteLoader.getBrickBottom();
//        	    BufferedImage brickLeft = SpriteLoader.getBrickLeft();
//        	    BufferedImage brickTop = SpriteLoader.getBrickTop();
//        	    BufferedImage miniBrick = SpriteLoader.getMiniBrick();
//        	    BufferedImage miniBrickRight = SpriteLoader.getMiniBrickRight();
//        	    BufferedImage miniBrickBottom = SpriteLoader.getMiniBrickBottom();
//        	    BufferedImage miniBrickLeft = SpriteLoader.getMiniBrickLeft();
//        	    BufferedImage miniBrickTop = SpriteLoader.getMiniBrickTop();
//        	    
//        	    BufferedImage steel = SpriteLoader.getSteel();
//        	    BufferedImage steelRight = SpriteLoader.getSteelRight();
//        	    BufferedImage steelBottom = SpriteLoader.getSteelBottom();
//        	    BufferedImage steelLeft = SpriteLoader.getSteelLeft();
//        	    BufferedImage steelTop = SpriteLoader.getSteelTop();
//        	    BufferedImage miniSteel = SpriteLoader.getMiniSteel();
        	    
        	    BufferedImage ice = SpriteLoader.getIce();
        	    BufferedImage miniIce = SpriteLoader.getMiniIce();
        	    
        	    BufferedImage bush = SpriteLoader.getBush();
        	    BufferedImage miniBush = SpriteLoader.getMiniBush();
        	    
        	    
        	    BufferedImage steelWall = SpriteLoader.getSteelWall();
        	    BufferedImage miniSteelWall= SpriteLoader.getMiniSteelWall();
        	    
        	    BufferedImage eagleAlive = SpriteLoader.getEagleAlive();
        	    BufferedImage eagleDead = SpriteLoader.getEagleDead();
        	    
        	    BufferedImage water = SpriteLoader.getWater();
        	    BufferedImage waterSec = SpriteLoader.getWaterSec();
        	    BufferedImage miniWater = SpriteLoader.getMiniWater();
        	    BufferedImage miniWaterSec = SpriteLoader.getMiniWaterSec();
        	    
        	    int x = 10, y = 10;
//        	    g.drawImage(brick, x, y, 32, 32, null);
//        	    y += 42;
//        	    g.drawImage(brickRight, x, y, 32, 32, null);
//        	    y += 42;
//        	    g.drawImage(brickBottom, x, y, 32, 32, null);
//        	    y += 42;
//        	    g.drawImage(brickLeft, x, y, 32, 32, null);
//        	    y += 42;
//        	    g.drawImage(brickTop, x, y, 32, 32, null);
//        	    y += 42;
//        	    g.drawImage(miniBrick, x, y, 32, 32, null);
//        	    y += 42;
//        	    g.drawImage(miniBrickRight, x, y, 32, 32, null);
//        	    y += 42;
//        	    g.drawImage(miniBrickBottom, x, y, 32, 32, null);
//        	    y += 42;
//        	    g.drawImage(miniBrickLeft, x, y, 32, 32, null);
//        	    y += 42;
//        	    g.drawImage(miniBrickTop, x, y, 32, 32, null);
//        	    y += 42;
//        	    g.drawImage(steel, x, y, 32, 32, null);
//        	    y += 42;
//        	    g.drawImage(steelRight, x, y, 32, 32, null);
//        	    y += 42;
//        	    g.drawImage(steelBottom, x, y, 32, 32, null);
//        	    y += 42;
//        	    g.drawImage(steelLeft, x, y, 32, 32, null);
//        	    y += 42;
//        	    g.drawImage(steelTop, x, y, 32, 32, null);
//           	    y += 42;
//        	    g.drawImage(miniSteel, x, y, 32, 32, null);
//        	    y += 42;
        	    g.drawImage(ice, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(miniIce, x, y, 32, 32, null);
         	    y += 42;
        	    g.drawImage(bush, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(miniBush, x, y, 32, 32, null);
         	    y += 42;
        	    g.drawImage(steelWall, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(miniSteelWall, x, y, 32, 32, null);
         	    y += 42;
        	    g.drawImage(eagleAlive, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(eagleDead, x, y, 32, 32, null);
         	    y += 42;
        	    g.drawImage(water, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(waterSec, x, y, 32, 32, null);
         	    y += 42;
        	    g.drawImage(miniWater, x, y, 32, 32, null);
        	    y += 42;
        	    g.drawImage(miniWaterSec, x, y, 32, 32, null);
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
