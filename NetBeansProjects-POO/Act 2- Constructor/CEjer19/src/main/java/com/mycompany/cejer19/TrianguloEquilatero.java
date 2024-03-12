
package com.mycompany.cejer19;




public class TrianguloEquilatero {

    private double lado;
    private double perimetro;
    private double altura;
    private double area;

    // Constructor
    public TrianguloEquilatero(double lado) {
        this.lado = lado;
        this.perimetro = calcularPerimetro();
        this.altura = calcularAltura();
        this.area = calcularArea();
    }

    // Método para calcular el perímetro
    private double calcularPerimetro() {
        return 3 * lado;
    }

    // Método para calcular la altura
    private double calcularAltura() {
        return (Math.sqrt(3) / 2) * lado;
    }

    // Método para calcular el área
    private double calcularArea() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    // Método para mostrar resultados
    public void mostrarResultados() {
        System.out.println("\nResultados:");
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
    }
}