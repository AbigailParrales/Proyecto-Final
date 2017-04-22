import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	public Ventana(){
		super("Paint");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(new Dimension(1000,700));
		this.setResizable(false);
		
		PanelControles pc = new PanelControles();
		this.add(pc,BorderLayout.WEST);
		PanelDibujo pd = new PanelDibujo();
		this.add(pd,BorderLayout.EAST);
		
		this.pack();
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		Ventana win= new Ventana();
	}

}
