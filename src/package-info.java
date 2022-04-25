package com.egartech.lesson1;

import com.egartech.lesson1.animals.Animal;
import com.egartech.lesson1.animals.Cat;
import com.egartech.lesson1.animals.Dog;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "White", 2);


        Animal[] catsAndDogs = {
                new Cat("Barsik", "White", 2),
                new Dog("Murzik", "White", 2)
        };
        for (Animal o: catsAndDogs) {
            o.voice();
        }

        System.out.println("Кошку зовут: " + cat.getName());

        cat.hi();

    }
}
