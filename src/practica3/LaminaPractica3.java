package practica3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaPractica3 extends JPanel {

    private JLabel labelNumerador1,labelNumerador2,labelDenominador1,LabelDenominador2;
    private JTextField tFieldNum1,tFieldNum2,tFieldDen1,tFieldDen2;
    private JTextArea resultados;
    private JScrollPane textAreaScroll;
    private JRadioButton suma, resta, multiplicacion, division;
    private JButton calcular, limpiar;
    private GBCConstrains gbc=new GBCConstrains();
    private Racional2 racional2A, racional2B, racionalResultado;


    public LaminaPractica3(){
        setLayout(new GridBagLayout());
        labelNumerador1=new JLabel("Numerador 1");
        labelNumerador2=new JLabel("Numerador 2");
        labelDenominador1=new JLabel("Denominador 1");
        LabelDenominador2=new JLabel("Denominador 2");

        tFieldNum1=new JTextField(10);
        tFieldNum2=new JTextField(10);
        tFieldDen1=new JTextField(10);
       // tFieldDen1.setAlignmentX(JTextField.RIGHT);
        tFieldDen2=new JTextField(10);

        resultados=new JTextArea(3,3);
        textAreaScroll=new JScrollPane(resultados);
        resultados.setLineWrap(true);
        //resultados.setBackground(Color.LIGHT_GRAY);
        resultados.setBorder(BorderFactory.createTitledBorder("RESULTADOS"));
        JPanel panelOperacion=new JPanel();

        panelOperacion.setLayout(new GridLayout(4,1));
        panelOperacion.setBorder(BorderFactory.createTitledBorder("OPERACIONES"));
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
        //calcular.setEnabled(false);
        limpiar=new JButton("Limpiar");



        add(labelNumerador1,gbc.Constrains(0,0,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));
        add(tFieldNum1,gbc.Constrains(1,0,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));
        add(labelDenominador1,gbc.Constrains(2,0,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));
        add(tFieldDen1,gbc.Constrains(3,0,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));

        add(labelNumerador2,gbc.Constrains(0,1,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));
        add(tFieldNum2,gbc.Constrains(1,1,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));
        add(LabelDenominador2,gbc.Constrains(2,1,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));
        add(tFieldDen2,gbc.Constrains(3,1,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));

        add(textAreaScroll,gbc.Constrains(0,2,3,1,1.0,1.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(5,10,5,10)));


        add(panelOperacion,gbc.Constrains(3,2,1,1,1.0,1.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));

        add(calcular,gbc.Constrains(2,3,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));
        add(limpiar,gbc.Constrains(3,3,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,10,5,10)));


        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tFieldNum1.setText("");
                tFieldNum2.setText("");
                tFieldDen1.setText("");
                tFieldDen2.setText("");
                resultados.setText("");
            }
        });

        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                    calcular.setEnabled(true);
                    racional2A=new Racional2(Integer.parseInt(tFieldNum1.getText()) ,Integer.parseInt(tFieldDen1.getText()));
                    racional2B=new Racional2(Integer.parseInt(tFieldNum2.getText()) ,Integer.parseInt(tFieldDen2.getText()));
                    racionalResultado=new Racional2();

                    if(suma.isSelected()){
                        racionalResultado.sumar(racional2A,racional2B);
                        if((resultados.getText()).equals("")){
                            resultados.setText(String.valueOf(racional2A.devolverNumerador())+"/"+String.valueOf(racional2A.devolverDenominador())+"+"+
                                    String.valueOf(racional2B.devolverNumerador())+"/"+String.valueOf(racional2B.devolverDenominador())+"="+
                                    String.valueOf(racionalResultado.devolverNumerador())+"/"+String.valueOf(racionalResultado.devolverDenominador()));
                        }else{

                            resultados.setText(resultados.getText()+"\n"+String.valueOf(racional2A.devolverNumerador())+"/"+String.valueOf(racional2A.devolverDenominador())+"+"+
                                    String.valueOf(racional2B.devolverNumerador())+"/"+String.valueOf(racional2B.devolverDenominador())+"="+
                                    String.valueOf(racionalResultado.devolverNumerador())+"/"+String.valueOf(racionalResultado.devolverDenominador()));
                        }


                    }
                    if(resta.isSelected()){
                        racionalResultado.restar(racional2A,racional2B);
                        if((resultados.getText()).equals("")){
                            resultados.setText(String.valueOf(racional2A.devolverNumerador())+"/"+String.valueOf(racional2A.devolverDenominador())+"-"+
                                    String.valueOf(racional2B.devolverNumerador())+"/"+String.valueOf(racional2B.devolverDenominador())+"="+
                                    String.valueOf(racionalResultado.devolverNumerador())+"/"+String.valueOf(racionalResultado.devolverDenominador()));
                        }else{
                            resultados.setText(resultados.getText()+"\n"+String.valueOf(racional2A.devolverNumerador())+"/"+String.valueOf(racional2A.devolverDenominador())+"-"+
                                    String.valueOf(racional2B.devolverNumerador())+"/"+String.valueOf(racional2B.devolverDenominador())+"="+
                                    String.valueOf(racionalResultado.devolverNumerador())+"/"+String.valueOf(racionalResultado.devolverDenominador()));
                        }

                    }
                    if(multiplicacion.isSelected()){
                        racionalResultado.multiplicar(racional2A,racional2B);
                        if((resultados.getText()).equals("")){
                            resultados.setText(String.valueOf(racional2A.devolverNumerador())+"/"+String.valueOf(racional2A.devolverDenominador())+"*"+
                                    String.valueOf(racional2B.devolverNumerador())+"/"+String.valueOf(racional2B.devolverDenominador())+"="+
                                    String.valueOf(racionalResultado.devolverNumerador())+"/"+String.valueOf(racionalResultado.devolverDenominador()));

                        }else{
                            resultados.setText(resultados.getText()+"\n"+String.valueOf(racional2A.devolverNumerador())+"/"+String.valueOf(racional2A.devolverDenominador())+"*"+
                                    String.valueOf(racional2B.devolverNumerador())+"/"+String.valueOf(racional2B.devolverDenominador())+"="+
                                    String.valueOf(racionalResultado.devolverNumerador())+"/"+String.valueOf(racionalResultado.devolverDenominador()));
                        }

                    }

                    if(division.isSelected()){
                        racionalResultado.dividir(racional2A,racional2B);
                        if((resultados.getText()).equals("")){
                            resultados.setText(String.valueOf(racional2A.devolverNumerador())+"/"+String.valueOf(racional2A.devolverDenominador())+"/"+
                                    String.valueOf(racional2B.devolverNumerador())+"/"+String.valueOf(racional2B.devolverDenominador())+"="+
                                    String.valueOf(racionalResultado.devolverNumerador())+"/"+String.valueOf(racionalResultado.devolverDenominador()));
                        }else{
                            resultados.setText(resultados.getText()+"\n"+String.valueOf(racional2A.devolverNumerador())+"/"+String.valueOf(racional2A.devolverDenominador())+"/"+
                                    String.valueOf(racional2B.devolverNumerador())+"/"+String.valueOf(racional2B.devolverDenominador())+"="+
                                    String.valueOf(racionalResultado.devolverNumerador())+"/"+String.valueOf(racionalResultado.devolverDenominador()));
                        }

                    }



            }
        });

    }
}
