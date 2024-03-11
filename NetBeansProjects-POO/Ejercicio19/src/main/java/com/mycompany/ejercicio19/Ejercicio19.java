/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el valor del lado del triángulo equilátero
        System.out.println("Ingrese el valor del lado del triángulo equilátero:");
        double lado = scanner.nextDouble();

        // Calcular el perímetro
        double perimetro = 3 * lado;

        // Calcular la altura
        double altura = (Math.sqrt(3) / 2) * lado;

        // Calcular el área
        double area = (Math.sqrt(3) / 4) * lado * lado;

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);

        scanner.close();
    }
}
