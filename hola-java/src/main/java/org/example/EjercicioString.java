package org.example;

import java.util.Scanner;

public class EjercicioString {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase corta");
        String frase = sc.nextLine();

        System.out.println("Tu frase tiene " + frase.length() + " letras");
        System.out.println(frase.toUpperCase());
    }
}
