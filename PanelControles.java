import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
	private ArrayList<Pintable> figuras;

	public PanelControles(){
		super();
		this.setPreferredSize(new Dimension(200,700));
		this.setBackground(new Color(204,153,255));

		this.figuras=new ArrayList();		
		this.paintL=new JLabel("Paint Remasterizado");
		//this.paintL
		this.add(paintL);

		this.fotoB=new JRadioButton(new ImageIcon("foto.png"));
		this.fotoB.setPreferredSize(new Dimension(80,80));
		this.fotoB.addActionListener(this);
		this.add(this.fotoB);

		this.pincelB=new JRadioButton(new ImageIcon("pincel.png"));
		this.pincelB.setPreferredSize(new Dimension(80,80));
		this.pincelB.addActionListener(this);
		this.add(pincelB);

		this.borradorB=new JRadioButton(new ImageIcon("borrador.png"));
		this.borradorB.setPreferredSize(new Dimension(80,80));
		this.borradorB.addActionListener(this);
		this.add(borradorB);

		this.paletaB=new JRadioButton(new ImageIcon("paleta.png"));
		this.paletaB.setPreferredSize(new Dimension(80,80));
		this.paletaB.addActionListener(this);
		this.add(paletaB);

		this.sello1B=new JRadioButton(new ImageIcon("sello1.png"));
		this.sello1B.setPreferredSize(new Dimension(80,80));
		this.sello1B.addActionListener(this);
		this.add(sello1B);

		this.sello2B=new JRadioButton(new ImageIcon("sello2.png"));
		this.sello2B.setPreferredSize(new Dimension(80,80));
		this.sello2B.addActionListener(this);
		this.add(sello2B);

		this.sello3B=new JRadioButton(new ImageIcon("sello3.png"));
		this.sello3B.setPreferredSize(new Dimension(80,80));
		this.sello3B.addActionListener(this);
		this.add(sello3B);

		this.sello4B=new JRadioButton(new ImageIcon("sello4.png"));
		this.sello4B.setPreferredSize(new Dimension(80,80));
		this.sello4B.addActionListener(this);
		this.add(sello4B);

		this.guardarB=new JRadioButton(new ImageIcon("guardar.png"));
		this.guardarB.setPreferredSize(new Dimension(80,80));
		this.guardarB.addActionListener(this);
		this.add(guardarB);



	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==this.pincelB){
			this.figuras.add(new Lapiz());
			System.out.println("Lapiz");
		}
		else if(e.getSource()==){

		}
		else if(e.getSource()==){

		}
		else if(e.getSource()==){

		}
		else if(e.getSource()==){

		}
		else if(e.getSource()==){

		}
		else if(e.getSource()==){

		}

	}
}
