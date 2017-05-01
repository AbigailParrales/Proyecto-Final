import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Linea extends Pintable {
	private ArrayList<Point> puntos;
	private Color tinta;
	
	public Linea(Color tinta){
		this.puntos=new ArrayList<>();
		this.tinta=tinta;
	}
	
	public void agregarCoordenada(int x, int y){
		this.puntos.add(new Point(x,y));
	}
	
	public void pintate(Graphics g) {
		System.out.println("Entré a pintar linea");
		Point p1=this.puntos.get(0);
		Point p2=this.puntos.get(puntos.size()-1);
		
		g.setColor(tinta);
		g.drawLine((int)p1.getX(), (int)p1.getY(), (int)p2.getX(), (int)p2.getY());
		
		/*for(Point p:this.puntos){
			g.drawLine((int)p.getX(), (int)p.getY(), (int)pA.getX(), (int)pA.getY());
		}*/
	}

}
