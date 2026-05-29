package org.example;

public class PruebaCuentaBancaria {
    static void main(String[] args) {

        CuentaBancaria caixa = new CuentaBancaria("Jose", "ES720-2134");

        caixa.mostrarEstado();

        caixa.ingresar(500);

        caixa.retirar(220);

        caixa.mostrarEstado();


    }
}
