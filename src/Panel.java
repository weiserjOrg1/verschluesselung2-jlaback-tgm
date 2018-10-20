import java.awt.Color;
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
		g.setColor(Color.BLUE);
		
		g.drawString("Der Verschlüsselte Text: "+"\t" + this.m1.getencryptedText(), 20, 40 );
		g.drawString("Der Entschlüsselte Text: "+"tn" + this.m1.getdecryptedText(), 20, 50);
	}
}
