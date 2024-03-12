
package com.mycompany.cejer19;


import java.util.Scanner;

public class CEjer19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el valor del lado del triángulo equilátero
        System.out.println("Ingrese el valor del lado del triángulo equilátero:");
        double lado = scanner.nextDouble();

        // Crear un objeto TrianguloEquilatero usando el constructor
        TrianguloEquilatero triangulo = new TrianguloEquilatero(lado);

        // Mostrar resultados
        triangulo.mostrarResultados();

        scanner.close();
    }
}

