import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelControles extends JPanel{

	private JButton btUpload,
					btPencil,
					btColor,
					btSquare,
					btCircle,
					btTriangle,
					btLine,
					btSeal1,
					btSeal2,
					btSeal3,
					btSeal4,
					btSeal5;
	
	public PanelControles(){
		super();
		this.setPreferredSize(new Dimension(200,700));
		this.setBackground(Color.CYAN);
		
		
	}
}
