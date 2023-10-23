package Tarea01_DI;



import javax.swing.*;
import java.awt.*;



public class LaminaPrimariaLeliaMerca extends JPanel {

    private JLabel etiqueta;
    private JTextField textField;
    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup grupoRadio;
    private JButton botonAceptar;
    private GBCConstrains gbc=new GBCConstrains();
    private Font fontTitle=new Font("Lucida Sans",Font.BOLD,17);
    private Font fontRadio=new Font("Lucida Sans",Font.BOLD,14);

    public LaminaPrimariaLeliaMerca(){
        setLayout(new GridBagLayout());
        setBackground(Color.BLACK);


        etiqueta=new JLabel("Nombre Usuario");
        etiqueta.setFont(fontTitle);
        etiqueta.setForeground(Color.white);

        textField=new JTextField(10);
        textField.setFont(fontRadio);
        radio1=new JRadioButton("CLIENTE ESPORADICO");
        radio1.setSelected(true);
        radio1.setFont(fontRadio);
        radio1.setBackground(Color.BLACK);
        radio1.setForeground(Color.WHITE);
        radio2=new JRadioButton("CLIENTE CLUB");
        radio2.setFont(fontRadio);
        radio2.setBackground(Color.BLACK);
        radio2.setForeground(Color.WHITE);
        radio3=new JRadioButton("CLIENTE PREMIUM");
        radio3.setFont(fontRadio);
        radio3.setBackground(Color.BLACK);
        radio3.setForeground(Color.WHITE);
        grupoRadio=new ButtonGroup();
        grupoRadio.add(radio1);
        grupoRadio.add(radio2);
        grupoRadio.add(radio3);
        botonAceptar=new JButton("ACEPTAR");
        botonAceptar.setBackground(new Color(212,175,55));
        botonAceptar.setFont(fontTitle);

        botonAceptar.setBorderPainted(false);

        add(etiqueta,gbc.Constrains(0,0,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(10,25,10,25)));
        add(textField,gbc.Constrains(0,1,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(0,25,0,25)));
        add(radio1,gbc.Constrains(0,2,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(10,25,10,25)));
        add(radio2,gbc.Constrains(0,3,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(10,25,10,25)));
        add(radio3,gbc.Constrains(0,4,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(10,25,10,25)));
        add(botonAceptar,gbc.Constrains(0,5,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(10,25,10,25)));


        botonAceptar.addActionListener(e->{
            if(radio1.isSelected()) new VentanSecundariaLeliaMerca(1);
            if(radio2.isSelected()) new VentanSecundariaLeliaMerca(2);
            if(radio3.isSelected()) new VentanSecundariaLeliaMerca(3);
        });


    }

}
