package practica5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class LaminaPractica5_v2 extends JPanel {
    private JScrollBar scroll1;
    private JScrollBar scroll2;
    private JScrollBar scroll3;
    private JPanel panelWest;
    private JPanel panelcentral;
    private JPanel panelSur;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private PanelBotonesColor panelBotonesColor;





    public LaminaPractica5_v2(){
        setLayout(new BorderLayout());
        //JLabel.setOpaque(true) poner color de fondo a un label
        panelWest=new JPanel();
        panelWest.setLayout(new GridLayout(1,3,5,0));
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
        textField1=new JTextField("0",5);
        label2=new JLabel("verde");
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setFont(new Font("Verdana",Font.BOLD,14));
        label2.setHorizontalAlignment(JLabel.CENTER);
        textField2=new JTextField("0",5);
        label3=new JLabel("azul");
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setFont(new Font("Verdana",Font.BOLD,14));
        label3.setForeground(Color.WHITE);
        label3.setHorizontalAlignment(JLabel.CENTER);
        textField3=new JTextField("0",5);
        panelSur.add(label1);
        panelSur.add(textField1);
        panelSur.add(label2);
        panelSur.add(textField2);
        panelSur.add(label3);
        panelSur.add(textField3);
        add(panelSur,BorderLayout.SOUTH);
        panelBotonesColor=new PanelBotonesColor();
        add(panelBotonesColor,BorderLayout.EAST);


        //empieza la funcionalidad
        scroll1.addAdjustmentListener(new AdjustmentListener() {
            Color color;
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                textField1.setText(String.valueOf(scroll1.getValue()));
                color=RecogerColor();
                panelcentral.setBackground(color);
            }
        });

        scroll2.addAdjustmentListener(new AdjustmentListener() {
            Color color;
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                textField2.setText(String.valueOf(scroll2.getValue()));
                color=RecogerColor();
                panelcentral.setBackground(color);
            }
        });

        scroll3.addAdjustmentListener(new AdjustmentListener() {
            Color color;
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                textField3.setText(String.valueOf(scroll3.getValue()));
                color=RecogerColor();
                panelcentral.setBackground(color);
            }
        });

        textField1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField1.selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {
                scroll1.setValue(Integer.parseInt(textField1.getText()));
            }
        });

        textField2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField2.selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {
                scroll2.setValue(Integer.parseInt(textField2.getText()));
            }
        });

        textField3.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField3.selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {
                scroll3.setValue(Integer.parseInt(textField3.getText()));
            }
        });


















    }

    class PanelBotonesColor extends JPanel {
        private Color[]colores={Color.BLACK,Color.DARK_GRAY,Color.GRAY,Color.LIGHT_GRAY,Color.WHITE,Color.MAGENTA,Color.BLUE,Color.CYAN,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED,Color.PINK};
        private String[] coloresString={"Negro","Gris Oscuro","Gris","Gris Claro","Blanco","Magenta","Azul","Cyan","Verde","Amarillo","Naranja","Rojo","Rosa"};
        private JButton[] botones=new JButton[13];


        public PanelBotonesColor(){
            setLayout(new GridLayout(13,1,0,2));
            for(int i=0;i< botones.length;i++){
                botones[i]=new JButton(coloresString[i]);
                botones[i].setBackground(colores[i]);
                if(i<3){
                    botones[i].setForeground(Color.WHITE);
                }else{
                    botones[i].setForeground(Color.BLACK);
                }

                add(botones[i]);
                botones[i].addActionListener(e->{
                    switch (e.getActionCommand()){
                        case "Negro":
                            scroll1.setValue(0);
                            scroll2.setValue(0);
                            scroll3.setValue(0);
                            break;
                        case "Gris Oscuro":
                            scroll1.setValue(64);
                            scroll2.setValue(64);
                            scroll3.setValue(64);
                            break;
                        case "Gris":
                            scroll1.setValue(128);
                            scroll2.setValue(128);
                            scroll3.setValue(128);
                            break;
                        case "Gris Claro":
                            scroll1.setValue(192);
                            scroll2.setValue(192);
                            scroll3.setValue(192);
                            break;
                        case "Blanco":
                            scroll1.setValue(255);
                            scroll2.setValue(255);
                            scroll3.setValue(255);
                            break;
                        case "Magenta":
                            scroll1.setValue(255);
                            scroll2.setValue(0);
                            scroll3.setValue(255);
                            break;
                        case "Azul":
                            scroll1.setValue(0);
                            scroll2.setValue(0);
                            scroll3.setValue(255);
                            break;
                        case "Cyan":
                            scroll1.setValue(0);
                            scroll2.setValue(255);
                            scroll3.setValue(255);
                            break;
                        case "Verde":
                            scroll1.setValue(0);
                            scroll2.setValue(255);
                            scroll3.setValue(0);
                            break;
                        case "Amarillo":
                            scroll1.setValue(255);
                            scroll2.setValue(255);
                            scroll3.setValue(0);
                            break;
                        case "Naranja":
                            scroll1.setValue(255);
                            scroll2.setValue(200);
                            scroll3.setValue(0);
                            break;
                        case "Rojo":
                            scroll1.setValue(255);
                            scroll2.setValue(0);
                            scroll3.setValue(0);
                            break;
                        case "Rosa":
                            scroll1.setValue(255);
                            scroll2.setValue(175);
                            scroll3.setValue(175);
                            break;
                    }
                });

            }
        }


    }

    private Color RecogerColor() {
        int rojo=scroll1.getValue();
        int verde=scroll2.getValue();
        int azul=scroll3.getValue();
        Color color=new Color(rojo,verde,azul);
        return color;
    }


}

