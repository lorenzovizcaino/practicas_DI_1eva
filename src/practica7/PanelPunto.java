package practica7;

import javax.swing.*;
import java.awt.*;

public class PanelPunto extends JPanel {

    GBCConstrains gbc=new GBCConstrains();

    private JPanel coordenadas, centro, botones;
    private PanelEjecutar ejecutar;
    private JLabel lcoordenadaX1,lcoordenadaY1,lcoordenadaX2,lcoordenadaY2;
    private JTextArea areaTexto;
    private JButton calcular, dibujar, limpiar;
    private JTextField coordenadaX1,coordenadaY1,coordenadaX2,coordenadaY2;




    public PanelPunto(){
        setLayout(new GridBagLayout());
        coordenadas=new JPanel();
        coordenadas.setLayout(new GridLayout(2,4,10,10));
        lcoordenadaX1=new JLabel("Coordenada x");
        coordenadaX1=new JTextField(5);
        lcoordenadaY1=new JLabel("Coordenada y");
        coordenadaY1=new JTextField(5);
        lcoordenadaX2=new JLabel("Coordenada x");
        coordenadaX2=new JTextField(5);
        lcoordenadaY2=new JLabel("Coordenada y");
        coordenadaY2=new JTextField(5);
        coordenadas.add(lcoordenadaX1);
        coordenadas.add(coordenadaX1);
        coordenadas.add(lcoordenadaY1);
        coordenadas.add(coordenadaY1);
        coordenadas.add(lcoordenadaX2);
        coordenadas.add(coordenadaX2);
        coordenadas.add(lcoordenadaY2);
        coordenadas.add(coordenadaY2);

        centro=new JPanel();
        centro.setLayout(new GridLayout(1,2));
        areaTexto=new JTextArea();
        ejecutar=new PanelEjecutar();
        centro.add(areaTexto);
        centro.add(ejecutar);

        botones=new JPanel();
        botones.setLayout(new GridLayout(1,3));
        calcular=new JButton("Calcular");
        dibujar=new JButton("Dibujar");
        limpiar=new JButton("limpiar");
        botones.add(calcular);
        botones.add(dibujar);
        botones.add(limpiar);
        add(botones);



        add(coordenadas,gbc.Constrains(0,0,1,1,1.0,1.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(centro,gbc.Constrains(0,1,1,5,1.0,1.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(botones,gbc.Constrains(0,5,1,1,1.0,1.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));

    }
}

class PanelEjecutar extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLUE);
    }



}
