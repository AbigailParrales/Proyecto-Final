
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
public class PuntoCiego extends Pintable{
		public void pintate(Graphics g) {
		System.out.println("Entré a pintar punto ciego");
		g.drawLine(0,0,1,1);
	}

}
