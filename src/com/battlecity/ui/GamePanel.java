package com.battlecity.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.battlecity.entity.Bullet;
import com.battlecity.entity.Tank;
import com.battlecity.map.CellType;
import com.battlecity.map.Map;
import com.battlecity.util.Constants;
import com.battlecity.util.SpriteLoader;

public class GamePanel extends JPanel implements Runnable {
	private Thread gameThread;
	private boolean running = false;
	private final int FPS = 60;

	private Map map;
	private Tank player;
	private ArrayList<Bullet> bullets = new ArrayList<>();

	public GamePanel() {
		int windowSize = Constants.EDGE_LENGTH * 64;
		setPreferredSize(new Dimension(windowSize, windowSize));
		setBackground(Color.BLACK);
		setFocusable(true);

		map = new Map();
		map.loadStage1();
		player = new Tank(4 * 64, 11 * 64);

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				player.keyPressed(e.getKeyCode());
				if (e.getKeyCode() == KeyEvent.VK_SPACE) { if (bullets.isEmpty()) { bullets.add(player.shoot()); } }
			}

			@Override
			public void keyReleased(KeyEvent e) { player.keyReleased(e.getKeyCode()); }
		});
	}

	public void startGameThread() {
		gameThread = new Thread(this);
		running = true;
		gameThread.start();
	}

	@Override
	public void run() {
		double drawInterval = 1000000000.0 / FPS;
		double delta = 0;
		long lastTime = System.nanoTime();
		long currentTime;

		while (running) {
			currentTime = System.nanoTime();
			delta += (currentTime - lastTime) / drawInterval;
			lastTime = currentTime;

			if (delta >= 1) {
				update();
				repaint();
				delta--;
			}
		}
	}

	private void update() {
		player.update(map);

		for (int i = bullets.size() - 1; i >= 0; i--) {
			Bullet b = bullets.get(i);
			b.update(map);
			if (!b.isActive()) { bullets.remove(i); }
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		CellType[][] grid = map.getMap();

		for (int i = 0; i < Constants.EDGE_LENGTH; ++i) {
			for (int j = 0; j < Constants.EDGE_LENGTH; j++) {
				CellType cell = grid[i][j];
				BufferedImage sprite = null;
				switch (cell) {
				case BRICK:
					sprite = SpriteLoader.getBrick();
					break;
				case STEEL:
					sprite = SpriteLoader.getSteel();
					break;
				case WATER:
					sprite = SpriteLoader.getWater();
					break;
				case BUSH:
					sprite = SpriteLoader.getBush();
					break;
				case ICE:
					sprite = SpriteLoader.getIce();
					break;
				case STEEL_WALL:
					sprite = SpriteLoader.getSteelWall();
					break;
				case EAGLE:
					sprite = SpriteLoader.getEagleAlive();
					break;
				default:
					break;
				}
				if (sprite != null) {
					g.drawImage(sprite, j * Constants.CELL_SIZE, i * Constants.CELL_SIZE, Constants.CELL_SIZE,
							Constants.CELL_SIZE, null);
				}
			}
		}

		player.draw(g);

		for (Bullet b : bullets) { b.draw(g); }
	}
}