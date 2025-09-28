package Ejercicios_java.ejercicio_1;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {   
        Scanner Lector = new Scanner (System.in);
        // Imprimir en pantalla
        System.out.println("hola, mundo");

        // Declarar variables
        int edad = 18;
        edad = Lector.nextInt();
        System.out.println("Mi edad es: " + edad);
        
        double promedio = 8.5;
        promedio = Lector.nextDouble();
        System.out.println("Mi promedio es:" + promedio);

        String nombre = "Irvin";
        nombre = Lector.next();
        System.out.println("Mi nombre es:" + nombre);
        Lector.close();
    }
}
