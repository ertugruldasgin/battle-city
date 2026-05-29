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
	private static BufferedImage brick, brickRight, brickBottom, brickLeft, brickTop, miniBrick, miniBrickRight,
			miniBrickBottom, miniBrickLeft, miniBrickTop;
	private static BufferedImage steel, steelRight, steelBottom, steelLeft, steelTop, miniSteel;
	private static BufferedImage ice, miniIce;
	private static BufferedImage bush, miniBush;
	private static BufferedImage steelWall, miniSteelWall;
	private static BufferedImage eagleAlive, eagleDead;
	private static BufferedImage water, waterSec, miniWater, miniWaterSec;
	private static BufferedImage spawn[];
	private static BufferedImage bullet[];
	private static BufferedImage greenInk;
	private static BufferedImage powerUps[];
	private static BufferedImage explosion[], miniExplosion[];
	private static BufferedImage blinkEffect[];
	private static BufferedImage scores[];
	private static BufferedImage pause, gameOver, stage;
	private static BufferedImage enemyMark;
	private static BufferedImage numbers[];
	private static BufferedImage grayBackground, brownBackground, orangeBackground;
	// TODO: There will be more sprite (playerFirst, playerSec, flag...)

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
			loadIces();
			loadBushes();
			loadSteelWalls();
			loadEagles();
			loadWaters();
			loadSpawn();
			loadBullet();
			loadGreenInk();
			loadPowerUps();
			loadMiniExplosion();
			loadExplosion();
			loadBlinkEffect();
			loadScores();
			loadTexts();
			loadEnemyMark();
			loadNumbers();
			loadBackgrounds();
		} catch (Exception e) {
			System.err.println("Image can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadTanks() {
		try {
			yellowTanks = new BufferedImage[8][8];
			for (int i = 0; i < 8; ++i) {
				for (int j = 0; j < 8; ++j) { yellowTanks[i][j] = crop(j * 16, i * 16, 16, 16); }
			}

			grayTanks = new BufferedImage[8][8];
			for (int i = 0; i < 8; ++i) {
				for (int j = 0; j < 8; ++j) { grayTanks[i][j] = crop((j + 8) * 16, i * 16, 16, 16); }
			}

			greenTanks = new BufferedImage[8][8];
			for (int i = 0; i < 8; ++i) {
				for (int j = 0; j < 8; ++j) { greenTanks[i][j] = crop(j * 16, (i + 8) * 16, 16, 16); }
			}

			pinkTanks = new BufferedImage[8][8];
			for (int i = 0; i < 8; ++i) {
				for (int j = 0; j < 8; ++j) { pinkTanks[i][j] = crop((j + 8) * 16, (i + 8) * 16, 16, 16); }
			}
		} catch (Exception e) {
			System.err.println("Tanks sprite can not be loaded\n" + e.getMessage());
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
			System.err.println("Bricks sprite can not be loaded\n" + e.getMessage());
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
			System.err.println("Steels sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadIces() {
		try {
			ice = crop(256, 32, 16, 16);
			miniIce = crop(256, 80, 8, 8);
		} catch (Exception e) {
			System.err.println("Ices sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadBushes() {
		try {
			bush = crop(272, 32, 16, 16);
			miniBush = crop(264, 72, 8, 8);
		} catch (Exception e) {
			System.err.println("Bushes sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadSteelWalls() {
		try {
			steelWall = crop(288, 32, 16, 16);
			miniSteelWall = crop(272, 72, 8, 8);
		} catch (Exception e) {
			System.err.println("Steel Walls sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadEagles() {
		try {
			eagleAlive = crop(304, 32, 16, 16);
			eagleDead = crop(320, 32, 16, 16);
		} catch (Exception e) {
			System.err.println("Eagles sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadWaters() {
		try {
			water = crop(256, 48, 16, 16);
			waterSec = crop(272, 48, 16, 16);
			miniWater = crop(264, 80, 8, 8);
			miniWaterSec = crop(272, 80, 8, 8);
		} catch (Exception e) {
			System.err.println("Waters sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadSpawn() {
		try {
			spawn = new BufferedImage[4];
			for (int i = 0; i < 4; ++i) { spawn[i] = crop(256 + i * 16, 96, 16, 16); }
		} catch (Exception e) {
			System.err.println("Spawns sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadBullet() {
		try {
			bullet = new BufferedImage[4];
			bullet[0] = crop(323, 102, 3, 4);
			bullet[3] = crop(346, 102, 4, 3);
			bullet[1] = crop(330, 102, 4, 3);
			bullet[2] = crop(339, 102, 3, 4);
		} catch (Exception e) {
			System.err.println("Bullets sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadGreenInk() {
		try {
			greenInk = crop(352, 96, 16, 16);
		} catch (Exception e) {
			System.err.println("Greenk Ink sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadPowerUps() {
		try {
			powerUps = new BufferedImage[8];
			for (int i = 0; i < 7; ++i) { powerUps[i] = crop(256 + i * 16, 112, 16, 15); }
		} catch (Exception e) {
			System.err.println("Power Ups sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadMiniExplosion() {
		try {
			miniExplosion = new BufferedImage[3];
			for (int i = 0; i < 3; ++i) { miniExplosion[i] = crop(256 + i * 16, 128, 16, 16); }
		} catch (Exception e) {
			System.err.println("Mini Explosion sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadExplosion() {
		try {
			explosion = new BufferedImage[2];
			for (int i = 0; i < 2; ++i) { explosion[i] = crop(304 + i * 32, 128, 32, 32); }
		} catch (Exception e) {
			System.err.println("Explosion sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadBlinkEffect() {
		try {
			blinkEffect = new BufferedImage[2];
			for (int i = 0; i < 2; ++i) { blinkEffect[i] = crop(256 + i * 16, 144, 16, 16); }
		} catch (Exception e) {
			System.err.println("Blink Effect sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadScores() {
		try {
			scores = new BufferedImage[5];
			for (int i = 0; i < 5; ++i) { scores[i] = crop(288 + i * 16, 163, 16, 9); }
		} catch (Exception e) {
			System.err.println("Scores sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadTexts() {
		try {
			pause = crop(289, 176, 39, 7);
			gameOver = crop(289, 184, 31, 15);
			stage = crop(329, 176, 39, 7);
		} catch (Exception e) {
			System.err.println("Texts sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadEnemyMark() {
		try {
			enemyMark = crop(321, 193, 7, 7);
		} catch (Exception e) {
			System.err.println("Enemy Mark sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadNumbers() {
		try {
			numbers = new BufferedImage[10];
			for (int i = 0; i < 5; ++i) { numbers[i] = crop(329 + i * 8, 184, 7, 7); }
			for (int i = 5; i < 10; ++i) { numbers[i] = crop(329 + (i - 5) * 8, 192, 7, 7); }
		} catch (Exception e) {
			System.err.println("Scores sprite can not be loaded\n" + e.getMessage());
		}
	}

	private static void loadBackgrounds() {
		try {
			grayBackground = crop(368, 0, 24, 24);
			brownBackground = crop(376, 24, 8, 8);
			orangeBackground = crop(384, 24, 8, 8);
		} catch (Exception e) {
			System.err.println("Backgrounds sprite can not be loaded\n" + e.getMessage());
		}
	}

	// TODO: Don't sure about the getter method for sprite
	// public static BufferedImage getSprite() { return sprite; }

	// Setters and Getters
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

	public static BufferedImage getBush() { return bush; }

	public static BufferedImage getMiniBush() { return miniBush; }

	public static BufferedImage getSteelWall() { return steelWall; }

	public static BufferedImage getMiniSteelWall() { return miniSteelWall; }

	public static BufferedImage getEagleAlive() { return eagleAlive; }

	public static BufferedImage getEagleDead() { return eagleDead; }

	public static BufferedImage getWater() { return water; }

	public static BufferedImage getWaterSec() { return waterSec; }

	public static BufferedImage getMiniWater() { return miniWater; }

	public static BufferedImage getMiniWaterSec() { return miniWaterSec; }

	public static BufferedImage[] getSpawn() { return spawn; }

	public static BufferedImage[] getBullet() { return bullet; }

	public static BufferedImage getGreenInk() { return greenInk; }

	public static BufferedImage[] getPowerUps() { return powerUps; }

	public static BufferedImage[] getExplosion() { return explosion; }

	public static BufferedImage[] getMiniExplosion() { return miniExplosion; }

	public static BufferedImage[] getBlinkEffect() { return blinkEffect; }

	public static BufferedImage[] getScores() { return scores; }

	public static BufferedImage getPause() { return pause; }

	public static BufferedImage getGameOver() { return gameOver; }

	public static BufferedImage getStage() { return stage; }

	public static BufferedImage getEnemyMark() { return enemyMark; }

	public static BufferedImage[] getNumbers() { return numbers; }

	public static BufferedImage getGrayBackground() { return grayBackground; }

	public static BufferedImage getBrownBackground() { return brownBackground; }

	public static BufferedImage getOrangeBackground() { return orangeBackground; }

	public static BufferedImage crop(int x, int y, int width, int height) {
		return sprite.getSubimage(x, y, width, height);
	}
}
