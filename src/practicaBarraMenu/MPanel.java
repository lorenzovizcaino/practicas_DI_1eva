package practicaBarraMenu;

import javax.swing.*;
import java.awt.*;

public class MPanel extends JPanel {
    Color color;
    Font fuente=new Font("Arial",Font.PLAIN,60);



    public void setColor(Color color) {
        this.color = color;
    }



    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setFont(fuente);
        setBackground(color);
        g.drawString("Texto de ejemplo",50,getHeight()/2);

    }
}
