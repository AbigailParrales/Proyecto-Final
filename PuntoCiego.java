
import java.awt.Graphics;

public class PuntoCiego extends Pintable{
		public void pintate(Graphics g) {
		System.out.println("Entr� a pintar punto ciego");
		g.drawLine(0,0,1,1);
	}

}
