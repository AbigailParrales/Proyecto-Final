import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Lapiz extends Pintable {
	private ArrayList<Point> puntos;
	
	public Lapiz(){
		this.puntos=new ArrayList<>();
		//pintate(g);
	}
	
	public void agregarCoordenada(int x, int y){
		this.puntos.add(new Point(x,y));
	}
	
	public void pintate(Graphics g) {
		Point pA=this.puntos.get(0);
		for(Point p:this.puntos){
			g.drawLine((int)p.getX(), (int)p.getY(), (int)pA.getX(), (int)pA.getY());
			pA=p;
		}
	}

}
