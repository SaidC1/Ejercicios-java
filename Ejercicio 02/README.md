# Ejercicio 02 – Operaciones Aritméticas

## Descripción
Este programa en Java realiza operaciones básicas entre dos números enteros:
- Suma
- Resta
- Multiplicación
- División entera
- Módulo (residuo de la división)

## Conceptos prácticos
- Los operadores aritméticos en Java son:
  - `+` (suma)
  - `-` (resta)
  - `*` (multiplicación)
  - `/` (división entera)
  - `%` (módulo o residuo)

## Código
```java
public class Main {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 3;

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;a
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int modulo = numero1 % numero2;

        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

}
