
package com.mycompany.cce23;



public class EcuacionCuadratica {
    private double coeficienteA;
    private double coeficienteB;
    private double coeficienteC;

    // Constructor
    public EcuacionCuadratica(double coeficienteA, double coeficienteB, double coeficienteC) {
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.coeficienteC = coeficienteC;
    }

    // Método para calcular el discriminante
    public double calcularDiscriminante() {
        return coeficienteB * coeficienteB - 4 * coeficienteA * coeficienteC;
    }

    // Método para determinar las soluciones
    public void determinarSoluciones() {
        double discriminante = calcularDiscriminante();

        if (discriminante > 0) {
            // Dos soluciones reales distintas
            double x1 = (-coeficienteB + Math.sqrt(discriminante)) / (2 * coeficienteA);
            double x2 = (-coeficienteB - Math.sqrt(discriminante)) / (2 * coeficienteA);
            System.out.println("Las soluciones son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            // Una solución real doble
            double x = -coeficienteB / (2 * coeficienteA);
            System.out.println("La solución doble es:");
            System.out.println("x = " + x);
        } else {
            // No tiene soluciones reales
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}