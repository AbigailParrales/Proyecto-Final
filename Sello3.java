import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;

public class Sello3 extends Pintable implements ImageObserver{
	private Point punto;

	
	
	public void agregarCoordenada(int x, int y){
		this.punto=new Point(x,y);
	}

	public void pintate(Graphics g){
		System.out.println("Entrar a pintar Sello");
		g.drawImage(new ImageIcon("sello3.png").getImage(),(int)this.punto.getX(), (int)this.punto.getY()-60,60,60,this);
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub
		return false;
	}
}
