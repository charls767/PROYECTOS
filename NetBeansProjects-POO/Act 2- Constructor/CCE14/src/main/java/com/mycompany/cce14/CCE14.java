

package com.mycompany.cce14;
import java.util.Scanner;


public class CCE14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de las ventas de los departamentos y el salario base
        System.out.println("Ingrese las ventas del departamento 1:");
        double ventasDpto1 = scanner.nextDouble();

        System.out.println("Ingrese las ventas del departamento 2:");
        double ventasDpto2 = scanner.nextDouble();

        System.out.println("Ingrese las ventas del departamento 3:");
        double ventasDpto3 = scanner.nextDouble();

        System.out.println("Ingrese el salario de los vendedores:");
        double salarioBase = scanner.nextDouble();

        // Crear objeto SalariosDepartamentos usando el constructor
        SalariosDepartamentos salariosDepartamentos = new SalariosDepartamentos(ventasDpto1, ventasDpto2, ventasDpto3, salarioBase);

        // Calcular y mostrar los salarios de los vendedores de cada departamento
        salariosDepartamentos.calcularSalarios();

        scanner.close();
    }
}