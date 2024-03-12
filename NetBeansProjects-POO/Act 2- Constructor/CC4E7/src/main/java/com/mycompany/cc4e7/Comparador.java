
package com.mycompany.cc4e7;



public class Comparador {
    private int A;
    private int B;

    // Constructor
    public Comparador(int A, int B) {
        this.A = A;
        this.B = B;
    }

    // Método para comparar A y B
    public void comparar() {
        if (A > B) {
            System.out.println("A es mayor que B");
        } else if (A == B) {
            System.out.println("A es igual a B");
        } else {
            System.out.println("A es menor que B");
        }
    }
}