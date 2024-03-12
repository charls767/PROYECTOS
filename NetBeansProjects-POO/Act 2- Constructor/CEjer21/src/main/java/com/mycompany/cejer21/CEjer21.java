

package com.mycompany.cejer21;


import java.util.Scanner;

public class CEjer21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los tres lados del triangulo
        System.out.println("Ingrese la longitud del primer lado del triangulo:");
        double lado1 = scanner.nextDouble();

        System.out.println("Ingrese la longitud del segundo lado del triangulo:");
        double lado2 = scanner.nextDouble();

        System.out.println("Ingrese la longitud del tercer lado del triangulo:");
        double lado3 = scanner.nextDouble();

        // Crear un objeto Triangulo usando el constructor
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        // Mostrar resultados
        triangulo.mostrarResultados();

        scanner.close();
    }
}
