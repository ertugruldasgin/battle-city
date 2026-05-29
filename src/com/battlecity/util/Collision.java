package com.battlecity.util;

import com.battlecity.entity.Entity;
import com.battlecity.map.CellType;
import com.battlecity.map.Map;

public class Collision {
	public static boolean checkEntityCollision(Entity a, Entity b) {
		return a.getX() < b.getX() + b.getWidth() && a.getX() + a.getWidth() > b.getX()
				&& a.getY() < b.getY() + b.getHeight() && a.getY() + a.getHeight() > b.getY();
	}

	public static boolean isOutOfBounds(int nextX, int nextY, int width, int height) {
		return nextX < 0 || nextY < 0 || nextX + width > (Constants.BOARD_WIDTH)
				|| nextY + height > (Constants.BOARD_WIDTH);
	}

	public static boolean checkMapCollision(int nextX, int nextY, int width, int height, Map map) {
		int left = nextX / Constants.CELL_SIZE;
		int right = (nextX + width - 1) / Constants.CELL_SIZE;
		int top = nextY / Constants.CELL_SIZE;
		int bottom = (nextY + height - 1) / Constants.CELL_SIZE;

		for (int i = top; i <= bottom; ++i) {
			for (int j = left; j <= right; ++j) {
				if (i >= 0 && i < Constants.EDGE_LENGTH && j >= 0 && j < Constants.EDGE_LENGTH) {
					CellType cell = map.getCell(i, j);
					if (isSolid(cell)) { return true; }
				}
			}
		}
		return false;
	}

	private static boolean isSolid(CellType type) {
		return type == CellType.BRICK || type == CellType.STEEL || type == CellType.STEEL_WALL || type == CellType.WATER
				|| type == CellType.EAGLE;
	}
}
