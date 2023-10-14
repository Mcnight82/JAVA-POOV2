
import java.util.Scanner;

public class Principal{


    public static void main(String[] args) {

        Scanner numeros1 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = numeros1.nextInt();

        Scanner numeros2 = new Scanner(System.in);
        System.out.println("ingrese el segundo numero: ");
        int num2 = numeros2.nextInt();

        
        Operaciones operar = new Operaciones(num1,num2);

        System.out.println("El resultado de la suma es :"+operar.suma());
        System.out.println("El resultado de la resta es :"+operar.resta());
        System.out.println("El resultado de la multiplicacion es :"+operar.multiplicacion());
        System.out.println("El resultado de la division es :"+operar.division());
        System.out.println("El resultado de la potencia es :"+operar.potencia1());
        System.out.println("El resultado de la potencia es :"+operar.potencia2());

       

    }



}