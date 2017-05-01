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
		System.out.println("Estoy en pintar círculo");
		Point p1=this.puntos.get(0);
		Point p2=this.puntos.get(puntos.size()-1);

		if((int)p1.getX()<(int)p2.getX() && (int)p1.getY()<(int)p2.getY()){
			g.drawOval((int)p1.getX(), (int)p1.getY(), (int)p2.getX()-(int)p1.getX(), (int)p2.getY()-(int)p1.getY());
		}
		else if((int)p1.getX()<(int)p2.getX() && (int)p2.getY()<(int)p1.getY()){
			g.drawOval((int)p1.getX(), (int)p2.getY(), (int)p2.getX()-(int)p1.getX(), (int)p1.getY()-(int)p2.getY());
		}
		else if((int)p2.getX()<(int)p1.getX() && (int)p1.getY()<(int)p2.getY()){
			g.drawOval((int)p2.getX(), (int)p1.getY(), (int)p1.getX()-(int)p2.getX(), (int)p2.getY()-(int)p1.getY());
		}
		else if((int)p2.getX()<(int)p1.getX() && (int)p2.getY()<(int)p1.getY()){
			g.drawOval((int)p2.getX(), (int)p2.getY(), (int)p1.getX()-(int)p2.getX(), (int)p1.getY()-(int)p2.getY());
		}
	}
}

