package practica4Profesora.FuncionalidadInterfazConManejador;

import java.awt.event.*;

public class Manejador implements ActionListener, ItemListener {
    interfaz_tabla_multiplicar interfaz;
    // Crear constructor

    Manejador() {
        this.interfaz = new interfaz_tabla_multiplicar();
    }

    Manejador(interfaz_tabla_multiplicar mInterfaz_tabla_multiplicar) {
        this.interfaz = mInterfaz_tabla_multiplicar;

    }

    public void actionPerformed(ActionEvent e) {
        // matematica n1,n2;
        matematica2 n1, n2, resultado;
        try {
            // Resolución utilizando la clase matematica
            // n1=new matematica(Integer.valueOf(interfaz.numero1.getText()));
            // n2=new matematica(Integer.valueOf(interfaz.numero2.getText()));
            // interfaz.resultado.setText(String.valueOf(n2.suma(n1.getNumero())));

            // Resolución utilizando la clase matematica2
            n1 = new matematica2(Integer.valueOf(interfaz.numero1.getText()));
            n2 = new matematica2(Integer.valueOf(interfaz.numero2.getText()));
            resultado = new matematica2();
            resultado.suma(n1, n2);
            interfaz.resultado.setText(String.valueOf(resultado.getNumero()));

        } catch (Exception ex) {
            // TODO: handle exception
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // Resolución utilizando la clase matematica
        // matematica n3=new matematica(Integer.parseInt(e.getItem().toString()));
        matematica2 n3 = new matematica2(Integer.parseInt(e.getItem().toString()));
        matematica2 num = new matematica2();
        matematica2 resultado = new matematica2();

        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            // Resolución utilizando la clase matematica
            // interfaz.BotonsNumero2[i].setText(Integer.toString((n3.multiplicar(i) )));
            num.setNumero(i);
            resultado.multiplicar(num, n3);
            interfaz.BotonsNumero2[i].setText(Integer.toString((resultado.getNumero())));
        }

        // Poner el foco en el cuadro de texto resultado
        interfaz.numero1.requestFocus();
    }

}
