package org.example;

public class PruebaAnimales {
    static void main(String[] args) {
        Perro Pikachu = new Perro ("Pikachu", 2, "huskie");

        Gato Coco = new Gato ("Coco", 7, "gris");

        Pikachu.hacerSonido();
        Pikachu.mostrarInfo();

        Coco.hacerSonido();
        Coco.mostrarInfo();

        Animal [] animales = {Pikachu, Coco};

        for (Animal animal : animales) {
            animal.hacerSonido();
        }

    }
}
