
package com.mycompany.cce11;
import java.util.Scanner;

public class CCE11 {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de los tres numeros enteros
        System.out.println("Ingrese el primer numero:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer numero:");
        int numero3 = scanner.nextInt();

        // Crear objeto MayorEntreTresNumeros usando el constructor
        MayorEntreTresNumeros comparador = new MayorEntreTresNumeros(numero1, numero2, numero3);

        // Encontrar el mayor de los tres numeros y mostrar resultado
        int mayor = comparador.encontrarMayor();
        System.out.println("El valor mayor entre " + numero1 + ", " + numero2 + " y " + numero3 + " es: " + mayor);

        scanner.close();
    }
}