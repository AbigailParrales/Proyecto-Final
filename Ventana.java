import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	public Ventana(){
		super("Paint Remasterizado");		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(new PanelControles(), BorderLayout.WEST);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Ventana win=new Ventana();
	}

}
