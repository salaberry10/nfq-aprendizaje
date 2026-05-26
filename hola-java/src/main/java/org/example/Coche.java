package org.example;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    public Coche (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void acelerar (int incremento) {
        this.velocidad += incremento;
    }

    public void mostrarEstado () {
        System.out.println(this.marca + " " + this.modelo + " " + this.velocidad + " km/h");
    }
}
