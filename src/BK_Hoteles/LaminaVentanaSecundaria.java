package BK_Hoteles;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

public class LaminaVentanaSecundaria extends JPanel {

    private JPanel panel1,panel2,panel3,panel4;
    private JLabel jLNombre,jLTelefono, jLTipoEvento, jLFechaEvento, jLTipoCocina, jLPersonas,jLJornadas,jLHabitaciones,jLComensales,jLTipoMesa;
    private JTextField jTNombre, jTTelefono;
    private JRadioButton bBanquete, bCongreso, bJornada, bSi,bNo,bRectangular, bRedonda;
    private JSpinner sFechaEvento,sPersonas, sJornadas,sComensales;
    private JComboBox combo;
    private JButton reservar;
    private ButtonGroup bGEvento,bGHabitaciones,bGMesas;
    private GBCConstrains gbc=new GBCConstrains();




    public LaminaVentanaSecundaria(){
        setLayout(new GridBagLayout());
        panel1=new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setBorder(BorderFactory.createTitledBorder(null,"Datos Personales", TitledBorder.LEFT,TitledBorder.TOP,new Font("Arial",Font.BOLD,16)));
        jLNombre=new JLabel("Nombre:");
        jLTelefono=new JLabel("Telefono:");
        jTNombre=new JTextField(10);
        jTTelefono=new JTextField(10);
        panel1.add(jLNombre,gbc.Constrains(0,0,1,1,0.0,0.0,GridBagConstraints.NONE,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        panel1.add(jTNombre,gbc.Constrains(1,0,3,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        panel1.add(jLTelefono,gbc.Constrains(0,1,1,1,0.0,0.0,GridBagConstraints.NONE,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        panel1.add(jTTelefono,gbc.Constrains(1,1,3,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));

        panel2=new JPanel();
        panel2.setLayout(new GridBagLayout());

        panel2.setBorder(BorderFactory.createTitledBorder(null,"Datos Reserva",TitledBorder.LEFT,TitledBorder.TOP,new Font("Arial",Font.BOLD,16)));
        jLTipoEvento=new JLabel("Tipo de evento:");
        bBanquete=new JRadioButton("Banquete");

        bCongreso=new JRadioButton("Congreso");
        bJornada=new JRadioButton("Jornada");
        bJornada.setSelected(true);
        bGEvento=new ButtonGroup();
        bGEvento.add(bBanquete);
        bGEvento.add(bCongreso);
        bGEvento.add(bJornada);
        jLFechaEvento=new JLabel("Fecha del evento:");
        Date initDate = new Date();
        SpinnerDateModel model = new SpinnerDateModel(initDate, null, null, Calendar.HOUR_OF_DAY);
        sFechaEvento=new JSpinner(model);
        jLTipoCocina=new JLabel("Tipo de cocina:");
        combo=new JComboBox<>();
        combo.addItem("Buffet");
        combo.addItem("Carta");
        combo.addItem("Pedir cita Cheff");
        combo.addItem("No precisa");
        jLPersonas=new JLabel("Nº Personas:");
        sPersonas=new JSpinner(new SpinnerNumberModel(1,1,10,1));
        panel2.add(jLTipoEvento,gbc.Constrains(0,0,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,25,5,5)));
        panel2.add(bBanquete,gbc.Constrains(1,0,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,25,5,5)));
        panel2.add(bCongreso,gbc.Constrains(2,0,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,25,5,5)));
        panel2.add(bJornada,gbc.Constrains(3,0,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,45,5,5)));
        panel2.add(jLFechaEvento,gbc.Constrains(0,1,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,35,5,5)));
        panel2.add(sFechaEvento,gbc.Constrains(1,1,3,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,45)));
        panel2.add(jLTipoCocina,gbc.Constrains(0,2,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,35,5,5)));
        panel2.add(combo,gbc.Constrains(1,2,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        panel2.add(jLPersonas,gbc.Constrains(2,2,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        panel2.add(sPersonas,gbc.Constrains(3,2,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,45)));

        panel3=new JPanel();
        panel3.setBorder(BorderFactory.createTitledBorder(""));
        panel3.setLayout(new GridBagLayout());
        jLJornadas=new JLabel("Nº Jornadas:");
        sJornadas=new JSpinner(new SpinnerNumberModel(1,1,30,1));

        jLHabitaciones=new JLabel("Requiere habitaciones:");
        bSi=new JRadioButton("Si");
        bSi.setSelected(true);
        bNo=new JRadioButton("No");
        bGHabitaciones=new ButtonGroup();
        bGHabitaciones.add(bSi);
        bGHabitaciones.add(bNo);
        panel3.add(jLJornadas,gbc.Constrains(0,1,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,35,5,5)));
        panel3.add(sJornadas,gbc.Constrains(1,1,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        panel3.add(jLHabitaciones,gbc.Constrains(2,1,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        panel3.add(bSi,gbc.Constrains(3,0,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,0,75)));
        panel3.add(bNo,gbc.Constrains(3,2,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(0,5,5,75)));

        panel4=new JPanel();
        panel4.setBorder(BorderFactory.createTitledBorder(""));
        panel4.setLayout(new GridBagLayout());
        jLComensales=new JLabel("Comensales/mesa:");
        sComensales=new JSpinner(new SpinnerNumberModel(1,1,30,1));

        jLTipoMesa=new JLabel("Tipo de mesa:");
        bRectangular=new JRadioButton("Rectangular");
        bRectangular.setSelected(true);
        bRedonda=new JRadioButton("Redonda");
        bGMesas=new ButtonGroup();
        bGMesas.add(bRectangular);
        bGMesas.add(bRedonda);
        panel4.add(jLComensales,gbc.Constrains(0,1,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,35,5,5)));
        panel4.add(sComensales,gbc.Constrains(1,1,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        panel4.add(jLTipoMesa,gbc.Constrains(2,1,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        panel4.add(bRectangular,gbc.Constrains(3,0,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,0,75)));
        panel4.add(bRedonda,gbc.Constrains(3,2,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(0,5,5,75)));



        reservar=new JButton("Reservar");


        add(panel1,gbc.Constrains(0,0,4,2,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(panel2,gbc.Constrains(0,2,4,3,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(panel3,gbc.Constrains(0,5,4,3,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(panel4,gbc.Constrains(0,5,4,3,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(reservar,gbc.Constrains(0,8,4,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        panel3.setVisible(false);
        panel4.setVisible(false);

        bBanquete.addActionListener(e->{
            if(bBanquete.isSelected()) {
                panel4.setVisible(true);
                panel3.setVisible(false);

            }
        });

        bCongreso.addActionListener(e->{
            if(bCongreso.isSelected()) {
                panel3.setVisible(true);
                panel4.setVisible(false);
            }
        });

        bJornada.addActionListener(e->{
            if(bJornada.isSelected()) {
                panel3.setVisible(false);
                panel4.setVisible(false);
            }
        });


        reservar.addActionListener(e->{
            if(jTNombre.getText().equalsIgnoreCase("")||jTTelefono.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(this,"Los campos nombre y telefono no pueden estar vacios","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this,"Datos guardados correctamente","Info",JOptionPane.INFORMATION_MESSAGE);
            }
        });

    }
}
