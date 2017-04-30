import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Fondo extends Pintable implements ImageObserver{
	private String rutaFoto;
	
	/*private ArrayList<Point> puntos;
	
	public Fondo(){
		this.puntos=new ArrayList<>();
	}
	
	public void agregarCoordenada(int x, int y){
		this.puntos.add(new Point(x,y));
	}*/
	
	public void pintate(Graphics g){
		System.out.println("Entrar a pintar Fondo");
		//Point p1=this.puntos.get(0);
		//Point p2=this.puntos.get(puntos.size()-1);
		
		g.drawImage(new ImageIcon(this.rutaFoto).getImage(),0,0,800,700,this);
		//g.drawImage(new ImageIcon(this.rutaFoto).getImage(),(int)p1.getX(), (int)p1.getY(), (int)p2.getX()-(int)p1.getX(), (int)p2.getY()-(int)p1.getY(), this);
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getRutaFoto() {
		return rutaFoto;
	}

	public void setRutaFoto(String rutaFoto) {
		this.rutaFoto = rutaFoto;
	}
	
	
	
}
