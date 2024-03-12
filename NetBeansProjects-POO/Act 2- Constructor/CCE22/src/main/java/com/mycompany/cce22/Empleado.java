
package com.mycompany.cce22;


public class Empleado {
    private String nombre;
    private double salarioPorHora;
    private int horasTrabajadas;

    // Constructor
    public Empleado(String nombre, double salarioPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Método para calcular el salario mensual
    public double calcularSalarioMensual() {
        return salarioPorHora * horasTrabajadas;
    }

    // Método para verificar si el salario mensual es mayor a $450.000
    public boolean esSalarioMayor() {
        return calcularSalarioMensual() > 450000;
    }
}