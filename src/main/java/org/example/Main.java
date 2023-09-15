package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        metodoinicial();
        confirmarNombre();
        verificarEdad();
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
    /*
    Ahora otro método para verificar la edad.
     */

    public static int verificarEdad(){

        System.out.println("Dame tu edad para seleccionar a qué categoría agregarte.");
        System.out.println("Introdusca cero para salir del programa.");

        Scanner leer = new Scanner(System.in);

        int edad = leer.nextInt();

        while (edad < 100){
            if (edad <10){
                System.out.println("Eres un niño");
            }
            if (edad > 10 && edad<=20){
                System.out.println("Eres un adolescente");
            }
            if (edad > 21){
                System.out.println("Eres un adulto");
            }
            System.out.println("Saliendo del programa...");
            break;
        }

        return edad;
    }
}
