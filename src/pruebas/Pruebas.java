package pruebas;

public class Pruebas {
    public static void main(String[] args) {
        double distancia = 3.14159; // El número que deseas redondear

        // Redondear a dos decimales
        double distaciaRedondeada = Math.round(distancia * 100.0) / 100.0;

        System.out.println("Número original: " + distancia);
        System.out.println("Número redondeado a dos decimales: " + distaciaRedondeada);
    }
}
