

package com.mycompany.cap4e7;
import java.util.Scanner;

public class Cap4E7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de los valores de A y B
        System.out.println("Ingrese el valor de A:");
        int A = scanner.nextInt();

        System.out.println("Ingrese el valor de B:");
        int B = scanner.nextInt();

        // Comparación de A con B
        if (A > B) {
            System.out.println("A es mayor que B");
        } else if (A == B) {
            System.out.println("A es igual a B");
        } else {
            System.out.println("A es menor que B");
        }

        scanner.close();
    }
}


