import java.util.Scanner;

import javax.swing.JFrame;

public class Programa {

    public static void main(String[] args) {

        //Instanciamos la clase ClaseSuma con los valores que se requieren
        ClaseSuma objetoSuma = new ClaseSuma();

   
        //Imprimimos el resultado de la suma
        //System.out.println("El resultado de la suma es: " + objetoSuma.sumar(numero1, numero2));


         ClaseHijo hijo = new ClaseHijo();

        System.out.println("El resulado de la multiplicacion es: "+hijo.multiplicar(3, 3));
   
        System.out.println("el resultado de la potencia es: "+hijo.potencia(2, 5));




    }     

    
}
