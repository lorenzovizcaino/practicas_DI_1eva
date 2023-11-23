package practicaExamen;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class MiPanel extends JPanel {

    private String usuario;

    public MiPanel(){
        usuario="";
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(usuario,20,40);
        if(!usuario.equals("")){
            LocalDate fecha=LocalDate.now();
            LocalTime hora=LocalTime.now();
            g.drawString(String.valueOf(fecha),20,60);
            g.drawString(String.valueOf(hora),20,80);
        }


    }
}
