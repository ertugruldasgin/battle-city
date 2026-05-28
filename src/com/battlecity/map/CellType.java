package com.battlecity.map;

public enum CellType {
	EMPTY(0), BRICK(1), STEEL(2), WATER(3), BUSH(4), ICE(5), STEEL_WALL(6), EAGLE(7);

	private final int val;

	CellType(int val) { this.val = val; }

	public int getVal() { return val; }

	public static CellType fromInt(int value) { return CellType.values()[value]; }
}