package com.battlecity.entity;

import java.awt.Graphics;

import com.battlecity.map.Map;
import com.battlecity.util.Collision;
import com.battlecity.util.Constants;
import com.battlecity.util.SpriteLoader;

public class Tank extends Entity {
	private int dir;
	private int frame;

	public boolean upPressed, downPressed, leftPressed, rightPressed;

	public Tank(int x, int y) {
		super(x, y, 64, 64, 2, SpriteLoader.getYellowTanks()[0][0]);
		this.dir = 0;
		this.frame = 0;
	}

	public void move(int dir, Map map) {
		if (this.dir != dir) {
			this.dir = dir;
			int snap = Constants.CELL_SIZE / 8;
			if (dir == 0 || dir == 2) {
				x = ((x + snap / 2) / snap) * snap;
			} else {
				y = ((y + snap / 2) / snap) * snap;
			}
		}

		frame = (frame + 1) % 2;

		int dx = 0, dy = 0;
		switch (dir) {
		case 0:
			dy = -speed;
			break;
		case 1:
			dx = -speed;
			break;
		case 2:
			dy = speed;
			break;
		case 3:
			dx = speed;
			break;
		}

		int nextX = this.x + dx;
		int nextY = this.y + dy;

		if (!Collision.isOutOfBounds(nextX, nextY, width, height)
				&& !Collision.checkMapCollision(nextX, nextY, width, height, map)) {
			this.x = nextX;
			this.y = nextY;
		}

		img = SpriteLoader.getYellowTanks()[0][frame + dir * 2];
	}

	@Override
	public void draw(Graphics g) { g.drawImage(img, x, y, width, height, null); }

	@Override
	public void update(Map map) {
		if (upPressed) {
			move(0, map);
		} else if (leftPressed) {
			move(1, map);
		} else if (downPressed) {
			move(2, map);
		} else if (rightPressed) { move(3, map); }
	}
}