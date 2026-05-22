package org.example;

import java.util.Scanner;


public class Operadores {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        double numero1 = sc.nextDouble();

        System.out.println("Introduce el segundo número: ");
        double numero2 = sc.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double producto = numero1 * numero2;
        double division = numero1 / numero2;

        System.out.println("La suma de " + numero1 + " + " + numero2 + " es " + suma);
        System.out.println("La resta de " + numero1 + " - " + numero2 + " es " + resta);
        System.out.println("El producto de " + numero1 + " x " + numero2 + " es " + producto);
        System.out.println("La división de " + numero1 + " : " + numero2 + " es " + division);




    }
}
