
package com.mycompany.cce24;

import java.util.Scanner;

public class CCE24 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de los pesos de las esferas
        System.out.println("Ingrese el peso de la esfera A:");
        double pesoA = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera B:");
        double pesoB = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera C:");
        double pesoC = scanner.nextDouble();

        // Crear objeto Esferas usando el constructor
        Esferas esferas = new Esferas(pesoA, pesoB, pesoC);

        // Determinar la esfera de mayor peso
        esferas.determinarEsferaMayor();

        scanner.close();
    }
}