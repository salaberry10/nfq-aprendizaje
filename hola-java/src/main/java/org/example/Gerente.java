package org.example;

public class Gerente extends Empleado {
    private double bonus;

    public Gerente(String nombre, double salarioBase, double bonus){
        super (nombre, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSueldo(){
        return getSalarioBase() + bonus;
    }


}
