package BK_Hoteles;

import javax.swing.*;

public class VentanaSecundariaPrincipal extends JFrame {


    public VentanaSecundariaPrincipal(){
        setBounds(100,100,600,420);
        setTitle("Reservar Salon");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        LaminaVentanaSecundaria laminaVentanaSecundaria=new LaminaVentanaSecundaria();
        add(laminaVentanaSecundaria);
        setVisible(true);
    }
}
