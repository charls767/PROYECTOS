
package com.mycompany.cce14;


public class SalariosDepartamentos {

    private double ventasDpto1;
    private double ventasDpto2;
    private double ventasDpto3;
    private double salarioBase;

    // Constructor
    public SalariosDepartamentos(double ventasDpto1, double ventasDpto2, double ventasDpto3, double salarioBase) {
        this.ventasDpto1 = ventasDpto1;
        this.ventasDpto2 = ventasDpto2;
        this.ventasDpto3 = ventasDpto3;
        this.salarioBase = salarioBase;
    }

    // Metodo para calcular los salarios de los vendedores de cada departamento
    public void calcularSalarios() {
        // Calcular el total de ventas y el porcentaje para el incentivo
        double totalVentas = ventasDpto1 + ventasDpto2 + ventasDpto3;
        double porcentajeVentas = 0.33 * totalVentas;

        // Calcular el salario recibido para cada departamento
        double salarioDpto1 = (ventasDpto1 > porcentajeVentas) ? salarioBase * 1.2 : salarioBase;
        double salarioDpto2 = (ventasDpto2 > porcentajeVentas) ? salarioBase * 1.2 : salarioBase;
        double salarioDpto3 = (ventasDpto3 > porcentajeVentas) ? salarioBase * 1.2 : salarioBase;

        // Mostrar los salarios de los vendedores de cada departamento
        System.out.println("Salario vendedores departamento 1: $" + salarioDpto1);
        System.out.println("Salario vendedores departamento 2: $" + salarioDpto2);
        System.out.println("Salario vendedores departamento 3: $" + salarioDpto3);
    }
}