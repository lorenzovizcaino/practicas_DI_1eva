package practica7;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manejador implements ActionListener, DocumentListener {

    PanelPunto panelPunto;
    PanelEjecutar panelEjecutar;
    private Color[]colores={Color.BLACK,Color.DARK_GRAY,Color.GRAY,Color.LIGHT_GRAY,Color.WHITE,Color.MAGENTA,Color.BLUE,Color.CYAN,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED,Color.PINK};


    public Manejador(PanelPunto panelPunto,PanelEjecutar panelEjecutar){
        this.panelPunto=panelPunto;
        this.panelEjecutar=panelEjecutar;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand()=="Limpiar"){
            panelPunto.areaTexto.setText("");
            panelPunto.coordenadaX1.setText("");
            panelPunto.coordenadaY1.setText("");
            panelPunto.coordenadaX2.setText("");
            panelPunto.coordenadaY2.setText("");
            panelEjecutar.getCoordendas(0,0,0,0,"", Color.GRAY, Color.GRAY);
            panelPunto.dibujar.setEnabled(false);
            panelPunto.calcular.setEnabled(false);
            panelEjecutar.repaint();
        }
        if(e.getActionCommand()=="Calcular"){
           Punto punto1=new Punto(Double.parseDouble(panelPunto.coordenadaX1.getText()),Double.parseDouble(panelPunto.coordenadaY1.getText()));
           Punto punto2=new Punto(Double.parseDouble(panelPunto.coordenadaX2.getText()),Double.parseDouble(panelPunto.coordenadaY2.getText()));
           double distancia=punto1.calcularDistancia(punto2);
            double distaciaRedondeada = Math.round(distancia * 100.0) / 100.0;
           panelPunto.areaTexto.setText(String.valueOf(distaciaRedondeada));

        }
        if(e.getActionCommand()=="Dibujar"){
            int x1=Integer.parseInt(panelPunto.coordenadaX1.getText());
            int y1=Integer.parseInt(panelPunto.coordenadaY1.getText());
            int x2=Integer.parseInt(panelPunto.coordenadaX2.getText());
            int y2=Integer.parseInt(panelPunto.coordenadaY2.getText());
            int itemColorBorde=panelPunto.colorBorde.getSelectedIndex();
            int itemColorInterno=panelPunto.colorInterno.getSelectedIndex();
            System.out.println(itemColorBorde);
            Color colorBorde=colores[itemColorBorde];
            Color colorInterno=colores[itemColorInterno];

            panelEjecutar.getCoordendas(x1,y1,x2,y2,"RECTANGULO",colorBorde,colorInterno);
            panelEjecutar.repaint();

        }

    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        if(!(panelPunto.coordenadaX1.getText().equals("") || panelPunto.coordenadaY1.getText().equals("") || panelPunto.coordenadaX2.getText().equals("") || panelPunto.coordenadaY2.getText().equals(""))){
            System.out.println("HOLA");
            panelPunto.dibujar.setEnabled(true);
            panelPunto.calcular.setEnabled(true);
        }

    }

    @Override
    public void removeUpdate(DocumentEvent e) {

    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}
