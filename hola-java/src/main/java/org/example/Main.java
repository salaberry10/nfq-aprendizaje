package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, NFQ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Como te llamas");
        String nombre = sc.nextLine();

        System.out.println("Cuantos años tienes");
        int edad = sc.nextInt();

        System.out.println("Hola " + nombre + " tienes " + edad + " años");





    }

}
