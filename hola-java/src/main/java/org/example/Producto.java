package org.example;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void vender (int unidades) {
       if (unidades <= stock) {
           stock -= unidades;
           System.out.println("Vendidas " + unidades + " unidades de " + nombre);
       } else {
           System.out.println("Stock insuficiente");
       }
    }
    public void reabastecer (int unidades) {
        if(unidades > 0) {
            stock += unidades;
            System.out.println("Stock actualizado: " + stock + " unidades de " + nombre);
        } else {
            System.out.println("La cantidad a reabastecer debe ser mayor que 0");
        }
    }

    public void mostrarInfo () {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
}
