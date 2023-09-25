package practica3;

import javax.swing.*;
import java.awt.*;

public class LaminaPractica3 extends JPanel {

    private JLabel labelNumerador1,labelNumerador2,labelDenominador1,LabelDenominador2;
    private JTextField tFieldNum1,tFieldNum2,tFieldDen1,tFieldDen2;
    private JTextArea resultados;
    private JRadioButton suma, resta, multiplicacion, division;
    private JButton calcular, limpiar;
    private GBCConstrains gbc=new GBCConstrains();

    public LaminaPractica3(){
        setLayout(new GridBagLayout());
        labelNumerador1=new JLabel("Numerador 1");
        labelNumerador2=new JLabel("Numerador 2");
        labelDenominador1=new JLabel("Denominador 1");
        LabelDenominador2=new JLabel("Denominador 2");

        tFieldNum1=new JTextField(10);
        tFieldNum2=new JTextField(10);
        tFieldDen1=new JTextField(10);
        tFieldDen2=new JTextField(10);

        resultados=new JTextArea(3,3);
        resultados.setBackground(Color.LIGHT_GRAY);
        JPanel panelOperacion=new JPanel();

        panelOperacion.setLayout(new GridLayout(4,1));
        ButtonGroup grupo=new ButtonGroup();
        suma=new JRadioButton("Suma");
        resta=new JRadioButton("Resta");
        multiplicacion=new JRadioButton("Multiplicacion");
        division=new JRadioButton("Division");

        grupo.add(suma);
        grupo.add(resta);
        grupo.add(multiplicacion);
        grupo.add(division);
        panelOperacion.add(suma);
        panelOperacion.add(resta);
        panelOperacion.add(multiplicacion);
        panelOperacion.add(division);


        calcular=new JButton("Calcular");
        limpiar=new JButton("Limpiar");

        add(labelNumerador1,gbc.Constrains(0,0,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));
        add(tFieldNum1,gbc.Constrains(1,0,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));
        add(labelDenominador1,gbc.Constrains(2,0,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));
        add(tFieldDen1,gbc.Constrains(3,0,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));

        add(labelNumerador2,gbc.Constrains(0,1,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));
        add(tFieldNum2,gbc.Constrains(1,1,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));
        add(LabelDenominador2,gbc.Constrains(2,1,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));
        add(tFieldDen2,gbc.Constrains(3,1,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));

       add(resultados,gbc.Constrains(0,2,3,1,0.0,0.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(5,10,5,10)));

        add(panelOperacion,gbc.Constrains(3,2,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));

        add(calcular,gbc.Constrains(2,3,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));
        add(limpiar,gbc.Constrains(3,3,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));



    }
}
