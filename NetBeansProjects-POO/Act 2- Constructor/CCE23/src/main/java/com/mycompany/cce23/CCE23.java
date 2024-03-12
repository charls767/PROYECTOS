
package com.mycompany.cce23;
import java.util.Scanner;
public class CCE23 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de los coeficientes de la ecuación cuadrática
        System.out.println("Ingrese el coeficiente A:");
        double A = scanner.nextDouble();

        System.out.println("Ingrese el coeficiente B:");
        double B = scanner.nextDouble();

        System.out.println("Ingrese el coeficiente C:");
        double C = scanner.nextDouble();

        // Crear objeto EcuacionCuadratica usando el constructor
        EcuacionCuadratica ecuacion = new EcuacionCuadratica(A, B, C);

        // Determinar y mostrar las soluciones de la ecuación
        ecuacion.determinarSoluciones();

        scanner.close();
    }
}