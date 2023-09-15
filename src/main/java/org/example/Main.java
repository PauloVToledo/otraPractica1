package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        metodoinicial();
        confirmarNombre();
    }

    public static void  metodoinicial(){
        System.out.println("soy el método 1");
    }

    public static boolean confirmarNombre(){
        System.out.println("Ingrese su nombre para verificación por favor.");

        Scanner leer = new Scanner(System.in);

        String nombre = leer.nextLine();


        System.out.println("Tu nombre es "+ nombre);
        if (nombre == "Paulo"){
            System.out.println(true);
            return true;
        }
        if (nombre != "Paulo"){
           System.out.println("Su nombre esta mal escrito "+ false);
        }
        return false;
    }
}
