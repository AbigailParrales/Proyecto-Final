import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Cuadrado implements Pintable {
	private ArrayList<Point> puntos;
	
	public Cuadrado(){
		this.puntos=new ArrayList<>();
	}
	
	public void agregarCoordenada(int x, int y){
		this.puntos.add(new Point(x,y));
	}
	
	public void pintate(Graphics g) {
		Point p1=this.puntos.get(0);
		Point p2=this.puntos.get(puntos.size()-1);
		
		g.drawRect((int)p1.getX(), (int)p1.getY(), (int)p2.getX()-(int)p1.getX(), (int)p2.getY()-(int)p1.getY());
		/*for(Point p:this.puntos){
			g.drawRect((int)p.getX(), (int)p.getY(), (int)pA.getX()-(int)p.getX(), (int)pA.getY()-(int)p.getY());
		}*/
	}

}
