
package com.mycompany.cc4e7;
import java.util.Scanner;

public class CC4E7 {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de los valores de A y B
        System.out.println("Ingrese el valor de A:");
        int A = scanner.nextInt();

        System.out.println("Ingrese el valor de B:");
        int B = scanner.nextInt();

        // Crear objeto Comparador usando el constructor
        Comparador comparador = new Comparador(A, B);

        // Comparar A y B y mostrar resultados
        comparador.comparar();

        scanner.close();
    }
}