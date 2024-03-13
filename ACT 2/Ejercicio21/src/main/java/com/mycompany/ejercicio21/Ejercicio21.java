
package com.mycompany.ejercicio21;

import java.util.Scanner;

public class Ejercicio21{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los tres lados del triángulo
        System.out.println("Ingrese la longitud del primer lado del triángulo:");
        double lado1 = scanner.nextDouble();

        System.out.println("Ingrese la longitud del segundo lado del triángulo:");
        double lado2 = scanner.nextDouble();

        System.out.println("Ingrese la longitud del tercer lado del triángulo:");
        double lado3 = scanner.nextDouble();

        // Calcular el perímetro
        double perimetro = lado1 + lado2 + lado3;

        // Calcular el semiperímetro
        double semiperimetro = perimetro / 2;

        // Calcular el área utilizando la fórmula de Herón
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Semiperímetro: " + semiperimetro);
        System.out.println("Área: " + area);

        scanner.close();
    }
}
