package Ejercicios_java.Ejercicio_03;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        
        // Solicitar nombre a usuario y su edad 
        System.out.println("Ingrese su nombre:");
        String nombre = lector.nextLine();
        System.out.println("Ingrese su edad:");
        int edad = lector.nextInt();
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
        lector.close();
    }
}
