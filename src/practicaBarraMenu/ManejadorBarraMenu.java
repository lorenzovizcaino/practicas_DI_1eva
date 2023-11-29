package practicaBarraMenu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManejadorBarraMenu implements ActionListener {

    LaminaBarraMenu laminaBarraMenu;
    MPanel mPanel;
    Color colorFondo=Color.BLACK;
    Font fuente;

    public ManejadorBarraMenu(LaminaBarraMenu laminaBarraMenu, MPanel mPanel) {
        this.laminaBarraMenu = laminaBarraMenu;
        this.mPanel = mPanel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==laminaBarraMenu.negro){
            colorFondo= Color.BLACK;
            mPanel.setColor(colorFondo);
            mPanel.repaint();

        }
        if(e.getSource()==laminaBarraMenu.azul){
            colorFondo= Color.CYAN;
            mPanel.setColor(colorFondo);
            mPanel.repaint();

        }
        if(e.getSource()==laminaBarraMenu.rojo){
            colorFondo= Color.RED;
            mPanel.setColor(colorFondo);
            mPanel.repaint();

        }
        if(e.getSource()==laminaBarraMenu.verde){
            colorFondo= Color.GREEN;
            mPanel.setColor(colorFondo);
            mPanel.repaint();

        }
        if(e.getSource()==laminaBarraMenu.serif){
            fuente=ConfigurarFuente("Serif");
            mPanel.setFuente(fuente);
            mPanel.repaint();
        }
        if(e.getSource()==laminaBarraMenu.monoSpaced){
            fuente=ConfigurarFuente("MonoSpaced");
            mPanel.setFuente(fuente);
            mPanel.repaint();
        }
        if(e.getSource()==laminaBarraMenu.sansSerif){
            fuente=ConfigurarFuente("Rockwell");
            mPanel.setFuente(fuente);
            mPanel.repaint();
        }

        if(e.getSource()==laminaBarraMenu.negrita){
            DeterminarNegritaCursiva();

        }
        if(e.getSource()==laminaBarraMenu.cursiva){
            DeterminarNegritaCursiva();

        }


    }

    private void DeterminarNegritaCursiva() {
        int codigo=0;
        String textFuente="";
        if(laminaBarraMenu.negrita.isSelected()) codigo++;
        if(laminaBarraMenu.cursiva.isSelected()) codigo+=2;
        if(laminaBarraMenu.serif.isSelected()) textFuente="Serif";
        if(laminaBarraMenu.monoSpaced.isSelected()) textFuente="MonoSpaced";
        if(laminaBarraMenu.sansSerif.isSelected()) textFuente="Rockwell";
        fuente=ConfigurarFuente2(textFuente,codigo);

        mPanel.setFuente(fuente);
        mPanel.repaint();
    }

    private Font ConfigurarFuente2(String textFuente, int codigo) {
        Font f=new Font(textFuente,codigo,60);
        return f;

    }

    private Font ConfigurarFuente(String fuente) {
        Font f=new Font("Arial",Font.PLAIN,60);
        if(laminaBarraMenu.negrita.isSelected() && laminaBarraMenu.cursiva.isSelected()){
            f=new Font(fuente,3,60);

        }
        if(laminaBarraMenu.negrita.isSelected() && !laminaBarraMenu.cursiva.isSelected()){
            f=new Font(fuente,Font.BOLD,60);

        }
        if(!laminaBarraMenu.negrita.isSelected() && laminaBarraMenu.cursiva.isSelected()){
            f=new Font(fuente,Font.ITALIC,60);

        }
        if(!laminaBarraMenu.negrita.isSelected() && !laminaBarraMenu.cursiva.isSelected()){
            f=new Font(fuente,Font.PLAIN,60);

        }
        return f;
    }
}
