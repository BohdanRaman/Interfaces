package main;

import task_13.Car;
import task_14.Animals;
import task_15.Dog;
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

        System.out.println("Task 13:");
        Car car = new Car();
        car.door(3);
        car.typeCar();
        car.engine();
        car.getModel();
        System.out.println(car.engine());
        System.out.println(car.typeCar());
        System.out.println(car.getModel());
        System.out.println();

        System.out.println("Task 14:");
        Animals animals = new Animals();
        animals.setName("Tiger");
        animals.setWeight(30);
        System.out.println("name:" + animals.getName() + ", weight:" + animals.getWeight());
        animals.firstMethod(animals);
        animals.secondMethod(animals);
        animals.thirdMethod(animals);
        animals.fourthMethod(animals);
        System.out.println();

        System.out.println("Task 15:");
        Dog dog = new Dog();
        dog.setName("Archi");
        dog.setWeight(15);
        System.out.println(("Dog name: " + dog.getName()) + ", dog weignt: " + dog.getWeight());
        dog.speed();
        dog.ageAnimals();
        dog.eatMeals();
        dog.eatVegetables();
        dog.sizeBody();
        dog.jump();
        dog.sizeFoot();


    }
}
