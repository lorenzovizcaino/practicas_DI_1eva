package pruebas;

import javax.swing.*;

public class pruebas4 {

    public static void main(String[] args) {
        // Crear un nuevo marco (frame)
        JFrame frame = new JFrame("Ejemplo de Menú");

        // Crear una barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Crear un menú
        JMenu menu = new JMenu("Archivo");

        // Crear un elemento de menú
        JMenuItem item1 = new JMenuItem("Abrir");

        // Crear otro elemento de menú
        JMenuItem item2 = new JMenuItem("Guardar");

        // Crear un submenú
        JMenu submenu = new JMenu("Otros");

        // Agregar elementos al submenú
        JMenuItem subItem1 = new JMenuItem("Opción 1");
        JMenuItem subItem2 = new JMenuItem("Opción 2");

        submenu.add(subItem1);
        submenu.add(subItem2);

        // Agregar elementos al menú
        menu.add(item1);
        menu.add(item2);
        menu.add(submenu); // Agregar el submenú al menú principal

        // Agregar el menú a la barra de menú
        menuBar.add(menu);

        // Establecer la barra de menú en el marco
        frame.setJMenuBar(menuBar);

        // Establecer el tamaño y la operación de cierre del marco
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
