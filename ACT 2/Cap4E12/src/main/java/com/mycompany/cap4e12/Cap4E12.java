
package com.mycompany.cap4e12;


import java.util.Scanner;

public class Cap4E12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de los datos del trabajador
        System.out.println("Ingrese el nombre del trabajador:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el número de horas trabajadas:");
        int horasTrabajadas = scanner.nextInt();

        System.out.println("Ingrese el valor de la hora normal de trabajo:");
        double valorHoraNormal = scanner.nextDouble();

        // Cálculo del salario devengado
        double salario;
        
        if (horasTrabajadas > 40) {
            int horasExtras = horasTrabajadas - 40;
            if (horasExtras > 8) {
                int horasExtrasExcedentes = horasExtras - 8;
                salario = 40 * valorHoraNormal + 16 * valorHoraNormal + horasExtrasExcedentes * 3 * valorHoraNormal;
            } else {
                salario = 40 * valorHoraNormal + horasExtras * 2 * valorHoraNormal;
            }
        } else {
            salario = horasTrabajadas * valorHoraNormal;
        }

        // Mostrar resultado
        System.out.println("El trabajador " + nombre + " devengó: $" + salario);

        scanner.close();
    }
}
