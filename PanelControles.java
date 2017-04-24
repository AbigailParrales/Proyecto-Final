<<<<<<< HEAD
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
=======
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelControles extends JPanel{
	private JButton fotoB,
					pincelB,
					borradorB,
					paletaB,
					sello1B,
					sello2B,
					sello3B,
					sello4B,
					guardarB;
	private ImageIcon foto,
						pincel,
						borrador,
						paleta,
						sello1,
						sello2,
						sello3,
						sello4,
						guardar;
	
	public PanelControles(){
		super();
		this.setPreferredSize(new Dimension(170,800));
		this.add(new JLabel("Paint Remasterizado"));
		this.foto=new ImageIcon("foto.png");
		this.fotoB=new JButton(foto);
		this.add(this.fotoB);
		this.fotoB.setPreferredSize(new Dimension(64,64));
		this.pincel=new ImageIcon("pincel.png");
		this.pincelB=new JButton(pincel);
		this.add(pincelB);
		this.pincelB.setPreferredSize(new Dimension(64,64));
		this.borrador=new ImageIcon("borrador.png");
		this.borradorB=new JButton(borrador);
		this.add(borradorB);
		this.borradorB.setPreferredSize(new Dimension(64,64));
		this.paleta=new ImageIcon("paleta.png");
		this.paletaB=new JButton(paleta);
		this.add(paletaB);
		this.paletaB.setPreferredSize(new Dimension(64,64));
		this.sello1=new ImageIcon("sello1.png");
		this.sello1B=new JButton(sello1);
		this.add(sello1B);
		this.sello1B.setPreferredSize(new Dimension(64,64));
		this.sello2=new ImageIcon("sello2.png");
		this.sello2B=new JButton(sello2);
		this.add(sello2B);
		this.sello2B.setPreferredSize(new Dimension(64,64));
		this.sello3=new ImageIcon("sello3.png");
		this.sello3B=new JButton(sello3);
		this.add(sello3B);
		this.sello3B.setPreferredSize(new Dimension(64,64));
		this.sello4=new ImageIcon("sello4.png");
		this.sello4B=new JButton(sello4);
		this.add(sello4B);
		this.sello4B.setPreferredSize(new Dimension(64,64));
		this.guardar=new ImageIcon("guardar.png");
		this.guardarB=new JButton(guardar);
		this.add(guardarB);
		this.guardarB.setPreferredSize(new Dimension(64,64));
	}
}
>>>>>>> origin/master
