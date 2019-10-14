package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    ArrayList<Polymorph> morphList = new ArrayList<Polymorph>();
  //  RedMorph r;
   // Polymorph bluePoly;
    //MovingMorph moving;
   // CircleMorph circle;
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
   	 
   	
   	 
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 MouseMorph mousey = new MouseMorph(100, 100, 20, 20);
   	 window.addMouseMotionListener(mousey);
   	 
   	 morphList.add(new BluePolymorph(50, 50, 20, 20));
   	 morphList.add(new RedMorph(100, 100, 20, 20));
   	 morphList.add(new MovingMorph(40, 40, 20, 20));
   	 morphList.add(new CircleMorph(200, 200, 20, 20));
   	 morphList.add(mousey);
   	 
  	 //bluePoly = new BluePolymorph(50, 50, 20, 20);
     //	 r = new RedMorph(100, 100, 20, 20);
 	 //moving = new MovingMorph(40, 40, 20, 20);
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	for (Polymorph i: morphList) {
		i.draw(g);
		
	}
   	 
  	// bluePoly.draw(g);
  	 //r.draw(g);
  	 //moving.draw(g);
  	 //circle.draw(g);
  	
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	for (Polymorph i: morphList) {
		i.update();
		
	}
   //	 moving.update();
    }
    
 
}
