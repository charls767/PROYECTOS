
package com.mycompany.cap4e22;


import java.util.Scanner;

public class Cap4E22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de los datos del empleado
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el salario básico por hora del empleado:");
        double salarioPorHora = scanner.nextDouble();

        System.out.println("Ingrese el número de horas trabajadas en el mes:");
        int horasTrabajadas = scanner.nextInt();

        // Cálculo del salario mensual
        double salarioMensual = salarioPorHora * horasTrabajadas;

        // Verificar si el salario mensual es mayor de $450.000
        if (salarioMensual > 450000) {
            System.out.println("Nombre del empleado: " + nombre);
            System.out.println("Salario mensual: $" + salarioMensual);
        } else {
            System.out.println("Nombre del empleado: " + nombre);
        }

        scanner.close();
    }
}
