public class ClasePadre {

   public int numero1;
   public int numero2;
   public int resultado;

    public ClasePadre() {
    
    }

    public int multiplicar(int valor1, int valor2){
        
        try{
            
            this.numero1 = valor1;
            this.numero2 = valor2;
            this.resultado = this.numero1 * this.numero2;
            return this.resultado;
            
        }catch(Exception ex){
            
            System.out.println("Error de tipo: " + ex);
            return 0;
            
        }finally{
            
            System.out.println("Fue ejecutado el método multiplicar()");
            
        }     
    }
    
}
