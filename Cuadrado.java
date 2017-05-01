import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Cuadrado extends Pintable {
	private ArrayList<Point> puntos;
	private Color tinta;
	
	public Cuadrado(Color tinta){
		this.puntos=new ArrayList<>();
		this.tinta=tinta;
	}

	public void agregarCoordenada(int x, int y){
		this.puntos.add(new Point(x,y));
	}

	public void pintate(Graphics g) {
		System.out.println("Entre a pintar cuadrado");
		Point p1=this.puntos.get(0);
		Point p2=this.puntos.get(puntos.size()-1);
		
		g.setColor(tinta);
		//g.drawRect((int)p1.getX(), (int)p1.getY(), (int)p2.getX()-(int)p1.getX(), (int)p2.getY()-(int)p1.getY());

		if((int)p1.getX()<(int)p2.getX() && (int)p1.getY()<(int)p2.getY()){
			g.drawRect((int)p1.getX(), (int)p1.getY(), (int)p2.getX()-(int)p1.getX(), (int)p2.getY()-(int)p1.getY());
		}
		else if((int)p1.getX()<(int)p2.getX() && (int)p2.getY()<(int)p1.getY()){
			g.drawRect((int)p1.getX(), (int)p2.getY(), (int)p2.getX()-(int)p1.getX(), (int)p1.getY()-(int)p2.getY());
		}
		else if((int)p2.getX()<(int)p1.getX() && (int)p1.getY()<(int)p2.getY()){
			g.drawRect((int)p2.getX(), (int)p1.getY(), (int)p1.getX()-(int)p2.getX(), (int)p2.getY()-(int)p1.getY());
		}
		else if((int)p2.getX()<(int)p1.getX() && (int)p2.getY()<(int)p1.getY()){
			g.drawRect((int)p2.getX(), (int)p2.getY(), (int)p1.getX()-(int)p2.getX(), (int)p1.getY()-(int)p2.getY());
		}

		/*for(Point p:this.puntos){
			g.drawRect((int)p.getX(), (int)p.getY(), (int)pA.getX()-(int)p.getX(), (int)pA.getY()-(int)p.getY());
		}*/
	}

}
