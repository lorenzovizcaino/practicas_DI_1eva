package practica6;
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

	
}



	class PanelCentral extends JPanel {
		JLabel[] etiquetas = new JLabel[5];
		JTextField[] cuadros = new JTextField[5];
	
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
				
				this.add(etiquetas[i], createConstraints(0, i, 1, 1, 0.0, 1.0,
						GridBagConstraints.BOTH, GridBagConstraints.CENTER, new Insets(4, 5, 10, 4)));
	
				cuadros[i] = new JTextField(40);
				
				Border border = BorderFactory.createRaisedSoftBevelBorder();
	
				cuadros[i].setBorder(border);
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
	GBCConstrains gbc=new GBCConstrains();
	Frase frase;



	public VentanaFrase() {


		super("Interface Frase");
		setLayout(new GridBagLayout());
		contenedor = this.getContentPane();
		panelCentral = new PanelCentral();
		
		JlFrase = new JLabel("Introduce una frase");


		cuadroFrase = new JTextField(20);
		
		botonProcesar = new JButton("Procesar frase");
	

		// Añade el panel de los resultados
		panelCentral = new PanelCentral();
		//contenedor.add(panelCentral);
		botonLimpiar=new JButton("Limpiar");
		botonSalir = new JButton("Salir");
	
		botonPintar = new JButton();
		botonPintar = new JButton("Pintar");
		
		botonMostrar = new JButton("Mostrar");

		contenedor.add(JlFrase,gbc.Constrains(0,0,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
		contenedor.add(cuadroFrase,gbc.Constrains(1,0,2,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
		contenedor.add(botonProcesar,gbc.Constrains(0,1,1,5,0.0,0.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
		contenedor.add(panelCentral,gbc.Constrains(1,1,2,5,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
		contenedor.add(botonLimpiar,gbc.Constrains(1,6,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
		contenedor.add(botonSalir,gbc.Constrains(2,6,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));


		setSize(new Dimension(1200, 400));
		setMinimumSize(new Dimension(320, 200));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




		botonProcesar.addActionListener(e->{

			frase=new Frase(cuadroFrase.getText());
			panelCentral.cuadros[0].setText(String.valueOf(frase.contarLetras()));
			panelCentral.cuadros[1].setText(String.valueOf(frase.contarPalabras()));
			panelCentral.cuadros[2].setText(String.valueOf(frase.invertirFrase()));
			panelCentral.cuadros[3].setText(String.valueOf(frase.separarPalabras()));
			panelCentral.cuadros[4].setText(String.valueOf(frase.primeraVocal()));

		});

	}

}
