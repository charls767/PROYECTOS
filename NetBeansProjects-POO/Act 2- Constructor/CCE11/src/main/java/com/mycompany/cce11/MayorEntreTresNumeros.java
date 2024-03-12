
package com.mycompany.cce11;





public class MayorEntreTresNumeros {
    private int numero1;
    private int numero2;
    private int numero3;

    // Constructor
    public MayorEntreTresNumeros(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    // Metodo para encontrar el mayor de los tres numeros
    public int encontrarMayor() {
        int mayor;

        if (numero1 > numero2 && numero1 > numero3) {
            mayor = numero1;
        } else if (numero2 > numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        return mayor;
    }
}
