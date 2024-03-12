
package com.mycompany.cejer21;



public class Triangulo {

    private double lado1;
    private double lado2;
    private double lado3;
    private double perimetro;
    private double semiperimetro;
    private double area;

    // Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.perimetro = calcularPerimetro();
        this.semiperimetro = calcularSemiperimetro();
        this.area = calcularArea();
    }

    // Metodo para calcular el perimetro
    private double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    // Metodo para calcular el semiperimetro
    private double calcularSemiperimetro() {
        return perimetro / 2;
    }

    // Metodo para calcular el area utilizando la formula de Heron
    private double calcularArea() {
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }

    // Metodo para mostrar resultados
    public void mostrarResultados() {
        System.out.println("\nResultados:");
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Semiperimetro: " + semiperimetro);
        System.out.println("Area: " + area);
    }
}
