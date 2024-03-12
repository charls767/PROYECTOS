package com.mycompany.cejer18;


class Empleado {
    private int codigoEmpleado;
    private String nombres;
    private int horasTrabajadas;
    private double valorHora;
    private double retencionFuente;
    
    // Constructor para la clase empleado 
    public Empleado(int codigoEmpleado, String nombres, int horasTrabajadas, double valorHora, double retencionFuente) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.retencionFuente = retencionFuente;
    }
    
    // Método  # 1para calcular el salario bruto 
    public double calcularSalarioBruto() {
        return horasTrabajadas * valorHora;
    }
    
    // Método # 2 para calcular la retención en la fuente
    public double calcularRetencion() {
        return calcularSalarioBruto() * (retencionFuente / 100);
    }
    
    // Método  # 3 para calcular el salario neto
    public double calcularSalarioNeto() {
        return calcularSalarioBruto() - calcularRetencion();
    }
    
    // Método # 4  para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("\nInformación del empleado:");
        System.out.println("Código: " + codigoEmpleado);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario Bruto: $" + calcularSalarioBruto());
        System.out.println("Salario Neto: $" + calcularSalarioNeto());
    }
}