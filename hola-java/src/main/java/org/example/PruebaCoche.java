package org.example;

public class PruebaCoche {
    static void main(String[] args) {
        Coche coche1 = new Coche ("Toyota", "CHR");

        coche1.acelerar(10);

        coche1.acelerar(25);

        coche1.mostrarEstado();

        Coche coche2 = new Coche ("Renault", "Megane");

        coche2.acelerar(40);

        coche2.acelerar(60);

        coche2.mostrarEstado();
    }
}
