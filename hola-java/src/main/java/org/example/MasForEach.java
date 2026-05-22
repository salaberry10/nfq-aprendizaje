package org.example;

public class MasForEach {
    static void main(String[] args) {
        int[] numeros = {4, 8, 15, 16, 23};

        for (int numero : numeros){
            System.out.println(numero);
        }

        int suma = 0;
        for(int number : numeros){
            suma += number;
        }
        System.out.println(suma);
    }
}
