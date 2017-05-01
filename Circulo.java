import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Circulo extends Pintable{
	private ArrayList<Point> puntos;
	private Color tinta;
	private Boolean relleno;

	public Circulo(Color tinta, Boolean relleno){

		this.puntos=new ArrayList<>();
		this.tinta=tinta;
		this.relleno=relleno;
	}

	public void agregarCoordenada(int x, int y){
		this.puntos.add(new Point(x,y));
	}

	public void pintate(Graphics g) {
		System.out.println("Estoy en pintar circulo");
		Point p1=this.puntos.get(0);
		Point p2=this.puntos.get(puntos.size()-1);

		g.setColor(tinta);
		//g.drawOval((int)p1.getX(), (int)p1.getY(), Math.abs((int)p2.getX()-(int)p1.getX()), Math.abs((int)p2.getY()-(int)p1.getY()));
		if(relleno){
			if((int)p1.getX()<(int)p2.getX() && (int)p1.getY()<(int)p2.getY()){
				g.fillOval((int)p1.getX(), (int)p1.getY(), (int)p2.getX()-(int)p1.getX(), (int)p2.getY()-(int)p1.getY());
			}
			else if((int)p1.getX()<(int)p2.getX() && (int)p2.getY()<(int)p1.getY()){
				g.fillOval((int)p1.getX(), (int)p2.getY(), (int)p2.getX()-(int)p1.getX(), (int)p1.getY()-(int)p2.getY());
			}
			else if((int)p2.getX()<(int)p1.getX() && (int)p1.getY()<(int)p2.getY()){
				g.fillOval((int)p2.getX(), (int)p1.getY(), (int)p1.getX()-(int)p2.getX(), (int)p2.getY()-(int)p1.getY());
			}
			else if((int)p2.getX()<(int)p1.getX() && (int)p2.getY()<(int)p1.getY()){
				g.fillOval((int)p2.getX(), (int)p2.getY(), (int)p1.getX()-(int)p2.getX(), (int)p1.getY()-(int)p2.getY());
			}
		}
		else{
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
}

