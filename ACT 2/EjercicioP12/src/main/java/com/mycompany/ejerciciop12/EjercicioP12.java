
package com.mycompany.ejerciciop12;

public class EjercicioP12 {
    public static void main(String[] args) {
        double horas_trabajadas, valor_hora;
        double retencion, porcentaje_retencion;
        double salario_bruto, salario_neto;
        valor_hora = 5000;
        horas_trabajadas = 48;
        porcentaje_retencion = 12.5; // 12.5%
        salario_bruto = valor_hora * horas_trabajadas;        
        retencion = salario_bruto * (porcentaje_retencion / 100);
        salario_neto = salario_bruto - retencion;
        System.out.println("Valor hora: $" + valor_hora);
        System.out.println("Horas trabajadas: " + horas_trabajadas);
        System.out.println("Porcentaje de retención en la fuente: " + porcentaje_retencion + "%");
        System.out.println("Salario bruto: $" + salario_bruto);
        System.out.println("Retención en la fuente: $" + retencion);
        System.out.println("Salario neto: $" + salario_neto);
    }
}
