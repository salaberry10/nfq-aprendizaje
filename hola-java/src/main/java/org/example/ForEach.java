package org.example;

public class ForEach {
    static void main(String[] args) {
        int[] numeros = {4, 8, 15, 16, 23};

        int suma = 0;

        for (int numero : numeros){
            suma += numero; // lo mismo que suma = numero + suma
        }
        System.out.println("La suma es : " + suma);
    }
}
