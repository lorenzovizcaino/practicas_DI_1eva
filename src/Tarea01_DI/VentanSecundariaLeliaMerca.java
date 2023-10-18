package Tarea01_DI;

import javax.swing.*;

public class VentanSecundariaLeliaMerca extends JFrame {


    public VentanSecundariaLeliaMerca(int id){

        setSize(600,400);
        setLocationRelativeTo(null);
        setTitle("LeliaMerca Productos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        LaminaSecundariaLeliaMerca laminaSecundariaLeliaMerca=new LaminaSecundariaLeliaMerca(id);
        add(laminaSecundariaLeliaMerca);
        setVisible(true);
    }
}
