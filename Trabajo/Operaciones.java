public class Operaciones {

    //Declaramos las propiedades de la Clase
    public int numero1;
    public int numero2;

    //Declaramos el constructor de la Clase
    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Declaramos el metodo suma
    public int suma(){

        return numero1+numero2;


    }

    public int resta(){

        return numero1-numero2;
    
    }

    public int division(){

        return numero1/numero2;
    
    }


    public int multiplicacion(){

        return numero1*numero2;
    
    }

    public int potencia1(){

        Double pot1 = Math.pow(numero1,2);

        int pot1A = pot1.intValue();
        
        return pot1A ;

    }

    public int potencia2(){

        Double pot2 = Math.pow(numero2,2);

        int pot2A = pot2.intValue();
       
        return pot2A;
    
    }

   

    
}
