
package com.mycompany.cce10;



public class Estudiante {
    private String numeroInscripcion;
    private String nombres;
    private double patrimonio;
    private int estrato;

    // Constructor
    public Estudiante(String numeroInscripcion, String nombres, double patrimonio, int estrato) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
    }

    // Metodo para calcular el pago de matricula
    public double calcularPagoMatricula() {
        double pagoMatricula = 50000; // Valor constante de matricula

        if (patrimonio > 2000000 && estrato > 3) {
            pagoMatricula += 0.03 * patrimonio; // Incremento del 3% sobre el patrimonio
        }

        return pagoMatricula;
    }
}