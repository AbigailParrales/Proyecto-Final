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
	private int x1,
				y1,
				x2,
				y2;
	private Graphics2D g2D;
	private ArrayList<Pintable> figuras;
	
	//Lapiz lp;
	
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
		
		for (int i=0;i<figuras.size();i++){
			if(this.figuras.get(i)!=null){
				this.figuras.get(i).pintate(g);
			}
		}
		
		/*if(lp!=null){
			this.lp.pintate(g);
		}
		*/
		//g.drawLine(arg0, arg1, arg2, arg3);
	}

	/*
	public void clear(){
		g2D.setPaint(Color.white);
		g2D.fillRect(0, 0, getSize().width, getSize().height);
		g2D.setPaint(Color.black);
		repaint();
	}*/
	
	@Override
	public void mouseDragged(MouseEvent e) {
		//this.mouseDrag=true;
		/*
		this.x2=e.getX();
		this.y2=e.getY();
		
		while(this.g2D!=null){
			g2D.drawLine(x1, y1, x2, y2);
			repaint();
			this.x2=this.x1;
			this.y2=this.y1;
		}*/
		for (int i=0;i<figuras.size();i++){
			if(this.figuras.get(i)!=null){
				this.figuras.get(i).agregarCoordenada(e.getX(), e.getY());
				repaint();;
			}
		}
		//this.lp.agregarCoordenada(e.getX(), e.getY());
		//repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.x1=e.getX();
		this.y1=e.getY();
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
		this.lp=new Lapiz();
		this.lp.agregarCoordenada(e.getX(), e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}