package practica5ConManejador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class LaminaPractica5_v2 extends JPanel {
     JScrollBar scroll1;
     JScrollBar scroll2;
     JScrollBar scroll3;
     JPanel panelWest;
     JPanel panelcentral;
     JPanel panelSur;
     JTextField textField1;
     JTextField textField2;
     JTextField textField3;
     JLabel label1;
     JLabel label2;
     JLabel label3;
     PanelBotonesColor panelBotonesColor;
    ManejadorPractica5 manejadorPractica5=new ManejadorPractica5(this);;





    public LaminaPractica5_v2(){
        setLayout(new BorderLayout());
        //JLabel.setOpaque(true) poner color de fondo a un label
        panelWest=new JPanel();
        panelWest.setLayout(new GridLayout(1,3,5,0));
        scroll1=new JScrollBar(JScrollBar.VERTICAL,0,1,0,255);
        scroll2=new JScrollBar(JScrollBar.VERTICAL,0,1,0,255);
        scroll3=new JScrollBar(JScrollBar.VERTICAL,0,1,0,255);

        panelWest.add(scroll1);
        panelWest.add(scroll2);
        panelWest.add(scroll3);
        add(panelWest,BorderLayout.WEST);

        panelcentral=new JPanel();
        panelcentral.setBackground(Color.BLUE);
        add(panelcentral,BorderLayout.CENTER);

        panelSur=new JPanel();
        panelSur.setLayout(new GridLayout(1,6));
        label1=new JLabel("rojo");
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setFont(new Font("Verdana",Font.BOLD,14));
        label1.setHorizontalAlignment(JLabel.CENTER);
        textField1=new JTextField("0",5);
        label2=new JLabel("verde");
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setFont(new Font("Verdana",Font.BOLD,14));
        label2.setHorizontalAlignment(JLabel.CENTER);
        textField2=new JTextField("0",5);
        label3=new JLabel("azul");
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setFont(new Font("Verdana",Font.BOLD,14));
        label3.setForeground(Color.WHITE);
        label3.setHorizontalAlignment(JLabel.CENTER);
        textField3=new JTextField("0",5);
        panelSur.add(label1);
        panelSur.add(textField1);
        panelSur.add(label2);
        panelSur.add(textField2);
        panelSur.add(label3);
        panelSur.add(textField3);
        add(panelSur,BorderLayout.SOUTH);
        panelBotonesColor=new PanelBotonesColor();
        add(panelBotonesColor,BorderLayout.EAST);

        scroll1.addAdjustmentListener(manejadorPractica5);
        scroll2.addAdjustmentListener(manejadorPractica5);
        scroll3.addAdjustmentListener(manejadorPractica5);
        textField1.addFocusListener(manejadorPractica5);
        textField2.addFocusListener(manejadorPractica5);
        textField3.addFocusListener(manejadorPractica5);


    }

    class PanelBotonesColor extends JPanel {
        private Color[]colores={Color.BLACK,Color.DARK_GRAY,Color.GRAY,Color.LIGHT_GRAY,Color.WHITE,Color.MAGENTA,Color.BLUE,Color.CYAN,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED,Color.PINK};
        private String[] coloresString={"Negro","Gris Oscuro","Gris","Gris Claro","Blanco","Magenta","Azul","Cyan","Verde","Amarillo","Naranja","Rojo","Rosa"};
        private JButton[] botones=new JButton[13];


        public PanelBotonesColor(){
            setLayout(new GridLayout(13,1,0,2));
            for(int i=0;i< botones.length;i++){
                botones[i]=new JButton(coloresString[i]);
                botones[i].setBackground(colores[i]);
                if(i<3){
                    botones[i].setForeground(Color.WHITE);
                }else{
                    botones[i].setForeground(Color.BLACK);
                }

                add(botones[i]);
                botones[i].addActionListener(manejadorPractica5);

            }
        }


    }

    private Color RecogerColor() {
        int rojo=scroll1.getValue();
        int verde=scroll2.getValue();
        int azul=scroll3.getValue();
        Color color=new Color(rojo,verde,azul);
        return color;
    }


}

