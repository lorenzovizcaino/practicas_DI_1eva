package BK_Hoteles;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class LaminaPrincipalBKHoteles extends JPanel {
    private JLabel logo;
    private JButton reservar;
    private File file=new File("imagenes"+ File.separator+"logo.png");

    private ImageIcon image;
    GBCConstrains gbc=new GBCConstrains();

    public LaminaPrincipalBKHoteles(){
        setLayout(new GridBagLayout());
        try {
            image=new ImageIcon(ImageIO.read(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logo=new JLabel(image);
        reservar=new JButton("Reservar Salon");
        add(logo,gbc.Constrains(0,0,1,1,1.0,0.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(reservar,gbc.Constrains(0,1,1,1,1.0,0.0,GridBagConstraints.NONE,GridBagConstraints.CENTER,new Insets(5,5,5,5)));

        reservar.addActionListener(e -> {
            new VentanaSecundariaPrincipal();
        });

    }


}
