
package com.mycompany.cce12;

public class Trabajador {
    private String nombre;
    private int horasTrabajadas;
    private double valorHoraNormal;

    // Constructor
    public Trabajador(String nombre, int horasTrabajadas, double valorHoraNormal) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoraNormal = valorHoraNormal;
    }

    // Metodo para calcular el salario devengado
    public double calcularSalario() {
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

        return salario;
    }
}