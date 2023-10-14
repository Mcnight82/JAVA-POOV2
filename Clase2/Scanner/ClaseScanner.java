package Scanner;
import java.util.Scanner;

public class ClaseScanner {

    public static void main2(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Usted esta a gusto en la clase POO: ");

        boolean resp = scan.nextBoolean();

        System.out.println("Su respuesta fue: "+resp);

        scan.close();

    }
    
}
