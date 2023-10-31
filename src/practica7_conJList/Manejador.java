package practica7_conJList;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Manejador implements ActionListener, DocumentListener , ListSelectionListener {

    PanelPunto panelPunto;
    Punto punto1, punto2;
    PanelEjecutar panelEjecutar;
    private Color[]colores={Color.BLACK,Color.DARK_GRAY,Color.GRAY,Color.LIGHT_GRAY,Color.WHITE,Color.MAGENTA,Color.BLUE,Color.CYAN,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED,Color.PINK};
    private Cuadrado cuadrado;
    private ArrayList<Cuadrado> cuadrados=new ArrayList<>();
    private static int contador=0;

    public Manejador(PanelPunto panelPunto, PanelEjecutar panelEjecutar){
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
            panelEjecutar.getCoordendas(0,0,0,"", Color.GRAY, Color.GRAY);
            panelPunto.dibujar.setEnabled(false);
            panelPunto.calcular.setEnabled(false);
            panelEjecutar.repaint();
        }
        if(e.getActionCommand()=="Calcular"){
           punto1=new Punto(Double.parseDouble(panelPunto.coordenadaX1.getText()),Double.parseDouble(panelPunto.coordenadaY1.getText()));
           punto2=new Punto(Double.parseDouble(panelPunto.coordenadaX2.getText()),Double.parseDouble(panelPunto.coordenadaY2.getText()));
           double distancia=punto1.calcularDistancia(punto2);
            double distaciaRedondeada = Math.round(distancia * 100.0) / 100.0;
           panelPunto.areaTexto.setText(String.valueOf(distaciaRedondeada));

        }
        if(e.getActionCommand()=="Dibujar"){
            int x1=Integer.parseInt(panelPunto.coordenadaX1.getText());
            int y1=Integer.parseInt(panelPunto.coordenadaY1.getText());

            int itemColorBorde=panelPunto.colorBorde.getSelectedIndex();
            int itemColorInterno=panelPunto.colorInterno.getSelectedIndex();
            Color colorBorde=colores[itemColorBorde];
            Color colorInterno=colores[itemColorInterno];


            int distancia= (int)punto1.calcularDistancia(punto2);
            System.out.println(distancia);
            panelEjecutar.getCoordendas(x1,y1,distancia ,"RECTANGULO",colorBorde,colorInterno);
            panelEjecutar.repaint();

        }
        if(e.getActionCommand()=="Añadir a la lista"){
            String line=panelPunto.areaTexto.getText();
            panelPunto.listModel.addElement(line);
            panelPunto.areaTexto.setText("");
        }

    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        if(!(panelPunto.coordenadaX1.getText().equals("") || panelPunto.coordenadaY1.getText().equals("") || panelPunto.coordenadaX2.getText().equals("") || panelPunto.coordenadaY2.getText().equals(""))){

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

    @Override
    public void valueChanged(ListSelectionEvent e) {
        cuadrado=new Cuadrado(contador,Integer.parseInt(panelPunto.coordenadaX1.getText()),Integer.parseInt(panelPunto.coordenadaY1.getText()),Integer.parseInt(panelPunto.areaTexto.getText()));


        if (!e.getValueIsAdjusting()) {
            int selectedIndex = panelPunto.lineList.getSelectedIndex();
            if (selectedIndex != -1) {
                // Realizar la acción en la línea seleccionada
                String selectedLine = panelPunto.listModel.getElementAt(selectedIndex);

                System.out.println(selectedIndex);
                System.out.println("Línea seleccionada: " + selectedLine);
                // Puedes reemplazar esta impresión con la acción que desees realizar en la línea.
            }
        }

    }
}
