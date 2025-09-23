# Ejercicio 01 – Hola Mundo y Variables Básicas

## Descripción
Este ejercicio es la base para comenzar a programar en Java.  
Consiste en:
1. Imprimir un mensaje en consola.
2. Declarar variables de diferentes tipos de datos.
3. Mostrar el valor de las variables.

## Conceptos prácticos
- `System.out.println` se usa para imprimir en pantalla.
- Tipos de datos básicos:
  - `int` → números enteros.
  - `double` → números decimales.
  - `String` → texto (cadenas de caracteres).

## Código
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, mundo");

        int edad = 18;
        double promedio = 8.5;
        String nombre = "Irvin";

        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Nombre: " + nombre);
    }
}
