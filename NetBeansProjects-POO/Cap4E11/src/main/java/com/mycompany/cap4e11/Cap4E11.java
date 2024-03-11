
package com.mycompany.cap4e11;


import java.util.Scanner;

public class Cap4E11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de los tres números enteros
        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número:");
        int numero3 = scanner.nextInt();

        // Encontrar el mayor de los tres números
        int mayor;

        if (numero1 > numero2 && numero1 > numero3) {
            mayor = numero1;
        } else if (numero2 > numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        // Mostrar resultado
        System.out.println("El valor mayor entre " + numero1 + ", " + numero2 + " y " + numero3 + " es: " + mayor);

        scanner.close();
    }
}
