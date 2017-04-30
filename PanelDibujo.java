import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
//import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelDibujo extends JPanel implements MouseMotionListener, MouseListener{
	private ArrayList<Pintable> figuras;
	private Pintable actual;
	private PanelControles pc;
	//private boolean a;

	//private Image fondo;
	//private String rutaFoto;

	//Lapiz lp;
	//Cuadrado cd;
	//Circulo ci;
	//Linea ln;

	public PanelDibujo(PanelControles pc){
		super();
		this.setPreferredSize(new Dimension(800,700));
		this.setBackground(Color.WHITE);

		this.pc=pc;

		this.figuras=new ArrayList<Pintable>(0);

		this.addMouseMotionListener(this);
		this.addMouseListener(this);

		//this.a=this.pc.getA();


		//this.rutaFoto=this.pc.getRutaFoto();

		//this.fondo=new ImageIcon("fondoDefault.png").getImage();
		//"C:\\Users\\Daniela Parrales\\Downloads\\Fotos\\varios\\130920645715.png"

	}

	public void paintComponent(Graphics g){
		System.out.println("Entré a paintComponent()");
		super.paintComponent(g);
		g.drawImage(new ImageIcon(this.pc.getRutaFoto()).getImage(), 0, 0,this.getWidth(),this.getHeight(), this);
		for (int i=0;i<this.figuras.size();i++){
			System.out.println("Pintando figura: "+ (i+1));
			this.figuras.get(i).pintate(g);
			//System.out.println("a:"+this.a);
		}
		System.out.println("Termine de pintar");
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		this.actual.agregarCoordenada(e.getX(), e.getY());
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//if (a==false){
			if(this.pc.getFiguraSeleccionada()=="Sello1"){
				this.actual = new Sello1();
				this.actual.agregarCoordenada(e.getX(), e.getY());
			}
			this.figuras.add(actual);
			repaint();
		//}
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void regresar(){
		if(this.figuras.size()>=0){
			System.out.println(this.figuras);
			this.figuras.remove(this.figuras.size()-1);
			repaint();
		}
		else{
			JOptionPane.showMessageDialog(this, "Ya no hay figuras a borrar");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		String figSel=this.pc.getFiguraSeleccionada();

		System.out.println("Panel dibujo detectó mouse presionado");

		this.actual=new Lapiz();
		this.actual.agregarCoordenada(e.getX(), e.getY());


		if(figSel=="Lapiz"){
			this.actual=new Lapiz();
			this.actual.agregarCoordenada(e.getX(), e.getY());
		}
		if(figSel=="Cuadrado"){
			this.actual= new Cuadrado();
			this.actual.agregarCoordenada(e.getX(), e.getY());
		}
		else if(figSel=="Circulo"){
			this.actual=new Circulo();
			this.actual.agregarCoordenada(e.getX(), e.getY());
		}
		else if(figSel=="Linea"){
			this.actual = new Linea();
			this.actual.agregarCoordenada(e.getX(), e.getY());
		}
		else if(figSel=="Foto"){
			this.actual = new Fondo();
		}

		this.figuras.add(actual);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	public PanelDibujo getPd() {
		return this;
	}	

}