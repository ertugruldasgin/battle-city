package com.battlecity;

import com.battlecity.ui.GameWindow;
import com.battlecity.util.SpriteLoader;

public class Main {
	public static void main(String[] args) {
		SpriteLoader.loadImage();
		GameWindow gameWindow = new GameWindow();
	}
}
