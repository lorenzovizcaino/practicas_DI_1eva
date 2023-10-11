package practica5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class LaminaPractica5 extends JPanel {



    private JScrollBar scroll1;
    private JScrollBar scroll2;
    private JScrollBar scroll3;
    private JPanel panelWest;
    private JPanel panelcentral;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JPanel panelSur;

    private JButton negro;
    private JButton grisOscuro;
    private JButton gris;
    private JButton grisClaro;
    private JButton blanco;

    private JButton magenta;
    private JButton azul;
    private JButton cyan;
    private JButton verde;
    private JButton amarillo;
    private JButton naranja;
    private JButton rojo;
    private JButton rosa;
    private JPanel panelEste;
    private Color []colores={Color.BLACK,Color.DARK_GRAY,Color.GRAY,Color.LIGHT_GRAY,Color.WHITE,Color.MAGENTA,Color.BLUE,Color.CYAN,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED,Color.PINK};
    private String[] coloresString={"Negro","Gris Oscuro","Gris","Gris Claro","Blanco","Magenta","Azul","Cyan","Verde","Amarillo","Naranja","Rojo","Rosa"};

    public LaminaPractica5(){
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

        panelEste=new JPanel();
        panelEste.setLayout(new GridLayout(13,1,0,2));
        negro=new JButton("Negro");
        negro.setBackground(Color.BLACK);
        negro.setForeground(Color.WHITE);

        grisOscuro=new JButton("Gris Oscuro");
        grisOscuro.setBackground(Color.DARK_GRAY);
        grisOscuro.setForeground(Color.WHITE);
        gris=new JButton("Gris");
        gris.setBackground(Color.GRAY);
        //gris.setForeground(Color.WHITE);
        grisClaro=new JButton("Gris Claro");
        grisClaro.setBackground(Color.lightGray);
        blanco=new JButton("Blanco");
        blanco.setBackground(Color.white);
        magenta=new JButton("Magenta");
        magenta.setBackground(Color.magenta);
        azul=new JButton("Azul");
        azul.setBackground(Color.blue);
        azul.setForeground(Color.WHITE);
        cyan=new JButton("Cyan");
        cyan.setBackground(Color.cyan);
        verde=new JButton("Verde");
        verde.setBackground(Color.GREEN);
        amarillo=new JButton("Amarillo");
        amarillo.setBackground(Color.YELLOW);
        naranja=new JButton("Naranja");
        naranja.setBackground(Color.ORANGE);
        rojo=new JButton("Rojo");
        rojo.setBackground(Color.RED);
        rosa=new JButton("Rosa");
        rosa.setBackground(Color.PINK);
        panelEste.add(negro);
        panelEste.add(grisOscuro);
        panelEste.add(gris);
        panelEste.add(grisClaro);
        panelEste.add(blanco);

        panelEste.add(magenta);
        panelEste.add(azul);
        panelEste.add(cyan);
        panelEste.add(verde);
        panelEste.add(amarillo);
        panelEste.add(naranja);
        panelEste.add(rojo);
        panelEste.add(rosa);
        add(panelEste, BorderLayout.EAST);


        scroll1.addAdjustmentListener(new AdjustmentListener() {
            Color color;
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                textField1.setText(String.valueOf(scroll1.getValue()));
                color=RecogerColor();
                panelcentral.setBackground(color);
            }
        });

        scroll2.addAdjustmentListener(new AdjustmentListener() {
            Color color;
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                textField2.setText(String.valueOf(scroll2.getValue()));
                color=RecogerColor();
                panelcentral.setBackground(color);
            }
        });

        scroll3.addAdjustmentListener(new AdjustmentListener() {
            Color color;
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                textField3.setText(String.valueOf(scroll3.getValue()));
                color=RecogerColor();
                panelcentral.setBackground(color);
            }
        });

        textField1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField1.selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {
                scroll1.setValue(Integer.parseInt(textField1.getText()));
            }
        });

        textField2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField2.selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {
                scroll2.setValue(Integer.parseInt(textField2.getText()));
            }
        });

        textField3.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField3.selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {
                scroll3.setValue(Integer.parseInt(textField3.getText()));
            }
        });

        negro.addActionListener(e->{
            scroll1.setValue(0);
            scroll2.setValue(0);
            scroll3.setValue(0);
        });

        grisOscuro.addActionListener(e->{
            scroll1.setValue(64);
            scroll2.setValue(64);
            scroll3.setValue(64);
        });

        gris.addActionListener(e->{
            scroll1.setValue(128);
            scroll2.setValue(128);
            scroll3.setValue(128);
        });

        grisClaro.addActionListener(e->{
            scroll1.setValue(192);
            scroll2.setValue(192);
            scroll3.setValue(192);
        });

        blanco.addActionListener(e->{
            scroll1.setValue(255);
            scroll2.setValue(255);
            scroll3.setValue(255);
        });

        magenta.addActionListener(e->{
            scroll1.setValue(255);
            scroll2.setValue(0);
            scroll3.setValue(255);
        });

        azul.addActionListener(e->{
            scroll1.setValue(0);
            scroll2.setValue(0);
            scroll3.setValue(255);
        });

        cyan.addActionListener(e->{
            scroll1.setValue(0);
            scroll2.setValue(255);
            scroll3.setValue(255);
        });

        verde.addActionListener(e->{
            scroll1.setValue(0);
            scroll2.setValue(255);
            scroll3.setValue(0);
        });

        amarillo.addActionListener(e->{
            scroll1.setValue(255);
            scroll2.setValue(255);
            scroll3.setValue(0);
        });

        naranja.addActionListener(e->{
            scroll1.setValue(255);
            scroll2.setValue(200);
            scroll3.setValue(0);
        });

        rojo.addActionListener(e->{
            scroll1.setValue(255);
            scroll2.setValue(0);
            scroll3.setValue(0);
        });

        rosa.addActionListener(e->{
            scroll1.setValue(255);
            scroll2.setValue(175);
            scroll3.setValue(175);
        });
















    }

    private Color RecogerColor() {
        int rojo=scroll1.getValue();
        int verde=scroll2.getValue();
        int azul=scroll3.getValue();
        Color color=new Color(rojo,verde,azul);
        return color;
    }


}
