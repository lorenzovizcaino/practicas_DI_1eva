package practica5;

import practica3.LaminaPractica3;

import javax.swing.*;

public class VentanaPractica5 extends JFrame {

    public VentanaPractica5(){
        setBounds(100,100,600,600);
        setTitle("Practica 5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaPractica5 laminaPractica5=new LaminaPractica5();
        add(laminaPractica5);
        setVisible(true);

    }


}
