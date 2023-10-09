package practica5;

import javax.swing.*;
import java.awt.*;

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

    public LaminaPractica5(){
        setLayout(new BorderLayout());
        //JLabel.setOpaque(true) poner color de fondo a un label
        panelWest=new JPanel();
        panelWest.setLayout(new GridLayout(1,3));
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
        textField1=new JTextField(5);
        label2=new JLabel("verde");
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setFont(new Font("Verdana",Font.BOLD,14));
        label2.setHorizontalAlignment(JLabel.CENTER);
        textField2=new JTextField(5);
        label3=new JLabel("azul");
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setFont(new Font("Verdana",Font.BOLD,14));
        label3.setForeground(Color.WHITE);
        label3.setHorizontalAlignment(JLabel.CENTER);
        textField3=new JTextField(5);
        panelSur.add(label1);
        panelSur.add(textField1);
        panelSur.add(label2);
        panelSur.add(textField2);
        panelSur.add(label3);
        panelSur.add(textField3);
        add(panelSur,BorderLayout.SOUTH);

        panelEste=new JPanel();
        panelEste.setLayout(new GridLayout(13,1));
        negro=new JButton("Negro");
        negro.setBackground(Color.BLACK);
        negro.setForeground(Color.WHITE);
        grisOscuro=new JButton("Gris Oscuro");
        grisOscuro.setBackground(Color.darkGray);
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








    }







}