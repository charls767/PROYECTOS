
package com.mycompany.cap4e10;


public class Estudiante {
    private String numeroInscripcion;
    private String nombres;
    private double patrimonio;
    private int estrato;
    private double pagoMatricula;

    public Estudiante(String numeroInscripcion, String nombres, double patrimonio, int estrato) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
        this.pagoMatricula = calcularPagoMatricula();
    }

    private double calcularPagoMatricula() {
        double pago = 50000; // Valor constante de matrícula
        if (patrimonio > 2000000 && estrato > 3) {
            pago += 0.03 * patrimonio; // Incremento del 3% sobre el patrimonio
        }
        return pago;
    }

    public String getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public String getNombres() {
        return nombres;
    }

    public double getPatrimonio() {
        return patrimonio;
    }

    public int getEstrato() {
        return estrato;
    }

    public double getPagoMatricula() {
        return pagoMatricula;
    }
}