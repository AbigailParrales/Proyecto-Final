/*
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
*/
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelControles extends JPanel implements ActionListener{
	private JRadioButton fotoB,
					pincelB,
					borradorB,
					paletaB,
					sello1B,
					sello2B,
					sello3B,
					sello4B,
					guardarB;
	private JLabel paintL;
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
		this.setPreferredSize(new Dimension(200,700));
		this.setBackground(new Color(204,153,255));
		
		this.paintL=new JLabel("Paint Remasterizado");
		//this.paintL
		this.add(paintL);
		
		this.foto=new ImageIcon("foto.png");
		this.fotoB=new JRadioButton(foto);
		this.fotoB.setPreferredSize(new Dimension(80,80));
		this.add(this.fotoB);
		
		this.pincel=new ImageIcon("pincel.png");
		this.pincelB=new JRadioButton(pincel);
		this.pincelB.setPreferredSize(new Dimension(80,80));
		this.add(pincelB);
		
		this.borrador=new ImageIcon("borrador.png");
		this.borradorB=new JRadioButton(borrador);
		this.borradorB.setPreferredSize(new Dimension(80,80));
		this.add(borradorB);
		
		this.paleta=new ImageIcon("paleta.png");
		this.paletaB=new JRadioButton(paleta);
		this.paletaB.setPreferredSize(new Dimension(80,80));
		this.add(paletaB);
		
		this.sello1=new ImageIcon("sello1.png");
		this.sello1B=new JRadioButton(sello1);
		this.sello1B.setPreferredSize(new Dimension(80,80));
		this.add(sello1B);
		
		this.sello2=new ImageIcon("sello2.png");
		this.sello2B=new JRadioButton(sello2);
		this.sello2B.setPreferredSize(new Dimension(80,80));
		this.add(sello2B);
		
		this.sello3=new ImageIcon("sello3.png");
		this.sello3B=new JRadioButton(sello3);
		this.sello3B.setPreferredSize(new Dimension(80,80));
		this.add(sello3B);
		
		this.sello4=new ImageIcon("sello4.png");
		this.sello4B=new JRadioButton(sello4);
		this.sello4B.setPreferredSize(new Dimension(80,80));
		this.add(sello4B);
		
		this.guardar=new ImageIcon("guardar.png");
		this.guardarB=new JRadioButton(guardar);
		this.guardarB.setPreferredSize(new Dimension(80,80));
		this.guardarB.addActionListener(this);
		this.add(guardarB);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==this.guardarB){
			System.out.println("Guardar");
		}
	}
}
