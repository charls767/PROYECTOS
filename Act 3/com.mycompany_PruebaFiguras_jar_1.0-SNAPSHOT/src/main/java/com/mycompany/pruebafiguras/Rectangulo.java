package com.mycompany.pruebafiguras;

public class Rectangulo {
    int base_rec;
    int altura_rec;

    public int getBase_rec() {
        return base_rec;
    }

    public void setBase_rec(int base_rec) {
        this.base_rec = base_rec;
    }

    public int getAltura_rec() {
        return altura_rec;
    }

    public void setAltura_rec(int altura_rec) {
        this.altura_rec = altura_rec;
    }
    
    Rectangulo(int base, int altura) {
        this.base_rec = base;
        this.altura_rec = altura;
    }
    
    double calcularArea() {
        return base_rec * altura_rec;
    }
    
    double calcularPerimetro() {
        return (2 * base_rec) + (2 * altura_rec);
    }
}
