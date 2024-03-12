package com.mycompany.cejer18;
import java.util.Scanner;
public class CEjer18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar información del empleado
        System.out.println("Ingrese el código del empleado:");
        int codigoEmpleado = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Ingrese los nombres del empleado:");
        String nombres = scanner.nextLine();
        
        System.out.println("Ingrese el número de horas trabajadas al mes:");
        int horasTrabajadas = scanner.nextInt();
        
        System.out.println("Ingrese el valor de la hora trabajada:");
        double valorHora = scanner.nextDouble();
        
        System.out.println("Ingrese el porcentaje de retención en la fuente:");
        double retencionFuente = scanner.nextDouble();
        
        // Crear instancia de Empleado utilizando el constructor
        Empleado empleado = new Empleado(codigoEmpleado, nombres, horasTrabajadas, valorHora, retencionFuente);
        
        // Mostrar información del empleado
        empleado.mostrarInformacion();
        
        scanner.close();
    }
}