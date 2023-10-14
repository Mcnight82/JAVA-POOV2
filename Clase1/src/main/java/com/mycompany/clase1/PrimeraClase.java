

package com.mycompany.clase1;


/**
 *
 * @author guillermomanzoliz
 */



public class PrimeraClase {
    
           /*  String texto1 = "este texto es de ejemplo mayúsculas y minúsculas";

        String Mayus = texto1.toUpperCase();

        String Minus = texto1.toLowerCase();


        System.out.println(texto1);

        System.out.println(Mayus);

        System.out.println(Minus);*/

                /*String textOriginal = "        este seria el texto a reemplazar         ";

        //Se eliminan los espacios en el texto de salida
        String sinEspacios = textOriginal.trim();

        System.out.println(textOriginal);

        System.out.println(sinEspacios +" " +"como ven, sin espacios en blanco");

        //el mértodo replace en este caso busca el objetivo y lo cambia por el reemplazo
        String textoReemplazo = textOriginal.replace("reemplazar", "reemplazado");

        System.out.println(textOriginal);

        System.out.println(textoReemplazo);*/

        /*  String texto = "1554";

        System.out.println(texto);

        //en este ejemplo, si usamos "int" estamos invocando el "primitivo" y eb base a eso se convierte a numero 
        //primitivo
        int textoConvertido = Integer.parseInt(texto);

        System.out.println("El numero primitivo es: "+textoConvertido);

        //en este otro ejemplo, es posible convertir al "objeto" numero para usar mas propiedades de éste
        //de la siguiente forma

        Integer textoConverObjeto = Integer.valueOf(texto);

        System.out.println("El numero Objeto es:  "+textoConverObjeto);  */  

           /*   Integer num1 = 130;
        Integer num2 = 55;

        System.out.println("el primer numero es: "+num1);

        System.out.println("el segundo numero es:  "+num2);

        int compara = num1.compareTo(num2);

        //si la salida es -1 indica que no son iguales y el PRIMER numero es diferente
        //si la salida es 0 indica que ambos numeros son iguales
        //si la salida es 1 inidca que que no son iguales y el SEGUNDO numero es diferente
        System.out.println("Son iguales los dos numeros? : "+compara);*/

          /*   int numeroPrimitivo = 14553;

        String numeroTexto = Integer.toString(numeroPrimitivo);

        System.out.println("el numero en cadena es: "+numeroTexto);*/

              /*   float numeroaInteger = 5586.55f;

        //la conversion se realiza pero SACRIFICA la parte decimal 
        //dejando solamente la parte entera
        Integer num = (int) numeroaInteger;

        System.out.println("el numero ORIGINAL es:  "+numeroaInteger);

        System.out.println("el numero convertido a integer es:  "+num);

        double doubleaInteger = 224.231;

        //la conversion nuevamente se realiza pero SACRIFICA la 
        //parte decimal dejando solamente la parte entera
        Integer num1 = (int) doubleaInteger;

        System.out.println("el numero ORIGINAL es: "+doubleaInteger);

        System.out.println("el numero convertido a integer es:   "+num1);*/

             /*    boolean clasesHoy = false;

        boolean noClaseshoy = true;


        if(clasesHoy){

            System.out.println("hoy tenemos clases de POO");

        }else if (noClaseshoy){

            System.out.println("Hoy no nos toca POO");*/

                /*     if(edad >18){

            System.out.println("Estas autorizado a comprar cervezas :) ");

        }else{

            System.out.println("Estas jodido... que tu padre venga a comprarlas");

        }*/

        /*for(int i = 0 ; i<=10; i++){

            System.out.println("Estes texto es repetición hasta que llegue a 10 y vamos en: " +i);


        }*/

        /*int edad = 1;

        //el ciclo while se ejecuta mientras la condicion sea verdadera
        //cuando es falsa, este ciclo corta automáticamente
        while(edad < 18){

            System.out.println("No esta autorizado a comprar cervezas :), porque su edad es: "+edad+" años");
            edad++;
        }*/

         /*  int edad = 0;

        //en el ciclo do while, se realiza la actividad hasta que la condición sea FALSA
        do{

            System.out.println("No esta autorizado a comprar cervezas :), porque su edad es: "+edad+" años");
            edad++;

        }while(edad < 18);*/

        /*int dias = 7;

        switch(dias){


            case 1:

                System.out.println("Hoy es Lunes BUUUU");
            
            break;
            
            case 2:

                System.out.println("Hoy es Martes");

            break;

            case 3:

                System.out.println("Hoy es Miercoles");
            
            break;

            case 4:

                System.out.println("Hoy es Jueves");

            break;

            case 5:

                System.out.println("Hoy es viernes YUJU");

            break;


            case 6:

                System.out.println("Hoy es Sabado EEEHHH y tenemos sed tenemos sed");

            break;

            case 7:

                System.out.println("Hoy es Fomingo");
            
            break;

            default:

                System.out.println("No es un dia de la semana válido");
            
            break;
        }*/

     public static void Notmain(String[] args) {

        
        String nombres [] = {"Guillermo", "Juan", "Pedro", "Maria", "Jose"};

        //el ciclo for, recorre el arreglo y lo imprime
        for(int i = 0; i < 5; i++){

            System.out.println(nombres[i]);

        }

        Integer numeros [] = {100,101,102,103,104,105};

        //el ciclo for, recorre el arreglo y lo imprime

        for(int i = 0; i < numeros.length; i++){

            System.out.println(numeros[i]);
        
        }

        //Los Arrays en Java se pueden declarar de esta forma:
        String[] palabras;
        int[] numeros2;
        double[] decimales;

        //Otra forma de declarar un Array en Java es:
        String palabras2[];
        int numeros3[];
        double decimales2[];

        //Otra forma seria
        String[] palabras3 = new String[5];
        int[] numeros4 = new int[5];
        double[] decimales3 = new double[5];

        //Otra forma seria
        String palabras4[] = new String[5];
        int numeros5[] = new int[5];
        double decimales4[] = new double[5];

        //Otra forma seria
        String[] palabras5 = {"uno", "dos", "tres", "cuatro", "cinco"};
        int[] numeros6 = {1,2,3,4,5};
        double[] decimales5 = {1.1,2.2,3.3,4.4,5.5};
        

        //recorremos el array
        for(int i = 0; i < palabras5.length; i++){

            System.out.println(palabras5[i]);

        }

        for(int i = 0; i < numeros6.length; i++){

            System.out.println(numeros6[i]);

        }

        for(int i = 0; i < decimales5.length; i++){

            System.out.println(decimales5[i]);

        }

    }

}
       

