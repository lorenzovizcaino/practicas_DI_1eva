package practicaExamen;

public class Usuario {
    String cadena;

    public Usuario(String cadena) {
        this.cadena = cadena;
    }
    public Usuario() {
        this.cadena = "";
    }


    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    public boolean comprobarCadena(){
        int longitud=cadena.length();

        if (longitud>7 && longitud<13) return true;
        else return false;
    }
}
