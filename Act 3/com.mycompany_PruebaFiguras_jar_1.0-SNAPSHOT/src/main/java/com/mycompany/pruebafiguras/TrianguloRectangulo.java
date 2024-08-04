package com.mycompany.pruebafiguras;
public class TrianguloRectangulo {
    private int base;
    private int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(base * base + altura * altura);
        return base + altura + hipotenusa;
    }

    public String determinarTipoTriangulo() {
        
        if (base == altura) {
            return "Isósceles";
        } else if (base * base + altura * altura == Math.pow(Math.sqrt(base * base + altura * altura), 2)) {
            return "Rectángulo";
        } else {
            return "Escaleno";
        }
    }
}