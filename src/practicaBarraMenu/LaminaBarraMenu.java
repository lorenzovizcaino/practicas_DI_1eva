package practicaBarraMenu;

import practica7.Manejador;
import practicaExamen.MiPanel;

import javax.swing.*;
import java.awt.*;

public class LaminaBarraMenu extends JPanel {

    private JMenuBar barra;
    private JMenu archivo,formato;
    private JMenuItem acercaDe, salir, color,tipoLetra;
    JRadioButtonMenuItem negro, azul, rojo, verde, serif, monoSpaced,sansSerif;
    JCheckBoxMenuItem negrita,cursiva;
    JSeparator separador;
    ButtonGroup colores, fuentes;
    MPanel miPanel;
    Color colorFondo;
    Font fuente;



    public LaminaBarraMenu(){
        setLayout(new BorderLayout());
        barra = new JMenuBar();

        // Crear un menú
        archivo = new JMenu("Archivo");
        formato = new JMenu("Formato");

        // Crear un elemento de menú
        acercaDe = new JMenuItem("Acerca De");

        // Crear otro elemento de menú
        salir = new JMenuItem("Salir");

        // Crear un submenú
        color = new JMenu("Color");
        tipoLetra = new JMenu("Tipo de letra");

        // Agregar elementos al submenú
        negro = new JRadioButtonMenuItem("Negro");
        azul = new JRadioButtonMenuItem("Azul");
        rojo = new JRadioButtonMenuItem("Rojo");
        verde = new JRadioButtonMenuItem("Verde");
        colores=new ButtonGroup();
        colores.add(negro);
        colores.add(azul);
        colores.add(rojo);
        colores.add(verde);

        serif=new JRadioButtonMenuItem("Serif");
        monoSpaced=new JRadioButtonMenuItem("MonoSpaced");
        sansSerif=new JRadioButtonMenuItem("Sans Serif");
        fuentes=new ButtonGroup();
        fuentes.add(serif);
        fuentes.add(monoSpaced);
        fuentes.add(sansSerif);

        separador=new JSeparator();

        negrita=new JCheckBoxMenuItem("Negrita");
        cursiva=new JCheckBoxMenuItem("Cursiva");


        color.add(negro);
        color.add(azul);
        color.add(rojo);
        color.add(verde);

        tipoLetra.add(serif);
        tipoLetra.add(monoSpaced);
        tipoLetra.add(sansSerif);
        tipoLetra.add(separador);
        tipoLetra.add(negrita);
        tipoLetra.add(cursiva);

        // Agregar elementos al menú
        archivo.add(acercaDe);
        archivo.add(salir);
        formato.add(color);
        formato.add(tipoLetra);

        // Agregar el menú a la barra de menú
        barra.add(archivo);
        barra.add(formato);
        add(barra,BorderLayout.PAGE_START);

        miPanel=new MPanel();
        add(miPanel,BorderLayout.CENTER);

        ManejadorBarraMenu manejadorBarraMenu=new ManejadorBarraMenu(this, miPanel);

        negro.addActionListener(manejadorBarraMenu);
        azul.addActionListener(manejadorBarraMenu);
        rojo.addActionListener(manejadorBarraMenu);
        verde.addActionListener(manejadorBarraMenu);
        serif.addActionListener(manejadorBarraMenu);
        monoSpaced.addActionListener(manejadorBarraMenu);
        sansSerif.addActionListener(manejadorBarraMenu);
        negrita.addActionListener(manejadorBarraMenu);
        cursiva.addActionListener(manejadorBarraMenu);








    }


}
