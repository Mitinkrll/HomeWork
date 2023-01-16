package org.example;

public class Animal implements AminalInterface.AnimalInterface {
    private short animalDistanceRun;
    private byte  animalDistanceSwim;
    static int count;
    static String name = "Животные";


        Animal(short animalDistanceRun, byte animalDistanceSwim) {
            this.animalDistanceRun = animalDistanceRun;
            this.animalDistanceSwim = animalDistanceSwim;
            count++;
        }

        @Override
        public boolean run(double value) {
            return animalDistanceRun > value;
        }


        @Override
        public boolean swim(double value) {
            return animalDistanceSwim > value;
        }

        double getAnimalDistanceRun() {
            return animalDistanceRun;
        }


        double getAnimalDistanceSwim() {
            return animalDistanceSwim;
        }

}
