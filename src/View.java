import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame{
	
	//Attriute
	private Model m1;
	private Controller c1;
	private Panel p1;
	private JTextField verschiebenT;
	private JButton verschiebenB;
	private JTextField entschlüsselnT;
	private JButton entschlüsselnB;
	private JTextField verschlüsselnT;
	private JButton verschlüsselnB;
	private JPanel cont;
	
	//Konstruktor
	public View(Model m, Controller c) {
		this.m1 = m;
		this.c1 = c;
		this.setTitle("Verschlüsselung");
		this.setSize(400, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.p1 = new Panel(this.m1);
		
		
		this.verschiebenT = new JTextField("verschieben");
		this.verschiebenB = new JButton("verschieben");
		
		
		this.entschlüsselnT = new JTextField();
		this.entschlüsselnB = new JButton("entschlüsseln");
		
		this.verschlüsselnT = new JTextField();
		this.verschlüsselnB = new JButton("verschlüsseln");
		
		this.entschlüsselnT.addActionListener(this.c1);
		this.entschlüsselnB.addActionListener(this.c1);
		this.verschlüsselnT.addActionListener(this.c1);
		this.verschlüsselnT.addActionListener(this.c1);
		
		this.cont = new JPanel();
		this.cont.setLayout(new GridLayout(2,6));
		this.cont.add(verschiebenT);
		this.cont.add(verschiebenB);
		this.cont.add(entschlüsselnT);
		this.cont.add(entschlüsselnB);
		this.cont.add(verschlüsselnT);
		this.cont.add(verschlüsselnB);
		JPanel b1 = new JPanel();
		b1.setLayout(new BorderLayout());
		b1.add(this.cont, BorderLayout.CENTER);
		
		this.setVisible(true);
		
	}

}
