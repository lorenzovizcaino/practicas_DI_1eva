package practica7_conJList;

import javax.swing.*;
import java.awt.*;

public class PanelPunto extends JPanel {

    GBCConstrains gbc=new GBCConstrains();

    private JPanel coordenadas, centro, botones, jlist;
    private PanelEjecutar ejecutar=new PanelEjecutar();
    private JLabel lcoordenadaX1,lcoordenadaY1,lcoordenadaX2,lcoordenadaY2,lColorBorde,lColorInterno;
    protected JTextArea areaTexto;
    protected JButton calcular, dibujar, limpiar;
    protected JTextField coordenadaX1,coordenadaY1,coordenadaX2,coordenadaY2;
     Manejador manejador=new Manejador(this,ejecutar);


    private String[] coloresString={"Negro","Gris Oscuro","Gris","Gris Claro","Blanco","Magenta","Azul","Cyan","Verde","Amarillo","Naranja","Rojo","Rosa"};
    protected JComboBox colorBorde, colorInterno;
    protected DefaultListModel<String> listModel;
    protected JList<String> lineList;
    protected JButton sumarLista;




    public PanelPunto(){
        setLayout(new GridBagLayout());
        coordenadas=new JPanel();
        coordenadas.setLayout(new GridLayout(2,8,20,10));
        lcoordenadaX1=new JLabel("Coordenada x");
        lcoordenadaX1.setHorizontalAlignment(JLabel.RIGHT);
        coordenadaX1=new JTextField(5);
        lcoordenadaY1=new JLabel("Coordenada y");
        lcoordenadaY1.setHorizontalAlignment(JLabel.RIGHT);
        coordenadaY1=new JTextField(5);
        lColorBorde=new JLabel("Color borde");
        lColorBorde.setHorizontalAlignment(JLabel.RIGHT);
        colorBorde=new JComboBox<>(coloresString);
        lcoordenadaX2=new JLabel("Coordenada x");
        lcoordenadaX2.setHorizontalAlignment(JLabel.RIGHT);
        coordenadaX2=new JTextField(5);
        lcoordenadaY2=new JLabel("Coordenada y");
        lcoordenadaY2.setHorizontalAlignment(JLabel.RIGHT);
        coordenadaY2=new JTextField(5);
        lColorInterno=new JLabel("Color interno");
        lColorInterno.setHorizontalAlignment(JLabel.RIGHT);
        colorInterno=new JComboBox<>(coloresString);
        coordenadas.add(lcoordenadaX1);
        coordenadas.add(coordenadaX1);
        coordenadas.add(lcoordenadaY1);
        coordenadas.add(coordenadaY1);
        coordenadas.add(lColorBorde);
        coordenadas.add(colorBorde);
        coordenadas.add(lcoordenadaX2);
        coordenadas.add(coordenadaX2);
        coordenadas.add(lcoordenadaY2);
        coordenadas.add(coordenadaY2);
        coordenadas.add(lColorInterno);
        coordenadas.add(colorInterno);

        centro=new JPanel();
        centro.setLayout(new GridLayout(1,2,10,10));
        jlist=new JPanel();
        jlist.setLayout(new BorderLayout());
        listModel=new DefaultListModel<>();
        lineList=new JList<>(listModel);
        areaTexto=new JTextArea();
        sumarLista=new JButton("Añadir a la lista");
        jlist.add(areaTexto,BorderLayout.NORTH);
        jlist.add(lineList,BorderLayout.CENTER);
        jlist.add(sumarLista,BorderLayout.SOUTH);

        centro.add(jlist);
        centro.add(ejecutar);

        botones=new JPanel();
        botones.setLayout(new GridLayout(1,3,10,10));
        calcular=new JButton("Calcular");
        calcular.setEnabled(false);
        dibujar=new JButton("Dibujar");
        dibujar.setEnabled(false);
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
        sumarLista.addActionListener(manejador);
        lineList.addListSelectionListener(manejador);

        coordenadaX1.getDocument().addDocumentListener(manejador);
        coordenadaY1.getDocument().addDocumentListener(manejador);
        coordenadaX2.getDocument().addDocumentListener(manejador);
        coordenadaY2.getDocument().addDocumentListener(manejador);

    }
}

class PanelEjecutar extends JPanel{
    int x1,y1;
    int distancia;
    String texto="";
    Color coloBorde,colorInterno;



    public void getCoordendas(int x1, int y1, int distancia, String texto, Color colorBorde, Color colorInterno) {
        this.x1=x1;
        this.y1=y1;
        this.distancia=distancia;

        this.texto=texto;
        this.coloBorde=colorBorde;
        this.colorInterno=colorInterno;

    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.GRAY);
        setForeground(Color.red);
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.RED);
        g2.setFont(new Font("Arial",Font.BOLD,26));
        int ancho=this.getWidth();
        g2.drawString(texto,(ancho/3),50);
        g2.setColor(colorInterno);
        g2.fillRect(x1,y1,distancia,distancia);
        g2.setColor(coloBorde);
        g2.drawRect(x1,y1,distancia,distancia);
    }



}
