package org.example;

public class Perro extends Animal {
    private String raza;

    public Perro (String nombre, int edad, String raza) {
        super (nombre, edad);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau!! soy " + getNombre());
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Raza: " + raza);
    }

}
