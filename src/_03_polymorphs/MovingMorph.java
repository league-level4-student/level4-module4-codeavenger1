package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {
	int speed = 5;
	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		setX(getX()+speed);
		
		
	}

}
