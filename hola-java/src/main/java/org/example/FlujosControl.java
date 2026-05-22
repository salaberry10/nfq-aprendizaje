package org.example;

import java.util.Scanner;

public class FlujosControl {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota del alumno: ");
        int nota = sc.nextInt();

        if(nota >= 9){
            System.out.println("Sobresaliente");
        }else if(nota >=7){
            System.out.println("Notable");
        }else if(nota >=5){
            System.out.println("Aprobado");
        }else{
            System.out.println("Suspenso");
        }

    }
}
