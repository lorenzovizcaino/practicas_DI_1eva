package practicaBarraMenu;

import javax.swing.*;
import java.awt.*;

public class LaminaBarraMenu extends JPanel {

    private JMenuBar barra;
    private JMenu archivo,formato;
    private JMenuItem acercaDe, salir, color,tipoLetra;
    JRadioButtonMenuItem negro, azul, rojo, verde, serif, monoSpaced,sansSeriff;
    ButtonGroup colores, fuentes;

    public LaminaBarraMenu(){
        setLayout(new BorderLayout());
        barra=new JMenuBar();
        archivo=new JMenu("Archivo");
        formato=new JMenu("Formato");

        acercaDe=new JMenuItem("Acerca de...");
        salir=new JMenuItem("Salir");
        color=new JMenuItem("Color");

        tipoLetra=new JMenuItem("Tipo de Letra");


        negro=new JRadioButtonMenuItem("Negro");
        azul=new JRadioButtonMenuItem("Azul");
        rojo=new JRadioButtonMenuItem("Rojo");
        verde=new JRadioButtonMenuItem("Verde");
        colores=new ButtonGroup();
        colores.add(negro);
        colores.add(azul);
        colores.add(rojo);
        colores.add(verde);
        color.add(negro);
        color.add(azul);
        color.add(rojo);
        color.add(verde);


        archivo.add(acercaDe);
        archivo.add(salir);
        formato.add(color);
        formato.add(tipoLetra);
        barra.add(archivo);
        barra.add(formato);



        add(barra,BorderLayout.PAGE_START);


    }


}
