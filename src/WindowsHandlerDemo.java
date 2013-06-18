import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.*;

public class WindowsHandlerDemo extends JFrame implements WindowListener {
	
	WindowsHandlerDemo(){
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.addWindowListener(this);
		this.setTitle("Eventos");
	}

	@Override
	public void windowActivated(WindowEvent w) {
		// TODO Auto-generated method stub
		System.out.println("Activado");
	}
	@Override
	public void windowClosed(WindowEvent w) {
		// TODO Auto-generated method stub
		System.out.println("Cerrar");
	}
	@Override
	public void windowClosing(WindowEvent w) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowDeactivated(WindowEvent w) {
		// TODO Auto-generated method stub
		System.out.println("Desactivado");
	}
	@Override
	public void windowDeiconified(WindowEvent w) {
		// TODO Auto-generated method stub
		System.out.println("Maximizar");
	}
	@Override
	public void windowIconified(WindowEvent w) {
		// TODO Auto-generated method stub
		System.out.println("Maximizar");
	}
	@Override
	public void windowOpened(WindowEvent w) {
		// TODO Auto-generated method stub	
		System.out.println("Abrir");
	}
}
