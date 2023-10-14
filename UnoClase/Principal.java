import java.util.Scanner;

public class Principal {

    public static void main (String []args){

         int numero1;
         int numero2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        numero1 = scan.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        numero2 = scan.nextInt();


        Operaciones tutun = new Operaciones(numero1, numero2);

        System.out.println("El resultado de la suma es: "+tutun.Suma());



    }
    
}
