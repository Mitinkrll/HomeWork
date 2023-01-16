package org.example;

class Dog extends Animal {
    static int count;
    static String name = "Собака";
    Dog(short animalDistanceRun,byte animalDistanceSwim) {
        super(animalDistanceRun,animalDistanceSwim);
        count++;
    }
}
