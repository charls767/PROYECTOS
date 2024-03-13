

package com.mycompany.ejercicio18;
import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar información del empleado
        System.out.println("Ingrese el código del empleado:");
        int codigoEmpleado = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        
        System.out.println("Ingrese los nombres del empleado:");
        String nombres = scanner.nextLine();
        
        System.out.println("Ingrese el número de horas trabajadas al mes:");
        int horasTrabajadas = scanner.nextInt();
        
        System.out.println("Ingrese el valor de la hora trabajada:");
        double valorHora = scanner.nextDouble();
        
        System.out.println("Ingrese el porcentaje de retención en la fuente:");
        double retencionFuente = scanner.nextDouble();
        
        // Calcular salario bruto
        double salarioBruto = horasTrabajadas * valorHora;
        
        // Calcular retención en la fuente
        double retencion = salarioBruto * (retencionFuente / 100);
        
        // Calcular salario neto
        double salarioNeto = salarioBruto - retencion;
        
        // Mostrar resultados
        System.out.println("\nInformación del empleado:");
        System.out.println("Código: " + codigoEmpleado);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Salario Neto: $" + salarioNeto);
        
        scanner.close();
    }
}
