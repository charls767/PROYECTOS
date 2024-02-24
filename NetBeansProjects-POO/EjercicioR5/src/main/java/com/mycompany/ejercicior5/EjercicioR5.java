
package com.mycompany.ejercicior5;

public class EjercicioR5 {

    public static void main(String[] args) {

        double SUMA = 0;
        double X = 20;
        double Y = 40;
        SUMA = SUMA + X;
        X = X + Math.pow(Y, 2);
        SUMA = SUMA + X / Y;

        System.out.println("EL VALOR DE LA SUMA ES: " + SUMA);
    }

}