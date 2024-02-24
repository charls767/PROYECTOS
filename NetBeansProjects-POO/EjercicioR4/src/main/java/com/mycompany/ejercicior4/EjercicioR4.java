
package com.mycompany.ejercicior4;
import java.util.Scanner;

public class EjercicioR4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese la edad de Juan: ");
        int edadJuan = scanner.nextInt();

        // Cálculo de las edades
        int edadAlberto = (2 * edadJuan) / 3;
        int edadAna = (4 * edadJuan) / 3;
        int edadMama = edadJuan + edadAlberto + edadAna;

        // Salida de resultados
        System.out.println("Las edades son:");
        System.out.println("Alberto: " + edadAlberto);
        System.out.println("Juan: " + edadJuan);
        System.out.println("Ana: " + edadAna);
        System.out.println("Mamá: " + edadMama);
        
        scanner.close();
    }
}
