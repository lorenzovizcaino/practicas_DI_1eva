package fraseRepetida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ManejadorFrase implements ActionListener, FocusListener, KeyListener {
    private VentanaFrase ventanaFrase;
    private PanelCentral panelCentral;
    private PanelDibujo panelDibujo;
    private Frase frase;
    private Color color;
    boolean volverPintar=false;
    String fraseTexto="";
    String fraseAsterisco="";

    public ManejadorFrase(VentanaFrase ventanaFrase,PanelCentral panelCentral,PanelDibujo panelDibujo){
        this.ventanaFrase=ventanaFrase;
        this.panelCentral=panelCentral;
        this.panelDibujo=panelDibujo;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="Procesar frase"){
            procesarFrase();




        }
        if(e.getActionCommand()=="Salir"){
            System.exit(0);
        }

        if(e.getActionCommand()=="Limpiar"){
            limpiar();


        }

        if(e.getActionCommand()=="Pintar"){
            color= JColorChooser.showDialog(ventanaFrase,"Color a elegir",Color.BLACK);
            if(volverPintar){
                pintar();

            }else{
                volverPintar=true;
            }


        }
        if(e.getActionCommand()=="Mostrar"){
            pintar();

        }

    }

    private void procesarFrase() {
        frase=new Frase(fraseTexto);
        panelCentral.cuadros[0].setText(String.valueOf(frase.contarLetras()));
        panelCentral.cuadros[1].setText(String.valueOf(frase.contarPalabras()));
        panelCentral.cuadros[2].setText(String.valueOf(frase.invertirFrase()));
        panelCentral.cuadros[3].setText(String.valueOf(frase.separarPalabras()));
        panelCentral.cuadros[4].setText(String.valueOf(frase.primeraVocal()));
        ventanaFrase.cuadroFrase.setText(fraseTexto);
    }
    private void limpiar() {
        ventanaFrase.cuadroFrase.setText("");
        panelCentral.cuadros[0].setText("");
        panelCentral.cuadros[1].setText("");
        panelCentral.cuadros[2].setText("");
        panelCentral.cuadros[3].setText("");
        panelCentral.cuadros[4].setText("");
        ventanaFrase.cuadroFrase.grabFocus();
        volverPintar=false;
        panelDibujo.setTexto("");
        panelDibujo.repaint();
        fraseAsterisco="";
        fraseTexto="";
    }

    private void pintar() {
        panelDibujo.setColor(color);
        panelDibujo.setTexto(fraseTexto);

        panelDibujo.repaint();
    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

        if(e.getSource()==ventanaFrase.cuadroFrase){
            ventanaFrase.botonMostrar.setEnabled(true);
            ventanaFrase.botonPintar.setEnabled(true);
        }
        if(e.getSource()==ventanaFrase.botonProcesar){
            System.out.println("hola");
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

        if(e.getSource()==ventanaFrase.cuadroFrase){
            e.consume();
            fraseTexto+=e.getKeyChar();
            fraseAsterisco+="*";
            ventanaFrase.cuadroFrase.setText(fraseAsterisco);
        }



    }



    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_CONTROL+KeyEvent.VK_P){
            procesarFrase();


        }
        if(e.getKeyCode()==(KeyEvent.VK_CONTROL+KeyEvent.VK_L)){
            limpiar();


        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
