
package com.mycompany.cce22;
import java.util.Scanner;

public class CCE22 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de los datos del empleado
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el salario basico por hora del empleado:");
        double salarioPorHora = scanner.nextDouble();

        System.out.println("Ingrese el numero de horas trabajadas en el mes:");
        int horasTrabajadas = scanner.nextInt();

        // Crear objeto Empleado usando el constructor
        Empleado empleado = new Empleado(nombre, salarioPorHora, horasTrabajadas);

        // Verificar si el salario mensual es mayor de $450.000 y mostrar el resultado
        if (empleado.esSalarioMayor()) {
            System.out.println("Nombre del empleado: " + nombre);
            System.out.println("Salario mensual: $" + empleado.calcularSalarioMensual());
        } else {
            System.out.println("Nombre del empleado: " + nombre);
        }

        scanner.close();
    }
}