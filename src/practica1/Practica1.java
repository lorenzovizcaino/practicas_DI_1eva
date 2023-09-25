package practica1;

import javax.swing.*;
import java.awt.*;

public class Practica1 {

    public static void main(String[] args) {
        new VentanaPractica1();
    }
}

class VentanaPractica1 extends JFrame{


    public VentanaPractica1(){
        setBounds(100,100,300,125);
        setTitle("Ejemplo de uso de CheckBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaPractica1 laminaPractica1=new LaminaPractica1();
        add(laminaPractica1);
        setVisible(true);
    }
}

class LaminaPractica1 extends JPanel{
    private JLabel jlabel1, jlabel2;
    private JTextField jTextField;
    private JCheckBox jCheckBox;
    public LaminaPractica1(){
        setLayout(new BorderLayout());
        jlabel1=new JLabel("Introduce un texto cualquiera");
        jlabel1.setHorizontalAlignment(JLabel.CENTER);
        jTextField=new JTextField(20);

        jCheckBox=new JCheckBox();
        jlabel2=new JLabel("Convertir el texto a mayusculas");

        add(jlabel1,BorderLayout.NORTH);
        add(jTextField,BorderLayout.CENTER);
        JPanel panel2=new JPanel();

        panel2.add(jCheckBox);
        panel2.add(jlabel2);
        add(panel2,BorderLayout.SOUTH);
    }
}
