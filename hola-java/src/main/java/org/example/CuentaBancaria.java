package org.example;

public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar (double cantidad) {

        if (cantidad > 0){
            saldo += cantidad;
        } else {
            System.out.println("La cantidad a ingresar debe ser mayor de 0");
        }
    }

    public void retirar (double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor que 0");
        } else if(cantidad > saldo) {
            System.out.println("Saldo insuficiente");
    } else {
            saldo -= cantidad;
        }
}

    public void mostrarEstado() {
        System.out.println("Sus datos bancarios: " );
        System.out.println("Titular: " + titular + " " +" Numero de cuenta: " + numeroCuenta + " " + " Saldo: " + saldo);
    }
}

