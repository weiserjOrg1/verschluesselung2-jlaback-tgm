import java.awt.Graphics;
import javax.swing.*;

public class Panel extends JPanel{
	//Attribute
	private Model m1;
	
	/**
	 * Konstruktor bekommt ein Model
	 * @param m
	 */
	public Panel(Model m) {
		this.m1 = m;
	}
	
	protected void paintComponent (Graphics g) {
		super.paintComponent(g);
		
	}
}
