package org.example;

public class PruebaLibro {
    static void main(String[] args) {
        Libro libro1 = new Libro("El Quijote", "Cervantes");
        Libro libro2 = new Libro("La Sombra del Viento", "Ruiz Zafón");

        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }
}
