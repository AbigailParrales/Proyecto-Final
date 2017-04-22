import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.JPanel;

public class PanelControles extends JPanel{

	private Icon icUpload,
				 icPencil,
				 icColor,
				 icSquare,
				 icCircle,
				 icTriangle,
				 icLine,
				 icSeal1,
				 icSeal2,
				 icSeal3,
				 icSeal4,
				 icSeal5;
	
	public PanelControles(){
		super();
		this.setPreferredSize(new Dimension(200,700));
		this.setBackground(new Color(204,153,255));
		
		
	}
}
