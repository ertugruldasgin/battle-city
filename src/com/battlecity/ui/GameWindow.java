package com.battlecity.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.battlecity.util.SpriteLoader;

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
//
//				BufferedImage ice = SpriteLoader.getIce();
//				BufferedImage miniIce = SpriteLoader.getMiniIce();
//
//				BufferedImage bush = SpriteLoader.getBush();
//				BufferedImage miniBush = SpriteLoader.getMiniBush();
//
//				BufferedImage steelWall = SpriteLoader.getSteelWall();
//				BufferedImage miniSteelWall = SpriteLoader.getMiniSteelWall();
//
//				BufferedImage eagleAlive = SpriteLoader.getEagleAlive();
//				BufferedImage eagleDead = SpriteLoader.getEagleDead();
//
//				BufferedImage water = SpriteLoader.getWater();
//				BufferedImage waterSec = SpriteLoader.getWaterSec();
//				BufferedImage miniWater = SpriteLoader.getMiniWater();
//				BufferedImage miniWaterSec = SpriteLoader.getMiniWaterSec();
//
//				BufferedImage[] spawn = SpriteLoader.getSpawn();
//
//				BufferedImage[] bullet = SpriteLoader.getBullet();
//
//				BufferedImage greenInk = SpriteLoader.getGreenInk();
//
//				BufferedImage[] powerUps = SpriteLoader.getPowerUps();
//
//				BufferedImage[] explosion = SpriteLoader.getExplosion();
//
//				BufferedImage[] miniExplosion = SpriteLoader.getMiniExplosion();
//
//				BufferedImage[] blinkEffect = SpriteLoader.getBlinkEffect();
//
//				BufferedImage[] scores = SpriteLoader.getScores();
//
//				BufferedImage pause = SpriteLoader.getPause();
//				BufferedImage gameOver = SpriteLoader.getGameOver();
//				BufferedImage stage = SpriteLoader.getStage();
//
//				BufferedImage enemyMark = SpriteLoader.getEnemyMark();

				BufferedImage[] numbers = SpriteLoader.getNumbers();

				BufferedImage grayBackground = SpriteLoader.getGrayBackground();
				BufferedImage brownBackground = SpriteLoader.getBrownBackground();
				BufferedImage orangeBackground = SpriteLoader.getOrangeBackground();

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
//           	y += 42;
//        	    g.drawImage(miniSteel, x, y, 32, 32, null);
//        	    y += 42;
//				g.drawImage(ice, x, y, 32, 32, null);
//				y += 42;
//				g.drawImage(miniIce, x, y, 32, 32, null);
//				y += 42;
//				g.drawImage(bush, x, y, 32, 32, null);
//				y += 42;
//				g.drawImage(miniBush, x, y, 32, 32, null);
//				y += 42;
//				g.drawImage(steelWall, x, y, 32, 32, null);
//				y += 42;
//				g.drawImage(miniSteelWall, x, y, 32, 32, null);
//				y += 42;
//				g.drawImage(eagleAlive, x, y, 32, 32, null);
//				y += 42;
//				g.drawImage(eagleDead, x, y, 32, 32, null);
//				y += 42;
//				g.drawImage(water, x, y, 32, 32, null);
//				y += 42;
//				g.drawImage(waterSec, x, y, 32, 32, null);
//				y += 42;
//				g.drawImage(miniWater, x, y, 32, 32, null);
//				y += 42;
//				g.drawImage(miniWaterSec, x, y, 32, 32, null);
//				for (int i = 0; i < 4; ++i) {
//					y += 42;
//					g.drawImage(spawn[i], x, y, 32, 32, null);
//				}
//				for (int i = 0; i < 4; ++i) {
//					y += 42;
//					g.drawImage(bullet[i], x, y, 32, 32, null);
//				}
//				y += 42;
//				g.drawImage(greenInk, x, y, 32, 32, null);
//				for (int i = 0; i < 7; ++i) {
//					y += 42;
//					g.drawImage(powerUps[i], x, y, 32, 32, null);
//				}
//
//				for (int i = 0; i < 2; ++i) {
//					y += 42;
//					g.drawImage(explosion[i], x, y, 32, 32, null);
//				}
//
//				for (int i = 0; i < 2; ++i) {
//					y += 42;
//					g.drawImage(blinkEffect[i], x, y, 32, 32, null);
//				}
//
//				for (int i = 0; i < 5; ++i) {
//					y += 42;
//					g.drawImage(scores[i], x, y, 64, 32, null);
//				}
//
//				y += 42;
//				g.drawImage(pause, x, y, 64, 32, null);
//				y += 42;
//				g.drawImage(gameOver, x, y, 64, 64, null);
//				y += 74;
//				g.drawImage(stage, x, y, 64, 32, null);
//				y += 42;
//				g.drawImage(enemyMark, x, y, 32, 32, null);
				y += 42;
				for (int i = 0; i < 10; ++i) {
					y += 42;
					g.drawImage(numbers[i], x, y, 32, 32, null);
				}
				y += 42;
				g.drawImage(grayBackground, x, y, 64, 64, null);
				y += 74;
				g.drawImage(brownBackground, x, y, 64, 64, null);
				y += 74;
				g.drawImage(orangeBackground, x, y, 64, 64, null);
			}
		};

		panel.setPreferredSize(new Dimension(400, 800));
		panel.setBackground(Color.CYAN);
		add(panel);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
