<<<<<<< HEAD
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JComponent;
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

	}
}

=======
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
>>>>>>> origin/master
