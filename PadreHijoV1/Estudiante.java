public class Estudiante extends Persona{

    public float Nota1;
    public float Nota2;
    public float Nota3;
    public float Nota4;
    public float Nota5;
    public float promedio;


    public void estudiante(){

    }

    public void notas(float n1, float n2, float n3, float n4, float n5){

        this.Nota1 = n1;
        this.Nota2 = n2;
        this.Nota3 = n3;
        this.Nota4 = n4;
        this.Nota5 = n5;

        float[] notas = {this.Nota1, this.Nota2, this.Nota3, this.Nota4, this.Nota5};

        for (int a=0; a< notas.length; a++){
            
            System.out.println("Las notas guardadas en el arreglo son: "+notas[a]);

        }

        /* 
        promedio = (notas[0]+notas[1]+notas[2]+notas[3]+notas[4])/5;

        System.out.println("El promedio de las notas es: "+promedio);*/

        float suma = 0; 

        for(int x=0; x<notas.length; x++){
            suma = suma + notas[x];
    
        }

        promedio = (suma/notas.length);

        System.out.println("El promedio de las notas es: " +promedio);


        }


    }



    

