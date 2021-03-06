package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	 int x;
	 int y;

	 int width;
	 int height;

  Polymorph(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		
		this.width = width;
		this.height = height;
	}

	public void update() {
		
	}

	public abstract void draw(Graphics g);
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}

	public int getWidth() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
}
