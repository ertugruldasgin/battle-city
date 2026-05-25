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
	private static BufferedImage brick, brickStairRight, brickStairLeft, brickSlab, miniBrick, miniBrickStairRight, miniBrickStairLeft, miniBrickSlab;
	private static BufferedImage steel, steelStairRight, steelStairLeft, steelSlab, miniSteel;
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
	
	public static BufferedImage getSprite() { return sprite; }
	
	public static BufferedImage[][] getYellowTanks() { return yellowTanks; }
	
	public static BufferedImage[][] getGrayTanks() { return grayTanks; }
	
	public static BufferedImage[][] getGreenTanks() { return greenTanks; }
	
	public static BufferedImage[][] getPinkTanks() { return pinkTanks; }
	
	public static BufferedImage crop(int x, int y, int width, int height) {
		return sprite.getSubimage(x, y, width, height);
	}
}
