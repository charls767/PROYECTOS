
package com.mycompany.cce15;

import java.util.Scanner;
public class CCE15 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de los pesos de las esferas
        System.out.println("Ingrese el peso de la esfera A:");
        int pesoA = scanner.nextInt();

        System.out.println("Ingrese el peso de la esfera B:");
        int pesoB = scanner.nextInt();

        System.out.println("Ingrese el peso de la esfera C:");
        int pesoC = scanner.nextInt();

        System.out.println("Ingrese el peso de la esfera D:");
        int pesoD = scanner.nextInt();

        // Crear objeto Esferas usando el constructor
        Esferas esferas = new Esferas(pesoA, pesoB, pesoC, pesoD);

        // Determinar la esfera diferente y su relación de peso con las otras
        esferas.determinarEsferaDiferente();

        scanner.close();
    }
}