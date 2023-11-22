package practicaExamen;

import javax.swing.*;

public class VentanaPracticaExamen extends JFrame {

    public VentanaPracticaExamen(){
        setBounds(100,100,300,200);
        setTitle("login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaPracticaExamen laminaPracticaExamen=new LaminaPracticaExamen();
        add(laminaPracticaExamen);
        setVisible(true);
    }
}
