package com.battlecity.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.battlecity.map.CellType;
import com.battlecity.map.Map;
import com.battlecity.util.SpriteLoader;

public class GameWindow extends JFrame {
	private Map map;

	public GameWindow() {
		setTitle("Battle City");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		map = new Map();
		map.loadStage1();

		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);

				CellType[][] grid = map.getMap();
				int cellSize = 64;

				for (int i = 0; i < Map.EDGE_LENGTH; ++i) {
					for (int j = 0; j < Map.EDGE_LENGTH; j++) {
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
							g.drawImage(sprite, j * cellSize, i * cellSize, cellSize, cellSize, null);
						}
					}
				}
			}
		};

		int windowSize = Map.EDGE_LENGTH * 64;
		panel.setPreferredSize(new Dimension(windowSize, windowSize));
		panel.setBackground(Color.BLACK);
		add(panel);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
