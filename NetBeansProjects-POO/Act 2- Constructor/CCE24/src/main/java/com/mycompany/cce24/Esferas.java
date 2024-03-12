
package com.mycompany.cce24;


public class Esferas {
    private double pesoA;
    private double pesoB;
    private double pesoC;

    // Constructor
    public Esferas(double pesoA, double pesoB, double pesoC) {
        this.pesoA = pesoA;
        this.pesoB = pesoB;
        this.pesoC = pesoC;
    }

    // Método para determinar la esfera de mayor peso
    public void determinarEsferaMayor() {
        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A es la de mayor peso con un peso de " + pesoA);
        } else if (pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera B es la de mayor peso con un peso de " + pesoB);
        } else if (pesoC > pesoA && pesoC > pesoB) {
            System.out.println("La esfera C es la de mayor peso con un peso de " + pesoC);
        } else {
            System.out.println("Las esferas tienen pesos iguales.");
        }
    }
}