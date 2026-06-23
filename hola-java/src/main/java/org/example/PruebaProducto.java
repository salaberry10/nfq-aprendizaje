package org.example;

public class PruebaProducto {
    static void main(String[] args) {

        Producto ps5 = new Producto("PS5", 500, 6);
        Producto nintendo = new Producto("Switch", 350, 3);

        ps5.mostrarInfo();
        nintendo.mostrarInfo();

        ps5.vender(9);
        ps5.vender(2);

        nintendo.reabastecer(3);
        nintendo.reabastecer(-2);

        ps5.mostrarInfo();
        nintendo.mostrarInfo();


    }
}
