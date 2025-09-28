# Ejercicio 1 – Hola Mundo, variables y entrada por teclado

Este es el **primer ejercicio en Java**. El objetivo es aprender los conceptos más básicos:

- Imprimir mensajes en pantalla.
- Declarar variables de distintos tipos (`int`, `double`, `String`).
- Recibir datos del usuario por teclado usando la clase `Scanner`.

---

## 📌 Código

```java
package Ejercicios_java.ejercicio_1;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {   
        Scanner Lector = new Scanner(System.in);

        // Imprimir en pantalla
        System.out.println("hola, mundo");

        // Declarar variables y pedir datos al usuario
        int edad = 18;
        edad = Lector.nextInt();
        System.out.println("Mi edad es: " + edad);
        
        double promedio = 8.5;
        promedio = Lector.nextDouble();
        System.out.println("Mi promedio es: " + promedio);

        String nombre = "Irvin";
        nombre = Lector.next();
        System.out.println("Mi nombre es: " + nombre);

        Lector.close();
    }
}
