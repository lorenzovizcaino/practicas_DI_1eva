package practica4Profesora.FuncionalidadInterfazConManejador;

import java.awt.*;
import javax.swing.*;

// Clase constructora interfaz que hereda de un JFrame
public class interfaz_tabla_multiplicar extends JFrame  {

     //Declaración elementos que forman la ventana

     Boton[] BotonsNumero1;
     Boton[] BotonsNumero2;
     Boton[] BotonsOperacion;

     JLabel num1;
     JLabel num2;
     JLabel resul;

     JTextField numero1;
     JTextField numero2;
     JTextField resultado;
     Boton calc;

     JLabel etiqueta;

     JComboBox<String> listanumeros;

     Panel np;
     Panel cp;
     Panel sp;

     //Constructor de la ventana 
   
     interfaz_tabla_multiplicar() {

          BotonsNumero1 = new Boton[10];
          BotonsNumero2 = new Boton[10];
          BotonsOperacion = new Boton[10];

          num1 = new JLabel();
          num2 = new JLabel();
          resul = new JLabel();

          numero1 = new JTextField();
          numero2 = new JTextField();
          resultado = new JTextField();
          calc = new Boton("SUMAR");

          etiqueta = new JLabel();

          listanumeros = new JComboBox<String>();

          //Declaración de los objetos de tipo panel, uno para el norte, otro para el centro y el último para el sur
          np = new Panel();
          cp = new Panel();
          sp = new Panel();

          // Asignar el layout adecuado a cada panel
          np.setLayout(new GridLayout(2, 1));
          cp.setLayout(new GridBagLayout());
          sp.setLayout(new GridBagLayout());

          initComponents();// Metodo en el que construimos la tabla de multiplicar

          // Añadir los paneles a la ventana en la zona indicada
          this.add(cp, BorderLayout.CENTER);
          this.add(np, BorderLayout.NORTH);
          this.add(sp, BorderLayout.SOUTH);

          // Poner a la escucha el botón calcular y la lista de números
          
          calc.addActionListener(new Manejador(this));
          listanumeros.addItemListener(new Manejador(this));

          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setSize(350, 600);

     } 

     //Método static en el que se asignan las propiedades de GridBagConstraints para cada uno de los componentes
     //de la interfaz

     private static GridBagConstraints createConstraints(int gridx, int gridy, int gridwidth, int gridheight,
               double weightx,
               double weighty, int fill, int anchor, Insets insets) {
          GridBagConstraints constraints = new GridBagConstraints();
          constraints.gridx = gridx;
          constraints.gridy = gridy;
          constraints.gridwidth = gridwidth;
          constraints.gridheight = gridheight;
          constraints.weightx = weightx;
          constraints.weighty = weighty;
          constraints.fill = fill;
          constraints.anchor = anchor;
          constraints.insets = insets;
          return constraints;
     }

     private void initComponents() {

          // Botones de númmeros, utilizamos tres arrays de botones, uno para números, otro para igual y el último para el resultado
          for (int i = 0; i < BotonsNumero1.length; i++) {
               BotonsNumero1[i] = new Boton(String.valueOf(i));
               BotonsNumero1[i].setEnabled(false);

               BotonsOperacion[i] = new Boton("=");
               BotonsOperacion[i].setEnabled(false);
               BotonsNumero2[i] = new Boton();
               BotonsNumero2[i].setEnabled(false);
          }

          for (int j = 0; j < BotonsNumero1.length; j++) {

               cp.add(BotonsNumero1[j], createConstraints(0, j, 1, 1, 1.0, 1.0,
                         GridBagConstraints.BOTH, GridBagConstraints.CENTER, new Insets(4, 10, 10, 4)));
               cp.add(BotonsOperacion[j], createConstraints(1, j, 1, 1, 1.0, 1.0,
                         GridBagConstraints.BOTH, GridBagConstraints.CENTER, new Insets(4, 10, 10, 4)));
               cp.add(BotonsNumero2[j], createConstraints(2, j, 1, 1, 1.0, 1.0,
                         GridBagConstraints.BOTH, GridBagConstraints.CENTER, new Insets(4, 10, 10, 4)));
          }
          // Construir el panel del norte. Podríamos crear un objeto de tipo panel norte
          etiqueta.setFont(new Font("Arial", Font.BOLD, 28));

          etiqueta.setText("Tabla de Multiplicar");
          // Alinear la etiqueta en el centro de la ventana
          etiqueta.setHorizontalAlignment(SwingConstants.CENTER);

          np.add(etiqueta);
          np.add(listanumeros);

          for (int i = 0; i < 10; i++) {
               listanumeros.addItem(String.valueOf(i));
          }

          num1.setFont(new Font("Arial", Font.BOLD, 14));
          num2.setFont(new Font("Arial", Font.BOLD, 14));
          resul.setFont(new Font("Arial", Font.BOLD, 14));

          num1.setText("Numero1:");
          num2.setText("Numero2:");
          resul.setText("Resultado");
          num1.setAlignmentX(JLabel.CENTER);
          num2.setAlignmentX(JLabel.CENTER);
          resul.setAlignmentX(JLabel.CENTER);

          //Desactivar el cuadro de texto resultado
          resultado.setEditable(false);

          sp.add(num1, createConstraints(0, 0, 1, 1, 0.0, 1.0,
                    GridBagConstraints.BOTH, GridBagConstraints.CENTER, new Insets(0, 10, 10, 4)));
          sp.add(numero1, createConstraints(1, 0, 1, 1, 1.0, 1.0,
                    GridBagConstraints.BOTH, GridBagConstraints.CENTER, new Insets(4, 10, 10, 4)));
          sp.add(num2, createConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.BOTH, GridBagConstraints.CENTER, new Insets(0, 10, 10, 4)));
          sp.add(numero2, createConstraints(1, 1, 1, 1, 1.0, 1.0,
                    GridBagConstraints.BOTH, GridBagConstraints.CENTER, new Insets(4, 10, 10, 4)));
          sp.add(calc, createConstraints(3, 0, 2, 3, 1.0, 1.0,
                    GridBagConstraints.BOTH, GridBagConstraints.CENTER, new Insets(4, 10, 10, 4)));

          sp.add(resul, createConstraints(0, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.BOTH, GridBagConstraints.CENTER, new Insets(0, 10, 10, 4)));
          sp.add(resultado, createConstraints(1, 2, 1, 1, 1.0, 1.0,
                    GridBagConstraints.BOTH, GridBagConstraints.CENTER, new Insets(4, 10, 10, 4)));

     }

    
}
