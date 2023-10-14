public class Persona {
    
    public String nombre;
    public String apellido_pat;
    public String apellido_mat;
    public String edad;
    public String rut;
    public String genero;

    public void persona(){

    }

    public void guardaPersona(String nom, String ape_pat, String ape_mat, String edad1, String rut1, String gene){

        this.nombre = nom;
        this.apellido_pat = ape_pat;
        this.apellido_mat = ape_mat;
        this.edad = edad1;
        this.rut = rut1; 
        this.genero = gene;

        String[] persona = {this.nombre, this.apellido_pat, this.apellido_mat, this.edad, this.rut, this.genero};

        /* 
        System.out.println("Nombre: " + persona[0]);
        System.out.println("Apellido Paterno: " + persona[1]);
        System.out.println("Apellido Materno: " + persona[2]);
        System.out.println("Edad: " + persona[3]);
        System.out.println("Rut: " + persona[4]);
        System.out.println("Genero: " + persona[5]);*/

        for(int i=0; i<persona.length; i++){
           System.out.println("El dato existente en el arreglo es: " +persona[i]);
        }


    }


}
