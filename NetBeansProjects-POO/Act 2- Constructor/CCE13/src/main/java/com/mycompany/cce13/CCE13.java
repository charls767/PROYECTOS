
package com.mycompany.cce13;
import java.util.Scanner;
public class CCE13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura del valor de la compra y el color de la bolita
        System.out.println("Ingrese el valor de la compra:");
        double valorCompra = scanner.nextDouble();

        System.out.println("Ingrese el color de la bolita (BLANCO, VERDE, AMARILLO, AZUL):");
        String colorBolita = scanner.next();

        // Crear objeto Compra usando el constructor
        Compra compra = new Compra(valorCompra, colorBolita);

        // Calcular y mostrar el valor a pagar con descuento
        double valorPagar = compra.calcularValorPagar();
        System.out.println("El cliente debe pagar: $" + valorPagar);

        scanner.close();
    }
}