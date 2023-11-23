package practicaExamen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LaminaPracticaExamen extends JPanel {





    private JLabel usuario, contraseña;
    private JTextField tFusuario, tFcontraseña;
    private JButton aceptar, cancelar;
    private Usuario user=new Usuario();
    private Contraseña pass=new Contraseña();
    private boolean booluser=false;
    private boolean boolpass=false;
    private String textoPass="";
    private String asteriscoPass="";
    private GBCConstrains gbc=new GBCConstrains();
    private MiPanel miPanel;
    private  JButton enviar;

    public LaminaPracticaExamen(){


        setBorder(BorderFactory.createTitledBorder("Login"));
        setLayout(new GridBagLayout());
        usuario=new JLabel("Usuario");
        contraseña=new JLabel("Contraseña");
        tFusuario=new JTextField(7);
        tFcontraseña=new JTextField(7);
        aceptar=new JButton("Aceptar");
        cancelar=new JButton("Cancelar");
        miPanel=new MiPanel();
        miPanel.setBorder(BorderFactory.createTitledBorder("Graphics"));
        enviar=new JButton("Enviar");
        add(usuario,gbc.Constrains(0,0,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(45,5,1,5)));
        add(tFusuario,gbc.Constrains(1,0,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(45,5,1,5)));
        add(contraseña,gbc.Constrains(0,1,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(tFcontraseña,gbc.Constrains(1,1,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(aceptar,gbc.Constrains(0,2,1,1,1.0,1.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(15,5,0,5)));
        add(cancelar,gbc.Constrains(1,2,1,1,1.0,1.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(15,5,0,5)));
        add(miPanel,gbc.Constrains(2,0,1,2,1.0,1.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(5,5,0,5)));
        add(enviar,gbc.Constrains(2,2,1,1,1.0,1.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(15,5,0,5)));




        tFusuario.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                user.setCadena(tFusuario.getText());
                if(user.comprobarCadena()) booluser=true;
                else {
                    JOptionPane.showMessageDialog(tFusuario,"El usuario debe de tener entre 8 y 12 carateres","Error Usuario",JOptionPane.ERROR_MESSAGE);
                    booluser=false;
                }

            }
        });

        tFcontraseña.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                pass.setCadenapass(textoPass);
                if(pass.comprobarEspacios()) boolpass=true;
                else {
                    JOptionPane.showMessageDialog(tFcontraseña,"La contraseña no puede estar en blanco","Error Password",JOptionPane.ERROR_MESSAGE);
                    boolpass=false;
                }

            }
        });

        aceptar.addActionListener(e -> {
            if(booluser && boolpass) JOptionPane.showMessageDialog(tFcontraseña,"Usuario: "+tFusuario.getText()+" con la contraseña: "+textoPass,"Usuario",JOptionPane.INFORMATION_MESSAGE);
        });
        cancelar.addActionListener(e -> {
            System.exit(0);
        });
        tFcontraseña.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                e.consume();
                textoPass+=e.getKeyChar();
                asteriscoPass+="*";
                tFcontraseña.setText(asteriscoPass);
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


        enviar.addActionListener(e -> {
            miPanel.setUsuario(tFusuario.getText());
            miPanel.repaint();
        });
    }
}
