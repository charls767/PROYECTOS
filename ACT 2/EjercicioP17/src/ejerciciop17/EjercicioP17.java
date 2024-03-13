
package ejerciciop17;
import java.util.Scanner;
public class EjercicioP17 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();
        double area = Math.PI * radio * radio;
        double longitudCircunferencia = 2 * Math.PI * radio;
        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitudCircunferencia);

        scanner.close();
    }
}