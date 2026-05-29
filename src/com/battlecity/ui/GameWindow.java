package com.battlecity.ui;

import javax.swing.JFrame;

public class GameWindow extends JFrame {

	public GameWindow() {
		setTitle("Battle City");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		GamePanel gamePanel = new GamePanel();
		add(gamePanel);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);

		gamePanel.startGameThread();
	}
}