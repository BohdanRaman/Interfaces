package task_13;

/**
 * Exercise 13: Create an interface, and inherit two new interfaces from that interface.
 * Multiply inherit a third interface from the second two.
 */

public class Car implements TypeCar {

    @Override
    public String engine() {
        return "Diesel";
    }

    @Override
    public String getModel() {
        return "2023 years";
    }

    @Override
    public String typeCar() {
        return "SportCar";
    }

    @Override
    public void door(int i) {
        System.out.println("Count door in a car: " + i);
    }
}
