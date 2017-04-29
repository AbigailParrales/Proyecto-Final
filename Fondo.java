import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;

public class Fondo extends Pintable implements ImageObserver{
	
	public void pintate(Graphics g){
		g.drawImage(new ImageIcon("fondoDefault.png").getImage(), 0, 0,800,700, this);
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
