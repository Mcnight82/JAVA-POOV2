import java.util.Scanner;

import javax.print.attribute.EnumSyntax;

public class Main{

    


    public static void main (String[] args){

        Scanner scanNom = new Scanner(System.in);
        Scanner scanApePat = new Scanner(System.in);
        Scanner scanApeMat = new Scanner(System.in);
        Scanner scanEdad = new Scanner(System.in);
        Scanner scanRut = new Scanner(System.in);
        Scanner scanGene = new Scanner(System.in);

        Scanner scanNota1 = new Scanner(System.in);
        Scanner scanNota2 = new Scanner(System.in);
        Scanner scanNota3 = new Scanner(System.in);
        Scanner scanNota4 = new Scanner(System.in);
        Scanner scanNota5 = new Scanner(System.in);

         
        System.out.println("Ingrese el nombre del estudiante: ");
        String nom = scanNom.nextLine();

        System.out.println("Ingrese el apellido paterno del estudiante: ");
        String ape_pat = scanApePat.nextLine();

        System.out.println("Ingrese el apellido materno del estudiante: ");
        String ape_mat = scanApeMat.nextLine();

        System.out.println("Ingrese la edad del estudiante: ");
        String edade = scanEdad.nextLine();

        System.out.println("Ingrese el rut del estudiante: ");
        String rute = scanRut.nextLine();

        System.out.println("Ingrese el genero del estudiante: ");
        String gener = scanGene.nextLine();
 
        System.out.println("Ingrese la nota 1 del estudiante: ");
        float nota1 = scanNota1.nextFloat();

        System.out.println("Ingrese la nota 2 del estudiante: ");
        float nota2 = scanNota2.nextFloat();

        System.out.println("Ingrese la nota 3 del estudiante:");
        float nota3 = scanNota3.nextFloat();

        System.out.println("Ingrese la nota 4 del estudiante: ");
        float nota4 = scanNota4.nextFloat();

        System.out.println("Ingrese la nota 5 del estudiante: ");
        float nota5 = scanNota5.nextFloat();

        Estudiante estudio = new Estudiante();

        estudio.guardaPersona(nom, ape_pat, ape_mat, edade, rute, gener);
        estudio.notas(nota1, nota2, nota3, nota4, nota5);



    }





}