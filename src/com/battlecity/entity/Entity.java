package com.battlecity.entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.battlecity.map.Map;

public abstract class Entity {
	protected int x, y;
	protected int width, height;
	protected int speed;
	protected BufferedImage img;

	public Entity(int x, int y, int width, int height, int speed, BufferedImage img) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = speed;
		this.img = img;
	}

	public abstract void draw(Graphics g);

	public abstract void update(Map map);

	public int getX() { return x; }

	public int getY() { return y; }

	public int getWidth() { return width; }

	public int getHeight() { return height; }

	public void setImg(BufferedImage img) { this.img = img; }
}
