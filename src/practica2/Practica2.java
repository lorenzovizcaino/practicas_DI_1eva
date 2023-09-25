package practica2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.Color.BLUE;

public class Practica2 {
    public static void main(String[] args) {
        new VentanaPractica2();
    }
}

class VentanaPractica2 extends JFrame {
    public VentanaPractica2(){
        setBounds(100,100,300,125);
        setTitle("Uso de GridBagLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaPractica2 laminaPractica2=new LaminaPractica2();
        add(laminaPractica2);
        setVisible(true);
    }

}

class LaminaPractica2 extends JPanel{

    private JLabel jlabel1;
    private JTextField jTextField;
    private JCheckBox jCheckBox;
    GBCConstrains gbc=new GBCConstrains();
    public LaminaPractica2(){
        setLayout(new GridBagLayout());
        jlabel1=new JLabel("Introduce un texto cualquiera");
        jlabel1.setHorizontalAlignment(JLabel.CENTER);
        jlabel1.setFont(new Font("Arial",Font.BOLD,16));


        jTextField=new JTextField(20);
        jCheckBox=new JCheckBox("Convertir el texto a mayusculas");
        jCheckBox.setDisplayedMnemonicIndex(0);

        add(jlabel1,gbc.Constrains(0,0,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));
        add(jTextField,gbc.Constrains(0,1,1,1,1.0,1.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(5,10,5,10)));
        add(jCheckBox,gbc.Constrains(0,2,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));


    }
}