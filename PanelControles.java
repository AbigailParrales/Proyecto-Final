import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelControles extends JPanel implements  ActionListener, MouseListener{
	private JRadioButton fotoB,
	pincelB,
	borradorB,
	paletaB,
	sello1B,
	sello2B,
	sello3B,
	sello4B,
	cuadradoB,
	circuloB,
	lineaB,
	guardarB;

	//private int tamaño;

	private JLabel paintL;

	private JFileChooser fcFoto,
	fcSave;

	private String rutaFoto,
				   rutaGuardar;
	public PanelDibujo pd;

	public PanelControles(){
		super();
		this.addMouseListener(this);
		this.setPreferredSize(new Dimension(200,700));
		this.setBackground(new Color(204,153,255));

		this.paintL=new JLabel("Paint Remasterizado");
		this.add(paintL);
		paintL.setFont(new Font("Helvetica", Font.BOLD,18));

		this.fotoB=new JRadioButton(new ImageIcon("foto.png"));
		this.fotoB.setPreferredSize(new Dimension(80,80));
		this.fotoB.addMouseListener(this);
		this.fotoB.addActionListener(this);
		this.fotoB.setOpaque(false);
		this.add(this.fotoB);	

		this.pincelB=new JRadioButton(new ImageIcon("pincel.png"));
		this.pincelB.setPreferredSize(new Dimension(80,80));
		this.pincelB.addMouseListener(this);
		this.pincelB.setOpaque(false);
		this.add(pincelB);

		this.borradorB=new JRadioButton(new ImageIcon("borrador.png"));
		this.borradorB.setPreferredSize(new Dimension(80,80));
		this.borradorB.addMouseListener(this);
		this.borradorB.addActionListener(this);
		this.borradorB.setOpaque(false);
		this.add(borradorB);

		this.paletaB=new JRadioButton(new ImageIcon("paleta.png"));
		this.paletaB.setPreferredSize(new Dimension(80,80));
		this.paletaB.addMouseListener(this);
		this.paletaB.setOpaque(false);
		this.add(paletaB);

		this.sello1B=new JRadioButton(new ImageIcon("sello1.png"));
		this.sello1B.setPreferredSize(new Dimension(80,80));
		this.sello1B.addMouseListener(this);
		this.sello1B.setOpaque(false);
		this.add(sello1B);

		this.sello2B=new JRadioButton(new ImageIcon("sello2.png"));
		this.sello2B.setPreferredSize(new Dimension(80,80));
		this.sello2B.addMouseListener(this);
		this.sello2B.setOpaque(false);
		this.add(sello2B);

		this.sello3B=new JRadioButton(new ImageIcon("sello3.png"));
		this.sello3B.setPreferredSize(new Dimension(80,80));
		this.sello3B.addMouseListener(this);
		this.sello3B.setOpaque(false);
		this.add(sello3B);

		this.sello4B=new JRadioButton(new ImageIcon("sello4.png"));
		this.sello4B.setPreferredSize(new Dimension(80,80));
		this.sello4B.addMouseListener(this);
		this.sello4B.setOpaque(false);
		this.add(sello4B);

		this.cuadradoB=new JRadioButton(new ImageIcon("cuadrado.png"));
		this.cuadradoB.setPreferredSize(new Dimension(80,80));
		this.cuadradoB.addMouseListener(this);
		this.cuadradoB.setOpaque(false);
		this.add(cuadradoB);

		this.circuloB=new JRadioButton(new ImageIcon("circulo.png"));
		this.circuloB.setPreferredSize(new Dimension(80,80));
		this.circuloB.addMouseListener(this);
		this.circuloB.setOpaque(false);
		this.add(circuloB);

		this.lineaB=new JRadioButton(new ImageIcon("linea.png"));
		this.lineaB.setPreferredSize(new Dimension(80,80));
		this.lineaB.addMouseListener(this);
		this.lineaB.setOpaque(false);
		this.add(lineaB);

		this.guardarB=new JRadioButton(new ImageIcon("guardar.png"));
		this.guardarB.setPreferredSize(new Dimension(80,80));
		this.guardarB.addMouseListener(this);
		this.guardarB.addActionListener(this);
		this.guardarB.setOpaque(false);
		this.add(guardarB);

		ButtonGroup bg=new ButtonGroup();

		bg.add(fotoB);
		bg.add(pincelB);
		bg.add(borradorB);
		bg.add(paletaB);
		bg.add(sello1B);
		bg.add(sello2B);
		bg.add(sello3B);
		bg.add(sello4B);
		bg.add(cuadradoB);
		bg.add(circuloB);
		bg.add(lineaB);
		bg.add(guardarB);

		this.rutaFoto="";
		this.rutaGuardar="";

		this.fcFoto=new JFileChooser();
		this.fcSave=new JFileChooser();

	}

	public String getFiguraSeleccionada(){
		String fig="";
		if(this.cuadradoB.isSelected()){
			fig="Cuadrado";
		}else if(this.pincelB.isSelected()){
			fig="Lapiz";
		}else if(this.circuloB.isSelected()){
			fig="Circulo";
		}else if(this.lineaB.isSelected()){
			fig="Linea";
		}
		return fig;
	}

	@Override
	public void mouseClicked(MouseEvent a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent a) {
		// TODO Auto-generated method stub
		if(a.getSource()==this.fotoB){
			this.fotoB.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.pincelB){
			this.pincelB.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.borradorB){
			this.borradorB.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.paletaB){
			this.paletaB.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.sello1B){
			this.sello1B.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.sello2B){
			this.sello2B.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.sello3B){
			this.sello3B.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.sello4B){
			this.sello4B.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.cuadradoB){
			this.cuadradoB.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.circuloB){
			this.circuloB.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.lineaB){
			this.lineaB.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.guardarB){
			this.guardarB.setSize(new Dimension(100,100));
		}
	}

	@Override
	public void mouseExited(MouseEvent a) {
		// TODO Auto-generated method stub
		if(a.getSource()==this.fotoB){
			this.fotoB.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.pincelB){
			this.pincelB.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.borradorB){
			this.borradorB.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.paletaB){
			this.paletaB.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.sello1B){
			this.sello1B.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.sello2B){
			this.sello2B.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.sello3B){
			this.sello3B.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.sello4B){
			this.sello4B.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.cuadradoB){
			this.cuadradoB.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.circuloB){
			this.circuloB.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.lineaB){
			this.lineaB.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.guardarB){
			this.guardarB.setSize(new Dimension(80,80));
		}
	}

	@Override
	public void mousePressed(MouseEvent a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.fotoB){
			int resp=this.fcFoto.showOpenDialog(this.pd);
			if(resp==JFileChooser.APPROVE_OPTION){
				this.rutaFoto=this.fcFoto.getSelectedFile().toString();
				System.out.println("camara");
			}
		}
		else if(e.getSource()==this.borradorB){

		}
		else if(e.getSource()==this.guardarB){
			this.takeImage();
		}

	}
	
	public void takeImage(){
		BufferedImage bi=new BufferedImage(this.pd.getWidth(), this.pd.getHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics g =bi.createGraphics();
		this.pd.paintAll(g);
		g.dispose();
		int returnval;
		returnval= fcSave.showSaveDialog(null);
		if(returnval ==  JFileChooser.APPROVE_OPTION){
			try {
				ImageIO.write(bi, "png", new File((this.fcSave.getSelectedFile())+ ".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//public void 
	
	public PanelDibujo getPd() {
		return pd;
	}

	public void setPd(PanelDibujo pd) {
		this.pd = pd;
	}

}
