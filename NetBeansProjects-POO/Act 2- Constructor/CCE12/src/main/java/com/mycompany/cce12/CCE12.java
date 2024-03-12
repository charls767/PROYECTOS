
package com.mycompany.cce12;
import java.util.Scanner;

public class CCE12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de los datos del trabajador
        System.out.println("Ingrese el nombre del trabajador:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el número de horas trabajadas:");
        int horasTrabajadas = scanner.nextInt();

        System.out.println("Ingrese el valor de la hora normal de trabajo:");
        double valorHoraNormal = scanner.nextDouble();

        // Crear objeto Trabajador usando el constructor
        Trabajador trabajador = new Trabajador(nombre, horasTrabajadas, valorHoraNormal);

        // Calcular y mostrar el salario devengado
        double salario = trabajador.calcularSalario();
        System.out.println("El trabajador " + nombre + " devengó: $" + salario);

        scanner.close();
    }
}