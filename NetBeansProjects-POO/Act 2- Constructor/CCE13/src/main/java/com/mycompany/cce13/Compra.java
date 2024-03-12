
package com.mycompany.cce13;

public class Compra {
    private double valorCompra;
    private String colorBolita;

    // Constructor
    public Compra(double valorCompra, String colorBolita) {
        this.valorCompra = valorCompra;
        this.colorBolita = colorBolita.toUpperCase();
    }

    // Método para determinar el porcentaje de descuento
    public double determinarPorcentajeDescuento() {
        double porcentajeDescuento;

        switch (colorBolita) {
            case "BLANCO":
                porcentajeDescuento = 0;
                break;
            case "VERDE":
                porcentajeDescuento = 10;
                break;
            case "AMARILLO":
                porcentajeDescuento = 25;
                break;
            case "AZUL":
                porcentajeDescuento = 50;
                break;
            default:
                porcentajeDescuento = 100;
                break;
        }

        return porcentajeDescuento;
    }

    // Método para calcular el valor a pagar con descuento
    public double calcularValorPagar() {
        double porcentajeDescuento = determinarPorcentajeDescuento();
        return valorCompra - (porcentajeDescuento * valorCompra / 100);
    }
}