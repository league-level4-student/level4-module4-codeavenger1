package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class MessageMorph extends Polymorph implements MouseListener{

	MessageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
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
		
		if (mouseX >= 300 && mouseX <= 320 && mouseY >= 320 && mouseY <= 340) {
			String ans = JOptionPane.showInputDialog(null, "ello mate");
			//if (ans.equals("who's there")) {
			//String answer = JOptionPane.showInputDialog("cash");
			//if (answer.equals("cash who?")) {
			//	JOptionPane.showMessageDialog(null, "no thanks, i'll have some peanuts");
			//}
			//}
			
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
