package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {
		int speed = 1;
		float theta = 0;
	CircleMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.magenta);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
	
		setX(getX()+speed);
		
		theta+=0.03;
		x = (int)(100*Math.cos(theta));
		y = (int)(100*Math.sin(theta));
	}

}
