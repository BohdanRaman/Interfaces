package task_15;

/**
 * Exercise 14: Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a new method.
 * Create a class by implementing the new interface and also inheriting from a concrete class.
 * Now write four methods, each of which takes one of the four interfaces as an argument.
 * In main( ), create an object of your class and pass it to each of the methods
 * <p>
 * Exercise 15: Modify the previous exercise by creating an abstract class and
 * inheriting that into the derived class.
 */

public class Animals extends AnimalsCharacteristic implements AgeAnimals {
    @Override
    public void ageAnimals() {
        System.out.println("Age animals");
    }

    @Override
    public void eatMeals() {
        System.out.println("Animals eat meat");
    }

    @Override
    public void eatVegetables() {
        System.out.println("Animals eat vegetables");
    }

    @Override
    public void speed() {
        System.out.println("Animals has a fast speed");
    }

    @Override
    public void jump() {
        System.out.println("Animals can't jumping");
    }

    @Override
    public void sizeBody() {
        System.out.println("Animals has a little body");
    }

    @Override
    public void sizeFoot() {
        System.out.println("Animals has a quite little foot");
    }

    public void firstMethod(MoveAnimals move) {
        move.jump();
        move.speed();
    }

    public void secondMethod(SizeAnimals size) {
        size.sizeBody();
        size.sizeFoot();
    }

    public void thirdMethod(EatAnimals eat) {
        eat.eatMeals();
        eat.eatVegetables();
    }

    public void fourthMethod(AgeAnimals age) {
        age.ageAnimals();
    }
}
