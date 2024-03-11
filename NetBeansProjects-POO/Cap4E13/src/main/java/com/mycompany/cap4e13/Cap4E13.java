
package com.mycompany.cap4e13;

import java.util.Scanner;

public class Cap4E13{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura del valor de la compra y el color de la bolita
        System.out.println("Ingrese el valor de la compra:");
        double valorCompra = scanner.nextDouble();

        System.out.println("Ingrese el color de la bolita (BLANCO, VERDE, AMARILLO, AZUL):");
        String colorBolita = scanner.next().toUpperCase(); // Convertir a mayúsculas para comparación

        // Determinar el porcentaje de descuento
        double porcentajeDescuento;

        switch (colorBolita) {
            case "BLANCO":
                porcentajeDescuento = 0;
                break;
            case "VERDE":
                porcentajeDescuento = 10;
                break;
            case "AMARILLO":
                porcentajeDescuento = 25;
                break;
            case "AZUL":
                porcentajeDescuento = 50;
                break;
            default:
                porcentajeDescuento = 100;
                break;
        }

        // Calcular el valor a pagar con descuento
        double valorPagar = valorCompra - (porcentajeDescuento * valorCompra / 100);

        // Mostrar resultado
        System.out.println("El cliente debe pagar: $" + valorPagar);

        scanner.close();
    }
}
