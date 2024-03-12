
package com.mycompany.cce15;

public class Esferas {
    private int pesoA;
    private int pesoB;
    private int pesoC;
    private int pesoD;

    // Constructor
    public Esferas(int pesoA, int pesoB, int pesoC, int pesoD) {
        this.pesoA = pesoA;
        this.pesoB = pesoB;
        this.pesoC = pesoC;
        this.pesoD = pesoD;
    }

    // Metodo para determinar la esfera diferente y su relación de peso con las otras
    public void determinarEsferaDiferente() {
        if (pesoA == pesoB && pesoA == pesoC) {
            if (pesoD > pesoA) {
                System.out.println("La esfera D es la diferente y es de mayor peso.");
            } else {
                System.out.println("La esfera D es la diferente y es de menor peso.");
            }
        } else if (pesoA == pesoB && pesoA == pesoD) {
            System.out.println("La esfera C es la diferente.");
            if (pesoC > pesoA) {
                System.out.println("Y es de mayor peso.");
            } else {
                System.out.println("Y es de menor peso.");
            }
        } else if (pesoA == pesoC && pesoA == pesoD) {
            System.out.println("La esfera B es la diferente.");
            if (pesoB > pesoD) {
                System.out.println("Y es de mayor peso.");
            } else {
                System.out.println("Y es de menor peso.");
            }
        } else {
            System.out.println("La esfera A es la diferente.");
            if (pesoA > pesoB) {
                System.out.println("Y es de mayor peso.");
            } else {
                System.out.println("Y es de menor peso.");
            }
        }
    }
}