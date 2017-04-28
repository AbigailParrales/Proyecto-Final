import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Circulo extends Pintable{
private ArrayList<Point> puntos;
	
	public Circulo(){
		this.puntos=new ArrayList<>();
	}
	
	public void agregarCoordenada(int x, int y){
		this.puntos.add(new Point(x,y));
	}
	
	public void pintate(Graphics g) {
		Point p1=this.puntos.get(0);
		Point p2=this.puntos.get(puntos.size()-1);
		
		g.drawOval((int)p1.getX(), (int)p1.getY(), Math.abs((int)p2.getX()-(int)p1.getX()), Math.abs((int)p2.getY()-(int)p1.getY()));
		
	}
}
