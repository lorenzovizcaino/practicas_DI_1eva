package Tarea01_DI;

import javax.swing.*;

public class VentanaPrimariaLeliaMerca extends JFrame {

    public VentanaPrimariaLeliaMerca(){
        setSize(300,300);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("LeliaMerca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaPrimariaLeliaMerca laminaPrimariaLeliaMerca=new LaminaPrimariaLeliaMerca();
        add(laminaPrimariaLeliaMerca);
        setVisible(true);
    }
}
