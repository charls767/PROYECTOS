
package com.mycompany.cce10;
import java.util.Scanner;

public class CCE10 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de los datos del estudiante
        System.out.println("Ingrese el numero de inscripcion:");
        String numeroInscripcion = scanner.nextLine();

        System.out.println("Ingrese el nombre del estudiante:");
        String nombres = scanner.nextLine();

        System.out.println("Ingrese el patrimonio del estudiante:");
        double patrimonio = scanner.nextDouble();

        System.out.println("Ingrese el estrato social del estudiante:");
        int estrato = scanner.nextInt();

        // Crear objeto Estudiante usando el constructor
        Estudiante estudiante = new Estudiante(numeroInscripcion, nombres, patrimonio, estrato);

        // Calcular y mostrar el pago de matricula
        double pagoMatricula = estudiante.calcularPagoMatricula();
        System.out.println("\nEl estudiante con numero de inscripcion " + numeroInscripcion +
                           " y nombre " + nombres + " debe pagar: $" + pagoMatricula);

        scanner.close();
    }
}
