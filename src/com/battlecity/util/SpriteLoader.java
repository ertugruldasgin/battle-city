package com.battlecity.util;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class SpriteLoader {
	private static BufferedImage sprite;
	
	private static BufferedImage yellowTanks[][];
	private static BufferedImage grayTanks[][];
	private static BufferedImage greenTanks[][];
	private static BufferedImage pinkTanks[][];
	private static BufferedImage brick, brickRight, brickBottom, brickLeft, brickTop, miniBrick, miniBrickRight, miniBrickBottom, miniBrickLeft, miniBrickTop;
	private static BufferedImage steel, steelRight, steelBottom, steelLeft, steelTop, miniSteel;
	private static BufferedImage ice, miniIce;
	private static BufferedImage water, waterSec, miniWater, miniWaterSec;
	private static BufferedImage bush, miniBush;
	// TODO: There will be more sprite
	
	
	public static void loadImage() {
		try {
			sprite = ImageIO.read(new File("resources/sprites/general-sprites.png"));
		} catch (Exception e) {
			System.err.println("Sprite can not be loaded\n" + e.getMessage());
		}
		
		try {
			loadTanks();
			loadBricks();
			loadSteels();
		} catch (Exception e) {
			System.err.println("Tanks can not be loaded\n" + e.getMessage());
		}
	}
	
	private static void loadTanks() {
		yellowTanks = new BufferedImage[8][8];
		for (int i = 0; i < 8; ++i) {
			for (int j = 0; j < 8; ++j) {
				yellowTanks[i][j] = crop(j * 16, i * 16, 16, 16);
			}
		}
		
		grayTanks = new BufferedImage[8][8];
		for (int i = 0; i < 8; ++i) {
		    for (int j = 0; j < 8; ++j) {
		        grayTanks[i][j] = crop((j + 8) * 16, i * 16, 16, 16);
		    }
		}

		greenTanks = new BufferedImage[8][8];
		for (int i = 0; i < 8; ++i) {
		    for (int j = 0; j < 8; ++j) {
		        greenTanks[i][j] = crop(j * 16, (i + 8) * 16, 16, 16);
		    }
		}

		pinkTanks = new BufferedImage[8][8];
		for (int i = 0; i < 8; ++i) {
		    for (int j = 0; j < 8; ++j) {
		        pinkTanks[i][j] = crop((j + 8) * 16, (i + 8) * 16, 16, 16);
		    }
		}
	}
	
	private static void loadBricks() {
		try {
			brick = crop(256, 0, 16, 16);
			brickRight = crop(272, 0, 16, 16);
			brickBottom = crop(288, 0, 16, 16);
			brickLeft = crop(304, 0, 16, 16);
			brickTop = crop(320, 0, 16, 16);
			miniBrick = crop(256, 64, 8, 8);
			miniBrickRight = crop(264, 64, 8, 8);
			miniBrickBottom = crop(272, 64, 8, 8);
			miniBrickLeft = crop(280, 64, 8, 8);
			miniBrickTop = crop(288, 64, 8, 8);
		} catch (Exception e) {
			System.err.println("Tanks can not be bricks\n" + e.getMessage());
		}
	}
	
	private static void loadSteels() {
		try {
			steel = crop(256, 16, 16, 16);
			steelRight = crop(272, 16, 16, 16);
			steelBottom = crop(288, 16, 16, 16);
			steelLeft = crop(304, 16, 16, 16);
			steelTop = crop(320, 16, 16, 16);
			miniSteel = crop(256, 72, 8, 8);
		} catch (Exception e) {
			System.err.println("Tanks can not be steels\n" + e.getMessage());
		}
	}
	
	
	// TODO: Don't sure about the getter method for sprite
	//public static BufferedImage getSprite() { return sprite; }
	
	public static BufferedImage[][] getYellowTanks() { return yellowTanks; }
	public static BufferedImage[][] getGrayTanks() { return grayTanks; }
	public static BufferedImage[][] getGreenTanks() { return greenTanks; }
	public static BufferedImage[][] getPinkTanks() { return pinkTanks; }
	
	public static BufferedImage getBrick() { return brick; }
	public static BufferedImage getBrickRight() { return brickRight; }
	public static BufferedImage getBrickBottom() { return brickBottom; }
	public static BufferedImage getBrickLeft() { return brickLeft; }
	public static BufferedImage getBrickTop() { return brickTop; }
	public static BufferedImage getMiniBrick() { return miniBrick; }
	public static BufferedImage getMiniBrickRight() { return miniBrickRight; }
	public static BufferedImage getMiniBrickBottom() { return miniBrickBottom; }
	public static BufferedImage getMiniBrickLeft() { return miniBrickLeft; }
	public static BufferedImage getMiniBrickTop() { return miniBrickTop; }
	
	public static BufferedImage getSteel() { return steel; }
	public static BufferedImage getSteelRight() { return steelRight; }
	public static BufferedImage getSteelBottom() { return steelBottom; }
	public static BufferedImage getSteelLeft() { return steelLeft; }
	public static BufferedImage getSteelTop() { return steelTop; }
	public static BufferedImage getMiniSteel() { return miniSteel; }
	
	public static BufferedImage getIce() { return ice; }
	public static BufferedImage getMiniIce() { return miniIce; }
	
	public static BufferedImage getWater() { return water; }
	public static BufferedImage getWaterSec() { return waterSec; }
	public static BufferedImage getMiniWater() { return miniWater; }
	public static BufferedImage getMiniWaterSec() { return miniWaterSec; }
	
	public static BufferedImage getBush() { return bush; }
	public static BufferedImage getMiniBush() { return miniBush; }

	
	public static BufferedImage crop(int x, int y, int width, int height) {
		return sprite.getSubimage(x, y, width, height);
	}
}
