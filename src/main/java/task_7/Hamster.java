package task_7;

public class Hamster extends Gerbil {
    private final int hamsterJump = 3;
    private final int hamsterEat = 16;
    private final String hamsterSay = "yui yiu";

    @Override
    public String toString() {
        return "Hamster: " + "\n"
                + "eat: " + eat(hamsterEat) + "\n"
                + "say: " + say(hamsterSay)+ "\n"
                + "jump cm: " + jump(hamsterJump)+ "\n";
    }
}
