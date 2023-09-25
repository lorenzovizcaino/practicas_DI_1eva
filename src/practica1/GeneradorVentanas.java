package practica1;

import javax.swing.JFrame;

public class GeneradorVentanas extends JFrame {
     GeneradorVentanas(String titulo,int alto, int ancho, int posX, int posY) {
        
        super(titulo);
        setSize(ancho,alto);
       // setTitle(titulo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        GeneradorVentanas miVentana = new GeneradorVentanas("Prueba de crear ventanas",200,400,150,150);

    }
}
