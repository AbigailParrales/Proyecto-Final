import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Lapiz extends Pintable {
	private ArrayList<Point> puntos;
	private Color tinta;
	
	public Lapiz(Color tinta){
		this.puntos=new ArrayList<>();
		this.tinta=tinta;
		//pintate(g);
	}
	
	public void agregarCoordenada(int x, int y){
		this.puntos.add(new Point(x,y));
	}
	
	public void pintate(Graphics g) {
		System.out.println("Entré a pintar lapiz");
		Point pA=this.puntos.get(0);
		for(Point p:this.puntos){
			g.setColor(tinta);
			g.drawLine((int)p.getX(), (int)p.getY(), (int)pA.getX(), (int)pA.getY());
			pA=p;
		}
	}

}
