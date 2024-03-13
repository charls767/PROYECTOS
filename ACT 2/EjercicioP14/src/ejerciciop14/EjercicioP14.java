
package ejerciciop14;
import java.util.Scanner;

public class EjercicioP14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        double numero = scanner.nextDouble();
        double cuadrado = numero * numero;
        double cubo = numero * numero * numero;
        System.out.println("El numero es" + numero);
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        System.out.println("El cubo de " + numero + " es: " + cubo);

        scanner.close();
    }
}
    
    

