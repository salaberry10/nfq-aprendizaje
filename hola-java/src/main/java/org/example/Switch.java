package org.example;

import java.util.Scanner;

public class Switch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 7: ");
        int numero = sc.nextInt();
        String nombreDia = switch (numero) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "numero no valido";
        };
        System.out.println(nombreDia);
    }
}
