import java.util.Scanner;

public class Input{

    public static void main (String []args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo: ");

        String nombre = scan.nextLine();

        System.out.println("Su nombre es: "+nombre);

        System.out.println("Ingrese el primer numero: ");

        int num1 = scan.nextInt();

        System.out.println("Ingrese numero 2: ");
        
        int num2 = scan.nextInt();

        int resultado = num1+num2;

        System.out.println("El resultado de la suma es: "+resultado);

    }



}