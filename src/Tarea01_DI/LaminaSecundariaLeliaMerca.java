package Tarea01_DI;

import javax.swing.*;

public class LaminaSecundariaLeliaMerca extends JPanel {


    private JButton hola;

    public LaminaSecundariaLeliaMerca(int id){

        hola=new JButton("HOLA");
        add(hola);
        System.out.println(id);
    }
}
