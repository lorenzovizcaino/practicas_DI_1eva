package practica7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manejador implements ActionListener {

    PanelPunto panelPunto;
    PanelEjecutar panelEjecutar;


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
            panelEjecutar.getCoordendas(0,0,0,0,"");
            panelEjecutar.repaint();
        }
        if(e.getActionCommand()=="Calcular"){
           Punto punto1=new Punto(Double.parseDouble(panelPunto.coordenadaX1.getText()),Double.parseDouble(panelPunto.coordenadaY1.getText()));
           Punto punto2=new Punto(Double.parseDouble(panelPunto.coordenadaX2.getText()),Double.parseDouble(panelPunto.coordenadaY2.getText()));
           double distancia=punto1.calcularDistancia(punto2);
           panelPunto.areaTexto.setText(String.valueOf(distancia));

        }
        if(e.getActionCommand()=="Dibujar"){
            int x1=Integer.parseInt(panelPunto.coordenadaX1.getText());
            int y1=Integer.parseInt(panelPunto.coordenadaY1.getText());
            int x2=Integer.parseInt(panelPunto.coordenadaX2.getText());
            int y2=Integer.parseInt(panelPunto.coordenadaY2.getText());

            panelEjecutar.getCoordendas(x1,y1,x2,y2,"Rectangulo");
            panelEjecutar.repaint();

        }

    }
}
