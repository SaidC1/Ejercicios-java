package Ejercicios_java.Ejercicio_02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Lector = new Scanner (System.in);
        
        // Pedir dos numeros enteros
        System.out.println("Ingrese el primer numero entero:");
        int num1 = Lector.nextInt();

        System.out.println("Ingrese el segundo numero entero:");
        int num2 = Lector.nextInt();

        // Operaciones aritmeticas
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2;
        int modulo = num1 % num2;

        // Validar para evitar division por cero
        if (num2 != 0) {
            division = num1 / num2;
            modulo = num1 % num2;
        } else {
            System.out.println("Error: Division por cero no es permitida.");
        }

        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        if (num2 != 0) {
            System.out.println("Division: " + division);
            System.out.println("Modulo: " + modulo);
        }
        Lector.close();
    }
}
