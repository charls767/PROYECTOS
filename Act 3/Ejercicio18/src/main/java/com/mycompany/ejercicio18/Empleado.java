package com.mycompany.ejercicio18;

public class Empleado {
    String codigoEmpleado;
    String nombres;
    int horasTrabajadas;
    double valorHora;
    double retencionFuente;

    public Empleado(String codigoEmpleado, String nombres, int horasTrabajadas, double valorHora, double retencionFuente) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombres =  nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.retencionFuente = retencionFuente;
    }
  public double calcularSalarioBruto() {
        return horasTrabajadas * valorHora;
    }

    public double calcularRetencion() {
        double salarioBruto = calcularSalarioBruto();
        return salarioBruto * (retencionFuente / 100);
    }

    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        double retencion = calcularRetencion();
        return salarioBruto - retencion;
    }
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getRetencionFuente() {
        return retencionFuente;
    }

    public void setRetencionFuente(double retencionFuente) {
        this.retencionFuente = retencionFuente;
    }
    
}