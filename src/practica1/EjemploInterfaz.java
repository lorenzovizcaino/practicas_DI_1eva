package practica1;

import javax.swing.*;

public class EjemploInterfaz extends JFrame {

    // Declaracion de propiedades de la interface
    JPanel miPanel;
    JButton boton1;
    JButton boton2;
    JButton boton3;

    // Constructor de la ventana
    EjemploInterfaz() {
        miPanel = new JPanel();
        boton1 = new JButton("Boton 1");
        boton2 = new JButton("Este es el boton 2");
        boton3 = new JButton("Boton 3");
        miPanel.add(boton1);
        miPanel.add(boton2);
        miPanel.add(boton3);
        setContentPane(miPanel);
        setSize(350, 150);
        setTitle("Prueba de FlowLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        EjemploInterfaz miVentana = new EjemploInterfaz();

    }
}
