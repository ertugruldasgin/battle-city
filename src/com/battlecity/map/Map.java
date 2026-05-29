package com.battlecity.map;

import com.battlecity.util.Constants;

public class Map {
	private CellType[][] stage;

	public Map() { stage = new CellType[Constants.EDGE_LENGTH][Constants.EDGE_LENGTH]; }

	public CellType[][] getMap() { return stage; }

	public CellType getCell(int row, int col) { return stage[row][col]; }

	public void setCell(int row, int col, CellType val) { stage[row][col] = val; }

	public void loadStage1() {
		for (int r = 0; r < Constants.EDGE_LENGTH; r++) {
			for (int c = 0; c < Constants.EDGE_LENGTH; c++) { stage[r][c] = CellType.EMPTY; }
		}

		stage[12][6] = CellType.EAGLE;

		stage[12][5] = CellType.BRICK;
		stage[12][7] = CellType.BRICK;
		stage[11][5] = CellType.BRICK;
		stage[11][6] = CellType.BRICK;
		stage[11][7] = CellType.BRICK;

		for (int i = 1; i < 6; ++i) { for (int j = 0; j < 6; ++j) { stage[i][j * 2 + 1] = CellType.BRICK; } }

		for (int i = 7; i < 10; ++i) { for (int j = 0; j < 6; ++j) { stage[i][j * 2 + 1] = CellType.BRICK; } }
	}
}
