package task_15;

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

    public void fourthMethod(AgeAnimals age){
        age.ageAnimals();
    }
}
