package ejemplos.ejemploGraphics_Paint;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;





class listaColores3 extends JComboBox<String> {

    listaColores3() {
        super();
        addItem("Negro");
        addItem("Gris obscuro");
        addItem("Gris");
        addItem("Gris claro");
        addItem("Rojo");
        addItem("Azul");
        addItem("Verde");
        addItem("Amarillo");
        addItem("Naranja");
        addItem("Blanco");
    }

    Color devolverColor(String name) {

        if (name.equals("Negro")) {
            return Color.black;
        }
        if (name.equals("Gris oscuro")) {
            return Color.darkGray;
        }
        if (name.equals("Gris")) {
            return Color.gray;
        }
        if (name.equals("Gris claro")) {
            return Color.lightGray;
        }
        if (name.equals("Rojo")) {
            return Color.red;
        }
        if (name.equals("Azul")) {
            return Color.blue;
        }
        if (name.equals("Verde")) {
            return Color.green;
        }
        if (name.equals("Amarillo")) {
            return Color.yellow;
        }
        if (name.equals("Naranja")) {
            return Color.orange;
        }
        if (name.equals("Blanco")) {
            return Color.white;
        } else {
            return Color.black;
        }
    }
}

//Dclarar la clase PanelInf
class PanelInf2 extends JPanel{
    Color colorLinea;
    Color colorRelleno;
   
    @Override
    public void paintAll(Graphics g) {
    // TODO Auto-generated method stub
    super.paintAll(g);
    System.out.println("Es el metodo paintAll "+this.getClass().getCanonicalName());
    }
    @Override
    protected void paintChildren(Graphics g) {
    // TODO Auto-generated method stub
    super.paintChildren(g);
    System.out.println("Es el metodo paintChildren "+this.getClass().getCanonicalName());
    }
    @Override
    public void paintComponents(Graphics g) {
    // TODO Auto-generated method stub
    super.paintComponents(g);
    System.out.println("Es el metodo paintComponents "+this.getClass().getCanonicalName());
    
    }
    @Override
    protected void paintBorder(Graphics g) {
    // TODO Auto-generated method stub
    super.paintBorder(g);
    System.out.println("Es el metodo paintBorder "+this.getClass().getCanonicalName());
    }
    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        System.out.println("Es el metodo paint "+this.getClass().getCanonicalName());
    }
    @Override
    protected void paintComponent(Graphics g) {
    // TODO Auto-generated method stub
       super.paintComponent(g);
        System.out.println("Es el metodo paintComponent "+this.getClass().getCanonicalName());
        this.dibujar(colorLinea,colorRelleno);
      
       
    }
//En este ejemplo utilizamos un método creado por el programador pero obtenemos el contexto gráfico del panel
public void dibujar(Color colorLinea,Color colorRelleno){
    Graphics g= this.getGraphics();
    g.setColor (colorLinea);
    g.drawLine (0, 70, 100, 70);
    g.drawRect (150, 70, 50, 70);
    g.drawRoundRect (250, 70, 50, 70, 6, 6);
    g.drawOval (350, 70, 50, 70);
    int [] vx1 = {500, 550, 450};
    int [] vy1 = {70, 120, 120};
    g.drawPolygon (vx1, vy1, 3);
 
    g.setColor (colorRelleno);
    g.fillRect (150, 270, 50, 70);
    g.fillRoundRect (250, 270, 50, 70, 6, 6);
    g.fillOval (350, 270, 50, 70);
    int [] vx2 = {500, 550, 450};
    int [] vy2 = {270, 320, 320};
    g.fillPolygon (vx2, vy2, 3);
}
    
}



public class ejemploJFrameConPanel_Dibujo extends JFrame implements ItemListener {

    // Declaracion de las propiedades de la ventana
    Color colorLinea;
    Color colorRelleno;
    JLabel jlinea;

    JLabel jrelleno;

    listaColores colores;

    listaColores colores1;

    JPanel panelSup;
    PanelInf2 panelInf;

    public ejemploJFrameConPanel_Dibujo() {

        // Iniciarlizar las propiedades de la ventana
        colorLinea = new Color(0, 0, 0);
        colorRelleno = new Color(0, 0, 0);
        jlinea = new JLabel("Color linea");

        jrelleno = new JLabel("Color relleno");

        colores = new listaColores();

        colores1 = new listaColores();

        panelSup = new JPanel();

        //Declaramos un panel para dibujar las figuras
        panelInf = new PanelInf2();

        panelSup.setLayout(new GridLayout(1, 4));
        panelSup = new JPanel();

        panelSup.add(jlinea);
        panelSup.add(colores);
        panelSup.add(jrelleno);
        panelSup.add(colores1);

        add(panelSup, BorderLayout.NORTH);
        //Añadir el panelInf en el centro del JFrame
        add(panelInf,BorderLayout.CENTER);
        // Poner a la escucha las listas desplegables
        colores.addItemListener(this);
        colores1.addItemListener(this);

    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        System.out.println("Es el metodo paint "+this.getClass().getCanonicalName());
       
    }

    @Override
    public void paintAll(Graphics g) {
        // TODO Auto-generated method stub
        super.paintAll(g);
        System.out.println("Es el metodo paintAll");
    }

    public void itemStateChanged(ItemEvent arg0) {

        // TODO Auto-generated method stub

        if (arg0.getSource() == colores) {
            panelInf.colorLinea = colores.devolverColor(arg0.getItem().toString());
        }
        if (arg0.getSource() == colores1) {
            panelInf.colorRelleno = colores1.devolverColor(arg0.getItem().toString());
        }

        // Tenemos que llamar a la funcion que vuelve a pintar el JFrame
        panelInf.dibujar(colorLinea,colorRelleno);

    }

    public static void main(String[] args) {
        ejemploJFrameConPanel_Dibujo miVentana = new ejemploJFrameConPanel_Dibujo();
        miVentana.setSize(600, 600);
        miVentana.setVisible(true);

    }

}
