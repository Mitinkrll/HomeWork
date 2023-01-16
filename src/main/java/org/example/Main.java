package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
//Homework3

public class Main {

//    public static void main(String[] args) {
//        System.out.println();
//        Employee[] empCorp = new Employee[5];
//        empCorp[0] = new Employee("Anton Antonov", "Engineer", "aant@opn.ru", "89999999999", 12000, 62);
//        empCorp[1] = new Employee("Boris Yurinov", "Sales Manager", "Boyara@opn.ru", "88888888888", 15000, 41);
//        empCorp[2] = new Employee("Just  Vitaliy", "Real Cake", "Vmustang@opn.com", "87777777777", 200000, 22);
//        empCorp[3] = new Employee("Dmitriy Dmitriev", "Driver", "pupkina@mailbox.com", "86666666666", 10000, 18);
//        empCorp[4] = new Employee("Egor Egorov", "Engineer", "juk@mailbox.com", "85555555555", 3000, 25);
//        for (Employee employee : empCorp)
//            if (employee.getAge() > 40)
//                System.out.println(employee);
//
//    }

//Homework 4
    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        short distanceRun = 200;
        byte distanceSwim = 0;
        Cat cat = new Cat(distanceRun, distanceSwim);

        distanceRun = 500;
        distanceSwim =10;
        Animal dog = new Dog(distanceRun, distanceSwim);


        System.out.println("Кошка может пробежать: " + cat.getAnimalDistanceRun() +
                " м. \nСобака может пробежать: " + dog.getAnimalDistanceRun() + " м.");

        System.out.println("Введите дистанцию для бега:");
        double distance = scanner.nextShort();

        System.out.println("Кошка пытается выполнить run(" + distance + "). Результат: " + cat.run(distance));
        System.out.println("Собака пытается выполнить run(" + distance + "). Результат: " + dog.run(distance));
        System.out.println("\n****************\n");

        System.out.println("Кошка может проплыть: " + cat.getAnimalDistanceSwim() +
                " м. \nСобака может проплыть: " + dog.getAnimalDistanceSwim() + " м.");

        System.out.println("Введите дистанцию для плавания:");
        distance = scanner.nextByte();

        System.out.println("Кошка пытается выполнить swim(" + distance + "). Результат: " + cat.swim(distance));
        System.out.println("Собака пытается выполнить swim(" + distance + "). Результат: " + dog.swim(distance));
        System.out.println("Создано объектов " + Cat.name +" : " + Cat.count);
        System.out.println("Создано объектов " + Dog.name + " : " + Dog.count);
        System.out.println("Создано объектов " + Animal.name + " : " + Animal.count);

    }
}