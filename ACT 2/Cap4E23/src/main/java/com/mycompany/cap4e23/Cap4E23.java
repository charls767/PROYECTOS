
package com.mycompany.cap4e23;

import java.util.Scanner;

public class Cap4E23{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de los coeficientes de la ecuación cuadrática
        System.out.println("Ingrese el coeficiente A:");
        double A = scanner.nextDouble();

        System.out.println("Ingrese el coeficiente B:");
        double B = scanner.nextDouble();

        System.out.println("Ingrese el coeficiente C:");
        double C = scanner.nextDouble();

        // Calcular el discriminante
        double discriminante = B * B - 4 * A * C;

        // Determinar las soluciones
        if (discriminante > 0) {
            // Dos soluciones reales distintas
            double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            System.out.println("Las soluciones son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            // Una solución real doble
            double x = -B / (2 * A);
            System.out.println("La solución doble es:");
            System.out.println("x = " + x);
        } else {
            // No tiene soluciones reales
            System.out.println("La ecuación no tiene soluciones reales.");
        }

        scanner.close();
    }
}
