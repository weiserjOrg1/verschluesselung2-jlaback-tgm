import java.awt.event.ActionEvent;

public class Controller {
	//Attribute
	private Model m1;
	private View v1;
	
	/**
	 * Konstruktor
	 * 
	 */
	
	public Controller() {
		this.m1 = new Model();
		this.v1 = new View(this.m1, this);
	}
	
	public void ActionPerformed(ActionEvent e) {
		if (this.v1.istVerschiebenT(e)) {
			
		}
		
		if (this.v1.istVerschiebenB(e)) {
			
		}

		if (this.v1.istEntschl�sselnT(e)) {
	
		}
		
		if (this.v1.istEntschl�sselnB(e)) {
			
		}
		
		if (this.v1.istVerschl�sselnT(e)) {
			
		}
		
		if (this.v1.istVerschl�sselnB(e)) {
			
		}
	}
}
