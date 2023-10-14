public class Operaciones{

    //Generamos las PROPIEDADES
    public int num1;
    public int num2;
    public int resultado;

    //Generamos nuestro CONSTRUCTOR
    public Operaciones(int valor1, int valor2){

       num1 = valor1;
       num2 = valor2;

    }

    //Creamos los metodos (o acciones)
    public int Suma(){

     return resultado =  num1+num2;

    }

    public int Resta(){

        return resultado = num1-num2;
    }

    public int Multi(){

        return resultado = num1*num2;

    }

    public int Divi(){

        return resultado = num1/num2;

    }




}