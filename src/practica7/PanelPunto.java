package practica7;

import javax.swing.*;
import java.awt.*;

public class PanelPunto extends JPanel {

    GBCConstrains gbc=new GBCConstrains();

    private JPanel coordenadas, centro, botones;
    private PanelEjecutar ejecutar=new PanelEjecutar();
    private JLabel lcoordenadaX1,lcoordenadaY1,lcoordenadaX2,lcoordenadaY2;
    protected JTextArea areaTexto;
    protected JButton calcular, dibujar, limpiar;
    protected JTextField coordenadaX1,coordenadaY1,coordenadaX2,coordenadaY2;
     Manejador manejador=new Manejador(this,ejecutar);




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
        centro.setLayout(new GridLayout(1,2,10,10));
        areaTexto=new JTextArea();

        centro.add(areaTexto);
        centro.add(ejecutar);

        botones=new JPanel();
        botones.setLayout(new GridLayout(1,3,10,10));
        calcular=new JButton("Calcular");
        dibujar=new JButton("Dibujar");
        limpiar=new JButton("Limpiar");
        botones.add(calcular);
        botones.add(dibujar);
        botones.add(limpiar);
        add(botones);



        add(coordenadas,gbc.Constrains(0,0,1,2,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(centro,gbc.Constrains(0,2,1,10,1.0,1.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(botones,gbc.Constrains(0,12,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));

        limpiar.addActionListener(manejador);
        calcular.addActionListener(manejador);
        dibujar.addActionListener(manejador);
    }
}

class PanelEjecutar extends JPanel{
    int x1,y1,x2,y2;
    String texto="";



    public void getCoordendas(int x1, int y1, int x2, int y2,String texto) {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.texto=texto;

    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.CYAN);
        setForeground(Color.BLUE);

        g.drawString(texto,20,20);
        g.drawRect(x1,y1,x2,y2);
        g.fillRect(x1,y1,x2-x1,y2-y1);

    }



}
