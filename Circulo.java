import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Circulo extends Pintable{
	private ArrayList<Point> puntos;
<<<<<<< HEAD
	private Color tinta;

	public Circulo(Color tinta){
=======

	public Circulo(){
>>>>>>> origin/master
		this.puntos=new ArrayList<>();
		this.tinta=tinta;
	}

	public void agregarCoordenada(int x, int y){
		this.puntos.add(new Point(x,y));
	}

	public void pintate(Graphics g) {
		System.out.println("Estoy en pintar círculo");
		Point p1=this.puntos.get(0);
		Point p2=this.puntos.get(puntos.size()-1);

<<<<<<< HEAD
		g.setColor(tinta);
		g.drawOval((int)p1.getX(), (int)p1.getY(), Math.abs((int)p2.getX()-(int)p1.getX()), Math.abs((int)p2.getY()-(int)p1.getY()));

=======
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
>>>>>>> origin/master
	}
}

