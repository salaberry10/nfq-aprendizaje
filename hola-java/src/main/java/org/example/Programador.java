package org.example;

public class Programador extends Empleado {
    private int horasExtra;

    public Programador( String nombre, double salarioBase, int horasExtra) {
        super (nombre, salarioBase);
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSueldo() {
        return getSalarioBase() + (horasExtra * 20);
    }

}
