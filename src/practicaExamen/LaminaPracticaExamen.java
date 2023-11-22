package practicaExamen;

import javax.swing.*;
import java.awt.*;

public class LaminaPracticaExamen extends JPanel {




    private JPanel principal;
    private JLabel usuario, contraseña;
    private JTextField tFusuario, tFcontraseña;
    private JButton aceptar, cancelar;

    public LaminaPracticaExamen(){

        principal=new JPanel();
        principal.setBorder(BorderFactory.createTitledBorder("Login"));
        principal.setLayout(new GridLayout(3,2,15,15));
        usuario=new JLabel("Usuario");
        contraseña=new JLabel("Contraseña");
        tFusuario=new JTextField(10);
        tFcontraseña=new JTextField(10);
        aceptar=new JButton("Aceptar");
        cancelar=new JButton("Cancelar");
        principal.add(usuario);
        principal.add(tFusuario);
        principal.add(contraseña);
        principal.add(tFcontraseña);
        principal.add(aceptar);
        principal.add(cancelar);
        add(principal);
    }
}
