package practica7;

import javax.swing.*;

public class Ventana extends JFrame {


    public Ventana(){
        setBounds(100,100,800,500);
        setTitle("Dibuja Rectangulos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanelPunto panelPunto=new PanelPunto();
        add(panelPunto);
        setVisible(true);
    }
}
