package org.example;

class Cat extends Animal {
    static int count;
    static String name = "Кошка";

    Cat(short animalDistanceRun,byte animalDistanceSwim) {

        super(animalDistanceRun,animalDistanceSwim);
        count++;

    }


}