package com.mycompany.pruebafiguras;
public class Cuadrado {
    int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    double calcularArea() {
        return lado * lado;
    }
    
    double calcularPerimetro() {
        return 4 * lado;
    }
}

