package org.example;

public class Gato extends Animal {
    private String color;

    public Gato(String nombre, int edad, String color) {
        super (nombre, edad);
        this.color = color;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau!! soy " + getNombre());
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Color: " +  color);
    }


}
