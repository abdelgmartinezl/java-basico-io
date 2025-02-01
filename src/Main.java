import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Xopa, pelao!");

        // Este es un comentario de una linea
        /*
           Esto es un comentario
           de varias lineas :-)
        */

        int edad;
        edad = 100;

        byte num = 58;
        short año = 2025;
        int poblacion = 1000000; // Este es el que debo usar
        long estrellas = 900000000L;

        float temperatura = 35.3f;
        double no_pi = 3.123423424; // Este es el que debo usar

        char inicial = 'A';
        String nombre = "Anacleta";

        boolean esJavaDivertido = false;

        System.out.println("Edad: " + edad + " años");
        System.out.println("Año: " + año);
        System.out.println("Poblacion: " + poblacion + " personas");
        System.out.println("Estrellas: " + estrellas + " estrellas");
        System.out.println("Temperatura: " + temperatura + "º");
        System.out.println("No PI: " + no_pi);
        System.out.println("Inicial: " + inicial);
        System.out.println("Nombre: " + nombre);
        System.out.println("EsJavaDivertido: " + esJavaDivertido + ", mentira!");

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();

        System.out.print("Introduce tu altura: ");
        double altura = sc.nextDouble();

        System.out.println("Resumen de Datos");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);

        sc.close();
    }
}