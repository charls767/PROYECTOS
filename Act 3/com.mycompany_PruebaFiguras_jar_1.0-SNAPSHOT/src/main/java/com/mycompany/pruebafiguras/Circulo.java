
package com.mycompany.pruebafiguras;

public class Circulo {
    int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    Circulo(int radio) {
        this.radio = radio;
    }
    
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
