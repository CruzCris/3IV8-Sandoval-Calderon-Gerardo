

//libreria
import java.util.Scanner;

import java.util.*; //mandando a llamar a toda la libreria

class EntradaDatosUsuario{
    //metodo principal
    public static void main(String[] args){
        //a nuestro objeto o vamos a crear una instancia
        //invocacion de un objeto 
        //Nombre de la clade obj
        Scanner entrada = new Scanner (System.in);
        //variables
        String nombre;
        int edad;
        float altura;

        System.out.println("Escribe tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Escribe tu edad: ");
        edad = entrada.nextInt();
        System.out.println("Escribe tu estatura: ");
        altura = entrada.nextFloat();

        System.out.println("Tu nombre es: " +nombre);
        System.out.println("Tu edad es: " +edad);
        System.out.println("Tu altura es: " +altura);
    }
}
