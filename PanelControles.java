import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Font;
import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
//import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class PanelControles extends JPanel implements  ActionListener, MouseListener{
	private JRadioButton rbFoto,
	rbPincel,
	rbBorrador,
	rbColor,
	rbSello1,
	rbSello2,
	rbSello3,
	rbSello4,
	rbCuadrado,
	rbCirculo,
	rbLinea,
	rbGuardar,
	rbRellenar;

	private JLabel lbTitulo;

	private JFileChooser fcFoto,
	fcSave;

	private String rutaFoto,
	fig;

	private Color color;

	private PanelDibujo pd;

	private int i;
	
	private Boolean relleno;

	public PanelControles(){
		super();
		this.addMouseListener(this);
		this.setPreferredSize(new Dimension(200,700));
		this.setBackground(new Color(204,153,255));

		this.lbTitulo=new JLabel("Paint Remasterizado");
		this.add(lbTitulo);
		lbTitulo.setFont(new Font("Helvetica", Font.BOLD,18));

		this.rbFoto=new JRadioButton(new ImageIcon("foto.png"));
		this.rbFoto.setPreferredSize(new Dimension(80,80));
		this.rbFoto.addMouseListener(this);
		this.rbFoto.addActionListener(this);
		this.rbFoto.setOpaque(false);
		this.add(this.rbFoto);	

		this.rbPincel=new JRadioButton(new ImageIcon("pincel.png"));
		this.rbPincel.setPreferredSize(new Dimension(80,80));
		this.rbPincel.addMouseListener(this);
		this.rbPincel.addActionListener(this);
		this.rbPincel.setOpaque(false);
		this.add(rbPincel);

		this.rbBorrador=new JRadioButton(new ImageIcon("borrador.png"));
		this.rbBorrador.setPreferredSize(new Dimension(80,80));
		this.rbBorrador.addMouseListener(this);
		this.rbBorrador.addActionListener(this);
		this.rbBorrador.setOpaque(false);
		this.add(rbBorrador);

		this.rbColor=new JRadioButton(new ImageIcon("paleta.png"));
		this.rbColor.setPreferredSize(new Dimension(80,80));
		this.rbColor.addMouseListener(this);
		this.rbColor.addActionListener(this);
		this.rbColor.setOpaque(false);
		this.add(rbColor);

		this.rbSello1=new JRadioButton(new ImageIcon("sello1.png"));
		this.rbSello1.setPreferredSize(new Dimension(80,80));
		this.rbSello1.addMouseListener(this);
		this.rbSello1.addActionListener(this);
		this.rbSello1.setOpaque(false);
		this.add(rbSello1);

		this.rbSello2=new JRadioButton(new ImageIcon("sello2.png"));
		this.rbSello2.setPreferredSize(new Dimension(80,80));
		this.rbSello2.addMouseListener(this);
		this.rbSello2.addActionListener(this);
		this.rbSello2.setOpaque(false);
		this.add(rbSello2);

		this.rbSello3=new JRadioButton(new ImageIcon("sello3.png"));
		this.rbSello3.setPreferredSize(new Dimension(80,80));
		this.rbSello3.addMouseListener(this);
		this.rbSello3.addActionListener(this);
		this.rbSello3.setOpaque(false);
		this.add(rbSello3);

		this.rbSello4=new JRadioButton(new ImageIcon("sello4.png"));
		this.rbSello4.setPreferredSize(new Dimension(80,80));
		this.rbSello4.addMouseListener(this);
		this.rbSello4.addActionListener(this);
		this.rbSello4.setOpaque(false);
		this.add(rbSello4);

		this.rbCuadrado=new JRadioButton(new ImageIcon("cuadrado.png"));
		this.rbCuadrado.setPreferredSize(new Dimension(80,80));
		this.rbCuadrado.addMouseListener(this);
		this.rbCuadrado.addActionListener(this);
		this.rbCuadrado.setOpaque(false);
		this.add(rbCuadrado);

		this.rbCirculo=new JRadioButton(new ImageIcon("circulo.png"));
		this.rbCirculo.setPreferredSize(new Dimension(80,80));
		this.rbCirculo.addMouseListener(this);
		this.rbCirculo.addActionListener(this);
		this.rbCirculo.setOpaque(false);
		this.add(rbCirculo);

		this.rbLinea=new JRadioButton(new ImageIcon("linea.png"));
		this.rbLinea.setPreferredSize(new Dimension(80,80));
		this.rbLinea.addMouseListener(this);
		this.rbLinea.addActionListener(this);
		this.rbLinea.setOpaque(false);
		this.add(rbLinea);

		this.rbGuardar=new JRadioButton(new ImageIcon("guardar.png"));
		this.rbGuardar.setPreferredSize(new Dimension(80,80));
		this.rbGuardar.addMouseListener(this);
		this.rbGuardar.addActionListener(this);
		this.rbGuardar.setOpaque(false);
		this.add(rbGuardar);

		this.rbRellenar=new JRadioButton(new ImageIcon("CasillaSnSel.png"));
		this.rbRellenar.setPreferredSize(new Dimension(80,80));
		this.rbRellenar.addMouseListener(this);
		this.rbRellenar.addActionListener(this);
		this.rbRellenar.setOpaque(false);
		this.add(rbRellenar);

		ButtonGroup bg=new ButtonGroup();

		bg.add(rbFoto);
		bg.add(rbPincel);
		bg.add(rbBorrador);
		bg.add(rbColor);
		bg.add(rbSello1);
		bg.add(rbSello2);
		bg.add(rbSello3);
		bg.add(rbSello4);
		bg.add(rbCuadrado);
		bg.add(rbCirculo);
		bg.add(rbLinea);
		bg.add(rbGuardar);
		bg.add(rbRellenar);

		this.rutaFoto="fondoDefault.png";

		this.fcFoto=new JFileChooser("C:\\Users\\Daniela Parrales\\Downloads\\Fotos\\varios");
		this.fcSave=new JFileChooser();

		this.fig="Lapiz";

		this.i=1;
		
		this.relleno=false;
	}

	public String getFiguraSeleccionada(){
		System.out.println("Entr� a getFiguaraSeleccionada()");
		System.out.println("Figura seleccionada: "+this.fig);
		return this.fig;
	}

	@Override
	public void mouseClicked(MouseEvent a) {
		
			if(a.getSource()==this.rbRellenar){
				if(i==1){
					this.rbRellenar.setIcon(new ImageIcon("CasillaSel.png"));
					this.i=0;
					this.relleno=true;
				}	
				else if(i==0){
					this.rbRellenar.setIcon(new ImageIcon("CasillaSnSel.png"));
					this.i=1;
					this.relleno=false;
				}
			}
			
		//else if{

		//}

	}

	@Override
	public void mouseEntered(MouseEvent a) {
		// TODO Auto-generated method stub
		if(a.getSource()==this.rbFoto){
			this.rbFoto.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.rbPincel){
			this.rbPincel.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.rbBorrador){
			this.rbBorrador.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.rbColor){
			this.rbColor.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.rbSello1){
			this.rbSello1.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.rbSello2){
			this.rbSello2.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.rbSello3){
			this.rbSello3.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.rbSello4){
			this.rbSello4.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.rbCuadrado){
			this.rbCuadrado.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.rbCirculo){
			this.rbCirculo.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.rbLinea){
			this.rbLinea.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.rbGuardar){
			this.rbGuardar.setSize(new Dimension(100,100));
		}
		else if(a.getSource()==this.rbRellenar){
			this.rbRellenar.setSize(new Dimension(100,100));
		}
	}

	@Override
	public void mouseExited(MouseEvent a) {
		// TODO Auto-generated method stub
		if(a.getSource()==this.rbFoto){
			this.rbFoto.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.rbPincel){
			this.rbPincel.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.rbBorrador){
			this.rbBorrador.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.rbColor){
			this.rbColor.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.rbSello1){
			this.rbSello1.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.rbSello2){
			this.rbSello2.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.rbSello3){
			this.rbSello3.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.rbSello4){
			this.rbSello4.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.rbCuadrado){
			this.rbCuadrado.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.rbCirculo){
			this.rbCirculo.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.rbLinea){
			this.rbLinea.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.rbGuardar){
			this.rbGuardar.setSize(new Dimension(80,80));
		}
		else if(a.getSource()==this.rbRellenar){
			this.rbRellenar.setSize(new Dimension(80,80));
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

	public  Color getColorTinta(){
		return this.color;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Entre al action listener");
		if(e.getSource()==this.rbFoto){
			System.out.println("Seleccion� obtener foto");
			this.obtenerImagen();
		}
		else if(e.getSource()==this.rbBorrador){
			System.out.println("Seleccion� borrar el �ltimo elemento");
			this.regresar();
		}
		else if(e.getSource()==this.rbGuardar){
			System.out.println("Seleccion� guardae foto");
			this.guardarImagen();
		}
		else if(e.getSource()==this.rbCuadrado){
			fig="Cuadrado";
			System.out.println("La figura seleccionada es: "+ fig);
			//this.a=true;
			//System.out.println("a: "+this.a);
		}
		else if(e.getSource()==this.rbPincel){
			fig="Lapiz";
			System.out.println("La figura seleccionada es: "+ fig);
			//this.a=true;
			//System.out.println("a: "+this.a);
		}
		else if(e.getSource()==this.rbCirculo){
			fig="Circulo";
			System.out.println("La figura seleccionada es: "+ fig);
			//this.a=true;
			//System.out.println("a: "+this.a);
		}
		else if(e.getSource()==this.rbLinea){
			fig="Linea";
			System.out.println("La figura seleccionada es: "+ fig);
			//this.a=true;
			//System.out.println("a: "+this.a);
		}
		else if(e.getSource()==this.rbFoto){
			fig="Foto";
			System.out.println("La figura seleccionada es: "+ fig);
			//this.a=true;
			//System.out.println("a: "+this.a);
		}
		else if(e.getSource()==this.rbSello1){
			System.out.println("La figura seleccionada es: "+ fig);
			fig="Sello1";
		}
		else if(e.getSource()==this.rbSello2){
			System.out.println("La figura seleccionada es: "+ fig);
			fig="Sello2";
		}
		else if(e.getSource()==this.rbSello3){
			System.out.println("La figura seleccionada es: "+ fig);
			fig="Sello3";
		}
		else if(e.getSource()==this.rbSello4){
			System.out.println("La figura seleccionada es: "+ fig);
			fig="Sello4";
		}
		else if(e.getSource()==this.rbColor){
			this.color=JColorChooser.showDialog(this.pd,"Elije el color de tinta", Color.BLACK);
		}
	}
	public void regresar(){
		if(this.rbBorrador.isSelected()){
			try{
				this.pd.regresar();
			}
			catch(ArrayIndexOutOfBoundsException e){
				JOptionPane.showMessageDialog(this, "Ya no hay figuras a borrar");
			}
		}
	}
	public void guardarImagen(){
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

	public void obtenerImagen(){
		System.out.println("Entr� a obtenerImagen()");

		int returnval;
		returnval= fcFoto.showOpenDialog(null);
		if(returnval ==  JFileChooser.APPROVE_OPTION){
			this.rutaFoto =PanelControles.this.fcFoto.getSelectedFile().toString();
			System.out.println("Recib� una ruta");
			System.out.println("Ruta recibida: "+this.rutaFoto+" ---");
			JOptionPane.showMessageDialog(pd, "Para que la imagen se vea da click en el �rea de dibujo");
		}
		System.out.println("Termin� obtenerImagen()");

		this.setRutaFoto();
	}

	public PanelDibujo getPd() {
		return pd;
	}

	public void setPd(PanelDibujo pd) {
		this.pd = pd;
	}

	public String setRutaFoto() {
		System.out.println("Entr� a getRutaFoto()");

		String[] temp = this.rutaFoto.split("\\\\");

		System.out.println("Termin� de hacer split, este es mi array: "+"\n"+temp);

		String ruta="";
		for(int i=0;i<temp.length-1;i++){
			System.out.println("Entr� al for para concatenar la ruta");
			ruta+=temp[i]+"\\\\";
		}
		this.rutaFoto=ruta+temp[temp.length-1];	
		System.out.println("Termin� getRutaFoto, esta es la ruta que obtuve= "+this.rutaFoto);
		return rutaFoto;
	}

	public String getRutaFoto() {
		return this.rutaFoto;
	}

	public Boolean getRelleno() {
		return relleno;
	}
	
	


}
