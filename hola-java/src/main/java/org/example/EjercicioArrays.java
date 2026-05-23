package org.example;

import java.util.Scanner;

public class EjercicioArrays {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int[5];

        for (int i= 0; i < numeros.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + ":"); //como i empieza en 0, le sumo 1 solo para mostrar "número 1, 2, 3..."
            numeros[i] = sc.nextInt();
        }

        int suma = 0;
        for (int numero : numeros) {
            System.out.println("El numero es: " + numero);
            suma += numero;
        }
        System.out.println("La suma es : " + suma);


    }
}
