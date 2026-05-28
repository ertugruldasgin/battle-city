package com.battlecity.map;

public class Map {
	public static final int EDGE_LENGTH = 26;
	public static final int BOARD_WIDTH = 16 * EDGE_LENGTH;

	private CellType[][] stage;

	public Map() { stage = new CellType[EDGE_LENGTH][EDGE_LENGTH]; }

	public CellType[][] getMap() { return stage; }

	public CellType getCell(int row, int col) { return stage[row][col]; }

	public void setCell(int row, int col, CellType val) { stage[row][col] = val; }
}
