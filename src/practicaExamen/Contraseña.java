package practicaExamen;

public class Contraseña {
    private String cadenapass;

    public Contraseña(String cadenapass) {
        this.cadenapass = cadenapass;
    }
    public Contraseña() {
        this.cadenapass = "";
    }

    public String getCadenapass() {
        return cadenapass;
    }

    public void setCadenapass(String cadenapass) {
        this.cadenapass = cadenapass;
    }
    public boolean comprobarEspacios(){
        int longitud=cadenapass.length();
        int contador=0;
        for(int i=0;i<longitud;i++){
            if(cadenapass.charAt(i)==' '){
                contador++;
            }
        }
        if (contador==longitud)return false;
        else return true;

    }
}
