package practicaBarraMenu;

import javax.swing.*;

public class VentanaBarraMenu extends JFrame {
        public VentanaBarraMenu(){
            setTitle("Uso de objetos JMenu");
            setBounds(10,10,600,300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            LaminaBarraMenu laminaBarraMenu=new LaminaBarraMenu();
            add(laminaBarraMenu);
            setVisible(true);
        }
}
