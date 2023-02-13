package task_15;

public class Dog extends AnimalsWithAbstractClass{
    private String name;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void eatMeals() {
        System.out.println("Dogs eat meals everyday");
    }

    @Override
    public void eatVegetables() {
        System.out.println("Dogs hardly ever eat vegetables");
    }

    @Override
    public void ageAnimals() {
        System.out.println("Dogs live about 20 years");
    }

    @Override
    public void speed() {
        System.out.println("Dogs is fast animals");
    }

    @Override
    public void jump() {
        System.out.println("Dogs jump good");
    }

    @Override
    public void sizeBody() {
        System.out.println("Dogs has a difference size");
    }

    @Override
    public void sizeFoot() {
        System.out.println("Dogs has a difference foot");
    }
}
