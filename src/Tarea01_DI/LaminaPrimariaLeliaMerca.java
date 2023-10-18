package Tarea01_DI;

import javax.swing.*;
import java.awt.*;

public class LaminaPrimariaLeliaMerca extends JPanel {

    private JLabel etiqueta;
    private JTextField textField;
    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup grupoRadio;
    private JButton botonAceptar;

    public LaminaPrimariaLeliaMerca(){
        setLayout(new GridLayout(6,1,10,10));
        etiqueta=new JLabel("Nombre Usuario");
        textField=new JTextField(10);
        radio1=new JRadioButton("cliente esporádico");
        radio1.setSelected(true);
        radio2=new JRadioButton("cliente club");
        radio3=new JRadioButton("cliente premium");
        grupoRadio=new ButtonGroup();
        grupoRadio.add(radio1);
        grupoRadio.add(radio2);
        grupoRadio.add(radio3);
        botonAceptar=new JButton("Aceptar");
        add(etiqueta);
        add(textField);
        add(radio1);
        add(radio2);
        add(radio3);
        add(botonAceptar);

        botonAceptar.addActionListener(e->{
            if(radio1.isSelected()) new VentanSecundariaLeliaMerca(1);
            if(radio2.isSelected()) new VentanSecundariaLeliaMerca(2);
            if(radio3.isSelected()) new VentanSecundariaLeliaMerca(3);
        });


    }

}
