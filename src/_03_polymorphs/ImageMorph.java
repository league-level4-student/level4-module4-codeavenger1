package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph implements MouseListener{
	public static BufferedImage image;
	
	ImageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream("possum.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
	g.setColor(Color.pink);
	g.fillRect(getX(), getY(), getWidth(), getHeight());
	g.drawImage(image, x, y, width, height, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int mouseX = e.getX();
		int mouseY = e.getY();
		
		if (mouseX >= 400 && mouseX <= 420 && mouseY >= 420 && mouseY <= 440) {
			
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
