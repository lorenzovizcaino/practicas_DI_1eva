package fraseRepetida;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.Insets;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Color;


class PanelDibujo extends JPanel{
	String texto;
	Color color;
	PanelDibujo(){
		setBorder(BorderFactory.createTitledBorder("Dibujar Frase"));
		texto=new String();
		color=Color.blue;
	}
	PanelDibujo(String texto,Color color){
		this.texto=texto;
		this.color=color;
	}

	public void setTexto(String texto){
		this.texto=texto;
	}

	public void setColor(Color color){
		this.color=color;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.setFont(new Font("Arial",Font.BOLD,12));
		g.drawString(texto,30,this.getHeight()/2);
	}
}



	class PanelCentral extends JPanel {
		JLabel[] etiquetas = new JLabel[5];
		JTextField[] cuadros = new JTextField[5];
		String tooltips []={"Numero de Letras de la frase analizada",
				 	        "Numero de palabras de la frase analizada",
							"Frase invertida",
							"Palabras separadas de la frase analizada",
							"Primera posicion vocal de la frase analizada"};
		Font font=new Font("Arial",Font.BOLD,15);
	
		private static GridBagConstraints createConstraints(int gridx, int gridy, int gridwidth, int gridheight,
				double weightx, double weighty, int fill, int anchor, Insets insets) {
			GridBagConstraints constraints = new GridBagConstraints();
			constraints.gridx = gridx;
			constraints.gridy = gridy;
			constraints.gridwidth = gridwidth;
			constraints.gridheight = gridheight;
			constraints.weightx = weightx;
			constraints.weighty = weighty;
			constraints.fill = fill;
			constraints.anchor = anchor;
			constraints.insets = insets;
			return constraints;
		}
	
		PanelCentral() {
			this.setBorder(BorderFactory.createTitledBorder("Procesar Frase"));
			this.setLayout(new GridBagLayout());
	
			for (int i = 0; i < etiquetas.length; i++) {
				etiquetas[i] = new JLabel();
				etiquetas[i].setFont(font);
				this.add(etiquetas[i], createConstraints(0, i, 1, 1, 0.0, 1.0,
						GridBagConstraints.BOTH, GridBagConstraints.CENTER, new Insets(4, 5, 10, 4)));
	
				cuadros[i] = new JTextField(40);
				
				Border border = BorderFactory.createRaisedSoftBevelBorder();
	
				cuadros[i].setBorder(border);
				cuadros[i].setEditable(false);
				cuadros[i].setToolTipText(tooltips[i]);
				this.add(cuadros[i], createConstraints(1, i, 1, 1, 1.0, 1.0, GridBagConstraints.HORIZONTAL,
						GridBagConstraints.CENTER, new Insets(4, 5, 10, 4)));
	
			}
			etiquetas[0].setText("Numero de letras");
			
			etiquetas[1].setText("Numero de palabras");
			
			etiquetas[2].setText("Invertir frase");
			
			etiquetas[3].setText("Separar palabras");
		
			etiquetas[4].setText("Primera posicion vocal");
		
		}
	
	}
	

public class VentanaFrase extends JFrame {
	GridBagConstraints restricciones = new GridBagConstraints();
	Container contenedor;
	JLabel JlFrase;
	JTextField cuadroFrase;
	JButton botonProcesar, botonSalir, botonLimpiar;
	JButton botonMostrar,botonPintar;
	
	PanelCentral panelCentral;
	PanelDibujo panelDibujo;
	Font font=new Font("Arial",Font.BOLD,15);
	ManejadorFrase manejadorFrase;

	public VentanaFrase() {

		super("Interface Frase");
		setLayout(new GridBagLayout());
		contenedor = this.getContentPane();
		
		
		JlFrase = new JLabel("Introduce una frase");
		JlFrase.setToolTipText("Frase a analizar");
		JlFrase.setFont(font);

		cuadroFrase = new JTextField();
		cuadroFrase.setFont(font);
		botonProcesar = new JButton("Procesar frase");
		botonProcesar.setDisplayedMnemonicIndex(0);
		botonProcesar.setFont(font);
	

		// Añade el panel de los resultados
		panelCentral = new PanelCentral();
		botonLimpiar=new JButton("Limpiar");
		botonLimpiar.setFont(font);
		botonLimpiar.setDisplayedMnemonicIndex(0);
		botonSalir = new JButton("Salir");
		botonSalir.setFont(font);
		botonSalir.setDisplayedMnemonicIndex(0);

		botonPintar = new JButton("Pintar");
		botonPintar.setFont(font);
		botonPintar.setDisplayedMnemonicIndex(1);
		botonPintar.setEnabled(false);
		botonMostrar = new JButton("Mostrar");
		botonMostrar.setFont(font);
		botonMostrar.setDisplayedMnemonicIndex(0);
		botonMostrar.setEnabled(false);
		panelDibujo=new PanelDibujo();
		contenedor.add(JlFrase,createConstraints(0,0,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
		contenedor.add(cuadroFrase,createConstraints(1,0,6,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
		contenedor.add(botonProcesar,createConstraints(0,1,1,5,0.0,0.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
		contenedor.add(panelCentral,createConstraints(1,1,4,5,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
		contenedor.add(botonLimpiar,createConstraints(1,6,4,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
		contenedor.add(botonSalir,createConstraints(0,6,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
		contenedor.add(panelDibujo,createConstraints(5,1,2,5,0.0,0.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
		contenedor.add(botonPintar,createConstraints(5,6,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
		contenedor.add(botonMostrar,createConstraints(6,6,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
		manejadorFrase=new ManejadorFrase(this,panelCentral,panelDibujo);
		botonProcesar.addActionListener(manejadorFrase);
		botonSalir.addActionListener(manejadorFrase);
		botonLimpiar.addActionListener(manejadorFrase);
		botonPintar.addActionListener(manejadorFrase);
		botonMostrar.addActionListener(manejadorFrase);
		cuadroFrase.addFocusListener(manejadorFrase);
		botonProcesar.addFocusListener(manejadorFrase);
		cuadroFrase.addKeyListener(manejadorFrase);
		botonProcesar.addKeyListener(manejadorFrase);
		botonLimpiar.addKeyListener(manejadorFrase);


		
		setSize(new Dimension(1200, 400));
		setMinimumSize(new Dimension(320, 200));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	private static GridBagConstraints createConstraints(int gridx, int gridy, int gridwidth, int gridheight,
														double weightx, double weighty, int fill, int anchor, Insets insets) {
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = gridx;
		constraints.gridy = gridy;
		constraints.gridwidth = gridwidth;
		constraints.gridheight = gridheight;
		constraints.weightx = weightx;
		constraints.weighty = weighty;
		constraints.fill = fill;
		constraints.anchor = anchor;
		constraints.insets = insets;
		return constraints;
	}

}
