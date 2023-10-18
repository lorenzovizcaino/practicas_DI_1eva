package practica5ConManejador;

import java.awt.*;
import java.awt.event.*;

public class ManejadorPractica5 implements ActionListener, FocusListener, AdjustmentListener {

    private LaminaPractica5_v2 laminaPractica5_v2;

    public ManejadorPractica5(){
        laminaPractica5_v2=new LaminaPractica5_v2();
    }

    public ManejadorPractica5(LaminaPractica5_v2 laminaPractica5_v2){
        this.laminaPractica5_v2=laminaPractica5_v2;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()){
            case "Negro":
                System.out.println("NEGRO");
                laminaPractica5_v2.scroll1.setValue(0);
                laminaPractica5_v2.scroll2.setValue(0);
                laminaPractica5_v2.scroll3.setValue(0);
                break;
            case "Gris Oscuro":
                laminaPractica5_v2.scroll1.setValue(64);
                laminaPractica5_v2.scroll2.setValue(64);
                laminaPractica5_v2.scroll3.setValue(64);
                break;
            case "Gris":
                laminaPractica5_v2.scroll1.setValue(128);
                laminaPractica5_v2.scroll2.setValue(128);
                laminaPractica5_v2.scroll3.setValue(128);
                break;
            case "Gris Claro":
                laminaPractica5_v2.scroll1.setValue(192);
                laminaPractica5_v2.scroll2.setValue(192);
                laminaPractica5_v2.scroll3.setValue(192);
                break;
            case "Blanco":
                laminaPractica5_v2.scroll1.setValue(255);
                laminaPractica5_v2.scroll2.setValue(255);
                laminaPractica5_v2.scroll3.setValue(255);
                break;
            case "Magenta":
                laminaPractica5_v2.scroll1.setValue(255);
                laminaPractica5_v2.scroll2.setValue(0);
                laminaPractica5_v2.scroll3.setValue(255);
                break;
            case "Azul":
                laminaPractica5_v2.scroll1.setValue(0);
                laminaPractica5_v2.scroll2.setValue(0);
                laminaPractica5_v2.scroll3.setValue(255);
                break;
            case "Cyan":
                laminaPractica5_v2.scroll1.setValue(0);
                laminaPractica5_v2.scroll2.setValue(255);
                laminaPractica5_v2.scroll3.setValue(255);
                break;
            case "Verde":
                laminaPractica5_v2.scroll1.setValue(0);
                laminaPractica5_v2.scroll2.setValue(255);
                laminaPractica5_v2.scroll3.setValue(0);
                break;
            case "Amarillo":
                laminaPractica5_v2.scroll1.setValue(255);
                laminaPractica5_v2.scroll2.setValue(255);
                laminaPractica5_v2.scroll3.setValue(0);
                break;
            case "Naranja":
                laminaPractica5_v2.scroll1.setValue(255);
                laminaPractica5_v2.scroll2.setValue(200);
                laminaPractica5_v2.scroll3.setValue(0);
                break;
            case "Rojo":
                laminaPractica5_v2.scroll1.setValue(255);
                laminaPractica5_v2.scroll2.setValue(0);
                laminaPractica5_v2.scroll3.setValue(0);
                break;
            case "Rosa":
                laminaPractica5_v2.scroll1.setValue(255);
                laminaPractica5_v2.scroll2.setValue(175);
                laminaPractica5_v2.scroll3.setValue(175);
                break;
        }
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        Color color;
        if(e.getSource().equals(laminaPractica5_v2.scroll1)){
            laminaPractica5_v2.textField1.setText(String.valueOf(laminaPractica5_v2.scroll1.getValue()));
            color=RecogerColor();
            laminaPractica5_v2.panelcentral.setBackground(color);
        }
        if(e.getSource().equals(laminaPractica5_v2.scroll2)){
            laminaPractica5_v2.textField2.setText(String.valueOf(laminaPractica5_v2.scroll2.getValue()));
            color=RecogerColor();
            laminaPractica5_v2.panelcentral.setBackground(color);
        }
        if(e.getSource().equals(laminaPractica5_v2.scroll3)){
            laminaPractica5_v2.textField3.setText(String.valueOf(laminaPractica5_v2.scroll3.getValue()));
            color=RecogerColor();
            laminaPractica5_v2.panelcentral.setBackground(color);
        }

    }

    private Color RecogerColor() {
        int rojo=laminaPractica5_v2.scroll1.getValue();
        int verde=laminaPractica5_v2.scroll2.getValue();
        int azul=laminaPractica5_v2.scroll3.getValue();
        Color color=new Color(rojo,verde,azul);
        return color;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if(e.getSource().equals(laminaPractica5_v2.textField1)){
            laminaPractica5_v2.textField1.selectAll();
        }

        if(e.getSource().equals(laminaPractica5_v2.textField2)){
            laminaPractica5_v2.textField2.selectAll();
        }

        if(e.getSource().equals(laminaPractica5_v2.textField3)){
            laminaPractica5_v2.textField3.selectAll();
        }

    }
    

    @Override
    public void focusLost(FocusEvent e) {
        if(e.getSource().equals(laminaPractica5_v2.textField1)){
            laminaPractica5_v2.scroll1.setValue(Integer.parseInt(laminaPractica5_v2.textField1.getText()));
        }

        if(e.getSource().equals(laminaPractica5_v2.textField2)){
            laminaPractica5_v2.scroll2.setValue(Integer.parseInt(laminaPractica5_v2.textField2.getText()));
        }

        if(e.getSource().equals(laminaPractica5_v2.textField3)){
            laminaPractica5_v2.scroll3.setValue(Integer.parseInt(laminaPractica5_v2.textField3.getText()));
        }
    }
}
