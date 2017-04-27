import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelDibujo extends JPanel implements MouseMotionListener, MouseListener{
	private ArrayList<Pintable> figuras;

	//Lapiz lp;
	//Cuadrado cd;
	//Circulo ci;
	//Linea ln;

	public PanelDibujo(PanelControles pc){
		super();
		this.setPreferredSize(new Dimension(800,700));
		this.setBackground(Color.WHITE);

		pc= new PanelControles();

		this.figuras=new ArrayList<Pintable>();

		this.addMouseMotionListener(this);
		this.addMouseListener(this);


	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		/*for (int i=0;i<figuras.size();i++){
			if(this.figuras.get(i)!=null){
				this.figuras.get(i).pintate(g);
			}
		}*/

		/*if(lp!=null){
			this.lp.pintate(g);
		}
		 
		if(cd!=null){
			this.cd.pintate(g);
		}
		
		
		if(ci!=null){
			this.ci.pintate(g);
		}
		if(ln!=null){
			this.ln.pintate(g);
		}*/
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		/*for (int i=0;i<figuras.size();i++){
			if(this.figuras.get(i)!=null){
				this.figuras.get(i).agregarCoordenada(e.getX(), e.getY());
				repaint();;
			}
		}*/
		//this.lp.agregarCoordenada(e.getX(), e.getY());
		//this.cd.agregarCoordenada(e.getX(), e.getY());
		//this.ci.agregarCoordenada(e.getX(), e.getY());
		//this.ln.agregarCoordenada(e.getX(), e.getY());
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//this.lp=new Lapiz();
		//this.lp.agregarCoordenada(e.getX(), e.getY());
		
		//this.cd=new Cuadrado();
		//this.cd.agregarCoordenada(e.getX(), e.getY());
		
		//this.ci=new Circulo();
		//this.ci.agregarCoordenada(e.getX(), e.getY());
		
		//this.ln = new Linea();
		//this.ln.agregarCoordenada(e.getX(), e.getY());
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		

	}
}