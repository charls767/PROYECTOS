package com.mycompany.ejercicio19;

public class Triangulo {
    private double lado;

    // Constructor
    public Triangulo(double lado) {
        this.lado = lado;
    }

    // Calcular el perímetro
    public double perimetro(double lado) {
        return 3 * lado;
    }

    // Calcular la altura
    public double altura(double lado) {
        return (Math.sqrt(3) / 2) * lado;
    }

    // Calcular el área
    public double area(double lado) {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    // Getters and Setters para 'lado'
    public double getLado(double lado) {
        return lado;
    }

}
