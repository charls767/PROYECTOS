
package com.mycompany.cap4e10;


import java.util.Scanner;

public class Cap4E10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de los datos del estudiante
        System.out.println("Ingrese el número de inscripción:");
        String numeroInscripcion = scanner.nextLine();

        System.out.println("Ingrese el nombre del estudiante:");
        String nombres = scanner.nextLine();

        System.out.println("Ingrese el patrimonio del estudiante:");
        double patrimonio = scanner.nextDouble();

        System.out.println("Ingrese el estrato social del estudiante:");
        int estrato = scanner.nextInt();

        // Cálculo del pago de matrícula
        double pagoMatricula = 50000; // Valor constante de matrícula

        if (patrimonio > 2000000 && estrato > 3) {
            pagoMatricula += 0.03 * patrimonio; // Incremento del 3% sobre el patrimonio
        }

        // Mostrar resultados
        System.out.println("\nEl estudiante con número de inscripción " + numeroInscripcion +
                           " y nombre " + nombres + " debe pagar: $" + pagoMatricula);

        scanner.close();
    }
}
