package main;

import task_15.Animals;
import task_7.Gerbil;
import task_7.Hamster;
import task_7.Mouse;

/**
 * @author Raman Bohdan
 * @version 1.0
 * @since 23.01.2022
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 4:");

        System.out.println("Task 7:");
        Mouse mouse = new Mouse();
        Gerbil gerbil = new Gerbil();
        Hamster hamster = new Hamster();
        System.out.println(mouse);
        System.out.println();
        System.out.println(gerbil);
        System.out.println();
        System.out.println(hamster);
        System.out.println();
        ;

        System.out.println("Task 15:");
        Animals animals = new Animals();
        animals.setName("Tiger");
        animals.setWeight(30);
        System.out.println("name:" + animals.getName() + ", weight:" + animals.getWeight());
        animals.firstMethod(animals);
        animals.secondMethod(animals);
        animals.thirdMethod(animals);
        animals.fourthMethod(animals);
    }
}
