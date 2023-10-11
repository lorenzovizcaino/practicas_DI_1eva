package practica4Profesora.FuncionalidadInterfazConManejador;

public class matematica2 {
   
    private int numero;
    public matematica2(){
        
    }
    public matematica2(int numero){
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

public void suma (matematica2 num1, matematica2 num2){
    this.numero=num1.numero+num2.numero;
}


public void multiplicar (matematica2 num1, matematica2 num2){
    this.numero= num1.numero*num2.numero;
}

public void dividir (matematica2 num1, matematica2 num2){
    try
    {
       this.numero=num1.numero/num2.numero;
    } catch (Exception e) {
        System.out.println(e.getMessage());
        // TODO: handle exception
    }
    
}



}
