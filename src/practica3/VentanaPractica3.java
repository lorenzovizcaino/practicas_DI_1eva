package practica3;

import javax.swing.*;

public class VentanaPractica3 extends JFrame {

    public VentanaPractica3(){
        setBounds(100,100,500,300);
        setTitle("Practica 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaPractica3 laminaPractica3=new LaminaPractica3();
        add(laminaPractica3);
        setVisible(true);
    }

}
