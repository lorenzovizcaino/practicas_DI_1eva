package BK_Hoteles;

import javax.swing.*;

public class VentanaPrincipalBKHoteles  extends JFrame {



    public VentanaPrincipalBKHoteles(){
        setBounds(100,100,400,400);
        setTitle("BK Hoteles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaPrincipalBKHoteles laminaPrincipalBKHoteles=new LaminaPrincipalBKHoteles();
        add(laminaPrincipalBKHoteles);
        setVisible(true);
    }
}
