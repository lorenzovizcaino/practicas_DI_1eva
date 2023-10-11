package practica4Profesora.FuncionalidadInterfazSinManejador;

public class matematica {
    private int numero;
    public matematica(){
        
    }
    public matematica(int numero){
        this.numero=numero;
    }

    //Métodos set y getter
    public void setNumero(int numero){
        this.numero=numero;
    }
    public int getNumero(){
        return this.numero;
    }
    
//Métodos operaciones aritméticas

public int suma (int numero){
    return this.numero+numero;
}

public int multiplicar (int numero){
    return this.numero*numero;
}
public int dividir (int numero){
    try
    {
       return this.numero/numero;
    } catch (Exception e) {
        System.out.println(e.getMessage());
        // TODO: handle exception
    }
    return this.numero/numero;
}

}
