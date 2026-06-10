package org.example;

public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestar() {
        if(disponible==true) { // if(disponible) tambien valdría
            disponible = false;
            System.out.println("Has tomado prestado: " + titulo);
        }else {
            System.out.println("El libro ya está prestado, elige otro");
        }
    }

    public void devolver() {
        if(disponible == false) {
            disponible = true;
            System.out.println("Has devuelto: " + titulo);
        }else {
            System.out.println("Este libro no estaba prestado");
        }
    }

    public void mostrarInfo () {
        System.out.println("El libro " + titulo + " del autor " + autor + " - " + disponible);
    }
}
