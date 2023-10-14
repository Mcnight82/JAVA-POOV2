public class ClaseSuma{

    //Declaramos las PROPIEDADES de la clase
    public int numero1;
    public int numero2;
    public String numero3;
    public String numero4;

    //Generamos el CONSTRUCTOR de la clase
    public ClaseSuma(){
        
    }

    //Generamos el METODO (o ACCIÓN) de la clase
    
    public int sumar(int valor1, int valor2){

        try{

            this.numero1 = valor1;
            this.numero2 = valor2;
            this.numero3 = String.valueOf(valor1);
            this.numero4 = String.valueOf(valor2);
            return this.numero1 + this.numero2;

        //    String array[] = {numero1,numero2,numero3,numero4};
           

        }catch(Exception ex){

            System.out.println("Error de tipo: " + ex);
            return 0;

        }finally{

            System.out.println("Fue ejecutado el método sumar()");

        }     
    }
    
}