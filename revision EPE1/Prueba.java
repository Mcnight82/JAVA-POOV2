public class Prueba{

    public static void main (String [] args){

        System.out.println("Hola Profesor soy Guillermo manzoliz Arias, alumno de NADA");



        /******ITEM II *******/

        char letra = 'M';
        String cadena1 = "Indique su Género";
        String cadena2 = "Escoja un tipo de Jeans";

        System.out.println("Bienvenido "+cadena2+ " y su talla deberia ser:  " +letra+ "  e  "+cadena1);

        /******ITEM III *******/
        double num1 = 18.7;
        long num2 = 232475621447562L;
        double resul1 = num2/num1;

        System.out.println(resul1);

        int num3 = 5000;
        double resul2 = (num1+num2)*(num3/num1);
        System.out.println(resul2);

        long resul3 = (long) Math.pow(resul2, num1);

        System.out.println(resul3);

        boolean verdadero = true;
        boolean falso = false;

        System.out.println("el verdaero es: "+!verdadero);
        System.out.println("el falso es: "+!falso);

        int edad = 67;

        if (edad > 18 && edad < 65){

            System.out.println("Usted esta en edad de imponer para su ....");


        }else if(edad < 18){

            System.out.println("Usted es menor de edad, no puedes imponer por el ...");

        }else{

            System.out.println("Felicidades por entrar en sus años dorados");

        }


        String metodoPago1 = "Debito";
        String metodoPago2 = "Credito";


        if(metodoPago1=="Debito"){

            System.out.println("Metodo de pago aceptado en el comercio");

        }else if(metodoPago2=="Credito"){

            System.out.println("Metodo de pago aceptado en el comercio con 3,6,9 cuotas");
        }

        String wallet = "BANCO_CHILE";

        switch(wallet){

            case "BANCOESTADO":
                System.out.println("Tarjeta NO válida para este banco");
                break;
            
            case "BANCO_CHILE":
                System.out.println("Esta tarjeta es buena pero no es de su banco");
                break;
            
            case "BANCO_BCI":
                System.out.println("Tenmos MACH y BCI+ pero NO somos ITAU");
                break;
            
            case "BANCO_SANTANDER":
                System.out.println("Somos un buen banco pero cobramos harto");
                break;
            
            default:
                System.out.println("Somos el banco ITAU que paga la mejor tasa en deposito a plazo");
                break;



        }

        int edad2 = 0;

        while(edad2 <= 18){

            System.out.println("Su edad es: "+edad2);
            edad2++;

        }

        int credito = 50000;
        int couta = 2000;

        do{
            System.out.println("Su couta por vencer es: "+credito);
            credito -= couta;

        }while(credito >= 0);

        for(int a=1; a<=30; a++){

            System.out.println("Me gustan las clases de JAVA y me fue excelentemente bien "+a);

        }






    }





}