package com.battlecity.entity;

import java.awt.Graphics;

import com.battlecity.map.CellType;
import com.battlecity.map.Map;
import com.battlecity.util.Collision;
import com.battlecity.util.Constants;
import com.battlecity.util.SpriteLoader;

public class Bullet extends Entity {
	private int dir;
	private boolean active;

	public Bullet(int x, int y, int dir) {
		super(x, y, 8, 8, 6, SpriteLoader.getBullet()[dir]);
		this.dir = dir;
		this.active = true;
	}

	@Override
	public void update(Map map) {
		switch (dir) {
		case 0:
			y -= speed;
			break;
		case 1:
			x -= speed;
			break;
		case 2:
			y += speed;
			break;
		case 3:
			x += speed;
			break;
		}

		if (Collision.isOutOfBounds(x, y, width, height)) {
			active = false;
			return;
		}

		int centerX = x + width / 2;
		int centerY = y + height / 2;
		int col = centerX / Constants.CELL_SIZE;
		int row = centerY / Constants.CELL_SIZE;

		if (row >= 0 && row < Constants.EDGE_LENGTH && col >= 0 && col < Constants.EDGE_LENGTH) {
			CellType cell = map.getCell(row, col);
			if (cell == CellType.BRICK) {
				map.setCell(row, col, CellType.EMPTY);
				active = false;
			} else if (cell == CellType.STEEL || cell == CellType.STEEL_WALL) { active = false; }
		}
	}

	@Override
	public void draw(Graphics g) { if (active) { g.drawImage(img, x, y, width, height, null); } }

	public boolean isActive() { return active; }

	public void setActive(boolean active) { this.active = active; }
}