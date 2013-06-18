import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;

import javax.swing.JFrame;


public class MouseMotionDemo extends JFrame implements MouseMotionListener, MouseListener, KeyListener {

	private int x;
	private int y;
	
	private int uno;
	private int dos;
	
	private boolean control=false;
	
	MouseMotionDemo(){
		this.setSize(500, 500);
		this.setTitle("Mouse Motion");
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
		this.addKeyListener(this);
	}
//********************************************************	
	@Override
	public void mouseDragged(MouseEvent m) {
		// TODO Auto-generated method stub
		this.x=m.getX();
		this.y=m.getY();
		this.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent m) {
		// TODO Auto-generated method stub
		//System.out.println("X: "+m.getXOnScreen());
		//System.out.println("Y: "+m.getYOnScreen());
		//this.x=m.getXOnScreen();
		//this.y=m.getYOnScreen();
		//this.repaint();
	}
//**************************************************************	
	public void paint(Graphics g){
		Graphics2D g2=(Graphics2D) g;
		if(control==true){
			g2.drawOval(x, y, uno, dos);
		}
		//g2.drawLine(this.uno, this.dos, this.x, this.y);
		
	}
//*************************************************************
	@Override
	public void mouseClicked(MouseEvent m) {
		// TODO Auto-generated method stub
		this.uno=m.getX();
		this.dos=m.getX();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
//*************************************************************
	@Override
	public void keyPressed(KeyEvent k) {
		// TODO Auto-generated method stub
		if(k.getKeyCode()==17){
			control=true;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
